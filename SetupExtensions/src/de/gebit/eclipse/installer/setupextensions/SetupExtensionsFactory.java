//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage
 * @generated
 */
public interface SetupExtensionsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SetupExtensionsFactory eINSTANCE = de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Full Build Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Full Build Task</em>'.
   * @generated
   */
  FullBuildTask createFullBuildTask();

  /**
   * Returns a new object of class '<em>Execute Command Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execute Command Task</em>'.
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
   * Returns a new object of class '<em>Ivy Resolve Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ivy Resolve Task</em>'.
   * @generated
   */
  IvyResolveTask createIvyResolveTask();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>Unzip Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unzip Task</em>'.
   * @generated
   */
  UnzipTask createUnzipTask();

  /**
   * Returns a new object of class '<em>Epf Import Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Epf Import Task</em>'.
   * @generated
   */
  EpfImportTask createEpfImportTask();

  /**
   * Returns a new object of class '<em>Create Shortcut Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Shortcut Task</em>'.
   * @generated
   */
  CreateShortcutTask createCreateShortcutTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SetupExtensionsPackage getSetupExtensionsPackage();

} // SetupExtensionsFactory
