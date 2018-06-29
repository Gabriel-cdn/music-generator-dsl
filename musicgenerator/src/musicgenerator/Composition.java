/**
 */
package musicgenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.Composition#getStructure <em>Structure</em>}</li>
 *   <li>{@link musicgenerator.Composition#getParts <em>Parts</em>}</li>
 *   <li>{@link musicgenerator.Composition#getRhythm <em>Rhythm</em>}</li>
 *   <li>{@link musicgenerator.Composition#getInfo <em>Info</em>}</li>
 * </ul>
 *
 * @see musicgenerator.MusicgeneratorPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(Structure)
	 * @see musicgenerator.MusicgeneratorPackage#getComposition_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Structure getStructure();

	/**
	 * Sets the value of the '{@link musicgenerator.Composition#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Structure value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference.
	 * @see #setParts(Parts)
	 * @see musicgenerator.MusicgeneratorPackage#getComposition_Parts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parts getParts();

	/**
	 * Sets the value of the '{@link musicgenerator.Composition#getParts <em>Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parts</em>' containment reference.
	 * @see #getParts()
	 * @generated
	 */
	void setParts(Parts value);

	/**
	 * Returns the value of the '<em><b>Rhythm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhythm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhythm</em>' containment reference.
	 * @see #setRhythm(Rhythm)
	 * @see musicgenerator.MusicgeneratorPackage#getComposition_Rhythm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rhythm getRhythm();

	/**
	 * Sets the value of the '{@link musicgenerator.Composition#getRhythm <em>Rhythm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhythm</em>' containment reference.
	 * @see #getRhythm()
	 * @generated
	 */
	void setRhythm(Rhythm value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see musicgenerator.MusicgeneratorPackage#getComposition_Info()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link musicgenerator.Composition#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(Info value);

} // Composition
