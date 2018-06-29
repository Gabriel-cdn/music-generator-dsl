/**
 */
package musicgenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rhythm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicgenerator.Rhythm#getCompass <em>Compass</em>}</li>
 *   <li>{@link musicgenerator.Rhythm#getBpm <em>Bpm</em>}</li>
 *   <li>{@link musicgenerator.Rhythm#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see musicgenerator.MusicgeneratorPackage#getRhythm()
 * @model
 * @generated
 */
public interface Rhythm extends EObject {
	/**
	 * Returns the value of the '<em><b>Compass</b></em>' attribute.
	 * The default value is <code>"6/8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass</em>' attribute.
	 * @see #setCompass(String)
	 * @see musicgenerator.MusicgeneratorPackage#getRhythm_Compass()
	 * @model default="6/8" required="true"
	 * @generated
	 */
	String getCompass();

	/**
	 * Sets the value of the '{@link musicgenerator.Rhythm#getCompass <em>Compass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass</em>' attribute.
	 * @see #getCompass()
	 * @generated
	 */
	void setCompass(String value);

	/**
	 * Returns the value of the '<em><b>Bpm</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpm</em>' attribute.
	 * @see #setBpm(int)
	 * @see musicgenerator.MusicgeneratorPackage#getRhythm_Bpm()
	 * @model default="60" required="true"
	 * @generated
	 */
	int getBpm();

	/**
	 * Sets the value of the '{@link musicgenerator.Rhythm#getBpm <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpm</em>' attribute.
	 * @see #getBpm()
	 * @generated
	 */
	void setBpm(int value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link musicgenerator.Styles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see musicgenerator.Styles
	 * @see #setStyle(Styles)
	 * @see musicgenerator.MusicgeneratorPackage#getRhythm_Style()
	 * @model required="true"
	 * @generated
	 */
	Styles getStyle();

	/**
	 * Sets the value of the '{@link musicgenerator.Rhythm#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see musicgenerator.Styles
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Styles value);

} // Rhythm
