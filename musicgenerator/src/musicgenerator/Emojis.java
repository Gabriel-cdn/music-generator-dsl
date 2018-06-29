/**
 */
package musicgenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Emojis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see musicgenerator.MusicgeneratorPackage#getEmojis()
 * @model instanceClass="musicgenerator.Emojis"
 * @generated
 */
public enum Emojis implements Enumerator {
	/**
	 * The '<em><b>Happy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAPPY_VALUE
	 * @generated
	 * @ordered
	 */
	HAPPY(0, "Happy", ":)"),

	/**
	 * The '<em><b>Smiling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMILING_VALUE
	 * @generated
	 * @ordered
	 */
	SMILING(1, "Smiling", ":D"),

	/**
	 * The '<em><b>Cool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOL_VALUE
	 * @generated
	 * @ordered
	 */
	COOL(2, "Cool", "8)"),

	/**
	 * The '<em><b>Silent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENT_VALUE
	 * @generated
	 * @ordered
	 */
	SILENT(3, "Silent", ":x"),

	/**
	 * The '<em><b>Surprise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURPRISE_VALUE
	 * @generated
	 * @ordered
	 */
	SURPRISE(4, "Surprise", ":o"),

	/**
	 * The '<em><b>Heart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEART_VALUE
	 * @generated
	 * @ordered
	 */
	HEART(5, "Heart", "<3");

	/**
	 * The '<em><b>Happy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Happy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAPPY
	 * @model name="Happy" literal=":)"
	 * @generated
	 * @ordered
	 */
	public static final int HAPPY_VALUE = 0;

	/**
	 * The '<em><b>Smiling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smiling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMILING
	 * @model name="Smiling" literal=":D"
	 * @generated
	 * @ordered
	 */
	public static final int SMILING_VALUE = 1;

	/**
	 * The '<em><b>Cool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cool</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COOL
	 * @model name="Cool" literal="8)"
	 * @generated
	 * @ordered
	 */
	public static final int COOL_VALUE = 2;

	/**
	 * The '<em><b>Silent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Silent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SILENT
	 * @model name="Silent" literal=":x"
	 * @generated
	 * @ordered
	 */
	public static final int SILENT_VALUE = 3;

	/**
	 * The '<em><b>Surprise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surprise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURPRISE
	 * @model name="Surprise" literal=":o"
	 * @generated
	 * @ordered
	 */
	public static final int SURPRISE_VALUE = 4;

	/**
	 * The '<em><b>Heart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Heart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEART
	 * @model name="Heart" literal="&lt;3"
	 * @generated
	 * @ordered
	 */
	public static final int HEART_VALUE = 5;

	/**
	 * An array of all the '<em><b>Emojis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Emojis[] VALUES_ARRAY =
		new Emojis[] {
			HAPPY,
			SMILING,
			COOL,
			SILENT,
			SURPRISE,
			HEART,
		};

	/**
	 * A public read-only list of all the '<em><b>Emojis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Emojis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Emojis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Emojis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Emojis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Emojis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Emojis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Emojis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Emojis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Emojis get(int value) {
		switch (value) {
			case HAPPY_VALUE: return HAPPY;
			case SMILING_VALUE: return SMILING;
			case COOL_VALUE: return COOL;
			case SILENT_VALUE: return SILENT;
			case SURPRISE_VALUE: return SURPRISE;
			case HEART_VALUE: return HEART;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Emojis(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Emojis
