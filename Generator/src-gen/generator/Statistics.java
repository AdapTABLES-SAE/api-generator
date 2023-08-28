/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Statistics#getNbCorrectGivenAnswers <em>Nb Correct Given Answers</em>}</li>
 *   <li>{@link generator.Statistics#getNbQuestionsEncountered <em>Nb Questions Encountered</em>}</li>
 *   <li>{@link generator.Statistics#getMaxGameLevelReached <em>Max Game Level Reached</em>}</li>
 *   <li>{@link generator.Statistics#getTotalTime <em>Total Time</em>}</li>
 *   <li>{@link generator.Statistics#getNbDeaths <em>Nb Deaths</em>}</li>
 *   <li>{@link generator.Statistics#getNbLevelsGenerated <em>Nb Levels Generated</em>}</li>
 *   <li>{@link generator.Statistics#getNbFinishedLevels <em>Nb Finished Levels</em>}</li>
 *   <li>{@link generator.Statistics#getNbUnfinishedLevels <em>Nb Unfinished Levels</em>}</li>
 *   <li>{@link generator.Statistics#getTotalCoins <em>Total Coins</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getStatistics()
 * @model
 * @generated
 */
public interface Statistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Correct Given Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Correct Given Answers</em>' attribute.
	 * @see #setNbCorrectGivenAnswers(int)
	 * @see generator.GeneratorPackage#getStatistics_NbCorrectGivenAnswers()
	 * @model
	 * @generated
	 */
	int getNbCorrectGivenAnswers();

	/**
	 * Sets the value of the '{@link generator.Statistics#getNbCorrectGivenAnswers <em>Nb Correct Given Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Correct Given Answers</em>' attribute.
	 * @see #getNbCorrectGivenAnswers()
	 * @generated
	 */
	void setNbCorrectGivenAnswers(int value);

	/**
	 * Returns the value of the '<em><b>Nb Questions Encountered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Questions Encountered</em>' attribute.
	 * @see #setNbQuestionsEncountered(int)
	 * @see generator.GeneratorPackage#getStatistics_NbQuestionsEncountered()
	 * @model
	 * @generated
	 */
	int getNbQuestionsEncountered();

	/**
	 * Sets the value of the '{@link generator.Statistics#getNbQuestionsEncountered <em>Nb Questions Encountered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Questions Encountered</em>' attribute.
	 * @see #getNbQuestionsEncountered()
	 * @generated
	 */
	void setNbQuestionsEncountered(int value);

	/**
	 * Returns the value of the '<em><b>Max Game Level Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Game Level Reached</em>' attribute.
	 * @see #setMaxGameLevelReached(int)
	 * @see generator.GeneratorPackage#getStatistics_MaxGameLevelReached()
	 * @model
	 * @generated
	 */
	int getMaxGameLevelReached();

	/**
	 * Sets the value of the '{@link generator.Statistics#getMaxGameLevelReached <em>Max Game Level Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Game Level Reached</em>' attribute.
	 * @see #getMaxGameLevelReached()
	 * @generated
	 */
	void setMaxGameLevelReached(int value);

	/**
	 * Returns the value of the '<em><b>Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Time</em>' attribute.
	 * @see #setTotalTime(double)
	 * @see generator.GeneratorPackage#getStatistics_TotalTime()
	 * @model
	 * @generated
	 */
	double getTotalTime();

	/**
	 * Sets the value of the '{@link generator.Statistics#getTotalTime <em>Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Time</em>' attribute.
	 * @see #getTotalTime()
	 * @generated
	 */
	void setTotalTime(double value);

	/**
	 * Returns the value of the '<em><b>Nb Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Deaths</em>' attribute.
	 * @see #setNbDeaths(int)
	 * @see generator.GeneratorPackage#getStatistics_NbDeaths()
	 * @model
	 * @generated
	 */
	int getNbDeaths();

	/**
	 * Sets the value of the '{@link generator.Statistics#getNbDeaths <em>Nb Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Deaths</em>' attribute.
	 * @see #getNbDeaths()
	 * @generated
	 */
	void setNbDeaths(int value);

	/**
	 * Returns the value of the '<em><b>Nb Levels Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Levels Generated</em>' attribute.
	 * @see #setNbLevelsGenerated(int)
	 * @see generator.GeneratorPackage#getStatistics_NbLevelsGenerated()
	 * @model
	 * @generated
	 */
	int getNbLevelsGenerated();

	/**
	 * Sets the value of the '{@link generator.Statistics#getNbLevelsGenerated <em>Nb Levels Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Levels Generated</em>' attribute.
	 * @see #getNbLevelsGenerated()
	 * @generated
	 */
	void setNbLevelsGenerated(int value);

	/**
	 * Returns the value of the '<em><b>Nb Finished Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Finished Levels</em>' attribute.
	 * @see #setNbFinishedLevels(int)
	 * @see generator.GeneratorPackage#getStatistics_NbFinishedLevels()
	 * @model
	 * @generated
	 */
	int getNbFinishedLevels();

	/**
	 * Sets the value of the '{@link generator.Statistics#getNbFinishedLevels <em>Nb Finished Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Finished Levels</em>' attribute.
	 * @see #getNbFinishedLevels()
	 * @generated
	 */
	void setNbFinishedLevels(int value);

	/**
	 * Returns the value of the '<em><b>Nb Unfinished Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Unfinished Levels</em>' attribute.
	 * @see #setNbUnfinishedLevels(int)
	 * @see generator.GeneratorPackage#getStatistics_NbUnfinishedLevels()
	 * @model
	 * @generated
	 */
	int getNbUnfinishedLevels();

	/**
	 * Sets the value of the '{@link generator.Statistics#getNbUnfinishedLevels <em>Nb Unfinished Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Unfinished Levels</em>' attribute.
	 * @see #getNbUnfinishedLevels()
	 * @generated
	 */
	void setNbUnfinishedLevels(int value);

	/**
	 * Returns the value of the '<em><b>Total Coins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Coins</em>' attribute.
	 * @see #setTotalCoins(int)
	 * @see generator.GeneratorPackage#getStatistics_TotalCoins()
	 * @model
	 * @generated
	 */
	int getTotalCoins();

	/**
	 * Sets the value of the '{@link generator.Statistics#getTotalCoins <em>Total Coins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Coins</em>' attribute.
	 * @see #getTotalCoins()
	 * @generated
	 */
	void setTotalCoins(int value);

} // Statistics
