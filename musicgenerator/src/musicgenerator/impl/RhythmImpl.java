/**
 */
package musicgenerator.impl;

import musicgenerator.MusicgeneratorPackage;
import musicgenerator.Rhythm;
import musicgenerator.Styles;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rhythm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.impl.RhythmImpl#getCompass <em>Compass</em>}</li>
 *   <li>{@link musicgenerator.impl.RhythmImpl#getBpm <em>Bpm</em>}</li>
 *   <li>{@link musicgenerator.impl.RhythmImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RhythmImpl extends MinimalEObjectImpl.Container implements Rhythm {
	/**
	 * The default value of the '{@link #getCompass() <em>Compass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompass()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPASS_EDEFAULT = "6/8";

	/**
	 * The cached value of the '{@link #getCompass() <em>Compass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompass()
	 * @generated
	 * @ordered
	 */
	protected String compass = COMPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected static final int BPM_EDEFAULT = 60;

	/**
	 * The cached value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected int bpm = BPM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Styles STYLE_EDEFAULT = Styles.NONE;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Styles style = STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RhythmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicgeneratorPackage.Literals.RHYTHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompass() {
		return compass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompass(String newCompass) {
		String oldCompass = compass;
		compass = newCompass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.RHYTHM__COMPASS, oldCompass, compass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBpm() {
		return bpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpm(int newBpm) {
		int oldBpm = bpm;
		bpm = newBpm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.RHYTHM__BPM, oldBpm, bpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Styles getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(Styles newStyle) {
		Styles oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.RHYTHM__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicgeneratorPackage.RHYTHM__COMPASS:
				return getCompass();
			case MusicgeneratorPackage.RHYTHM__BPM:
				return getBpm();
			case MusicgeneratorPackage.RHYTHM__STYLE:
				return getStyle();
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
			case MusicgeneratorPackage.RHYTHM__COMPASS:
				setCompass((String)newValue);
				return;
			case MusicgeneratorPackage.RHYTHM__BPM:
				setBpm((Integer)newValue);
				return;
			case MusicgeneratorPackage.RHYTHM__STYLE:
				setStyle((Styles)newValue);
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
			case MusicgeneratorPackage.RHYTHM__COMPASS:
				setCompass(COMPASS_EDEFAULT);
				return;
			case MusicgeneratorPackage.RHYTHM__BPM:
				setBpm(BPM_EDEFAULT);
				return;
			case MusicgeneratorPackage.RHYTHM__STYLE:
				setStyle(STYLE_EDEFAULT);
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
			case MusicgeneratorPackage.RHYTHM__COMPASS:
				return COMPASS_EDEFAULT == null ? compass != null : !COMPASS_EDEFAULT.equals(compass);
			case MusicgeneratorPackage.RHYTHM__BPM:
				return bpm != BPM_EDEFAULT;
			case MusicgeneratorPackage.RHYTHM__STYLE:
				return style != STYLE_EDEFAULT;
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
		result.append(" (compass: ");
		result.append(compass);
		result.append(", bpm: ");
		result.append(bpm);
		result.append(", Style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //RhythmImpl
