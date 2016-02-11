/**
 */
package de.gebit.eclipse.installer.setupextensions;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Epf Import Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.EpfImportTask#getInput <em>Input</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.EpfImportTask#isIgnoreMissing <em>Ignore Missing</em>}</li>
 * </ul>
 *
 * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getEpfImportTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.epf.import' repository='https://github.com/GEBIT/EclipseSetupExtensions/wiki/updates/' installableUnits='SetupExtensions.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface EpfImportTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getEpfImportTask_Input()
   * @model required="true"
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensions.EpfImportTask#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

  /**
   * Returns the value of the '<em><b>Ignore Missing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Missing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Missing</em>' attribute.
   * @see #setIgnoreMissing(boolean)
   * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage#getEpfImportTask_IgnoreMissing()
   * @model required="true"
   * @generated
   */
  boolean isIgnoreMissing();

  /**
   * Sets the value of the '{@link de.gebit.eclipse.installer.setupextensions.EpfImportTask#isIgnoreMissing <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Missing</em>' attribute.
   * @see #isIgnoreMissing()
   * @generated
   */
  void setIgnoreMissing(boolean value);

} // EpfImportTask
