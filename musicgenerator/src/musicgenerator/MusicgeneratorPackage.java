/**
 */
package musicgenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see musicgenerator.MusicgeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface MusicgeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "musicgenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://musicgenerator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "musicgenerator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusicgeneratorPackage eINSTANCE = musicgenerator.impl.MusicgeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link musicgenerator.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.impl.CompositionImpl
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__PARTS = 1;

	/**
	 * The feature id for the '<em><b>Rhythm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__RHYTHM = 2;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__INFO = 3;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link musicgenerator.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.impl.PartImpl
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getPart()
	 * @generated
	 */
	int PART = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Verse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__VERSE = 1;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicgenerator.impl.VerseImpl <em>Verse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.impl.VerseImpl
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getVerse()
	 * @generated
	 */
	int VERSE = 2;

	/**
	 * The feature id for the '<em><b>Emoticon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSE__EMOTICON = 0;

	/**
	 * The feature id for the '<em><b>Harmony</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSE__HARMONY = 1;

	/**
	 * The feature id for the '<em><b>Melody</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSE__MELODY = 2;

	/**
	 * The feature id for the '<em><b>Id verse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSE__ID_VERSE = 3;

	/**
	 * The number of structural features of the '<em>Verse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Verse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicgenerator.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.impl.StructureImpl
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__PART = 0;

	/**
	 * The feature id for the '<em><b>Verse Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__VERSE_SIZE = 1;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicgenerator.impl.PartsImpl <em>Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.impl.PartsImpl
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getParts()
	 * @generated
	 */
	int PARTS = 4;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS__PART = 0;

	/**
	 * The number of structural features of the '<em>Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicgenerator.impl.RhythmImpl <em>Rhythm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.impl.RhythmImpl
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getRhythm()
	 * @generated
	 */
	int RHYTHM = 5;

	/**
	 * The feature id for the '<em><b>Compass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__COMPASS = 0;

	/**
	 * The feature id for the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__BPM = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Rhythm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rhythm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicgenerator.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.impl.InfoImpl
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getInfo()
	 * @generated
	 */
	int INFO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__TONE = 1;

	/**
	 * The feature id for the '<em><b>Tonality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__TONALITY = 2;

	/**
	 * The feature id for the '<em><b>Random seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__RANDOM_SEED = 3;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicgenerator.Emojis <em>Emojis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.Emojis
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getEmojis()
	 * @generated
	 */
	int EMOJIS = 7;

	/**
	 * The meta object id for the '{@link musicgenerator.Instruments <em>Instruments</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.Instruments
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getInstruments()
	 * @generated
	 */
	int INSTRUMENTS = 8;

	/**
	 * The meta object id for the '{@link musicgenerator.Styles <em>Styles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicgenerator.Styles
	 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getStyles()
	 * @generated
	 */
	int STYLES = 9;


	/**
	 * Returns the meta object for class '{@link musicgenerator.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see musicgenerator.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference '{@link musicgenerator.Composition#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see musicgenerator.Composition#getStructure()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Structure();

	/**
	 * Returns the meta object for the containment reference '{@link musicgenerator.Composition#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parts</em>'.
	 * @see musicgenerator.Composition#getParts()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Parts();

	/**
	 * Returns the meta object for the containment reference '{@link musicgenerator.Composition#getRhythm <em>Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhythm</em>'.
	 * @see musicgenerator.Composition#getRhythm()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Rhythm();

	/**
	 * Returns the meta object for the containment reference '{@link musicgenerator.Composition#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see musicgenerator.Composition#getInfo()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Info();

	/**
	 * Returns the meta object for class '{@link musicgenerator.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see musicgenerator.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Part#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see musicgenerator.Part#getTitle()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link musicgenerator.Part#getVerse <em>Verse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verse</em>'.
	 * @see musicgenerator.Part#getVerse()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Verse();

	/**
	 * Returns the meta object for class '{@link musicgenerator.Verse <em>Verse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verse</em>'.
	 * @see musicgenerator.Verse
	 * @generated
	 */
	EClass getVerse();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Verse#getEmoticon <em>Emoticon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emoticon</em>'.
	 * @see musicgenerator.Verse#getEmoticon()
	 * @see #getVerse()
	 * @generated
	 */
	EAttribute getVerse_Emoticon();

	/**
	 * Returns the meta object for the attribute list '{@link musicgenerator.Verse#getHarmony <em>Harmony</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Harmony</em>'.
	 * @see musicgenerator.Verse#getHarmony()
	 * @see #getVerse()
	 * @generated
	 */
	EAttribute getVerse_Harmony();

	/**
	 * Returns the meta object for the attribute list '{@link musicgenerator.Verse#getMelody <em>Melody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Melody</em>'.
	 * @see musicgenerator.Verse#getMelody()
	 * @see #getVerse()
	 * @generated
	 */
	EAttribute getVerse_Melody();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Verse#getId_verse <em>Id verse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id verse</em>'.
	 * @see musicgenerator.Verse#getId_verse()
	 * @see #getVerse()
	 * @generated
	 */
	EAttribute getVerse_Id_verse();

	/**
	 * Returns the meta object for class '{@link musicgenerator.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see musicgenerator.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the reference list '{@link musicgenerator.Structure#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part</em>'.
	 * @see musicgenerator.Structure#getPart()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Part();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Structure#getVerseSize <em>Verse Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verse Size</em>'.
	 * @see musicgenerator.Structure#getVerseSize()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_VerseSize();

	/**
	 * Returns the meta object for class '{@link musicgenerator.Parts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parts</em>'.
	 * @see musicgenerator.Parts
	 * @generated
	 */
	EClass getParts();

	/**
	 * Returns the meta object for the containment reference list '{@link musicgenerator.Parts#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see musicgenerator.Parts#getPart()
	 * @see #getParts()
	 * @generated
	 */
	EReference getParts_Part();

	/**
	 * Returns the meta object for class '{@link musicgenerator.Rhythm <em>Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rhythm</em>'.
	 * @see musicgenerator.Rhythm
	 * @generated
	 */
	EClass getRhythm();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Rhythm#getCompass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compass</em>'.
	 * @see musicgenerator.Rhythm#getCompass()
	 * @see #getRhythm()
	 * @generated
	 */
	EAttribute getRhythm_Compass();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Rhythm#getBpm <em>Bpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bpm</em>'.
	 * @see musicgenerator.Rhythm#getBpm()
	 * @see #getRhythm()
	 * @generated
	 */
	EAttribute getRhythm_Bpm();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Rhythm#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see musicgenerator.Rhythm#getStyle()
	 * @see #getRhythm()
	 * @generated
	 */
	EAttribute getRhythm_Style();

	/**
	 * Returns the meta object for class '{@link musicgenerator.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see musicgenerator.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Info#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musicgenerator.Info#getName()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Info#getTone <em>Tone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tone</em>'.
	 * @see musicgenerator.Info#getTone()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Tone();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Info#getTonality <em>Tonality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tonality</em>'.
	 * @see musicgenerator.Info#getTonality()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Tonality();

	/**
	 * Returns the meta object for the attribute '{@link musicgenerator.Info#getRandom_seed <em>Random seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random seed</em>'.
	 * @see musicgenerator.Info#getRandom_seed()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Random_seed();

	/**
	 * Returns the meta object for enum '{@link musicgenerator.Emojis <em>Emojis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emojis</em>'.
	 * @see musicgenerator.Emojis
	 * @generated
	 */
	EEnum getEmojis();

	/**
	 * Returns the meta object for enum '{@link musicgenerator.Instruments <em>Instruments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instruments</em>'.
	 * @see musicgenerator.Instruments
	 * @generated
	 */
	EEnum getInstruments();

	/**
	 * Returns the meta object for enum '{@link musicgenerator.Styles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Styles</em>'.
	 * @see musicgenerator.Styles
	 * @generated
	 */
	EEnum getStyles();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MusicgeneratorFactory getMusicgeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link musicgenerator.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.impl.CompositionImpl
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__STRUCTURE = eINSTANCE.getComposition_Structure();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__PARTS = eINSTANCE.getComposition_Parts();

		/**
		 * The meta object literal for the '<em><b>Rhythm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__RHYTHM = eINSTANCE.getComposition_Rhythm();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__INFO = eINSTANCE.getComposition_Info();

		/**
		 * The meta object literal for the '{@link musicgenerator.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.impl.PartImpl
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__TITLE = eINSTANCE.getPart_Title();

		/**
		 * The meta object literal for the '<em><b>Verse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__VERSE = eINSTANCE.getPart_Verse();

		/**
		 * The meta object literal for the '{@link musicgenerator.impl.VerseImpl <em>Verse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.impl.VerseImpl
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getVerse()
		 * @generated
		 */
		EClass VERSE = eINSTANCE.getVerse();

		/**
		 * The meta object literal for the '<em><b>Emoticon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSE__EMOTICON = eINSTANCE.getVerse_Emoticon();

		/**
		 * The meta object literal for the '<em><b>Harmony</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSE__HARMONY = eINSTANCE.getVerse_Harmony();

		/**
		 * The meta object literal for the '<em><b>Melody</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSE__MELODY = eINSTANCE.getVerse_Melody();

		/**
		 * The meta object literal for the '<em><b>Id verse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSE__ID_VERSE = eINSTANCE.getVerse_Id_verse();

		/**
		 * The meta object literal for the '{@link musicgenerator.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.impl.StructureImpl
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__PART = eINSTANCE.getStructure_Part();

		/**
		 * The meta object literal for the '<em><b>Verse Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__VERSE_SIZE = eINSTANCE.getStructure_VerseSize();

		/**
		 * The meta object literal for the '{@link musicgenerator.impl.PartsImpl <em>Parts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.impl.PartsImpl
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getParts()
		 * @generated
		 */
		EClass PARTS = eINSTANCE.getParts();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTS__PART = eINSTANCE.getParts_Part();

		/**
		 * The meta object literal for the '{@link musicgenerator.impl.RhythmImpl <em>Rhythm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.impl.RhythmImpl
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getRhythm()
		 * @generated
		 */
		EClass RHYTHM = eINSTANCE.getRhythm();

		/**
		 * The meta object literal for the '<em><b>Compass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHYTHM__COMPASS = eINSTANCE.getRhythm_Compass();

		/**
		 * The meta object literal for the '<em><b>Bpm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHYTHM__BPM = eINSTANCE.getRhythm_Bpm();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHYTHM__STYLE = eINSTANCE.getRhythm_Style();

		/**
		 * The meta object literal for the '{@link musicgenerator.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.impl.InfoImpl
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getInfo()
		 * @generated
		 */
		EClass INFO = eINSTANCE.getInfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__NAME = eINSTANCE.getInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Tone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__TONE = eINSTANCE.getInfo_Tone();

		/**
		 * The meta object literal for the '<em><b>Tonality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__TONALITY = eINSTANCE.getInfo_Tonality();

		/**
		 * The meta object literal for the '<em><b>Random seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__RANDOM_SEED = eINSTANCE.getInfo_Random_seed();

		/**
		 * The meta object literal for the '{@link musicgenerator.Emojis <em>Emojis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.Emojis
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getEmojis()
		 * @generated
		 */
		EEnum EMOJIS = eINSTANCE.getEmojis();

		/**
		 * The meta object literal for the '{@link musicgenerator.Instruments <em>Instruments</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.Instruments
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getInstruments()
		 * @generated
		 */
		EEnum INSTRUMENTS = eINSTANCE.getInstruments();

		/**
		 * The meta object literal for the '{@link musicgenerator.Styles <em>Styles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicgenerator.Styles
		 * @see musicgenerator.impl.MusicgeneratorPackageImpl#getStyles()
		 * @generated
		 */
		EEnum STYLES = eINSTANCE.getStyles();

	}

} //MusicgeneratorPackage
