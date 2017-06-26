/**
 */
package de.gebit.eclipse.installer.setupextensionsbootstrap;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/GEBIT/EclipseSetupExtensions/master/SetupExtensionsBootstrap/model/SetupExtensionsBootstrap-1.1.ecore'"
 *        annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.setup.extensions' repository='https://github.com/GEBIT/EclipseSetupExtensions/wiki/updates/' installableUnits='SetupExtensionsBootstrap.feature.group'"
 * @generated
 */
public interface SetupExtensionsBootstrapPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "setupextensionsbootstrap";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.gebit.de/SetupExtensionsBootstrap/1.1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "setupextensionsbootstrap";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SetupExtensionsBootstrapPackage eINSTANCE = de.gebit.eclipse.installer.setupextensionsbootstrap.impl.SetupExtensionsBootstrapPackageImpl.init();

  /**
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.impl.UnzipTaskImpl <em>Unzip Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.UnzipTaskImpl
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.SetupExtensionsBootstrapPackageImpl#getUnzipTask()
   * @generated
   */
  int UNZIP_TASK = 0;

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
   * The meta object id for the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.impl.CreateShortcutTaskImpl <em>Create Shortcut Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.CreateShortcutTaskImpl
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.SetupExtensionsBootstrapPackageImpl#getCreateShortcutTask()
   * @generated
   */
  int CREATE_SHORTCUT_TASK = 1;

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
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask <em>Unzip Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unzip Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask
   * @generated
   */
  EClass getUnzipTask();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getArchive <em>Archive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Archive</em>'.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getArchive()
   * @see #getUnzipTask()
   * @generated
   */
  EAttribute getUnzipTask_Archive();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask#getDestination()
   * @see #getUnzipTask()
   * @generated
   */
  EAttribute getUnzipTask_Destination();

  /**
   * Returns the meta object for class '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask <em>Create Shortcut Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Shortcut Task</em>'.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask
   * @generated
   */
  EClass getCreateShortcutTask();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getTarget()
   * @see #getCreateShortcutTask()
   * @generated
   */
  EAttribute getCreateShortcutTask_Target();

  /**
   * Returns the meta object for the attribute '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask#getLocation()
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
  SetupExtensionsBootstrapFactory getSetupExtensionsBootstrapFactory();

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
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.impl.UnzipTaskImpl <em>Unzip Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.UnzipTaskImpl
     * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.SetupExtensionsBootstrapPackageImpl#getUnzipTask()
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
     * The meta object literal for the '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.impl.CreateShortcutTaskImpl <em>Create Shortcut Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.CreateShortcutTaskImpl
     * @see de.gebit.eclipse.installer.setupextensionsbootstrap.impl.SetupExtensionsBootstrapPackageImpl#getCreateShortcutTask()
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

} // SetupExtensionsBootstrapPackage
