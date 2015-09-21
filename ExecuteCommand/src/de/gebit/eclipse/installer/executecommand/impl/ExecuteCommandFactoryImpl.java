//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.executecommand.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.gebit.eclipse.installer.executecommand.CommandParameter;
import de.gebit.eclipse.installer.executecommand.ExecuteCommandFactory;
import de.gebit.eclipse.installer.executecommand.ExecuteCommandPackage;
import de.gebit.eclipse.installer.executecommand.ExecuteCommandTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecuteCommandFactoryImpl extends EFactoryImpl implements ExecuteCommandFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExecuteCommandFactory init()
  {
    try
    {
      ExecuteCommandFactory theExecuteCommandFactory = (ExecuteCommandFactory)EPackage.Registry.INSTANCE.getEFactory(ExecuteCommandPackage.eNS_URI);
      if (theExecuteCommandFactory != null)
      {
        return theExecuteCommandFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExecuteCommandFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecuteCommandFactoryImpl()
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
    case ExecuteCommandPackage.EXECUTE_COMMAND_TASK:
      return createExecuteCommandTask();
    case ExecuteCommandPackage.COMMAND_PARAMETER:
      return createCommandParameter();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
  public ExecuteCommandPackage getExecuteCommandPackage()
  {
    return (ExecuteCommandPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExecuteCommandPackage getPackage()
  {
    return ExecuteCommandPackage.eINSTANCE;
  }

} // ExecuteCommandFactoryImpl
