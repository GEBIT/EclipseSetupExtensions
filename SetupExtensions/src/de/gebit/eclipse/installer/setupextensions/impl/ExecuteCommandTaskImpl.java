//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.gebit.eclipse.installer.setupextensions.CommandParameter;
import de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Command Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.ExecuteCommandTaskImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.ExecuteCommandTaskImpl#isWaitForJobs <em>Wait For Jobs</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.ExecuteCommandTaskImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteCommandTaskImpl extends SetupTaskImpl implements ExecuteCommandTask
{
  /**
   * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected static final String COMMAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected String command = COMMAND_EDEFAULT;

  /**
   * The default value of the '{@link #isWaitForJobs() <em>Wait For Jobs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWaitForJobs()
   * @generated
   * @ordered
   */
  protected static final boolean WAIT_FOR_JOBS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWaitForJobs() <em>Wait For Jobs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWaitForJobs()
   * @generated
   * @ordered
   */
  protected boolean waitForJobs = WAIT_FOR_JOBS_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<CommandParameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecuteCommandTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SetupExtensionsPackage.Literals.EXECUTE_COMMAND_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(String newCommand)
  {
    String oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsPackage.EXECUTE_COMMAND_TASK__COMMAND, oldCommand, command));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWaitForJobs()
  {
    return waitForJobs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWaitForJobs(boolean newWaitForJobs)
  {
    boolean oldWaitForJobs = waitForJobs;
    waitForJobs = newWaitForJobs;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsPackage.EXECUTE_COMMAND_TASK__WAIT_FOR_JOBS, oldWaitForJobs, waitForJobs));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CommandParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<CommandParameter>(CommandParameter.class, this, SetupExtensionsPackage.EXECUTE_COMMAND_TASK__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__PARAMETERS:
      return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__COMMAND:
      return getCommand();
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__WAIT_FOR_JOBS:
      return isWaitForJobs();
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__PARAMETERS:
      return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__COMMAND:
      setCommand((String)newValue);
      return;
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__WAIT_FOR_JOBS:
      setWaitForJobs((Boolean)newValue);
      return;
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__PARAMETERS:
      getParameters().clear();
      getParameters().addAll((Collection<? extends CommandParameter>)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__COMMAND:
      setCommand(COMMAND_EDEFAULT);
      return;
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__WAIT_FOR_JOBS:
      setWaitForJobs(WAIT_FOR_JOBS_EDEFAULT);
      return;
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__PARAMETERS:
      getParameters().clear();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__COMMAND:
      return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__WAIT_FOR_JOBS:
      return waitForJobs != WAIT_FOR_JOBS_EDEFAULT;
    case SetupExtensionsPackage.EXECUTE_COMMAND_TASK__PARAMETERS:
      return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (command: ");
    result.append(command);
    result.append(", waitForJobs: ");
    result.append(waitForJobs);
    result.append(')');
    return result.toString();
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    if (isWaitForJobs() && !Job.getJobManager().isIdle())
    {
      // we're also in a Job, so don't count ourselves
      context.log("Waiting for " + (Job.getJobManager().find(null).length - 1) + " jobs to complete");
      while (Job.getJobManager().find(null).length > 1)
      {
        context.log("waiting...");
        Thread.sleep(1000);

        for (Job tempJob : Job.getJobManager().find(null))
        {
          context.log("Active job: " + tempJob.getName());
        }
      }
    }

    ICommandService cmdService = PlatformUI.getWorkbench().getService(ICommandService.class);
    Command tempCommand = cmdService.getCommand(getCommand());
    if (!tempCommand.isDefined())
    {
      context.log("Failed to look up command category " + getCommand());
      return;
    }
    Map<String, String> tempParameters = new HashMap<String, String>();
    ExecutionEvent tempExecEvent = new ExecutionEvent(tempParameters, null, null);
    for (CommandParameter tempParameter : getParameters())
    {
      tempParameters.put(tempParameter.getName(), tempParameter.getValue());
    }
    tempCommand.executeWithChecks(tempExecEvent);
  }

} // ExecuteCommandTaskImpl
