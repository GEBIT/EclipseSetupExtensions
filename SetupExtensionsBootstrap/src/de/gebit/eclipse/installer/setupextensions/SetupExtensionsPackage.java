//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions;

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
 * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/GEBIT/EclipseSetupExtensions/master/SetupExtensions/model/SetupExtensions-1.1.ecore'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.setup.extensions' repository='https://github.com/GEBIT/EclipseSetupExtensions/wiki/updates/' installableUnits='SetupExtensions.feature.group'"
 * @generated
 */
public interface SetupExtensionsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "setupextensions";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.gebit.de/SetupExtensions/1.1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "setupextensions";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SetupExtensionsPackage eINSTANCE = de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.FullBuildTaskImpl <em>Full Build Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.FullBuildTaskImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getFullBuildTask()
   * @generated
   */
  int FULL_BUILD_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The number of structural features of the '<em>Full Build Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_BUILD_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.ExecuteCommandTaskImpl <em>Execute Command Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.ExecuteCommandTaskImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getExecuteCommandTask()
   * @generated
   */
  int EXECUTE_COMMAND_TASK = 1;

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
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

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
   * The number of structural features of the '<em>Execute Command Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_COMMAND_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.CommandParameterImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getCommandParameter()
   * @generated
   */
  int COMMAND_PARAMETER = 2;

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
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.IvyResolveTaskImpl <em>Ivy Resolve Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.IvyResolveTaskImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getIvyResolveTask()
   * @generated
   */
  int IVY_RESOLVE_TASK = 3;

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
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK__PROJECTS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ivy Resolve Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVY_RESOLVE_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.ProjectImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 4;

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
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.UnzipTaskImpl <em>Unzip Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.UnzipTaskImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getUnzipTask()
   * @generated
   */
  int UNZIP_TASK = 5;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Archive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__ARCHIVE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__DESTINATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unzip Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.EpfImportTaskImpl <em>Epf Import Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.EpfImportTaskImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getEpfImportTask()
   * @generated
   */
  int EPF_IMPORT_TASK = 6;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__INPUT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ignore Missing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK__IGNORE_MISSING = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Epf Import Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPF_IMPORT_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensions.impl.CreateShortcutTaskImpl <em>Create Shortcut Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensions.impl.CreateShortcutTaskImpl
   * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getCreateShortcutTask()
   * @generated
   */
  int CREATE_SHORTCUT_TASK = 7;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__TARGET = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK__LOCATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Shortcut Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_SHORTCUT_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.FullBuildTask <em>Full Build Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full Build Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.FullBuildTask
   * @generated
   */
  EClass getFullBuildTask();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask <em>Execute Command Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execute Command Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask
   * @generated
   */
  EClass getExecuteCommandTask();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask#getCommand()
   * @see #getExecuteCommandTask()
   * @generated
   */
  EAttribute getExecuteCommandTask_Command();

  /**
   * Returns the meta object for the containment reference list '{@link de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask#getParameters()
   * @see #getExecuteCommandTask()
   * @generated
   */
  EReference getExecuteCommandTask_Parameters();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.CommandParameter <em>Command Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Parameter</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.CommandParameter
   * @generated
   */
  EClass getCommandParameter();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.CommandParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.CommandParameter#getName()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.CommandParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.CommandParameter#getValue()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_Value();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.IvyResolveTask <em>Ivy Resolve Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ivy Resolve Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.IvyResolveTask
   * @generated
   */
  EClass getIvyResolveTask();

  /**
   * Returns the meta object for the containment reference list '{@link de.gebit.eclipse.installer.setupextensions.IvyResolveTask#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.IvyResolveTask#getProjects()
   * @see #getIvyResolveTask()
   * @generated
   */
  EReference getIvyResolveTask_Projects();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.Project#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.Project#getPattern()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Pattern();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.UnzipTask <em>Unzip Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unzip Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.UnzipTask
   * @generated
   */
  EClass getUnzipTask();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.UnzipTask#getArchive <em>Archive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Archive</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.UnzipTask#getArchive()
   * @see #getUnzipTask()
   * @generated
   */
  EAttribute getUnzipTask_Archive();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.UnzipTask#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.UnzipTask#getDestination()
   * @see #getUnzipTask()
   * @generated
   */
  EAttribute getUnzipTask_Destination();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.EpfImportTask <em>Epf Import Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Epf Import Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.EpfImportTask
   * @generated
   */
  EClass getEpfImportTask();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.EpfImportTask#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.EpfImportTask#getInput()
   * @see #getEpfImportTask()
   * @generated
   */
  EAttribute getEpfImportTask_Input();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.EpfImportTask#isIgnoreMissing <em>Ignore Missing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore Missing</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.EpfImportTask#isIgnoreMissing()
   * @see #getEpfImportTask()
   * @generated
   */
  EAttribute getEpfImportTask_IgnoreMissing();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensions.CreateShortcutTask <em>Create Shortcut Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Shortcut Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.CreateShortcutTask
   * @generated
   */
  EClass getCreateShortcutTask();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.CreateShortcutTask#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.CreateShortcutTask#getTarget()
   * @see #getCreateShortcutTask()
   * @generated
   */
  EAttribute getCreateShortcutTask_Target();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensions.CreateShortcutTask#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see de.gebit.eclipse.installer.setupextensions.CreateShortcutTask#getLocation()
   * @see #getCreateShortcutTask()
   * @generated
   */
  EAttribute getCreateShortcutTask_Location();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SetupExtensionsFactory getSetupExtensionsFactory();

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
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.FullBuildTaskImpl <em>Full Build Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.FullBuildTaskImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getFullBuildTask()
     * @generated
     */
    EClass FULL_BUILD_TASK = eINSTANCE.getFullBuildTask();

    /**
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.ExecuteCommandTaskImpl <em>Execute Command Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.ExecuteCommandTaskImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getExecuteCommandTask()
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
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.CommandParameterImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getCommandParameter()
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

    /**
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.IvyResolveTaskImpl <em>Ivy Resolve Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.IvyResolveTaskImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getIvyResolveTask()
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
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.ProjectImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getProject()
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

    /**
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.UnzipTaskImpl <em>Unzip Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.UnzipTaskImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getUnzipTask()
     * @generated
     */
    EClass UNZIP_TASK = eINSTANCE.getUnzipTask();

    /**
     * The meta object literal for the '<em><b>Archive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNZIP_TASK__ARCHIVE = eINSTANCE.getUnzipTask_Archive();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNZIP_TASK__DESTINATION = eINSTANCE.getUnzipTask_Destination();

    /**
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.EpfImportTaskImpl <em>Epf Import Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.EpfImportTaskImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getEpfImportTask()
     * @generated
     */
    EClass EPF_IMPORT_TASK = eINSTANCE.getEpfImportTask();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPF_IMPORT_TASK__INPUT = eINSTANCE.getEpfImportTask_Input();

    /**
     * The meta object literal for the '<em><b>Ignore Missing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPF_IMPORT_TASK__IGNORE_MISSING = eINSTANCE.getEpfImportTask_IgnoreMissing();

    /**
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensions.impl.CreateShortcutTaskImpl <em>Create Shortcut Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensions.impl.CreateShortcutTaskImpl
     * @see de.gebit.eclipse.installer.setupextensions.impl.SetupExtensionsPackageImpl#getCreateShortcutTask()
     * @generated
     */
    EClass CREATE_SHORTCUT_TASK = eINSTANCE.getCreateShortcutTask();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_SHORTCUT_TASK__TARGET = eINSTANCE.getCreateShortcutTask_Target();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_SHORTCUT_TASK__LOCATION = eINSTANCE.getCreateShortcutTask_Location();

  }

} // SetupExtensionsPackage
