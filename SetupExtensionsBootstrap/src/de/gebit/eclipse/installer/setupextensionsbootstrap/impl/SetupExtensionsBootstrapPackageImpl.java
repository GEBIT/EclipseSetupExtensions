/**
 */
package de.gebit.eclipse.installer.setupextensionsbootstrap.impl;

import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask;
import de.gebit.eclipse.installer.setupextensionsbootstrap.IncludeTask;
import de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapFactory;
import de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage;
import de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetupExtensionsBootstrapPackageImpl extends EPackageImpl implements SetupExtensionsBootstrapPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unzipTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createShortcutTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeTaskEClass = null;

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
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SetupExtensionsBootstrapPackageImpl()
  {
    super(eNS_URI, SetupExtensionsBootstrapFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SetupExtensionsBootstrapPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SetupExtensionsBootstrapPackage init()
  {
    if (isInited)
    {
      return (SetupExtensionsBootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(SetupExtensionsBootstrapPackage.eNS_URI);
    }

    // Obtain or create and register package
    Object registeredSetupExtensionsBootstrapPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SetupExtensionsBootstrapPackageImpl theSetupExtensionsBootstrapPackage = registeredSetupExtensionsBootstrapPackage instanceof SetupExtensionsBootstrapPackageImpl
        ? (SetupExtensionsBootstrapPackageImpl)registeredSetupExtensionsBootstrapPackage
        : new SetupExtensionsBootstrapPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    BasePackage.eINSTANCE.eClass();
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSetupExtensionsBootstrapPackage.createPackageContents();

    // Initialize created meta-data
    theSetupExtensionsBootstrapPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSetupExtensionsBootstrapPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SetupExtensionsBootstrapPackage.eNS_URI, theSetupExtensionsBootstrapPackage);
    return theSetupExtensionsBootstrapPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnzipTask()
  {
    return unzipTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnzipTask_Archive()
  {
    return (EAttribute)unzipTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnzipTask_Destination()
  {
    return (EAttribute)unzipTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCreateShortcutTask()
  {
    return createShortcutTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCreateShortcutTask_Target()
  {
    return (EAttribute)createShortcutTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCreateShortcutTask_Location()
  {
    return (EAttribute)createShortcutTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIncludeTask()
  {
    return includeTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetupExtensionsBootstrapFactory getSetupExtensionsBootstrapFactory()
  {
    return (SetupExtensionsBootstrapFactory)getEFactoryInstance();
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

    createShortcutTaskEClass = createEClass(CREATE_SHORTCUT_TASK);
    createEAttribute(createShortcutTaskEClass, CREATE_SHORTCUT_TASK__TARGET);
    createEAttribute(createShortcutTaskEClass, CREATE_SHORTCUT_TASK__LOCATION);

    includeTaskEClass = createEClass(INCLUDE_TASK);
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
    createShortcutTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());
    includeTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(unzipTaskEClass, UnzipTask.class, "UnzipTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnzipTask_Archive(), ecorePackage.getEString(), "archive", null, 1, 1, UnzipTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnzipTask_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, UnzipTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createShortcutTaskEClass, CreateShortcutTask.class, "CreateShortcutTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateShortcutTask_Target(), ecorePackage.getEString(), "target", null, 0, 1, CreateShortcutTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateShortcutTask_Location(), ecorePackage.getEString(), "location", null, 1, 1, CreateShortcutTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeTaskEClass, IncludeTask.class, "IncludeTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource("https://raw.githubusercontent.com/GEBIT/EclipseSetupExtensions/master/SetupExtensionsBootstrap/model/SetupExtensionsBootstrap-1.1.1.ecore");

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
    addAnnotation(this, source, new String[] { "schemaLocation",
        "https://raw.githubusercontent.com/GEBIT/EclipseSetupExtensions/master/SetupExtensionsBootstrap/model/SetupExtensionsBootstrap-1.1.1.ecore" });
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
    addAnnotation(this, source, new String[] { "variableName", "p2.setup.extensions", "repository",
        "https://github.com/GEBIT/EclipseSetupExtensions/wiki/updates/", "installableUnits", "SetupExtensionsBootstrap.feature.group[1.1.1,2.0.0)" });
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
    addAnnotation(createShortcutTaskEClass, source, new String[] { "triggers", "BOOTSTRAP STARTUP MANUAL" });
    addAnnotation(includeTaskEClass, source, new String[] { "triggers", "BOOTSTRAP STARTUP" });
  }

} // SetupExtensionsBootstrapPackageImpl
