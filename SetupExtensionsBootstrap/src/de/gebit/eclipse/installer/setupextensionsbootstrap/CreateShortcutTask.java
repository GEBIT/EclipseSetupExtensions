/**
 */
package de.gebit.eclipse.installer.setupextensionsbootstrap;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Shortcut Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getTarget <em>Target</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage#getCreateShortcutTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface CreateShortcutTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage#getCreateShortcutTask_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage#getCreateShortcutTask_Location()
   * @model required="true"
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

} // CreateShortcutTask
