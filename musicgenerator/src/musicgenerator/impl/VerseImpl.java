/**
 */
package musicgenerator.impl;

import java.util.Collection;

import musicgenerator.Emojis;
import musicgenerator.Instruments;
import musicgenerator.MusicgeneratorPackage;
import musicgenerator.Verse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.impl.VerseImpl#getEmoticon <em>Emoticon</em>}</li>
 *   <li>{@link musicgenerator.impl.VerseImpl#getHarmony <em>Harmony</em>}</li>
 *   <li>{@link musicgenerator.impl.VerseImpl#getMelody <em>Melody</em>}</li>
 *   <li>{@link musicgenerator.impl.VerseImpl#getId_verse <em>Id verse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerseImpl extends MinimalEObjectImpl.Container implements Verse {
	/**
	 * The default value of the '{@link #getEmoticon() <em>Emoticon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmoticon()
	 * @generated
	 * @ordered
	 */
	protected static final Emojis EMOTICON_EDEFAULT = Emojis.HAPPY;

	/**
	 * The cached value of the '{@link #getEmoticon() <em>Emoticon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmoticon()
	 * @generated
	 * @ordered
	 */
	protected Emojis emoticon = EMOTICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHarmony() <em>Harmony</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmony()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruments> harmony;

	/**
	 * The cached value of the '{@link #getMelody() <em>Melody</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMelody()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruments> melody;

	/**
	 * The default value of the '{@link #getId_verse() <em>Id verse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_verse()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_VERSE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getId_verse() <em>Id verse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_verse()
	 * @generated
	 * @ordered
	 */
	protected int id_verse = ID_VERSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicgeneratorPackage.Literals.VERSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emojis getEmoticon() {
		return emoticon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmoticon(Emojis newEmoticon) {
		Emojis oldEmoticon = emoticon;
		emoticon = newEmoticon == null ? EMOTICON_EDEFAULT : newEmoticon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.VERSE__EMOTICON, oldEmoticon, emoticon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruments> getHarmony() {
		if (harmony == null) {
			harmony = new EDataTypeUniqueEList<Instruments>(Instruments.class, this, MusicgeneratorPackage.VERSE__HARMONY);
		}
		return harmony;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruments> getMelody() {
		if (melody == null) {
			melody = new EDataTypeUniqueEList<Instruments>(Instruments.class, this, MusicgeneratorPackage.VERSE__MELODY);
		}
		return melody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId_verse() {
		return id_verse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId_verse(int newId_verse) {
		int oldId_verse = id_verse;
		id_verse = newId_verse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicgeneratorPackage.VERSE__ID_VERSE, oldId_verse, id_verse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicgeneratorPackage.VERSE__EMOTICON:
				return getEmoticon();
			case MusicgeneratorPackage.VERSE__HARMONY:
				return getHarmony();
			case MusicgeneratorPackage.VERSE__MELODY:
				return getMelody();
			case MusicgeneratorPackage.VERSE__ID_VERSE:
				return getId_verse();
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
			case MusicgeneratorPackage.VERSE__EMOTICON:
				setEmoticon((Emojis)newValue);
				return;
			case MusicgeneratorPackage.VERSE__HARMONY:
				getHarmony().clear();
				getHarmony().addAll((Collection<? extends Instruments>)newValue);
				return;
			case MusicgeneratorPackage.VERSE__MELODY:
				getMelody().clear();
				getMelody().addAll((Collection<? extends Instruments>)newValue);
				return;
			case MusicgeneratorPackage.VERSE__ID_VERSE:
				setId_verse((Integer)newValue);
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
			case MusicgeneratorPackage.VERSE__EMOTICON:
				setEmoticon(EMOTICON_EDEFAULT);
				return;
			case MusicgeneratorPackage.VERSE__HARMONY:
				getHarmony().clear();
				return;
			case MusicgeneratorPackage.VERSE__MELODY:
				getMelody().clear();
				return;
			case MusicgeneratorPackage.VERSE__ID_VERSE:
				setId_verse(ID_VERSE_EDEFAULT);
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
			case MusicgeneratorPackage.VERSE__EMOTICON:
				return emoticon != EMOTICON_EDEFAULT;
			case MusicgeneratorPackage.VERSE__HARMONY:
				return harmony != null && !harmony.isEmpty();
			case MusicgeneratorPackage.VERSE__MELODY:
				return melody != null && !melody.isEmpty();
			case MusicgeneratorPackage.VERSE__ID_VERSE:
				return id_verse != ID_VERSE_EDEFAULT;
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
		result.append(" (emoticon: ");
		result.append(emoticon);
		result.append(", harmony: ");
		result.append(harmony);
		result.append(", melody: ");
		result.append(melody);
		result.append(", id_verse: ");
		result.append(id_verse);
		result.append(')');
		return result.toString();
	}

} //VerseImpl
