//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensionsbootstrap;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unzip Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getArchive <em>Archive</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage#getUnzipTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface UnzipTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Archive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Archive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Archive</em>' attribute.
   * @see #setArchive(String)
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage#getUnzipTask_Archive()
   * @model required="true"
   * @generated
   */
  String getArchive();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getArchive <em>Archive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Archive</em>' attribute.
   * @see #getArchive()
   * @generated
   */
  void setArchive(String value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage#getUnzipTask_Destination()
   * @model required="true"
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

} // UnzipTask
