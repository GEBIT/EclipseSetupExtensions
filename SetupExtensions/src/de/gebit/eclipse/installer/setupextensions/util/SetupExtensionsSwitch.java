//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions.util;

import org.eclipse.oomph.base.ModelElement;
import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.gebit.eclipse.installer.setupextensions.CommandParameter;
import de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask;
import de.gebit.eclipse.installer.setupextensions.FullBuildTask;
import de.gebit.eclipse.installer.setupextensions.IvyResolveTask;
import de.gebit.eclipse.installer.setupextensions.Project;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;
import de.gebit.eclipse.installer.setupextensions.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage
 * @generated
 */
public class SetupExtensionsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SetupExtensionsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupExtensionsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SetupExtensionsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
    case SetupExtensionsPackage.FULL_BUILD_TASK:
    {
      FullBuildTask fullBuildTask = (FullBuildTask)theEObject;
      T result = caseFullBuildTask(fullBuildTask);
      if (result == null)
      {
        result = caseSetupTask(fullBuildTask);
      }
      if (result == null)
      {
        result = caseModelElement(fullBuildTask);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK:
    {
      ExecuteCommandTask executeCommandTask = (ExecuteCommandTask)theEObject;
      T result = caseExecuteCommandTask(executeCommandTask);
      if (result == null)
      {
        result = caseSetupTask(executeCommandTask);
      }
      if (result == null)
      {
        result = caseModelElement(executeCommandTask);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case SetupExtensionsPackage.COMMAND_PARAMETER:
    {
      CommandParameter commandParameter = (CommandParameter)theEObject;
      T result = caseCommandParameter(commandParameter);
      if (result == null)
      {
        result = caseModelElement(commandParameter);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case SetupExtensionsPackage.IVY_RESOLVE_TASK:
    {
      IvyResolveTask ivyResolveTask = (IvyResolveTask)theEObject;
      T result = caseIvyResolveTask(ivyResolveTask);
      if (result == null)
      {
        result = caseSetupTask(ivyResolveTask);
      }
      if (result == null)
      {
        result = caseModelElement(ivyResolveTask);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case SetupExtensionsPackage.PROJECT:
    {
      Project project = (Project)theEObject;
      T result = caseProject(project);
      if (result == null)
      {
        result = caseModelElement(project);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case SetupExtensionsPackage.UNZIP_TASK:
    {
      UnzipTask unzipTask = (UnzipTask)theEObject;
      T result = caseUnzipTask(unzipTask);
      if (result == null)
      {
        result = caseSetupTask(unzipTask);
      }
      if (result == null)
      {
        result = caseModelElement(unzipTask);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Full Build Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Full Build Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFullBuildTask(FullBuildTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execute Command Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execute Command Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecuteCommandTask(ExecuteCommandTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandParameter(CommandParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ivy Resolve Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ivy Resolve Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIvyResolveTask(IvyResolveTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unzip Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unzip Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnzipTask(UnzipTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetupTask(SetupTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} // SetupExtensionsSwitch
