//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.setup.ivyresolve;

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
 * @see de.gebit.eclipse.setup.ivyresolve.IvyResolveFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='http://eclipse.gebit.de/IvyResolve/schemas/Ivyresolve-1.0.ecore'"
 * @generated
 */
public interface IvyResolvePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ivyresolve";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.gebit.de/IvyResolve/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ivyresolve";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IvyResolvePackage eINSTANCE = de.gebit.eclipse.setup.ivyresolve.impl.IvyResolvePackageImpl.init();

  /**
   * The meta object id for the '{@link de.gebit.eclipse.setup.ivyresolve.impl.IvyResolveTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.setup.ivyresolve.impl.IvyResolveTaskImpl
   * @see de.gebit.eclipse.setup.ivyresolve.impl.IvyResolvePackageImpl#getIvyResolveTask()
   * @generated
   */
  int IVY_RESOLVE_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__PROJECTS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gebit.eclipse.setup.ivyresolve.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.setup.ivyresolve.impl.ProjectImpl
   * @see de.gebit.eclipse.setup.ivyresolve.impl.IvyResolvePackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ANNOTATIONS = BasePackage.MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PATTERN = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.setup.ivyresolve.IvyResolveTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see de.gebit.eclipse.setup.ivyresolve.IvyResolveTask
   * @generated
   */
  EClass getIvyResolveTask();

  /**
   * Returns the meta object for the containment reference list '{@link de.gebit.eclipse.setup.ivyresolve.IvyResolveTask#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see de.gebit.eclipse.setup.ivyresolve.IvyResolveTask#getProjects()
   * @see #getIvyResolveTask()
   * @generated
   */
  EReference getIvyResolveTask_Projects();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.setup.ivyresolve.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see de.gebit.eclipse.setup.ivyresolve.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.setup.ivyresolve.Project#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see de.gebit.eclipse.setup.ivyresolve.Project#getPattern()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Pattern();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IvyResolveFactory getIvyResolveFactory();

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
     * The meta object literal for the '{@link de.gebit.eclipse.setup.ivyresolve.impl.IvyResolveTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.setup.ivyresolve.impl.IvyResolveTaskImpl
     * @see de.gebit.eclipse.setup.ivyresolve.impl.IvyResolvePackageImpl#getIvyResolveTask()
     * @generated
     */
    EClass IVY_RESOLVE_TASK = eINSTANCE.getIvyResolveTask();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IVY_RESOLVE_TASK__PROJECTS = eINSTANCE.getIvyResolveTask_Projects();

    /**
     * The meta object literal for the '{@link de.gebit.eclipse.setup.ivyresolve.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.setup.ivyresolve.impl.ProjectImpl
     * @see de.gebit.eclipse.setup.ivyresolve.impl.IvyResolvePackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__PATTERN = eINSTANCE.getProject_Pattern();

  }

} // IvyResolvePackage
