/**
 */
package de.gebit.eclipse.unzip.unzip.impl;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.gebit.eclipse.unzip.unzip.UnzipFactory;
import de.gebit.eclipse.unzip.unzip.UnzipPackage;
import de.gebit.eclipse.unzip.unzip.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnzipPackageImpl extends EPackageImpl implements UnzipPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unzipTaskEClass = null;

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
   * @see de.gebit.eclipse.unzip.unzip.UnzipPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UnzipPackageImpl()
  {
    super(eNS_URI, UnzipFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link UnzipPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UnzipPackage init()
  {
    if (isInited)
    {
      return (UnzipPackage)EPackage.Registry.INSTANCE.getEPackage(UnzipPackage.eNS_URI);
    }

    // Obtain or create and register package
    UnzipPackageImpl theUnzipPackage = (UnzipPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnzipPackageImpl
        ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UnzipPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theUnzipPackage.createPackageContents();

    // Initialize created meta-data
    theUnzipPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUnzipPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UnzipPackage.eNS_URI, theUnzipPackage);
    return theUnzipPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnzipTask()
  {
    return unzipTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnzipTask_Archive()
  {
    return (EAttribute)unzipTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnzipTask_Destination()
  {
    return (EAttribute)unzipTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnzipFactory getUnzipFactory()
  {
    return (UnzipFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    unzipTaskEClass = createEClass(UNZIP_TASK);
    createEAttribute(unzipTaskEClass, UNZIP_TASK__ARCHIVE);
    createEAttribute(unzipTaskEClass, UNZIP_TASK__DESTINATION);
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
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    unzipTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(unzipTaskEClass, UnzipTask.class, "UnzipTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnzipTask_Archive(), ecorePackage.getEString(), "archive", null, 1, 1, UnzipTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnzipTask_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, UnzipTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource("http://eclipse.gebit.de/Unzip/schemas/Unzip-1.0.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation", "http://eclipse.gebit.de/Unzip/schemas/Unzip-1.0.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(unzipTaskEClass, source, new String[] { "variableName", "p2.unzip", "repository",
        "https://github.com/GEBIT/EclipseSetupExtensions/wiki/updates/", "installableUnits", "Unzip.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(unzipTaskEClass, source, new String[] { "triggers", "BOOTSTRAP STARTUP MANUAL" });
  }

} // UnzipPackageImpl
