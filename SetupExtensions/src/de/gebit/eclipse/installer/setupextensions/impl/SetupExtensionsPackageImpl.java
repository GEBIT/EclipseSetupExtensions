//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.gebit.eclipse.installer.setupextensions.CommandParameter;
import de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask;
import de.gebit.eclipse.installer.setupextensions.IvyResolveTask;
import de.gebit.eclipse.installer.setupextensions.Project;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsFactory;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;
import de.gebit.eclipse.installer.setupextensions.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetupExtensionsPackageImpl extends EPackageImpl implements SetupExtensionsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executeCommandTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ivyResolveTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectEClass = null;

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
   * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SetupExtensionsPackageImpl()
  {
    super(eNS_URI, SetupExtensionsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SetupExtensionsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SetupExtensionsPackage init()
  {
    if (isInited)
    {
      return (SetupExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(SetupExtensionsPackage.eNS_URI);
    }

    // Obtain or create and register package
    SetupExtensionsPackageImpl theSetupExtensionsPackage = (SetupExtensionsPackageImpl)(EPackage.Registry.INSTANCE
        .get(eNS_URI) instanceof SetupExtensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SetupExtensionsPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSetupExtensionsPackage.createPackageContents();

    // Initialize created meta-data
    theSetupExtensionsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSetupExtensionsPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SetupExtensionsPackage.eNS_URI, theSetupExtensionsPackage);
    return theSetupExtensionsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecuteCommandTask()
  {
    return executeCommandTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecuteCommandTask_Command()
  {
    return (EAttribute)executeCommandTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteCommandTask_Parameters()
  {
    return (EReference)executeCommandTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandParameter()
  {
    return commandParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommandParameter_Name()
  {
    return (EAttribute)commandParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommandParameter_Value()
  {
    return (EAttribute)commandParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIvyResolveTask()
  {
    return ivyResolveTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIvyResolveTask_Projects()
  {
    return (EReference)ivyResolveTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Pattern()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
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
  public SetupExtensionsFactory getSetupExtensionsFactory()
  {
    return (SetupExtensionsFactory)getEFactoryInstance();
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
    executeCommandTaskEClass = createEClass(EXECUTE_COMMAND_TASK);
    createEAttribute(executeCommandTaskEClass, EXECUTE_COMMAND_TASK__COMMAND);
    createEReference(executeCommandTaskEClass, EXECUTE_COMMAND_TASK__PARAMETERS);

    commandParameterEClass = createEClass(COMMAND_PARAMETER);
    createEAttribute(commandParameterEClass, COMMAND_PARAMETER__NAME);
    createEAttribute(commandParameterEClass, COMMAND_PARAMETER__VALUE);

    ivyResolveTaskEClass = createEClass(IVY_RESOLVE_TASK);
    createEReference(ivyResolveTaskEClass, IVY_RESOLVE_TASK__PROJECTS);

    projectEClass = createEClass(PROJECT);
    createEAttribute(projectEClass, PROJECT__PATTERN);

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
    BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    executeCommandTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());
    commandParameterEClass.getESuperTypes().add(theBasePackage.getModelElement());
    ivyResolveTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());
    projectEClass.getESuperTypes().add(theBasePackage.getModelElement());
    unzipTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(executeCommandTaskEClass, ExecuteCommandTask.class, "ExecuteCommandTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExecuteCommandTask_Command(), ecorePackage.getEString(), "command", null, 1, 1, ExecuteCommandTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteCommandTask_Parameters(), getCommandParameter(), null, "parameters", null, 0, -1, ExecuteCommandTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandParameterEClass, CommandParameter.class, "CommandParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommandParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, CommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommandParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, CommandParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ivyResolveTaskEClass, IvyResolveTask.class, "IvyResolveTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIvyResolveTask_Projects(), getProject(), null, "projects", null, 0, -1, IvyResolveTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProject_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unzipTaskEClass, UnzipTask.class, "UnzipTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnzipTask_Archive(), ecorePackage.getEString(), "archive", null, 1, 1, UnzipTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnzipTask_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, UnzipTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource("http://eclipse.gebit.de/SetupExtensions/schemas/SetupExtensions-1.0.ecore");

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
    addAnnotation(this, source, new String[] { "schemaLocation", "http://eclipse.gebit.de/SetupExtensions/schemas/SetupExtensions-1.0.ecore" });
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
    addAnnotation(executeCommandTaskEClass, source, new String[] { "variableName", "p2.execute.command", "repository",
        "https://raw.githubusercontent.com/wiki/GEBIT/EclipseSetupExtensions/updates/", "installableUnits", "ExecuteCommand.feature.group" });
    addAnnotation(ivyResolveTaskEClass, source, new String[] { "variableName", "p2.ivy.resolve", "repository",
        "https://raw.githubusercontent.com/wiki/GEBIT/EclipseSetupExtensions/updates/", "installableUnits", "IvyResolve.feature.group" });
    addAnnotation(unzipTaskEClass, source, new String[] { "variableName", "p2.unzip", "repository",
        "https://raw.githubusercontent.com/wiki/GEBIT/EclipseSetupExtensions/updates/", "installableUnits", "Unzip.feature.group" });
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
    addAnnotation(executeCommandTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
    addAnnotation(ivyResolveTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
    addAnnotation(unzipTaskEClass, source, new String[] { "triggers", "BOOTSTRAP STARTUP MANUAL" });
  }

} // SetupExtensionsPackageImpl
