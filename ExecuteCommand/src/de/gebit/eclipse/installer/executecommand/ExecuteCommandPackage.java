//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.executecommand;

import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.setup.SetupPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.gebit.eclipse.installer.executecommand.ExecuteCommandFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='http://eclipse.gebit.de/ExecuteCommand/schemas/ExecuteCommand-1.0.ecore'"
 * @generated
 */
public interface ExecuteCommandPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "executecommand";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.gebit.de/ExecuteCommand/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "executecommand";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExecuteCommandPackage eINSTANCE = de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandPackageImpl.init();

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandTaskImpl
   * @see de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandPackageImpl#getExecuteCommandTask()
   * @generated
   */
  int EXECUTE_COMMAND_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__COMMAND = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__PARAMETERS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.executecommand.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.executecommand.impl.CommandParameterImpl
   * @see de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandPackageImpl#getCommandParameter()
   * @generated
   */
  int COMMAND_PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__ANNOTATIONS = BasePackage.MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__NAME = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__VALUE = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER_FEATURE_COUNT = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.executecommand.ExecuteCommandTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see de.gebit.eclipse.installer.executecommand.ExecuteCommandTask
   * @generated
   */
  EClass getExecuteCommandTask();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.executecommand.ExecuteCommandTask#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see de.gebit.eclipse.installer.executecommand.ExecuteCommandTask#getCommand()
   * @see #getExecuteCommandTask()
   * @generated
   */
  EAttribute getExecuteCommandTask_Command();

  /**
   * Returns the meta object for the containment reference list '{@link de.gebit.eclipse.installer.executecommand.ExecuteCommandTask#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.gebit.eclipse.installer.executecommand.ExecuteCommandTask#getParameters()
   * @see #getExecuteCommandTask()
   * @generated
   */
  EReference getExecuteCommandTask_Parameters();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.executecommand.CommandParameter <em>Command Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Parameter</em>'.
   * @see de.gebit.eclipse.installer.executecommand.CommandParameter
   * @generated
   */
  EClass getCommandParameter();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.executecommand.CommandParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.gebit.eclipse.installer.executecommand.CommandParameter#getName()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.executecommand.CommandParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.gebit.eclipse.installer.executecommand.CommandParameter#getValue()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExecuteCommandFactory getExecuteCommandFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandTaskImpl
     * @see de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandPackageImpl#getExecuteCommandTask()
     * @generated
     */
    EClass EXECUTE_COMMAND_TASK = eINSTANCE.getExecuteCommandTask();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXECUTE_COMMAND_TASK__COMMAND = eINSTANCE.getExecuteCommandTask_Command();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_COMMAND_TASK__PARAMETERS = eINSTANCE.getExecuteCommandTask_Parameters();

    /**
     * The meta object literal for the '{@link de.gebit.eclipse.installer.executecommand.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.executecommand.impl.CommandParameterImpl
     * @see de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandPackageImpl#getCommandParameter()
     * @generated
     */
    EClass COMMAND_PARAMETER = eINSTANCE.getCommandParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_PARAMETER__NAME = eINSTANCE.getCommandParameter_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_PARAMETER__VALUE = eINSTANCE.getCommandParameter_Value();

  }

} // ExecuteCommandPackage
