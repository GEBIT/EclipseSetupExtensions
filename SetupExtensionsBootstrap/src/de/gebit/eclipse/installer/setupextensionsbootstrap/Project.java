//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensionsbootstrap;

import org.eclipse.oomph.base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensionsbootstrap.Project#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsPackage#getProject_Pattern()
   * @model required="true"
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.Project#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

} // Project
