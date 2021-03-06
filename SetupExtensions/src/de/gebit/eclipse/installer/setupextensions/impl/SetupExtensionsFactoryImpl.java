//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.gebit.eclipse.installer.setupextensions.CommandParameter;
import de.gebit.eclipse.installer.setupextensions.EpfImportTask;
import de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask;
import de.gebit.eclipse.installer.setupextensions.FullBuildTask;
import de.gebit.eclipse.installer.setupextensions.IvyResolveTask;
import de.gebit.eclipse.installer.setupextensions.Project;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsFactory;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetupExtensionsFactoryImpl extends EFactoryImpl implements SetupExtensionsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SetupExtensionsFactory init()
  {
    try
    {
      SetupExtensionsFactory theSetupExtensionsFactory = (SetupExtensionsFactory)EPackage.Registry.INSTANCE.getEFactory(SetupExtensionsPackage.eNS_URI);
      if (theSetupExtensionsFactory != null)
      {
        return theSetupExtensionsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SetupExtensionsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupExtensionsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case SetupExtensionsPackage.FULL_BUILD_TASK:
      return createFullBuildTask();
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK:
      return createExecuteCommandTask();
    case SetupExtensionsPackage.COMMAND_PARAMETER:
      return createCommandParameter();
    case SetupExtensionsPackage.IVY_RESOLVE_TASK:
      return createIvyResolveTask();
    case SetupExtensionsPackage.PROJECT:
      return createProject();
    case SetupExtensionsPackage.EPF_IMPORT_TASK:
      return createEpfImportTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FullBuildTask createFullBuildTask()
  {
    FullBuildTaskImpl fullBuildTask = new FullBuildTaskImpl();
    return fullBuildTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExecuteCommandTask createExecuteCommandTask()
  {
    ExecuteCommandTaskImpl executeCommandTask = new ExecuteCommandTaskImpl();
    return executeCommandTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommandParameter createCommandParameter()
  {
    CommandParameterImpl commandParameter = new CommandParameterImpl();
    return commandParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IvyResolveTask createIvyResolveTask()
  {
    IvyResolveTaskImpl ivyResolveTask = new IvyResolveTaskImpl();
    return ivyResolveTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EpfImportTask createEpfImportTask()
  {
    EpfImportTaskImpl epfImportTask = new EpfImportTaskImpl();
    return epfImportTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetupExtensionsPackage getSetupExtensionsPackage()
  {
    return (SetupExtensionsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SetupExtensionsPackage getPackage()
  {
    return SetupExtensionsPackage.eINSTANCE;
  }

} // SetupExtensionsFactoryImpl
