# Documentation API AdapTABLES

## 🗂️ DataResource (/data)
| Méthode | Endpoint                                                                | Description                       |
| ------- | ----------------------------------------------------------------------- | --------------------------------- |
| GET     | `/data/teacher/{teacherID}`                                             | Récupérer un enseignant           |
| GET     | `/data/teachers`                                                        | Récupérer tous les enseignants    |
| DELETE  | `/data/teacher/{teacherID}`                                             | Supprimer un enseignant           |
| POST          | `/data/teacher` `json:` ```{"idProf" (String), "name" (String)}```                                                        | Ajouter un enseignant |
| GET     | `/data/students/teacher/{teacherID}/classroom/{classroomID}`            | Récupérer les élèves d’une classe |
| POST    | `/data/classroom` `json:` `{"idProf": (String), "classe": {"id": (String), "name": (String)}}`                         | Ajoute une classe pour un enseignant |
| PUT     | `/data/classroom` `json:` `{"id": (String), "name": (String)}`| Met à jour une classe existante      |
| DELETE  | `/data/teacher/{teacherID}/classroom/{classroomID}`                     | Supprimer une classe              |
| POST    | `/data/student` `json:` `{"idClasse": (String), "idStudent": (String), "nomEleve": (String), "prenomEleve": (String)}` | Ajoute un élève dans une classe      |
| PUT     | `/data/student` `json:` `{"idClasse": (String), "idStudent": (String), "nomEleve": (String), "prenomEleve": (String)}` | Met à jour un élève existant         |
| DELETE  | `/data/teacher/{teacherID}/classroom/{classroomID}/learner/{studentID}` | Supprimer un élève                |
| GET     | `/data/student/createhg`                                                | Créer un élève HG (test)          |

## 🪙 CoinsResource (/coins)
| Méthode | Endpoint                                         | Description                                     |
| ------- | ------------------------------------------------ | ----------------------------------------------- |
| GET     | `/coins/learner/{learnerID}`                     | Récupérer les pièces d’un élève                 |
| GET     | `/coins/classroom/{classID}/learner/{learnerID}` | Récupérer les pièces d’un élève dans une classe |
| POST | `/coins` `json:` `{"newBalance": (Long)}`                                                                                                                                                                                                                                                                                     | Définit directement le solde de pièces du joueur   (cheatcode only)                |
| GET     | `/coins/learnerhg/{learnerID}`                   | Récupérer les pièces d’un élève HG              |

## ⚔️ GenerationResource (/generator)
| Méthode | Endpoint                                                | Description                                  |
| ------- | ------------------------------------------------------- | -------------------------------------------- |
| GET     | `/generator/learner/{learnerID}`                        | Générer un donjon (Maths, classe par défaut) |
| GET     | `/generator/HG/learner/{learnerID}`                     | Générer un donjon (HG, classe par défaut)    |
| GET     | `/generator/classroom/{classID}/learner/{learnerID}`    | Générer un donjon (Maths, classe spécifique) |
| GET     | `/generator/HG/classroom/{classID}/learner/{learnerID}` | Générer un donjon (HG, classe spécifique)    |

## 🏠 HomeRessource (/)
| Méthode | Endpoint | Description               |
| ------- | -------- | ------------------------- |
| GET     | `/`      | Page HTML de présentation |

## 📊 LearnerPlayerResultsResource (/results)
| Méthode | Endpoint                                                                                 | Description                                              |
| ------- | ---------------------------------------------------------------------------------------- | -------------------------------------------------------- |
| POST | `/results/game` `json:` `{"learnerID": (String), "nbQuestionsMeet": (Long), "nbCorrectAnswers": (Long), "timeInMin": (Long), "finishStatus": ("DEAD" \| "EXIT" \| "HUB"), "nbCoinsCollected": (Long)}`| Sauvegarde les résultats d’une session de jeu                      |
| POST    | `/results/training` `json:` `{"learnerID": (String), "objectiveID": (String), "levelID": (String), "resultsByTasks": [{"taskID": (String), ... }]}`                                       | Sauvegarde les résultats d’entraînement sans identifiant de classe (default)|
| POST |`/results/classroom/{classroomID}/training` `json:` `{"learnerID": (String), "objectiveID": (String), "levelID": (String), "resultsByTasks": [{"taskID": (String), ... }]}` | Sauvegarde les résultats de jeu selon un identifiant de classe         |
| GET     | `/results/learner/{learnerID}/objective/{objID}/level/{levelID}`                         | Récupérer progression d’un objectif (classe par défaut)  |
| GET     | `/results/classroom/{classroomID}/learner/{learnerID}/objective/{objID}/level/{levelID}` | Récupérer progression d’un objectif (classe spécifique)  |
| POST    | `/results/traininghg`                                                                    | Sauvegarder résultats d’entraînement HG                  |
| POST    | `/results/gamehg`                                                                        | Sauvegarder résultats de jeu HG                          |
| GET     | `/results/learnerhg/{learnerID}/objective/{objID}/level/{levelID}`                       | Récupérer progression d’un objectif HG                   |


## 🛤️ LearningPathResource (/path)
| Méthode | Endpoint                                            | Description                                   |
| ------- | --------------------------------------------------- | --------------------------------------------- |
| POST | `/path` `json:` `{"learningPathID": (String), "objective": (String), "level": (String), "setupParameters": {"buildingParameters": {"tables": [String], "leftOperand": (String), "resultLocation": (String), "intervalMin": (int), "intervalMax": (int)}, "tasksParameters": [ {... task défini par type...} ], "achievementParameters": {"successCompletionCriteria": (double), "encounterCompletionCriteria": (double)}}}` | Ajoute ou met à jour un objectif/niveau dans un parcours d’apprentissage                         |            
| POST | `/path/training` `json:` `{"learningPathID": (String), "learnerID": (String), "objectives": [ {"objective": (String), "name": (String), "prerequisites": [ {"requiredObjective": (String), "requiredLevel": (String), "successPercent": (double), "encountersPercent": (double)} ], "levels": [ {"level": (String), "name": (String), "setupParameters": {... comme ci-dessus ...}} ] } ]}`                          | Crée un nouveau parcours d’entraînement complet avec objectifs, niveaux, prérequis et paramètres |             |
| GET     | `/path/learner/{learnerID}`                         | Récupérer parcours d’un élève                 |
| GET     | `/path/training/learner/{learnerID}`                | Récupérer parcours d’entraînement d’un élève  |
| GET     | `/path/classroom/{classroomID}/learner/{learnerID}` | Récupérer parcours d’un élève dans une classe |
| GET     | `/path/learnerhg/{learnerID}`                       | Récupérer parcours HG d’un élève              |
| POST    | `/path/traininghg`                                  | Créer un parcours d’entraînement HG           |

## 🔑 LoginResource (/login)
| Méthode | Endpoint                                         | Description                              |
| ------- | ------------------------------------------------ | ---------------------------------------- |
| GET     | `/login/learner/{learnerID}`                     | Vérifier login élève (classe par défaut) |
| GET     | `/login/classroom/{classID}/learner/{learnerID}` | Vérifier login élève (classe spécifique) |
| GET     | `/login/teacher/{teacherID}`                     | Vérifier login enseignant                |
| GET     | `/login/learnerhg/{learnerID}`                   | Vérifier login élève HG                  |


## 🛒 PurchaseActivationResource (/store)
| Méthode | Endpoint                                                  | Description                                    |
| ------- | --------------------------------------------------------- | ---------------------------------------------- |
| GET     | `/store/learner/{playerID}`                               | Récupérer items d’un élève                     |
| GET     | `/store/reset/learner/{playerID}`                         | Réinitialiser items d’un élève                 |
| GET     | `/store/reset/classroom/{classroomID}/learner/{playerID}` | Réinitialiser items d’un élève dans une classe |
| GET     | `/store/classroom/{classroomID}/learner/{playerID}`       | Récupérer items d’un élève dans une classe     |
| POST | `/store` `json:` `{"items": [{"id": (String), "isActivated": (Boolean), "isBought": (Boolean)}], "usedCoins": (Long)}` | Met à jour les objets du joueur et déduit les pièces               |           |
| GET     | `/store/learnerhg/{playerID}`                             | Récupérer items HG d’un élève                  |
| POST    | `/store/hg`                                               | Mettre à jour items HG d’un élève              |

## 📈 StatisticsResource (/statistics)
| Méthode | Endpoint                                                  | Description                                       |
| ------- | --------------------------------------------------------- | ------------------------------------------------- |
| GET     | `/statistics/learner/{learnerID}`                         | Statistiques générales d’un élève                 |
| GET     | `/statistics/classroom/{classroomID}/learner/{learnerID}` | Statistiques générales d’un élève dans une classe |
| GET     | `/statistics/learnerhg/{learnerID}`                       | Statistiques générales HG d’un élève              |






