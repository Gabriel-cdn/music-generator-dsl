/**
 */
package musicgenerator.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import musicgenerator.Composition;
import musicgenerator.MusicgeneratorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionTest extends TestCase {

	/**
	 * The fixture for this Composition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Composition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositionTest.class);
	}

	/**
	 * Constructs a new Composition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Composition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Composition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Composition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Composition getFixture() {
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
		setFixture(MusicgeneratorFactory.eINSTANCE.createComposition());
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

} //CompositionTest
