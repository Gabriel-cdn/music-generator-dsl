/**
 */
package musicgenerator.impl;

import musicgenerator.Composition;
import musicgenerator.Emojis;
import musicgenerator.Info;
import musicgenerator.Instruments;
import musicgenerator.MusicgeneratorFactory;
import musicgenerator.MusicgeneratorPackage;

import musicgenerator.Part;
import musicgenerator.Parts;
import musicgenerator.Rhythm;
import musicgenerator.Structure;
import musicgenerator.Styles;
import musicgenerator.Verse;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicgeneratorPackageImpl extends EPackageImpl implements MusicgeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verseEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rhythmEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum emojisEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instrumentsEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stylesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see musicgenerator.MusicgeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MusicgeneratorPackageImpl() {
		super(eNS_URI, MusicgeneratorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MusicgeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MusicgeneratorPackage init() {
		if (isInited) return (MusicgeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(MusicgeneratorPackage.eNS_URI);

		// Obtain or create and register package
		MusicgeneratorPackageImpl theMusicgeneratorPackage = (MusicgeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MusicgeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MusicgeneratorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMusicgeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theMusicgeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMusicgeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MusicgeneratorPackage.eNS_URI, theMusicgeneratorPackage);
		return theMusicgeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Structure() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Parts() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Rhythm() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Info() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_Title() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_Verse() {
		return (EReference)partEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerse() {
		return verseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerse_Emoticon() {
		return (EAttribute)verseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerse_Harmony() {
		return (EAttribute)verseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerse_Melody() {
		return (EAttribute)verseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerse_Id_verse() {
		return (EAttribute)verseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Part() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructure_VerseSize() {
		return (EAttribute)structureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParts() {
		return partsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParts_Part() {
		return (EReference)partsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRhythm() {
		return rhythmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRhythm_Compass() {
		return (EAttribute)rhythmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRhythm_Bpm() {
		return (EAttribute)rhythmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRhythm_Style() {
		return (EAttribute)rhythmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfo() {
		return infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_Name() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_Tone() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_Tonality() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfo_Random_seed() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEmojis() {
		return emojisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstruments() {
		return instrumentsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyles() {
		return stylesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicgeneratorFactory getMusicgeneratorFactory() {
		return (MusicgeneratorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		compositionEClass = createEClass(COMPOSITION);
		createEReference(compositionEClass, COMPOSITION__STRUCTURE);
		createEReference(compositionEClass, COMPOSITION__PARTS);
		createEReference(compositionEClass, COMPOSITION__RHYTHM);
		createEReference(compositionEClass, COMPOSITION__INFO);

		partEClass = createEClass(PART);
		createEAttribute(partEClass, PART__TITLE);
		createEReference(partEClass, PART__VERSE);

		verseEClass = createEClass(VERSE);
		createEAttribute(verseEClass, VERSE__EMOTICON);
		createEAttribute(verseEClass, VERSE__HARMONY);
		createEAttribute(verseEClass, VERSE__MELODY);
		createEAttribute(verseEClass, VERSE__ID_VERSE);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__PART);
		createEAttribute(structureEClass, STRUCTURE__VERSE_SIZE);

		partsEClass = createEClass(PARTS);
		createEReference(partsEClass, PARTS__PART);

		rhythmEClass = createEClass(RHYTHM);
		createEAttribute(rhythmEClass, RHYTHM__COMPASS);
		createEAttribute(rhythmEClass, RHYTHM__BPM);
		createEAttribute(rhythmEClass, RHYTHM__STYLE);

		infoEClass = createEClass(INFO);
		createEAttribute(infoEClass, INFO__NAME);
		createEAttribute(infoEClass, INFO__TONE);
		createEAttribute(infoEClass, INFO__TONALITY);
		createEAttribute(infoEClass, INFO__RANDOM_SEED);

		// Create enums
		emojisEEnum = createEEnum(EMOJIS);
		instrumentsEEnum = createEEnum(INSTRUMENTS);
		stylesEEnum = createEEnum(STYLES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposition_Structure(), this.getStructure(), null, "structure", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Parts(), this.getParts(), null, "parts", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Rhythm(), this.getRhythm(), null, "rhythm", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Info(), this.getInfo(), null, "info", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPart_Title(), ecorePackage.getEString(), "title", null, 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_Verse(), this.getVerse(), null, "verse", null, 1, -1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verseEClass, Verse.class, "Verse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerse_Emoticon(), this.getEmojis(), "emoticon", null, 1, 1, Verse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerse_Harmony(), this.getInstruments(), "harmony", null, 0, -1, Verse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerse_Melody(), this.getInstruments(), "melody", null, 0, -1, Verse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerse_Id_verse(), ecorePackage.getEInt(), "id_verse", "1", 1, 1, Verse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Part(), this.getPart(), null, "part", null, 1, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructure_VerseSize(), ecorePackage.getEInt(), "verseSize", "4", 1, 1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partsEClass, Parts.class, "Parts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParts_Part(), this.getPart(), null, "part", null, 1, -1, Parts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rhythmEClass, Rhythm.class, "Rhythm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRhythm_Compass(), ecorePackage.getEString(), "compass", "6/8", 1, 1, Rhythm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRhythm_Bpm(), ecorePackage.getEInt(), "bpm", "60", 1, 1, Rhythm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRhythm_Style(), this.getStyles(), "Style", null, 1, 1, Rhythm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoEClass, Info.class, "Info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfo_Name(), ecorePackage.getEString(), "name", "My composition", 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_Tone(), ecorePackage.getEString(), "tone", "C", 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_Tonality(), ecorePackage.getEString(), "tonality", "major", 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_Random_seed(), ecorePackage.getEInt(), "random_seed", "0", 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(emojisEEnum, Emojis.class, "Emojis");
		addEEnumLiteral(emojisEEnum, Emojis.HAPPY);
		addEEnumLiteral(emojisEEnum, Emojis.SMILING);
		addEEnumLiteral(emojisEEnum, Emojis.COOL);
		addEEnumLiteral(emojisEEnum, Emojis.SILENT);
		addEEnumLiteral(emojisEEnum, Emojis.SURPRISE);
		addEEnumLiteral(emojisEEnum, Emojis.HEART);

		initEEnum(instrumentsEEnum, Instruments.class, "Instruments");
		addEEnumLiteral(instrumentsEEnum, Instruments.SAX);
		addEEnumLiteral(instrumentsEEnum, Instruments.PIANO);
		addEEnumLiteral(instrumentsEEnum, Instruments.VIOLIN);
		addEEnumLiteral(instrumentsEEnum, Instruments.GUITAR);
		addEEnumLiteral(instrumentsEEnum, Instruments.GAME);
		addEEnumLiteral(instrumentsEEnum, Instruments.TECHNO);
		addEEnumLiteral(instrumentsEEnum, Instruments.SAW);

		initEEnum(stylesEEnum, Styles.class, "Styles");
		addEEnumLiteral(stylesEEnum, Styles.NONE);
		addEEnumLiteral(stylesEEnum, Styles.ROCK_AND_ROLL);
		addEEnumLiteral(stylesEEnum, Styles.JAILHOUSE_ROCK);
		addEEnumLiteral(stylesEEnum, Styles.DISCO);
		addEEnumLiteral(stylesEEnum, Styles.FUNK);
		addEEnumLiteral(stylesEEnum, Styles.HIP_HOP);
		addEEnumLiteral(stylesEEnum, Styles.SAMBA);
		addEEnumLiteral(stylesEEnum, Styles.HEAVY_METAL);
		addEEnumLiteral(stylesEEnum, Styles.REGGAE);

		// Create resource
		createResource(eNS_URI);
	}

} //MusicgeneratorPackageImpl
