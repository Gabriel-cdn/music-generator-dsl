/**
 */
package musicgenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.Parts#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see musicgenerator.MusicgeneratorPackage#getParts()
 * @model
 * @generated
 */
public interface Parts extends EObject {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link musicgenerator.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see musicgenerator.MusicgeneratorPackage#getParts_Part()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Part> getPart();

} // Parts
