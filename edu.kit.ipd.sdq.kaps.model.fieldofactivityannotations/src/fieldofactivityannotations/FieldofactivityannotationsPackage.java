/**
 */
package fieldofactivityannotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fieldofactivityannotations.FieldofactivityannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface FieldofactivityannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fieldofactivityannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAPSFieldofactivityannotations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fieldofactivityannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FieldofactivityannotationsPackage eINSTANCE = fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl <em>Field Of Activity Annotation Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Calibration Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Test Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Development Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Purchase Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__PURCHASE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Hmi Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Ecad Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Documentation Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Component Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__COMPONENT_SPECIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Staff Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION = 8;

	/**
	 * The number of structural features of the '<em>Field Of Activity Annotation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Field Of Activity Annotation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.TestSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTestSpecification()
	 * @generated
	 */
	int TEST_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>System Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__SYSTEM_TESTS = 1;

	/**
	 * The number of structural features of the '<em>Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.StockSpecificationImpl <em>Stock Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.StockSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStockSpecification()
	 * @generated
	 */
	int STOCK_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Stock List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION__STOCK_LIST = 1;

	/**
	 * The number of structural features of the '<em>Stock Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stock Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.HMISpecificationImpl <em>HMI Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.HMISpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getHMISpecification()
	 * @generated
	 */
	int HMI_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Hmi Configuration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION__HMI_CONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>HMI Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>HMI Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.HMIConfigurationImpl <em>HMI Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.HMIConfigurationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getHMIConfiguration()
	 * @generated
	 */
	int HMI_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__MODULES = 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__INTERFACES = 4;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION__STRUCTURES = 5;

	/**
	 * The number of structural features of the '<em>HMI Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>HMI Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMI_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.ECADSpecificationImpl <em>ECAD Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.ECADSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getECADSpecification()
	 * @generated
	 */
	int ECAD_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__MODULES = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__INTERFACES = 3;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__STRUCTURES = 4;

	/**
	 * The feature id for the '<em><b>Drawings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION__DRAWINGS = 5;

	/**
	 * The number of structural features of the '<em>ECAD Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ECAD Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECAD_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl <em>Documentation Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.DocumentationSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDocumentationSpecification()
	 * @generated
	 */
	int DOCUMENTATION_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Component Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Module Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Interface Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Structure Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION = 4;

	/**
	 * The number of structural features of the '<em>Documentation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Documentation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.StaffSpecificationImpl <em>Staff Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.StaffSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStaffSpecification()
	 * @generated
	 */
	int STAFF_SPECIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__PERSON_LIST = 1;

	/**
	 * The feature id for the '<em><b>Role List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION__ROLE_LIST = 2;

	/**
	 * The number of structural features of the '<em>Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.CalibrationSpecificationImpl <em>Calibration Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.CalibrationSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getCalibrationSpecification()
	 * @generated
	 */
	int CALIBRATION_SPECIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Calibration Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Calibration Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.DevelopmentSpecificationImpl <em>Development Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.DevelopmentSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDevelopmentSpecification()
	 * @generated
	 */
	int DEVELOPMENT_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_SPECIFICATION__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Development Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Development Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.ComponentSpecificationImpl <em>Component Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.ComponentSpecificationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getComponentSpecification()
	 * @generated
	 */
	int COMPONENT_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPECIFICATION__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Component Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.FileImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 16;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILENAME = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.StockListImpl <em>Stock List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.StockListImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStockList()
	 * @generated
	 */
	int STOCK_LIST = 11;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST__FILENAME = FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST__PARENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST__COMPONENTS = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST__MODULES = FILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST__INTERFACES = FILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST__STRUCTURES = FILE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST_FEATURE_COUNT = FILE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Stock List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_LIST_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.RoleListImpl <em>Role List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.RoleListImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getRoleList()
	 * @generated
	 */
	int ROLE_LIST = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST__ROLES = 1;

	/**
	 * The number of structural features of the '<em>Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.RoleImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.PersonListImpl <em>Person List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.PersonListImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getPersonList()
	 * @generated
	 */
	int PERSON_LIST = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.PersonImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.TestCaseImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 17;

	/**
	 * The feature id for the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_NAME = 0;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.EngineerImpl <em>Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.EngineerImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getEngineer()
	 * @generated
	 */
	int ENGINEER = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.PurchaserImpl <em>Purchaser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.PurchaserImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getPurchaser()
	 * @generated
	 */
	int PURCHASER = 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Purchaser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Purchaser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.MechanicImpl <em>Mechanic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.MechanicImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getMechanic()
	 * @generated
	 */
	int MECHANIC = 20;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC__PARENT = ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC__PERSON = ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC__DESCRIPTION = ROLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Mechanic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mechanic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANIC_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.DocumentationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 21;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__FILENAME = FILE__FILENAME;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.DrawingImpl <em>Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.DrawingImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDrawing()
	 * @generated
	 */
	int DRAWING = 22;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__FILENAME = FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__PARENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.ComponentDrawingImpl <em>Component Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.ComponentDrawingImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getComponentDrawing()
	 * @generated
	 */
	int COMPONENT_DRAWING = 23;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING__DRAWN_COMPONENT = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.ModuleDrawingImpl <em>Module Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.ModuleDrawingImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getModuleDrawing()
	 * @generated
	 */
	int MODULE_DRAWING = 24;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING__DRAWN_MODULE = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.InterfaceDrawingImpl <em>Interface Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.InterfaceDrawingImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getInterfaceDrawing()
	 * @generated
	 */
	int INTERFACE_DRAWING = 25;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING__DRAWN_INTERFACE = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.StructureDrawingImpl <em>Structure Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.StructureDrawingImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStructureDrawing()
	 * @generated
	 */
	int STRUCTURE_DRAWING = 26;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING__FILENAME = DRAWING__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING__PARENT = DRAWING__PARENT;

	/**
	 * The feature id for the '<em><b>Drawn structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING__DRAWN_STRUCTURE = DRAWING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING_FEATURE_COUNT = DRAWING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DRAWING_OPERATION_COUNT = DRAWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.MainteneanceDocumentationImpl <em>Mainteneance Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.MainteneanceDocumentationImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getMainteneanceDocumentation()
	 * @generated
	 */
	int MAINTENEANCE_DOCUMENTATION = 27;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mainteneance Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mainteneance Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENEANCE_DOCUMENTATION_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.OperatorInstructionsImpl <em>Operator Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.OperatorInstructionsImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getOperatorInstructions()
	 * @generated
	 */
	int OPERATOR_INSTRUCTIONS = 28;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operator Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_INSTRUCTIONS_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.TrainingDocInternImpl <em>Training Doc Intern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.TrainingDocInternImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTrainingDocIntern()
	 * @generated
	 */
	int TRAINING_DOC_INTERN = 29;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Training Doc Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Training Doc Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_INTERN_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.TrainingDocExternalImpl <em>Training Doc External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.TrainingDocExternalImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTrainingDocExternal()
	 * @generated
	 */
	int TRAINING_DOC_EXTERNAL = 30;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL__FILENAME = DOCUMENTATION__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL__PARENT = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Training Doc External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Training Doc External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DOC_EXTERNAL_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.SystemTestImpl <em>System Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.SystemTestImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getSystemTest()
	 * @generated
	 */
	int SYSTEM_TEST = 31;

	/**
	 * The feature id for the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST__TEST_NAME = TEST_CASE__TEST_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST__PARENT = TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Under Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST__SYSTEM_UNDER_TEST = TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST_FEATURE_COUNT = TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST_OPERATION_COUNT = TEST_CASE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.DocumentationFilesImpl <em>Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.DocumentationFilesImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDocumentationFiles()
	 * @generated
	 */
	int DOCUMENTATION_FILES = 32;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__MAINTENEANCE = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__TRAINING_INTERN = 2;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES__TRAINING_EXTERNAL = 3;

	/**
	 * The number of structural features of the '<em>Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl <em>Component Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.ComponentDocumentationFilesImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getComponentDocumentationFiles()
	 * @generated
	 */
	int COMPONENT_DOCUMENTATION_FILES = 33;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.ModuleDocumentationFilesImpl <em>Module Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.ModuleDocumentationFilesImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getModuleDocumentationFiles()
	 * @generated
	 */
	int MODULE_DOCUMENTATION_FILES = 34;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl <em>Interface Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getInterfaceDocumentationFiles()
	 * @generated
	 */
	int INTERFACE_DOCUMENTATION_FILES = 35;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fieldofactivityannotations.impl.StructureDocumentationFilesImpl <em>Structure Documentation Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fieldofactivityannotations.impl.StructureDocumentationFilesImpl
	 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStructureDocumentationFiles()
	 * @generated
	 */
	int STRUCTURE_DOCUMENTATION_FILES = 36;

	/**
	 * The feature id for the '<em><b>Mainteneance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE = DOCUMENTATION_FILES__MAINTENEANCE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS = DOCUMENTATION_FILES__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Training Intern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN = DOCUMENTATION_FILES__TRAINING_INTERN;

	/**
	 * The feature id for the '<em><b>Training External</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL = DOCUMENTATION_FILES__TRAINING_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES__PARENT = DOCUMENTATION_FILES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES_FEATURE_COUNT = DOCUMENTATION_FILES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Documentation Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DOCUMENTATION_FILES_OPERATION_COUNT = DOCUMENTATION_FILES_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository <em>Field Of Activity Annotation Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Of Activity Annotation Repository</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository
	 * @generated
	 */
	EClass getFieldOfActivityAnnotationRepository();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibration Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getCalibrationSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_CalibrationSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getTestSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_TestSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDevelopmentSpecification <em>Development Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Development Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDevelopmentSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_DevelopmentSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getPurchaseSpecification <em>Purchase Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purchase Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getPurchaseSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_PurchaseSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hmi Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getHmiSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_HmiSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification <em>Ecad Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecad Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getEcadSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_EcadSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getDocumentationSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_DocumentationSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getComponentSpecification <em>Component Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getComponentSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_ComponentSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staff Specification</em>'.
	 * @see fieldofactivityannotations.FieldOfActivityAnnotationRepository#getStaffSpecification()
	 * @see #getFieldOfActivityAnnotationRepository()
	 * @generated
	 */
	EReference getFieldOfActivityAnnotationRepository_StaffSpecification();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.TestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Specification</em>'.
	 * @see fieldofactivityannotations.TestSpecification
	 * @generated
	 */
	EClass getTestSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.TestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.TestSpecification#getParent()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.TestSpecification#getSystemTests <em>System Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Tests</em>'.
	 * @see fieldofactivityannotations.TestSpecification#getSystemTests()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_SystemTests();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.StockSpecification <em>Stock Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Specification</em>'.
	 * @see fieldofactivityannotations.StockSpecification
	 * @generated
	 */
	EClass getStockSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.StockSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.StockSpecification#getParent()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.StockSpecification#getStockList <em>Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stock List</em>'.
	 * @see fieldofactivityannotations.StockSpecification#getStockList()
	 * @see #getStockSpecification()
	 * @generated
	 */
	EReference getStockSpecification_StockList();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.HMISpecification <em>HMI Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Specification</em>'.
	 * @see fieldofactivityannotations.HMISpecification
	 * @generated
	 */
	EClass getHMISpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.HMISpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.HMISpecification#getParent()
	 * @see #getHMISpecification()
	 * @generated
	 */
	EReference getHMISpecification_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.HMISpecification#getHmiConfiguration <em>Hmi Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hmi Configuration</em>'.
	 * @see fieldofactivityannotations.HMISpecification#getHmiConfiguration()
	 * @see #getHMISpecification()
	 * @generated
	 */
	EReference getHMISpecification_HmiConfiguration();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.HMIConfiguration <em>HMI Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMI Configuration</em>'.
	 * @see fieldofactivityannotations.HMIConfiguration
	 * @generated
	 */
	EClass getHMIConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fieldofactivityannotations.HMIConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.HMIConfiguration#getParent()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fieldofactivityannotations.HMIConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fieldofactivityannotations.HMIConfiguration#getName()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EAttribute getHMIConfiguration_Name();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.HMIConfiguration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see fieldofactivityannotations.HMIConfiguration#getComponents()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Components();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.HMIConfiguration#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see fieldofactivityannotations.HMIConfiguration#getModules()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Modules();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.HMIConfiguration#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see fieldofactivityannotations.HMIConfiguration#getInterfaces()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.HMIConfiguration#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see fieldofactivityannotations.HMIConfiguration#getStructures()
	 * @see #getHMIConfiguration()
	 * @generated
	 */
	EReference getHMIConfiguration_Structures();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.ECADSpecification <em>ECAD Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECAD Specification</em>'.
	 * @see fieldofactivityannotations.ECADSpecification
	 * @generated
	 */
	EClass getECADSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.ECADSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.ECADSpecification#getParent()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.ECADSpecification#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see fieldofactivityannotations.ECADSpecification#getComponents()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Components();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.ECADSpecification#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see fieldofactivityannotations.ECADSpecification#getModules()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Modules();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.ECADSpecification#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see fieldofactivityannotations.ECADSpecification#getInterfaces()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.ECADSpecification#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see fieldofactivityannotations.ECADSpecification#getStructures()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Structures();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.ECADSpecification#getDrawings <em>Drawings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drawings</em>'.
	 * @see fieldofactivityannotations.ECADSpecification#getDrawings()
	 * @see #getECADSpecification()
	 * @generated
	 */
	EReference getECADSpecification_Drawings();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.DocumentationSpecification <em>Documentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Specification</em>'.
	 * @see fieldofactivityannotations.DocumentationSpecification
	 * @generated
	 */
	EClass getDocumentationSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.DocumentationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.DocumentationSpecification#getParent()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationSpecification#getComponentDocumentation <em>Component Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Documentation</em>'.
	 * @see fieldofactivityannotations.DocumentationSpecification#getComponentDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_ComponentDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationSpecification#getModuleDocumentation <em>Module Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Documentation</em>'.
	 * @see fieldofactivityannotations.DocumentationSpecification#getModuleDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_ModuleDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationSpecification#getInterfaceDocumentation <em>Interface Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Documentation</em>'.
	 * @see fieldofactivityannotations.DocumentationSpecification#getInterfaceDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_InterfaceDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationSpecification#getStructureDocumentation <em>Structure Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Documentation</em>'.
	 * @see fieldofactivityannotations.DocumentationSpecification#getStructureDocumentation()
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	EReference getDocumentationSpecification_StructureDocumentation();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.StaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Specification</em>'.
	 * @see fieldofactivityannotations.StaffSpecification
	 * @generated
	 */
	EClass getStaffSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.StaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.StaffSpecification#getParent()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.StaffSpecification#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person List</em>'.
	 * @see fieldofactivityannotations.StaffSpecification#getPersonList()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_PersonList();

	/**
	 * Returns the meta object for the containment reference '{@link fieldofactivityannotations.StaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role List</em>'.
	 * @see fieldofactivityannotations.StaffSpecification#getRoleList()
	 * @see #getStaffSpecification()
	 * @generated
	 */
	EReference getStaffSpecification_RoleList();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.CalibrationSpecification <em>Calibration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calibration Specification</em>'.
	 * @see fieldofactivityannotations.CalibrationSpecification
	 * @generated
	 */
	EClass getCalibrationSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.CalibrationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.CalibrationSpecification#getParent()
	 * @see #getCalibrationSpecification()
	 * @generated
	 */
	EReference getCalibrationSpecification_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.DevelopmentSpecification <em>Development Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Specification</em>'.
	 * @see fieldofactivityannotations.DevelopmentSpecification
	 * @generated
	 */
	EClass getDevelopmentSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.DevelopmentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.DevelopmentSpecification#getParent()
	 * @see #getDevelopmentSpecification()
	 * @generated
	 */
	EReference getDevelopmentSpecification_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.ComponentSpecification <em>Component Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Specification</em>'.
	 * @see fieldofactivityannotations.ComponentSpecification
	 * @generated
	 */
	EClass getComponentSpecification();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.ComponentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.ComponentSpecification#getParent()
	 * @see #getComponentSpecification()
	 * @generated
	 */
	EReference getComponentSpecification_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.StockList <em>Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock List</em>'.
	 * @see fieldofactivityannotations.StockList
	 * @generated
	 */
	EClass getStockList();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.StockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.StockList#getParent()
	 * @see #getStockList()
	 * @generated
	 */
	EReference getStockList_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.StockList#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see fieldofactivityannotations.StockList#getComponents()
	 * @see #getStockList()
	 * @generated
	 */
	EReference getStockList_Components();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.StockList#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see fieldofactivityannotations.StockList#getModules()
	 * @see #getStockList()
	 * @generated
	 */
	EReference getStockList_Modules();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.StockList#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see fieldofactivityannotations.StockList#getInterfaces()
	 * @see #getStockList()
	 * @generated
	 */
	EReference getStockList_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.StockList#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see fieldofactivityannotations.StockList#getStructures()
	 * @see #getStockList()
	 * @generated
	 */
	EReference getStockList_Structures();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.RoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role List</em>'.
	 * @see fieldofactivityannotations.RoleList
	 * @generated
	 */
	EClass getRoleList();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.RoleList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.RoleList#getParent()
	 * @see #getRoleList()
	 * @generated
	 */
	EReference getRoleList_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.RoleList#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see fieldofactivityannotations.RoleList#getRoles()
	 * @see #getRoleList()
	 * @generated
	 */
	EReference getRoleList_Roles();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see fieldofactivityannotations.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link fieldofactivityannotations.Role#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.Role#getParent()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.Role#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see fieldofactivityannotations.Role#getPerson()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Person();

	/**
	 * Returns the meta object for the attribute '{@link fieldofactivityannotations.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fieldofactivityannotations.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.PersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person List</em>'.
	 * @see fieldofactivityannotations.PersonList
	 * @generated
	 */
	EClass getPersonList();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.PersonList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.PersonList#getParent()
	 * @see #getPersonList()
	 * @generated
	 */
	EReference getPersonList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.PersonList#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see fieldofactivityannotations.PersonList#getPersons()
	 * @see #getPersonList()
	 * @generated
	 */
	EReference getPersonList_Persons();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see fieldofactivityannotations.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.Person#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.Person#getParent()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fieldofactivityannotations.Person#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see fieldofactivityannotations.Person#getRoles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Roles();

	/**
	 * Returns the meta object for the attribute '{@link fieldofactivityannotations.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fieldofactivityannotations.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see fieldofactivityannotations.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link fieldofactivityannotations.File#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see fieldofactivityannotations.File#getFilename()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filename();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see fieldofactivityannotations.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link fieldofactivityannotations.TestCase#getTestName <em>Test Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Name</em>'.
	 * @see fieldofactivityannotations.TestCase#getTestName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_TestName();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer</em>'.
	 * @see fieldofactivityannotations.Engineer
	 * @generated
	 */
	EClass getEngineer();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.Purchaser <em>Purchaser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchaser</em>'.
	 * @see fieldofactivityannotations.Purchaser
	 * @generated
	 */
	EClass getPurchaser();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.Mechanic <em>Mechanic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanic</em>'.
	 * @see fieldofactivityannotations.Mechanic
	 * @generated
	 */
	EClass getMechanic();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see fieldofactivityannotations.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.Drawing <em>Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawing</em>'.
	 * @see fieldofactivityannotations.Drawing
	 * @generated
	 */
	EClass getDrawing();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.Drawing#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.Drawing#getParent()
	 * @see #getDrawing()
	 * @generated
	 */
	EReference getDrawing_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.ComponentDrawing <em>Component Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Drawing</em>'.
	 * @see fieldofactivityannotations.ComponentDrawing
	 * @generated
	 */
	EClass getComponentDrawing();

	/**
	 * Returns the meta object for the reference '{@link fieldofactivityannotations.ComponentDrawing#getDrawn_component <em>Drawn component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn component</em>'.
	 * @see fieldofactivityannotations.ComponentDrawing#getDrawn_component()
	 * @see #getComponentDrawing()
	 * @generated
	 */
	EReference getComponentDrawing_Drawn_component();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.ModuleDrawing <em>Module Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Drawing</em>'.
	 * @see fieldofactivityannotations.ModuleDrawing
	 * @generated
	 */
	EClass getModuleDrawing();

	/**
	 * Returns the meta object for the reference '{@link fieldofactivityannotations.ModuleDrawing#getDrawn_module <em>Drawn module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn module</em>'.
	 * @see fieldofactivityannotations.ModuleDrawing#getDrawn_module()
	 * @see #getModuleDrawing()
	 * @generated
	 */
	EReference getModuleDrawing_Drawn_module();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.InterfaceDrawing <em>Interface Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Drawing</em>'.
	 * @see fieldofactivityannotations.InterfaceDrawing
	 * @generated
	 */
	EClass getInterfaceDrawing();

	/**
	 * Returns the meta object for the reference '{@link fieldofactivityannotations.InterfaceDrawing#getDrawn_interface <em>Drawn interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn interface</em>'.
	 * @see fieldofactivityannotations.InterfaceDrawing#getDrawn_interface()
	 * @see #getInterfaceDrawing()
	 * @generated
	 */
	EReference getInterfaceDrawing_Drawn_interface();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.StructureDrawing <em>Structure Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Drawing</em>'.
	 * @see fieldofactivityannotations.StructureDrawing
	 * @generated
	 */
	EClass getStructureDrawing();

	/**
	 * Returns the meta object for the reference '{@link fieldofactivityannotations.StructureDrawing#getDrawn_structure <em>Drawn structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drawn structure</em>'.
	 * @see fieldofactivityannotations.StructureDrawing#getDrawn_structure()
	 * @see #getStructureDrawing()
	 * @generated
	 */
	EReference getStructureDrawing_Drawn_structure();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.MainteneanceDocumentation <em>Mainteneance Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainteneance Documentation</em>'.
	 * @see fieldofactivityannotations.MainteneanceDocumentation
	 * @generated
	 */
	EClass getMainteneanceDocumentation();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.MainteneanceDocumentation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.MainteneanceDocumentation#getParent()
	 * @see #getMainteneanceDocumentation()
	 * @generated
	 */
	EReference getMainteneanceDocumentation_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.OperatorInstructions <em>Operator Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Instructions</em>'.
	 * @see fieldofactivityannotations.OperatorInstructions
	 * @generated
	 */
	EClass getOperatorInstructions();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.OperatorInstructions#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.OperatorInstructions#getParent()
	 * @see #getOperatorInstructions()
	 * @generated
	 */
	EReference getOperatorInstructions_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.TrainingDocIntern <em>Training Doc Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Doc Intern</em>'.
	 * @see fieldofactivityannotations.TrainingDocIntern
	 * @generated
	 */
	EClass getTrainingDocIntern();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.TrainingDocIntern#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.TrainingDocIntern#getParent()
	 * @see #getTrainingDocIntern()
	 * @generated
	 */
	EReference getTrainingDocIntern_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.TrainingDocExternal <em>Training Doc External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Doc External</em>'.
	 * @see fieldofactivityannotations.TrainingDocExternal
	 * @generated
	 */
	EClass getTrainingDocExternal();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.TrainingDocExternal#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.TrainingDocExternal#getParent()
	 * @see #getTrainingDocExternal()
	 * @generated
	 */
	EReference getTrainingDocExternal_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.SystemTest <em>System Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Test</em>'.
	 * @see fieldofactivityannotations.SystemTest
	 * @generated
	 */
	EClass getSystemTest();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.SystemTest#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.SystemTest#getParent()
	 * @see #getSystemTest()
	 * @generated
	 */
	EReference getSystemTest_Parent();

	/**
	 * Returns the meta object for the reference '{@link fieldofactivityannotations.SystemTest#getSystemUnderTest <em>System Under Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Under Test</em>'.
	 * @see fieldofactivityannotations.SystemTest#getSystemUnderTest()
	 * @see #getSystemTest()
	 * @generated
	 */
	EReference getSystemTest_SystemUnderTest();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.DocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Files</em>'.
	 * @see fieldofactivityannotations.DocumentationFiles
	 * @generated
	 */
	EClass getDocumentationFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationFiles#getMainteneance <em>Mainteneance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mainteneance</em>'.
	 * @see fieldofactivityannotations.DocumentationFiles#getMainteneance()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_Mainteneance();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationFiles#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fieldofactivityannotations.DocumentationFiles#getInstructions()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_Instructions();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationFiles#getTrainingIntern <em>Training Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Training Intern</em>'.
	 * @see fieldofactivityannotations.DocumentationFiles#getTrainingIntern()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_TrainingIntern();

	/**
	 * Returns the meta object for the containment reference list '{@link fieldofactivityannotations.DocumentationFiles#getTrainingExternal <em>Training External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Training External</em>'.
	 * @see fieldofactivityannotations.DocumentationFiles#getTrainingExternal()
	 * @see #getDocumentationFiles()
	 * @generated
	 */
	EReference getDocumentationFiles_TrainingExternal();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.ComponentDocumentationFiles <em>Component Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Documentation Files</em>'.
	 * @see fieldofactivityannotations.ComponentDocumentationFiles
	 * @generated
	 */
	EClass getComponentDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.ComponentDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.ComponentDocumentationFiles#getParent()
	 * @see #getComponentDocumentationFiles()
	 * @generated
	 */
	EReference getComponentDocumentationFiles_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.ModuleDocumentationFiles <em>Module Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Documentation Files</em>'.
	 * @see fieldofactivityannotations.ModuleDocumentationFiles
	 * @generated
	 */
	EClass getModuleDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.ModuleDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.ModuleDocumentationFiles#getParent()
	 * @see #getModuleDocumentationFiles()
	 * @generated
	 */
	EReference getModuleDocumentationFiles_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.InterfaceDocumentationFiles <em>Interface Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Documentation Files</em>'.
	 * @see fieldofactivityannotations.InterfaceDocumentationFiles
	 * @generated
	 */
	EClass getInterfaceDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.InterfaceDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.InterfaceDocumentationFiles#getParent()
	 * @see #getInterfaceDocumentationFiles()
	 * @generated
	 */
	EReference getInterfaceDocumentationFiles_Parent();

	/**
	 * Returns the meta object for class '{@link fieldofactivityannotations.StructureDocumentationFiles <em>Structure Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Documentation Files</em>'.
	 * @see fieldofactivityannotations.StructureDocumentationFiles
	 * @generated
	 */
	EClass getStructureDocumentationFiles();

	/**
	 * Returns the meta object for the container reference '{@link fieldofactivityannotations.StructureDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fieldofactivityannotations.StructureDocumentationFiles#getParent()
	 * @see #getStructureDocumentationFiles()
	 * @generated
	 */
	EReference getStructureDocumentationFiles_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FieldofactivityannotationsFactory getFieldofactivityannotationsFactory();

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
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl <em>Field Of Activity Annotation Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.FieldOfActivityAnnotationRepositoryImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getFieldOfActivityAnnotationRepository()
		 * @generated
		 */
		EClass FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY = eINSTANCE.getFieldOfActivityAnnotationRepository();

		/**
		 * The meta object literal for the '<em><b>Calibration Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_CalibrationSpecification();

		/**
		 * The meta object literal for the '<em><b>Test Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_TestSpecification();

		/**
		 * The meta object literal for the '<em><b>Development Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DEVELOPMENT_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_DevelopmentSpecification();

		/**
		 * The meta object literal for the '<em><b>Purchase Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__PURCHASE_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_PurchaseSpecification();

		/**
		 * The meta object literal for the '<em><b>Hmi Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_HmiSpecification();

		/**
		 * The meta object literal for the '<em><b>Ecad Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_EcadSpecification();

		/**
		 * The meta object literal for the '<em><b>Documentation Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_DocumentationSpecification();

		/**
		 * The meta object literal for the '<em><b>Component Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__COMPONENT_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_ComponentSpecification();

		/**
		 * The meta object literal for the '<em><b>Staff Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION = eINSTANCE.getFieldOfActivityAnnotationRepository_StaffSpecification();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.TestSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTestSpecification()
		 * @generated
		 */
		EClass TEST_SPECIFICATION = eINSTANCE.getTestSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__PARENT = eINSTANCE.getTestSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>System Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__SYSTEM_TESTS = eINSTANCE.getTestSpecification_SystemTests();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.StockSpecificationImpl <em>Stock Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.StockSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStockSpecification()
		 * @generated
		 */
		EClass STOCK_SPECIFICATION = eINSTANCE.getStockSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__PARENT = eINSTANCE.getStockSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Stock List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_SPECIFICATION__STOCK_LIST = eINSTANCE.getStockSpecification_StockList();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.HMISpecificationImpl <em>HMI Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.HMISpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getHMISpecification()
		 * @generated
		 */
		EClass HMI_SPECIFICATION = eINSTANCE.getHMISpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_SPECIFICATION__PARENT = eINSTANCE.getHMISpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Hmi Configuration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_SPECIFICATION__HMI_CONFIGURATION = eINSTANCE.getHMISpecification_HmiConfiguration();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.HMIConfigurationImpl <em>HMI Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.HMIConfigurationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getHMIConfiguration()
		 * @generated
		 */
		EClass HMI_CONFIGURATION = eINSTANCE.getHMIConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__PARENT = eINSTANCE.getHMIConfiguration_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMI_CONFIGURATION__NAME = eINSTANCE.getHMIConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__COMPONENTS = eINSTANCE.getHMIConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__MODULES = eINSTANCE.getHMIConfiguration_Modules();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__INTERFACES = eINSTANCE.getHMIConfiguration_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMI_CONFIGURATION__STRUCTURES = eINSTANCE.getHMIConfiguration_Structures();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.ECADSpecificationImpl <em>ECAD Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.ECADSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getECADSpecification()
		 * @generated
		 */
		EClass ECAD_SPECIFICATION = eINSTANCE.getECADSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__PARENT = eINSTANCE.getECADSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__COMPONENTS = eINSTANCE.getECADSpecification_Components();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__MODULES = eINSTANCE.getECADSpecification_Modules();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__INTERFACES = eINSTANCE.getECADSpecification_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__STRUCTURES = eINSTANCE.getECADSpecification_Structures();

		/**
		 * The meta object literal for the '<em><b>Drawings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECAD_SPECIFICATION__DRAWINGS = eINSTANCE.getECADSpecification_Drawings();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.DocumentationSpecificationImpl <em>Documentation Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.DocumentationSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDocumentationSpecification()
		 * @generated
		 */
		EClass DOCUMENTATION_SPECIFICATION = eINSTANCE.getDocumentationSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__PARENT = eINSTANCE.getDocumentationSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Component Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__COMPONENT_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_ComponentDocumentation();

		/**
		 * The meta object literal for the '<em><b>Module Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__MODULE_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_ModuleDocumentation();

		/**
		 * The meta object literal for the '<em><b>Interface Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__INTERFACE_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_InterfaceDocumentation();

		/**
		 * The meta object literal for the '<em><b>Structure Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION = eINSTANCE.getDocumentationSpecification_StructureDocumentation();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.StaffSpecificationImpl <em>Staff Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.StaffSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStaffSpecification()
		 * @generated
		 */
		EClass STAFF_SPECIFICATION = eINSTANCE.getStaffSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__PARENT = eINSTANCE.getStaffSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Person List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__PERSON_LIST = eINSTANCE.getStaffSpecification_PersonList();

		/**
		 * The meta object literal for the '<em><b>Role List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_SPECIFICATION__ROLE_LIST = eINSTANCE.getStaffSpecification_RoleList();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.CalibrationSpecificationImpl <em>Calibration Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.CalibrationSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getCalibrationSpecification()
		 * @generated
		 */
		EClass CALIBRATION_SPECIFICATION = eINSTANCE.getCalibrationSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALIBRATION_SPECIFICATION__PARENT = eINSTANCE.getCalibrationSpecification_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.DevelopmentSpecificationImpl <em>Development Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.DevelopmentSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDevelopmentSpecification()
		 * @generated
		 */
		EClass DEVELOPMENT_SPECIFICATION = eINSTANCE.getDevelopmentSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_SPECIFICATION__PARENT = eINSTANCE.getDevelopmentSpecification_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.ComponentSpecificationImpl <em>Component Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.ComponentSpecificationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getComponentSpecification()
		 * @generated
		 */
		EClass COMPONENT_SPECIFICATION = eINSTANCE.getComponentSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SPECIFICATION__PARENT = eINSTANCE.getComponentSpecification_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.StockListImpl <em>Stock List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.StockListImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStockList()
		 * @generated
		 */
		EClass STOCK_LIST = eINSTANCE.getStockList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_LIST__PARENT = eINSTANCE.getStockList_Parent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_LIST__COMPONENTS = eINSTANCE.getStockList_Components();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_LIST__MODULES = eINSTANCE.getStockList_Modules();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_LIST__INTERFACES = eINSTANCE.getStockList_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_LIST__STRUCTURES = eINSTANCE.getStockList_Structures();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.RoleListImpl <em>Role List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.RoleListImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getRoleList()
		 * @generated
		 */
		EClass ROLE_LIST = eINSTANCE.getRoleList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_LIST__PARENT = eINSTANCE.getRoleList_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_LIST__ROLES = eINSTANCE.getRoleList_Roles();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.RoleImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PARENT = eINSTANCE.getRole_Parent();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERSON = eINSTANCE.getRole_Person();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.PersonListImpl <em>Person List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.PersonListImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getPersonList()
		 * @generated
		 */
		EClass PERSON_LIST = eINSTANCE.getPersonList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_LIST__PARENT = eINSTANCE.getPersonList_Parent();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_LIST__PERSONS = eINSTANCE.getPersonList_Persons();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.PersonImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARENT = eINSTANCE.getPerson_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLES = eINSTANCE.getPerson_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.FileImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILENAME = eINSTANCE.getFile_Filename();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.TestCaseImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Test Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__TEST_NAME = eINSTANCE.getTestCase_TestName();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.EngineerImpl <em>Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.EngineerImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getEngineer()
		 * @generated
		 */
		EClass ENGINEER = eINSTANCE.getEngineer();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.PurchaserImpl <em>Purchaser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.PurchaserImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getPurchaser()
		 * @generated
		 */
		EClass PURCHASER = eINSTANCE.getPurchaser();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.MechanicImpl <em>Mechanic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.MechanicImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getMechanic()
		 * @generated
		 */
		EClass MECHANIC = eINSTANCE.getMechanic();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.DocumentationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.DrawingImpl <em>Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.DrawingImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDrawing()
		 * @generated
		 */
		EClass DRAWING = eINSTANCE.getDrawing();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING__PARENT = eINSTANCE.getDrawing_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.ComponentDrawingImpl <em>Component Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.ComponentDrawingImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getComponentDrawing()
		 * @generated
		 */
		EClass COMPONENT_DRAWING = eINSTANCE.getComponentDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DRAWING__DRAWN_COMPONENT = eINSTANCE.getComponentDrawing_Drawn_component();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.ModuleDrawingImpl <em>Module Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.ModuleDrawingImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getModuleDrawing()
		 * @generated
		 */
		EClass MODULE_DRAWING = eINSTANCE.getModuleDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DRAWING__DRAWN_MODULE = eINSTANCE.getModuleDrawing_Drawn_module();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.InterfaceDrawingImpl <em>Interface Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.InterfaceDrawingImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getInterfaceDrawing()
		 * @generated
		 */
		EClass INTERFACE_DRAWING = eINSTANCE.getInterfaceDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DRAWING__DRAWN_INTERFACE = eINSTANCE.getInterfaceDrawing_Drawn_interface();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.StructureDrawingImpl <em>Structure Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.StructureDrawingImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStructureDrawing()
		 * @generated
		 */
		EClass STRUCTURE_DRAWING = eINSTANCE.getStructureDrawing();

		/**
		 * The meta object literal for the '<em><b>Drawn structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DRAWING__DRAWN_STRUCTURE = eINSTANCE.getStructureDrawing_Drawn_structure();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.MainteneanceDocumentationImpl <em>Mainteneance Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.MainteneanceDocumentationImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getMainteneanceDocumentation()
		 * @generated
		 */
		EClass MAINTENEANCE_DOCUMENTATION = eINSTANCE.getMainteneanceDocumentation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENEANCE_DOCUMENTATION__PARENT = eINSTANCE.getMainteneanceDocumentation_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.OperatorInstructionsImpl <em>Operator Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.OperatorInstructionsImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getOperatorInstructions()
		 * @generated
		 */
		EClass OPERATOR_INSTRUCTIONS = eINSTANCE.getOperatorInstructions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_INSTRUCTIONS__PARENT = eINSTANCE.getOperatorInstructions_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.TrainingDocInternImpl <em>Training Doc Intern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.TrainingDocInternImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTrainingDocIntern()
		 * @generated
		 */
		EClass TRAINING_DOC_INTERN = eINSTANCE.getTrainingDocIntern();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_DOC_INTERN__PARENT = eINSTANCE.getTrainingDocIntern_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.TrainingDocExternalImpl <em>Training Doc External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.TrainingDocExternalImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getTrainingDocExternal()
		 * @generated
		 */
		EClass TRAINING_DOC_EXTERNAL = eINSTANCE.getTrainingDocExternal();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_DOC_EXTERNAL__PARENT = eINSTANCE.getTrainingDocExternal_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.SystemTestImpl <em>System Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.SystemTestImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getSystemTest()
		 * @generated
		 */
		EClass SYSTEM_TEST = eINSTANCE.getSystemTest();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TEST__PARENT = eINSTANCE.getSystemTest_Parent();

		/**
		 * The meta object literal for the '<em><b>System Under Test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TEST__SYSTEM_UNDER_TEST = eINSTANCE.getSystemTest_SystemUnderTest();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.DocumentationFilesImpl <em>Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.DocumentationFilesImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getDocumentationFiles()
		 * @generated
		 */
		EClass DOCUMENTATION_FILES = eINSTANCE.getDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Mainteneance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__MAINTENEANCE = eINSTANCE.getDocumentationFiles_Mainteneance();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__INSTRUCTIONS = eINSTANCE.getDocumentationFiles_Instructions();

		/**
		 * The meta object literal for the '<em><b>Training Intern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__TRAINING_INTERN = eINSTANCE.getDocumentationFiles_TrainingIntern();

		/**
		 * The meta object literal for the '<em><b>Training External</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_FILES__TRAINING_EXTERNAL = eINSTANCE.getDocumentationFiles_TrainingExternal();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.ComponentDocumentationFilesImpl <em>Component Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.ComponentDocumentationFilesImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getComponentDocumentationFiles()
		 * @generated
		 */
		EClass COMPONENT_DOCUMENTATION_FILES = eINSTANCE.getComponentDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DOCUMENTATION_FILES__PARENT = eINSTANCE.getComponentDocumentationFiles_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.ModuleDocumentationFilesImpl <em>Module Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.ModuleDocumentationFilesImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getModuleDocumentationFiles()
		 * @generated
		 */
		EClass MODULE_DOCUMENTATION_FILES = eINSTANCE.getModuleDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DOCUMENTATION_FILES__PARENT = eINSTANCE.getModuleDocumentationFiles_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl <em>Interface Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.InterfaceDocumentationFilesImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getInterfaceDocumentationFiles()
		 * @generated
		 */
		EClass INTERFACE_DOCUMENTATION_FILES = eINSTANCE.getInterfaceDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DOCUMENTATION_FILES__PARENT = eINSTANCE.getInterfaceDocumentationFiles_Parent();

		/**
		 * The meta object literal for the '{@link fieldofactivityannotations.impl.StructureDocumentationFilesImpl <em>Structure Documentation Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fieldofactivityannotations.impl.StructureDocumentationFilesImpl
		 * @see fieldofactivityannotations.impl.FieldofactivityannotationsPackageImpl#getStructureDocumentationFiles()
		 * @generated
		 */
		EClass STRUCTURE_DOCUMENTATION_FILES = eINSTANCE.getStructureDocumentationFiles();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DOCUMENTATION_FILES__PARENT = eINSTANCE.getStructureDocumentationFiles_Parent();

	}

} //FieldofactivityannotationsPackage
