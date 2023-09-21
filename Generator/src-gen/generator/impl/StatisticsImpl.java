/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import generator.GeneratorPackage;
import generator.Statistics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.StatisticsImpl#getNbCorrectGivenAnswers <em>Nb Correct Given Answers</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getNbQuestionsEncountered <em>Nb Questions Encountered</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getMaxGameLevelReached <em>Max Game Level Reached</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getTotalTimeMin <em>Total Time Min</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getNbDeaths <em>Nb Deaths</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getNbLevelsGenerated <em>Nb Levels Generated</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getNbFinishedLevels <em>Nb Finished Levels</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getNbUnfinishedLevels <em>Nb Unfinished Levels</em>}</li>
 *   <li>{@link generator.impl.StatisticsImpl#getTotalCoins <em>Total Coins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticsImpl extends MinimalEObjectImpl.Container implements Statistics {
	/**
	 * The default value of the '{@link #getNbCorrectGivenAnswers() <em>Nb Correct Given Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCorrectGivenAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CORRECT_GIVEN_ANSWERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbCorrectGivenAnswers() <em>Nb Correct Given Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCorrectGivenAnswers()
	 * @generated
	 * @ordered
	 */
	protected int nbCorrectGivenAnswers = NB_CORRECT_GIVEN_ANSWERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbQuestionsEncountered() <em>Nb Questions Encountered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbQuestionsEncountered()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_QUESTIONS_ENCOUNTERED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbQuestionsEncountered() <em>Nb Questions Encountered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbQuestionsEncountered()
	 * @generated
	 * @ordered
	 */
	protected int nbQuestionsEncountered = NB_QUESTIONS_ENCOUNTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxGameLevelReached() <em>Max Game Level Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxGameLevelReached()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_GAME_LEVEL_REACHED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxGameLevelReached() <em>Max Game Level Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxGameLevelReached()
	 * @generated
	 * @ordered
	 */
	protected int maxGameLevelReached = MAX_GAME_LEVEL_REACHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalTimeMin() <em>Total Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimeMin()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_TIME_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalTimeMin() <em>Total Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimeMin()
	 * @generated
	 * @ordered
	 */
	protected int totalTimeMin = TOTAL_TIME_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbDeaths() <em>Nb Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDeaths()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_DEATHS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbDeaths() <em>Nb Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDeaths()
	 * @generated
	 * @ordered
	 */
	protected int nbDeaths = NB_DEATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbLevelsGenerated() <em>Nb Levels Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLevelsGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_LEVELS_GENERATED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbLevelsGenerated() <em>Nb Levels Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLevelsGenerated()
	 * @generated
	 * @ordered
	 */
	protected int nbLevelsGenerated = NB_LEVELS_GENERATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbFinishedLevels() <em>Nb Finished Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFinishedLevels()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_FINISHED_LEVELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbFinishedLevels() <em>Nb Finished Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFinishedLevels()
	 * @generated
	 * @ordered
	 */
	protected int nbFinishedLevels = NB_FINISHED_LEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbUnfinishedLevels() <em>Nb Unfinished Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbUnfinishedLevels()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_UNFINISHED_LEVELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbUnfinishedLevels() <em>Nb Unfinished Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbUnfinishedLevels()
	 * @generated
	 * @ordered
	 */
	protected int nbUnfinishedLevels = NB_UNFINISHED_LEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCoins() <em>Total Coins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCoins()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_COINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCoins() <em>Total Coins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCoins()
	 * @generated
	 * @ordered
	 */
	protected int totalCoins = TOTAL_COINS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbCorrectGivenAnswers() {
		return nbCorrectGivenAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCorrectGivenAnswers(int newNbCorrectGivenAnswers) {
		int oldNbCorrectGivenAnswers = nbCorrectGivenAnswers;
		nbCorrectGivenAnswers = newNbCorrectGivenAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__NB_CORRECT_GIVEN_ANSWERS,
					oldNbCorrectGivenAnswers, nbCorrectGivenAnswers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbQuestionsEncountered() {
		return nbQuestionsEncountered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbQuestionsEncountered(int newNbQuestionsEncountered) {
		int oldNbQuestionsEncountered = nbQuestionsEncountered;
		nbQuestionsEncountered = newNbQuestionsEncountered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__NB_QUESTIONS_ENCOUNTERED,
					oldNbQuestionsEncountered, nbQuestionsEncountered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxGameLevelReached() {
		return maxGameLevelReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxGameLevelReached(int newMaxGameLevelReached) {
		int oldMaxGameLevelReached = maxGameLevelReached;
		maxGameLevelReached = newMaxGameLevelReached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__MAX_GAME_LEVEL_REACHED,
					oldMaxGameLevelReached, maxGameLevelReached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalTimeMin() {
		return totalTimeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalTimeMin(int newTotalTimeMin) {
		int oldTotalTimeMin = totalTimeMin;
		totalTimeMin = newTotalTimeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__TOTAL_TIME_MIN,
					oldTotalTimeMin, totalTimeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbDeaths() {
		return nbDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbDeaths(int newNbDeaths) {
		int oldNbDeaths = nbDeaths;
		nbDeaths = newNbDeaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__NB_DEATHS, oldNbDeaths,
					nbDeaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbLevelsGenerated() {
		return nbLevelsGenerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbLevelsGenerated(int newNbLevelsGenerated) {
		int oldNbLevelsGenerated = nbLevelsGenerated;
		nbLevelsGenerated = newNbLevelsGenerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__NB_LEVELS_GENERATED,
					oldNbLevelsGenerated, nbLevelsGenerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbFinishedLevels() {
		return nbFinishedLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFinishedLevels(int newNbFinishedLevels) {
		int oldNbFinishedLevels = nbFinishedLevels;
		nbFinishedLevels = newNbFinishedLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__NB_FINISHED_LEVELS,
					oldNbFinishedLevels, nbFinishedLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbUnfinishedLevels() {
		return nbUnfinishedLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbUnfinishedLevels(int newNbUnfinishedLevels) {
		int oldNbUnfinishedLevels = nbUnfinishedLevels;
		nbUnfinishedLevels = newNbUnfinishedLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__NB_UNFINISHED_LEVELS,
					oldNbUnfinishedLevels, nbUnfinishedLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCoins() {
		return totalCoins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCoins(int newTotalCoins) {
		int oldTotalCoins = totalCoins;
		totalCoins = newTotalCoins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATISTICS__TOTAL_COINS,
					oldTotalCoins, totalCoins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.STATISTICS__NB_CORRECT_GIVEN_ANSWERS:
			return getNbCorrectGivenAnswers();
		case GeneratorPackage.STATISTICS__NB_QUESTIONS_ENCOUNTERED:
			return getNbQuestionsEncountered();
		case GeneratorPackage.STATISTICS__MAX_GAME_LEVEL_REACHED:
			return getMaxGameLevelReached();
		case GeneratorPackage.STATISTICS__TOTAL_TIME_MIN:
			return getTotalTimeMin();
		case GeneratorPackage.STATISTICS__NB_DEATHS:
			return getNbDeaths();
		case GeneratorPackage.STATISTICS__NB_LEVELS_GENERATED:
			return getNbLevelsGenerated();
		case GeneratorPackage.STATISTICS__NB_FINISHED_LEVELS:
			return getNbFinishedLevels();
		case GeneratorPackage.STATISTICS__NB_UNFINISHED_LEVELS:
			return getNbUnfinishedLevels();
		case GeneratorPackage.STATISTICS__TOTAL_COINS:
			return getTotalCoins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratorPackage.STATISTICS__NB_CORRECT_GIVEN_ANSWERS:
			setNbCorrectGivenAnswers((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__NB_QUESTIONS_ENCOUNTERED:
			setNbQuestionsEncountered((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__MAX_GAME_LEVEL_REACHED:
			setMaxGameLevelReached((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__TOTAL_TIME_MIN:
			setTotalTimeMin((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__NB_DEATHS:
			setNbDeaths((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__NB_LEVELS_GENERATED:
			setNbLevelsGenerated((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__NB_FINISHED_LEVELS:
			setNbFinishedLevels((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__NB_UNFINISHED_LEVELS:
			setNbUnfinishedLevels((Integer) newValue);
			return;
		case GeneratorPackage.STATISTICS__TOTAL_COINS:
			setTotalCoins((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GeneratorPackage.STATISTICS__NB_CORRECT_GIVEN_ANSWERS:
			setNbCorrectGivenAnswers(NB_CORRECT_GIVEN_ANSWERS_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__NB_QUESTIONS_ENCOUNTERED:
			setNbQuestionsEncountered(NB_QUESTIONS_ENCOUNTERED_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__MAX_GAME_LEVEL_REACHED:
			setMaxGameLevelReached(MAX_GAME_LEVEL_REACHED_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__TOTAL_TIME_MIN:
			setTotalTimeMin(TOTAL_TIME_MIN_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__NB_DEATHS:
			setNbDeaths(NB_DEATHS_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__NB_LEVELS_GENERATED:
			setNbLevelsGenerated(NB_LEVELS_GENERATED_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__NB_FINISHED_LEVELS:
			setNbFinishedLevels(NB_FINISHED_LEVELS_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__NB_UNFINISHED_LEVELS:
			setNbUnfinishedLevels(NB_UNFINISHED_LEVELS_EDEFAULT);
			return;
		case GeneratorPackage.STATISTICS__TOTAL_COINS:
			setTotalCoins(TOTAL_COINS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GeneratorPackage.STATISTICS__NB_CORRECT_GIVEN_ANSWERS:
			return nbCorrectGivenAnswers != NB_CORRECT_GIVEN_ANSWERS_EDEFAULT;
		case GeneratorPackage.STATISTICS__NB_QUESTIONS_ENCOUNTERED:
			return nbQuestionsEncountered != NB_QUESTIONS_ENCOUNTERED_EDEFAULT;
		case GeneratorPackage.STATISTICS__MAX_GAME_LEVEL_REACHED:
			return maxGameLevelReached != MAX_GAME_LEVEL_REACHED_EDEFAULT;
		case GeneratorPackage.STATISTICS__TOTAL_TIME_MIN:
			return totalTimeMin != TOTAL_TIME_MIN_EDEFAULT;
		case GeneratorPackage.STATISTICS__NB_DEATHS:
			return nbDeaths != NB_DEATHS_EDEFAULT;
		case GeneratorPackage.STATISTICS__NB_LEVELS_GENERATED:
			return nbLevelsGenerated != NB_LEVELS_GENERATED_EDEFAULT;
		case GeneratorPackage.STATISTICS__NB_FINISHED_LEVELS:
			return nbFinishedLevels != NB_FINISHED_LEVELS_EDEFAULT;
		case GeneratorPackage.STATISTICS__NB_UNFINISHED_LEVELS:
			return nbUnfinishedLevels != NB_UNFINISHED_LEVELS_EDEFAULT;
		case GeneratorPackage.STATISTICS__TOTAL_COINS:
			return totalCoins != TOTAL_COINS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nbCorrectGivenAnswers: ");
		result.append(nbCorrectGivenAnswers);
		result.append(", nbQuestionsEncountered: ");
		result.append(nbQuestionsEncountered);
		result.append(", maxGameLevelReached: ");
		result.append(maxGameLevelReached);
		result.append(", totalTimeMin: ");
		result.append(totalTimeMin);
		result.append(", nbDeaths: ");
		result.append(nbDeaths);
		result.append(", nbLevelsGenerated: ");
		result.append(nbLevelsGenerated);
		result.append(", nbFinishedLevels: ");
		result.append(nbFinishedLevels);
		result.append(", nbUnfinishedLevels: ");
		result.append(nbUnfinishedLevels);
		result.append(", totalCoins: ");
		result.append(totalCoins);
		result.append(')');
		return result.toString();
	}

} //StatisticsImpl
