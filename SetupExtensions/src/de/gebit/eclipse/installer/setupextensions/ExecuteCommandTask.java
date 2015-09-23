//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions;

import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute Command Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask#getCommand <em>Command</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getExecuteCommandTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.execute.command' repository='https://raw.githubusercontent.com/wiki/GEBIT/EclipseSetupExtensions/updates/' installableUnits='ExecuteCommand.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface ExecuteCommandTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see #setCommand(String)
   * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getExecuteCommandTask_Command()
   * @model required="true"
   * @generated
   */
  String getCommand();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see #getCommand()
   * @generated
   */
  void setCommand(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link de.gebit.eclipse.installer.setupextensions.CommandParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getExecuteCommandTask_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<CommandParameter> getParameters();

} // ExecuteCommandTask
