/**
 */
package musicgenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.Info#getName <em>Name</em>}</li>
 *   <li>{@link musicgenerator.Info#getTone <em>Tone</em>}</li>
 *   <li>{@link musicgenerator.Info#getTonality <em>Tonality</em>}</li>
 *   <li>{@link musicgenerator.Info#getRandom_seed <em>Random seed</em>}</li>
 * </ul>
 *
 * @see musicgenerator.MusicgeneratorPackage#getInfo()
 * @model
 * @generated
 */
public interface Info extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"My composition"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see musicgenerator.MusicgeneratorPackage#getInfo_Name()
	 * @model default="My composition" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link musicgenerator.Info#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tone</b></em>' attribute.
	 * The default value is <code>"C"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tone</em>' attribute.
	 * @see #setTone(String)
	 * @see musicgenerator.MusicgeneratorPackage#getInfo_Tone()
	 * @model default="C" required="true"
	 * @generated
	 */
	String getTone();

	/**
	 * Sets the value of the '{@link musicgenerator.Info#getTone <em>Tone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tone</em>' attribute.
	 * @see #getTone()
	 * @generated
	 */
	void setTone(String value);

	/**
	 * Returns the value of the '<em><b>Tonality</b></em>' attribute.
	 * The default value is <code>"major"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tonality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tonality</em>' attribute.
	 * @see #setTonality(String)
	 * @see musicgenerator.MusicgeneratorPackage#getInfo_Tonality()
	 * @model default="major" required="true"
	 * @generated
	 */
	String getTonality();

	/**
	 * Sets the value of the '{@link musicgenerator.Info#getTonality <em>Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tonality</em>' attribute.
	 * @see #getTonality()
	 * @generated
	 */
	void setTonality(String value);

	/**
	 * Returns the value of the '<em><b>Random seed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random seed</em>' attribute.
	 * @see #setRandom_seed(int)
	 * @see musicgenerator.MusicgeneratorPackage#getInfo_Random_seed()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getRandom_seed();

	/**
	 * Sets the value of the '{@link musicgenerator.Info#getRandom_seed <em>Random seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random seed</em>' attribute.
	 * @see #getRandom_seed()
	 * @generated
	 */
	void setRandom_seed(int value);

} // Info
