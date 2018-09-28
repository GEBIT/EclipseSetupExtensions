/**
 */
package de.gebit.eclipse.installer.setupextensionsbootstrap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage
 * @generated
 */
public interface SetupExtensionsBootstrapFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SetupExtensionsBootstrapFactory eINSTANCE = de.gebit.eclipse.installer.setupextensionsbootstrap.impl.SetupExtensionsBootstrapFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Unzip Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unzip Task</em>'.
   * @generated
   */
  UnzipTask createUnzipTask();

  /**
   * Returns a new object of class '<em>Create Shortcut Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Shortcut Task</em>'.
   * @generated
   */
  CreateShortcutTask createCreateShortcutTask();

  /**
   * Returns a new object of class '<em>Include Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Task</em>'.
   * @generated
   */
  IncludeTask createIncludeTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SetupExtensionsBootstrapPackage getSetupExtensionsBootstrapPackage();

} // SetupExtensionsBootstrapFactory
