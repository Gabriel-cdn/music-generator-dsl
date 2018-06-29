/**
 */
package musicgenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.Verse#getEmoticon <em>Emoticon</em>}</li>
 *   <li>{@link musicgenerator.Verse#getHarmony <em>Harmony</em>}</li>
 *   <li>{@link musicgenerator.Verse#getMelody <em>Melody</em>}</li>
 *   <li>{@link musicgenerator.Verse#getId_verse <em>Id verse</em>}</li>
 * </ul>
 *
 * @see musicgenerator.MusicgeneratorPackage#getVerse()
 * @model
 * @generated
 */
public interface Verse extends EObject {
	/**
	 * Returns the value of the '<em><b>Emoticon</b></em>' attribute.
	 * The literals are from the enumeration {@link musicgenerator.Emojis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emoticon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emoticon</em>' attribute.
	 * @see musicgenerator.Emojis
	 * @see #setEmoticon(Emojis)
	 * @see musicgenerator.MusicgeneratorPackage#getVerse_Emoticon()
	 * @model dataType="musicgenerator.Emojis" required="true"
	 * @generated
	 */
	Emojis getEmoticon();

	/**
	 * Sets the value of the '{@link musicgenerator.Verse#getEmoticon <em>Emoticon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emoticon</em>' attribute.
	 * @see musicgenerator.Emojis
	 * @see #getEmoticon()
	 * @generated
	 */
	void setEmoticon(Emojis value);

	/**
	 * Returns the value of the '<em><b>Harmony</b></em>' attribute list.
	 * The list contents are of type {@link musicgenerator.Instruments}.
	 * The literals are from the enumeration {@link musicgenerator.Instruments}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Harmony</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Harmony</em>' attribute list.
	 * @see musicgenerator.Instruments
	 * @see musicgenerator.MusicgeneratorPackage#getVerse_Harmony()
	 * @model
	 * @generated
	 */
	EList<Instruments> getHarmony();

	/**
	 * Returns the value of the '<em><b>Melody</b></em>' attribute list.
	 * The list contents are of type {@link musicgenerator.Instruments}.
	 * The literals are from the enumeration {@link musicgenerator.Instruments}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Melody</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Melody</em>' attribute list.
	 * @see musicgenerator.Instruments
	 * @see musicgenerator.MusicgeneratorPackage#getVerse_Melody()
	 * @model
	 * @generated
	 */
	EList<Instruments> getMelody();

	/**
	 * Returns the value of the '<em><b>Id verse</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id verse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id verse</em>' attribute.
	 * @see #setId_verse(int)
	 * @see musicgenerator.MusicgeneratorPackage#getVerse_Id_verse()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getId_verse();

	/**
	 * Sets the value of the '{@link musicgenerator.Verse#getId_verse <em>Id verse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id verse</em>' attribute.
	 * @see #getId_verse()
	 * @generated
	 */
	void setId_verse(int value);

} // Verse
