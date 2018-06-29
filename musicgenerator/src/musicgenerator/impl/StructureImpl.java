/**
 */
package musicgenerator.impl;

import java.util.Collection;

import musicgenerator.MusicgeneratorPackage;
import musicgenerator.Part;
import musicgenerator.Structure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.impl.StructureImpl#getPart <em>Part</em>}</li>
 *   <li>{@link musicgenerator.impl.StructureImpl#getVerseSize <em>Verse Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureImpl extends MinimalEObjectImpl.Container implements Structure {
	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> part;

	/**
	 * The default value of the '{@link #getVerseSize() <em>Verse Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerseSize()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSE_SIZE_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getVerseSize() <em>Verse Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerseSize()
	 * @generated
	 * @ordered
	 */
	protected int verseSize = VERSE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicgeneratorPackage.Literals.STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getPart() {
		if (part == null) {
			part = new EObjectResolvingEList<Part>(Part.class, this, MusicgeneratorPackage.STRUCTURE__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerseSize() {
		return verseSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerseSize(int newVerseSize) {
		int oldVerseSize = verseSize;
		verseSize = newVerseSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.STRUCTURE__VERSE_SIZE, oldVerseSize, verseSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicgeneratorPackage.STRUCTURE__PART:
				return getPart();
			case MusicgeneratorPackage.STRUCTURE__VERSE_SIZE:
				return getVerseSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MusicgeneratorPackage.STRUCTURE__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Part>)newValue);
				return;
			case MusicgeneratorPackage.STRUCTURE__VERSE_SIZE:
				setVerseSize((Integer)newValue);
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
			case MusicgeneratorPackage.STRUCTURE__PART:
				getPart().clear();
				return;
			case MusicgeneratorPackage.STRUCTURE__VERSE_SIZE:
				setVerseSize(VERSE_SIZE_EDEFAULT);
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
			case MusicgeneratorPackage.STRUCTURE__PART:
				return part != null && !part.isEmpty();
			case MusicgeneratorPackage.STRUCTURE__VERSE_SIZE:
				return verseSize != VERSE_SIZE_EDEFAULT;
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
		result.append(" (verseSize: ");
		result.append(verseSize);
		result.append(')');
		return result.toString();
	}

} //StructureImpl
