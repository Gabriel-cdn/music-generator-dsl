/**
 */
package musicgenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.Part#getTitle <em>Title</em>}</li>
 *   <li>{@link musicgenerator.Part#getVerse <em>Verse</em>}</li>
 * </ul>
 *
 * @see musicgenerator.MusicgeneratorPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see musicgenerator.MusicgeneratorPackage#getPart_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link musicgenerator.Part#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Verse</b></em>' containment reference list.
	 * The list contents are of type {@link musicgenerator.Verse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verse</em>' containment reference list.
	 * @see musicgenerator.MusicgeneratorPackage#getPart_Verse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Verse> getVerse();

} // Part
