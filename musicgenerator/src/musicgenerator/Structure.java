/**
 */
package musicgenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.Structure#getPart <em>Part</em>}</li>
 *   <li>{@link musicgenerator.Structure#getVerseSize <em>Verse Size</em>}</li>
 * </ul>
 *
 * @see musicgenerator.MusicgeneratorPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends EObject {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link musicgenerator.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see musicgenerator.MusicgeneratorPackage#getStructure_Part()
	 * @model required="true"
	 * @generated
	 */
	EList<Part> getPart();

	/**
	 * Returns the value of the '<em><b>Verse Size</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verse Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verse Size</em>' attribute.
	 * @see #setVerseSize(int)
	 * @see musicgenerator.MusicgeneratorPackage#getStructure_VerseSize()
	 * @model default="4" required="true"
	 * @generated
	 */
	int getVerseSize();

	/**
	 * Sets the value of the '{@link musicgenerator.Structure#getVerseSize <em>Verse Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verse Size</em>' attribute.
	 * @see #getVerseSize()
	 * @generated
	 */
	void setVerseSize(int value);

} // Structure
