/**
 */
package musicgenerator.impl;

import musicgenerator.Composition;
import musicgenerator.Info;
import musicgenerator.MusicgeneratorPackage;

import musicgenerator.Parts;
import musicgenerator.Rhythm;
import musicgenerator.Structure;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.impl.CompositionImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link musicgenerator.impl.CompositionImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link musicgenerator.impl.CompositionImpl#getRhythm <em>Rhythm</em>}</li>
 *   <li>{@link musicgenerator.impl.CompositionImpl#getInfo <em>Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends MinimalEObjectImpl.Container implements Composition {
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Structure structure;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected Parts parts;

	/**
	 * The cached value of the '{@link #getRhythm() <em>Rhythm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhythm()
	 * @generated
	 * @ordered
	 */
	protected Rhythm rhythm;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Info info;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicgeneratorPackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(Structure newStructure, NotificationChain msgs) {
		Structure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Structure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parts getParts() {
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParts(Parts newParts, NotificationChain msgs) {
		Parts oldParts = parts;
		parts = newParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__PARTS, oldParts, newParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParts(Parts newParts) {
		if (newParts != parts) {
			NotificationChain msgs = null;
			if (parts != null)
				msgs = ((InternalEObject)parts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__PARTS, null, msgs);
			if (newParts != null)
				msgs = ((InternalEObject)newParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__PARTS, null, msgs);
			msgs = basicSetParts(newParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__PARTS, newParts, newParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rhythm getRhythm() {
		return rhythm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhythm(Rhythm newRhythm, NotificationChain msgs) {
		Rhythm oldRhythm = rhythm;
		rhythm = newRhythm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__RHYTHM, oldRhythm, newRhythm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhythm(Rhythm newRhythm) {
		if (newRhythm != rhythm) {
			NotificationChain msgs = null;
			if (rhythm != null)
				msgs = ((InternalEObject)rhythm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__RHYTHM, null, msgs);
			if (newRhythm != null)
				msgs = ((InternalEObject)newRhythm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__RHYTHM, null, msgs);
			msgs = basicSetRhythm(newRhythm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__RHYTHM, newRhythm, newRhythm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(Info newInfo, NotificationChain msgs) {
		Info oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(Info newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MusicgeneratorPackage.COMPOSITION__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.COMPOSITION__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusicgeneratorPackage.COMPOSITION__STRUCTURE:
				return basicSetStructure(null, msgs);
			case MusicgeneratorPackage.COMPOSITION__PARTS:
				return basicSetParts(null, msgs);
			case MusicgeneratorPackage.COMPOSITION__RHYTHM:
				return basicSetRhythm(null, msgs);
			case MusicgeneratorPackage.COMPOSITION__INFO:
				return basicSetInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicgeneratorPackage.COMPOSITION__STRUCTURE:
				return getStructure();
			case MusicgeneratorPackage.COMPOSITION__PARTS:
				return getParts();
			case MusicgeneratorPackage.COMPOSITION__RHYTHM:
				return getRhythm();
			case MusicgeneratorPackage.COMPOSITION__INFO:
				return getInfo();
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
			case MusicgeneratorPackage.COMPOSITION__STRUCTURE:
				setStructure((Structure)newValue);
				return;
			case MusicgeneratorPackage.COMPOSITION__PARTS:
				setParts((Parts)newValue);
				return;
			case MusicgeneratorPackage.COMPOSITION__RHYTHM:
				setRhythm((Rhythm)newValue);
				return;
			case MusicgeneratorPackage.COMPOSITION__INFO:
				setInfo((Info)newValue);
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
			case MusicgeneratorPackage.COMPOSITION__STRUCTURE:
				setStructure((Structure)null);
				return;
			case MusicgeneratorPackage.COMPOSITION__PARTS:
				setParts((Parts)null);
				return;
			case MusicgeneratorPackage.COMPOSITION__RHYTHM:
				setRhythm((Rhythm)null);
				return;
			case MusicgeneratorPackage.COMPOSITION__INFO:
				setInfo((Info)null);
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
			case MusicgeneratorPackage.COMPOSITION__STRUCTURE:
				return structure != null;
			case MusicgeneratorPackage.COMPOSITION__PARTS:
				return parts != null;
			case MusicgeneratorPackage.COMPOSITION__RHYTHM:
				return rhythm != null;
			case MusicgeneratorPackage.COMPOSITION__INFO:
				return info != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionImpl
