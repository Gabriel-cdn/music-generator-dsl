/**
 */
package musicgenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Styles</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see musicgenerator.MusicgeneratorPackage#getStyles()
 * @model
 * @generated
 */
public enum Styles implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Rock and Roll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROCK_AND_ROLL_VALUE
	 * @generated
	 * @ordered
	 */
	ROCK_AND_ROLL(1, "Rock_and_Roll", "Rock_and_Roll"),

	/**
	 * The '<em><b>Jailhouse Rock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAILHOUSE_ROCK_VALUE
	 * @generated
	 * @ordered
	 */
	JAILHOUSE_ROCK(2, "Jailhouse_Rock", "Jailhouse_Rock"),

	/**
	 * The '<em><b>Disco</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCO_VALUE
	 * @generated
	 * @ordered
	 */
	DISCO(3, "Disco", "Disco"),

	/**
	 * The '<em><b>Funk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNK_VALUE
	 * @generated
	 * @ordered
	 */
	FUNK(4, "Funk", "Funk"),

	/**
	 * The '<em><b>Hip Hop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIP_HOP_VALUE
	 * @generated
	 * @ordered
	 */
	HIP_HOP(5, "Hip_Hop", "Hip_Hop"),

	/**
	 * The '<em><b>Samba</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMBA_VALUE
	 * @generated
	 * @ordered
	 */
	SAMBA(6, "Samba", "Samba"),

	/**
	 * The '<em><b>Heavy Metal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAVY_METAL_VALUE
	 * @generated
	 * @ordered
	 */
	HEAVY_METAL(7, "Heavy_Metal", "Heavy_Metal"),

	/**
	 * The '<em><b>Reggae</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGGAE_VALUE
	 * @generated
	 * @ordered
	 */
	REGGAE(8, "Reggae", "Reggae");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Rock and Roll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rock and Roll</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROCK_AND_ROLL
	 * @model name="Rock_and_Roll"
	 * @generated
	 * @ordered
	 */
	public static final int ROCK_AND_ROLL_VALUE = 1;

	/**
	 * The '<em><b>Jailhouse Rock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jailhouse Rock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAILHOUSE_ROCK
	 * @model name="Jailhouse_Rock"
	 * @generated
	 * @ordered
	 */
	public static final int JAILHOUSE_ROCK_VALUE = 2;

	/**
	 * The '<em><b>Disco</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disco</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCO
	 * @model name="Disco"
	 * @generated
	 * @ordered
	 */
	public static final int DISCO_VALUE = 3;

	/**
	 * The '<em><b>Funk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Funk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNK
	 * @model name="Funk"
	 * @generated
	 * @ordered
	 */
	public static final int FUNK_VALUE = 4;

	/**
	 * The '<em><b>Hip Hop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hip Hop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIP_HOP
	 * @model name="Hip_Hop"
	 * @generated
	 * @ordered
	 */
	public static final int HIP_HOP_VALUE = 5;

	/**
	 * The '<em><b>Samba</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Samba</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMBA
	 * @model name="Samba"
	 * @generated
	 * @ordered
	 */
	public static final int SAMBA_VALUE = 6;

	/**
	 * The '<em><b>Heavy Metal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Heavy Metal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAVY_METAL
	 * @model name="Heavy_Metal"
	 * @generated
	 * @ordered
	 */
	public static final int HEAVY_METAL_VALUE = 7;

	/**
	 * The '<em><b>Reggae</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reggae</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGGAE
	 * @model name="Reggae"
	 * @generated
	 * @ordered
	 */
	public static final int REGGAE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Styles</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Styles[] VALUES_ARRAY =
		new Styles[] {
			NONE,
			ROCK_AND_ROLL,
			JAILHOUSE_ROCK,
			DISCO,
			FUNK,
			HIP_HOP,
			SAMBA,
			HEAVY_METAL,
			REGGAE,
		};

	/**
	 * A public read-only list of all the '<em><b>Styles</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Styles> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Styles</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Styles get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Styles result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Styles</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Styles getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Styles result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Styles</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Styles get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case ROCK_AND_ROLL_VALUE: return ROCK_AND_ROLL;
			case JAILHOUSE_ROCK_VALUE: return JAILHOUSE_ROCK;
			case DISCO_VALUE: return DISCO;
			case FUNK_VALUE: return FUNK;
			case HIP_HOP_VALUE: return HIP_HOP;
			case SAMBA_VALUE: return SAMBA;
			case HEAVY_METAL_VALUE: return HEAVY_METAL;
			case REGGAE_VALUE: return REGGAE;
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
	private Styles(int value, String name, String literal) {
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
	
} //Styles
