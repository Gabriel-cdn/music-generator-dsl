/**
 */
package musicgenerator.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import musicgenerator.MusicgeneratorFactory;
import musicgenerator.Rhythm;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rhythm</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RhythmTest extends TestCase {

	/**
	 * The fixture for this Rhythm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rhythm fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RhythmTest.class);
	}

	/**
	 * Constructs a new Rhythm test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhythmTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rhythm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Rhythm fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rhythm test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rhythm getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MusicgeneratorFactory.eINSTANCE.createRhythm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RhythmTest
