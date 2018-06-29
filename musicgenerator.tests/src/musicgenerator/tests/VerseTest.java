/**
 */
package musicgenerator.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import musicgenerator.MusicgeneratorFactory;
import musicgenerator.Verse;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Verse</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerseTest extends TestCase {

	/**
	 * The fixture for this Verse test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verse fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VerseTest.class);
	}

	/**
	 * Constructs a new Verse test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Verse test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Verse fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Verse test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verse getFixture() {
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
		setFixture(MusicgeneratorFactory.eINSTANCE.createVerse());
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

} //VerseTest
