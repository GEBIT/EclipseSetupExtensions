//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.executecommand;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.gebit.eclipse.installer.executecommand.ExecuteCommandPackage
 * @generated
 */
public interface ExecuteCommandFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExecuteCommandFactory eINSTANCE = de.gebit.eclipse.installer.executecommand.impl.ExecuteCommandFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  ExecuteCommandTask createExecuteCommandTask();

  /**
   * Returns a new object of class '<em>Command Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command Parameter</em>'.
   * @generated
   */
  CommandParameter createCommandParameter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ExecuteCommandPackage getExecuteCommandPackage();

} // ExecuteCommandFactory
