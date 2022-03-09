package Generator;

public class Generator {

	public static void main(String[] args) {
		
		private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

		private final static String MODELS_FOLDER = "case1"; 

		private Domain domainRoot;
		private GenerationChoices choicesRoot;
		private Context contextRoot;

		private ResourceSet resSet;

		public Generator() {
			resSet = new ResourceSetImpl();
		}

		public static void main(String[] args) {

			try {
				MyLogger.setup();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Problems with creating the log files");
			}

			new Generator().start();

		}

		private void start() {

			loadModels();		

			createRootGenModel();

			try {
				generateObjective();

			} catch (GenerationException e) {
				System.err.println("Error while generating the objective : " + e.getMessage());
			}



			// TODO generateActivityType

			saveGeneratedModel();

			// TODO generation low level

		}



		private void createRootGenModel() {
			choicesRoot = AdapTablesFactory.eINSTANCE.createGenerationChoices();
			
		}

		private void generateObjective() throws GenerationException {

			List<Objective> availableObjectives = fetchAllAvailableObjectives();
			

			List<Objective> filteredObjectives = filterToEligibleObjective(availableObjectives);

			for (Objective obj: filteredObjectives) {
				LOGGER.info("ELIGIBLE OBJECTIVE " + obj.getName());
			}

			Objective selectedObjective = applyChoiceStrategy(filteredObjectives);
			
			LOGGER.info("FINAL SELECTED OBJECTIVE" + selectedObjective.getName());
			
		}

		private Objective applyChoiceStrategy(List<Objective> filteredObjectives) {

			List<PedagogicalStrategy> strategies = contextRoot.getCurrentLearner().getPedagogicalStrategies();

			return null;
		}

		private List<Objective> fetchAllAvailableObjectives() throws GenerationException {
			List<Objective> res = new ArrayList<>();

			Path currentPath = contextRoot.getCurrentLearner().getPath();

			if (currentPath == null) {
				throw new GenerationException(ObjectiveCodeError.NO_PATH);
			}

			for (Objective obj: currentPath.getObjectives()) {
				res.addAll(getObjectiveOrSubObjectivesFrom(obj));
			}

			return res;
		}

		private List<Objective> getObjectiveOrSubObjectivesFrom(Objective obj) {
			List<Objective> res = new ArrayList<>();

			if (obj.getSubObjectives().isEmpty()) {
				res.add(obj);
			} else {
				for (Objective subObj: obj.getSubObjectives()) {
					res.addAll(getObjectiveOrSubObjectivesFrom(subObj));
				}
			}
			return res;
		}

		private List<Objective> filterToEligibleObjective(List<Objective> availableObjectives) {
			List<Objective> res = new ArrayList<>();

			boolean allAcquired = areAllOjectivesAcquired(availableObjectives);

			for (Objective obj: availableObjectives) {
				if (isEligible(obj, allAcquired)) {
					res.add(obj);
				}
			}

			return res;
		}

		private boolean areAllOjectivesAcquired(List<Objective> objectives) {
			for (Objective o: objectives) {
				CurrentObjectiveLevel relatedObj = getCurrentObjectiveLevelFor(o);
				if (relatedObj == null) {
					return false;
				}
				if (!relatedObj.isAcquired()) {
					return false;
				}
			}
			return true;
		}

		private boolean isEligible(Objective obj, boolean allAcquired) {
			CurrentObjectiveLevel relatedObj = getCurrentObjectiveLevelFor(obj);

			if (isDynamicalObjective(obj)) {
				return preRequisiteOKForDynamicalObjective(obj);
			}

			if (relatedObj == null) {
				return preRequisiteOKFor(obj);
			} else {		
				if (!relatedObj.isAcquired()) {
					return true;
				} else {
					return allAcquired;
				}
			}
		}



		private boolean preRequisiteOKForDynamicalObjective(Objective obj) {
			
			final int MINIMAL_ACQUIRED_OBJECTIVE = 2;
			
			SetOfNumberFacts set = obj.getSetoffacts();
			if (set instanceof DynamicalSetOf) {
				List<Source> sources = ((DynamicalSetOf) set).getSource();

				if (sources.isEmpty())
					return false;

				int cpt = 0;
				for (Source source: sources) {
					Objective o = source.getObjective();
					CurrentObjectiveLevel relatedObj = getCurrentObjectiveLevelFor(o);

					if (relatedObj != null) {	
						if ((source.getGrade() == null && relatedObj.isAcquired())
								|| (source.getGrade() != null && currentGradeOkWithTreshold(relatedObj.getLevel(),source.getGrade(),o))) {
							cpt++;
							
							if (cpt >= MINIMAL_ACQUIRED_OBJECTIVE)
								return true;
						}
					}
				}
			}

			return false;
		}

		private boolean isDynamicalObjective(Objective obj) {

			return (obj.getSetoffacts() instanceof DynamicalSetOf);
		}

		private boolean preRequisiteOKFor(Objective obj) {
			if (obj.getPrerequisite().isEmpty()) {
				return true;
			}
			for (Prerequisite pre: obj.getPrerequisite()) {
				CurrentObjectiveLevel relatedObjForPre = getCurrentObjectiveLevelFor(pre.getObjective());
				if (relatedObjForPre == null) {
					return false;
				}
				if (relatedObjForPre.getLevel() == null && !relatedObjForPre.isAcquired()) {
					return false;
				}
				if (!currentGradeOkWithTreshold(relatedObjForPre.getLevel(), pre.getEligibilityMinimalTreshold(), pre.getObjective())) {
					return false;
				}
				if (pre.getMinMeanPercentOfRightAnswers() >= 0 && relatedObjForPre.getMeanPercentOfRightAnswers() < pre.getMinMeanPercentOfRightAnswers()) {
					return false;
				}
			}
			return true;
		}

		private boolean currentGradeOkWithTreshold(Grade level, Grade eligibilityMinimalTreshold, Objective objective) {

			int index = 0;
			int currentGradeIndex = -1;
			int minimalGradeIndex = -2;
			for (Grade grade: objective.getGrade()) {
				if (grade.equals(level))
					currentGradeIndex = index;
				if (grade.equals(eligibilityMinimalTreshold))
					minimalGradeIndex = index;
				index++;
			}
			return currentGradeIndex >= minimalGradeIndex;
		}

		private CurrentObjectiveLevel getCurrentObjectiveLevelFor(Objective obj) {
			List<CurrentObjectiveLevel> allcurrentObjLevel = contextRoot.getCurrentLearner().getCurrentobjectivelevel();

			if (allcurrentObjLevel.isEmpty()) 
				return null;

			for (CurrentObjectiveLevel col: allcurrentObjLevel) {
				if (col.getObjective().equals(obj)) 
					return col;
			}

			return null;
		}

		private void saveGeneratedModel() {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
			m.put("xmi", fact);
			m.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
			String outFileName = "FirstGenModel.xmi";
			String path = "model/" + MODELS_FOLDER + "/";
			Resource resource = resSet.createResource(URI.createURI(path + outFileName));

			resource.getContents().add(choicesRoot);

			try {
				resource.save(m);
			} catch (IOException e) {
				LOGGER.severe("Error when saving " + outFileName);
				e.printStackTrace();
				return;
			}
			LOGGER.info("Saving '" + outFileName + "' file : OK");
		}

		private void loadModels() {
			loadInputModels();

			LOGGER.info("Loading context and domain models : OK");
		}

		private void loadInputModels() {
			AdapTablesPackage.eINSTANCE.eClass();
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());

			String path = "model/" + MODELS_FOLDER + "/";

			File file = new File(path + "Context.xmi");
			Resource r = resSet.createResource(URI.createFileURI(file.getAbsolutePath()));
			try {
				r.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			EcoreUtil.resolveAll(resSet);
			contextRoot = (Context) r.getContents().get(0);

			Resource resource2 = resSet.getResource(URI.createURI(path + "Domain.xmi"), true);
			EcoreUtil.resolveAll(resSet);
			domainRoot = (Domain) resource2.getContents().get(0);
		}

	}

}
