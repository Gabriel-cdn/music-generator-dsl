/**
 */
package musicgenerator.impl;

import musicgenerator.Info;
import musicgenerator.MusicgeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.impl.InfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link musicgenerator.impl.InfoImpl#getTone <em>Tone</em>}</li>
 *   <li>{@link musicgenerator.impl.InfoImpl#getTonality <em>Tonality</em>}</li>
 *   <li>{@link musicgenerator.impl.InfoImpl#getRandom_seed <em>Random seed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoImpl extends MinimalEObjectImpl.Container implements Info {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "My composition";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTone() <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTone()
	 * @generated
	 * @ordered
	 */
	protected static final String TONE_EDEFAULT = "C";

	/**
	 * The cached value of the '{@link #getTone() <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTone()
	 * @generated
	 * @ordered
	 */
	protected String tone = TONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTonality() <em>Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonality()
	 * @generated
	 * @ordered
	 */
	protected static final String TONALITY_EDEFAULT = "major";

	/**
	 * The cached value of the '{@link #getTonality() <em>Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonality()
	 * @generated
	 * @ordered
	 */
	protected String tonality = TONALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandom_seed() <em>Random seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_seed()
	 * @generated
	 * @ordered
	 */
	protected static final int RANDOM_SEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRandom_seed() <em>Random seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_seed()
	 * @generated
	 * @ordered
	 */
	protected int random_seed = RANDOM_SEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicgeneratorPackage.Literals.INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTone() {
		return tone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTone(String newTone) {
		String oldTone = tone;
		tone = newTone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.INFO__TONE, oldTone, tone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTonality() {
		return tonality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTonality(String newTonality) {
		String oldTonality = tonality;
		tonality = newTonality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.INFO__TONALITY, oldTonality, tonality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRandom_seed() {
		return random_seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandom_seed(int newRandom_seed) {
		int oldRandom_seed = random_seed;
		random_seed = newRandom_seed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.INFO__RANDOM_SEED, oldRandom_seed, random_seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicgeneratorPackage.INFO__NAME:
				return getName();
			case MusicgeneratorPackage.INFO__TONE:
				return getTone();
			case MusicgeneratorPackage.INFO__TONALITY:
				return getTonality();
			case MusicgeneratorPackage.INFO__RANDOM_SEED:
				return getRandom_seed();
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
			case MusicgeneratorPackage.INFO__NAME:
				setName((String)newValue);
				return;
			case MusicgeneratorPackage.INFO__TONE:
				setTone((String)newValue);
				return;
			case MusicgeneratorPackage.INFO__TONALITY:
				setTonality((String)newValue);
				return;
			case MusicgeneratorPackage.INFO__RANDOM_SEED:
				setRandom_seed((Integer)newValue);
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
			case MusicgeneratorPackage.INFO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MusicgeneratorPackage.INFO__TONE:
				setTone(TONE_EDEFAULT);
				return;
			case MusicgeneratorPackage.INFO__TONALITY:
				setTonality(TONALITY_EDEFAULT);
				return;
			case MusicgeneratorPackage.INFO__RANDOM_SEED:
				setRandom_seed(RANDOM_SEED_EDEFAULT);
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
			case MusicgeneratorPackage.INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MusicgeneratorPackage.INFO__TONE:
				return TONE_EDEFAULT == null ? tone != null : !TONE_EDEFAULT.equals(tone);
			case MusicgeneratorPackage.INFO__TONALITY:
				return TONALITY_EDEFAULT == null ? tonality != null : !TONALITY_EDEFAULT.equals(tonality);
			case MusicgeneratorPackage.INFO__RANDOM_SEED:
				return random_seed != RANDOM_SEED_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", tone: ");
		result.append(tone);
		result.append(", tonality: ");
		result.append(tonality);
		result.append(", random_seed: ");
		result.append(random_seed);
		result.append(')');
		return result.toString();
	}

} //InfoImpl
