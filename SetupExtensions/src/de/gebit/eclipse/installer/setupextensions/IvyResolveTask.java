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
 * A representation of the model object '<em><b>Ivy Resolve Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.IvyResolveTask#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getIvyResolveTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface IvyResolveTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
   * The list contents are of type {@link de.gebit.eclipse.installer.setupextensions.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' containment reference list.
   * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getIvyResolveTask_Projects()
   * @model containment="true"
   * @generated
   */
  EList<Project> getProjects();

} // IvyResolveTask
