/**
 */
package musicgenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instruments</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see musicgenerator.MusicgeneratorPackage#getInstruments()
 * @model
 * @generated
 */
public enum Instruments implements Enumerator {
	/**
	 * The '<em><b>Sax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAX_VALUE
	 * @generated
	 * @ordered
	 */
	SAX(0, "Sax", "Sax"),

	/**
	 * The '<em><b>Piano</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIANO_VALUE
	 * @generated
	 * @ordered
	 */
	PIANO(1, "Piano", "Piano"),

	/**
	 * The '<em><b>Violin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLIN_VALUE
	 * @generated
	 * @ordered
	 */
	VIOLIN(2, "Violin", "Violin"),

	/**
	 * The '<em><b>Guitar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUITAR_VALUE
	 * @generated
	 * @ordered
	 */
	GUITAR(3, "Guitar", "Guitar"),

	/**
	 * The '<em><b>Game</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAME_VALUE
	 * @generated
	 * @ordered
	 */
	GAME(4, "Game", "Game"),

	/**
	 * The '<em><b>Techno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNO_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNO(5, "Techno", "Techno"),

	/**
	 * The '<em><b>Saw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAW_VALUE
	 * @generated
	 * @ordered
	 */
	SAW(6, "Saw", "Saw");

	/**
	 * The '<em><b>Sax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAX
	 * @model name="Sax"
	 * @generated
	 * @ordered
	 */
	public static final int SAX_VALUE = 0;

	/**
	 * The '<em><b>Piano</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Piano</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIANO
	 * @model name="Piano"
	 * @generated
	 * @ordered
	 */
	public static final int PIANO_VALUE = 1;

	/**
	 * The '<em><b>Violin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Violin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIOLIN
	 * @model name="Violin"
	 * @generated
	 * @ordered
	 */
	public static final int VIOLIN_VALUE = 2;

	/**
	 * The '<em><b>Guitar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guitar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUITAR
	 * @model name="Guitar"
	 * @generated
	 * @ordered
	 */
	public static final int GUITAR_VALUE = 3;

	/**
	 * The '<em><b>Game</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Game</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAME
	 * @model name="Game"
	 * @generated
	 * @ordered
	 */
	public static final int GAME_VALUE = 4;

	/**
	 * The '<em><b>Techno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Techno</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECHNO
	 * @model name="Techno"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNO_VALUE = 5;

	/**
	 * The '<em><b>Saw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Saw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAW
	 * @model name="Saw"
	 * @generated
	 * @ordered
	 */
	public static final int SAW_VALUE = 6;

	/**
	 * An array of all the '<em><b>Instruments</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Instruments[] VALUES_ARRAY =
		new Instruments[] {
			SAX,
			PIANO,
			VIOLIN,
			GUITAR,
			GAME,
			TECHNO,
			SAW,
		};

	/**
	 * A public read-only list of all the '<em><b>Instruments</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Instruments> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instruments</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Instruments get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instruments result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruments</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Instruments getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instruments result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruments</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Instruments get(int value) {
		switch (value) {
			case SAX_VALUE: return SAX;
			case PIANO_VALUE: return PIANO;
			case VIOLIN_VALUE: return VIOLIN;
			case GUITAR_VALUE: return GUITAR;
			case GAME_VALUE: return GAME;
			case TECHNO_VALUE: return TECHNO;
			case SAW_VALUE: return SAW;
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
	private Instruments(int value, String name, String literal) {
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
	
} //Instruments
