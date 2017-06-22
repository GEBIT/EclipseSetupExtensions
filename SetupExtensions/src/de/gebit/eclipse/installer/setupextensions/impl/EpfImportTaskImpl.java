/**
 */
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import de.gebit.eclipse.installer.setupextensions.EpfImportTask;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Epf Import Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.EpfImportTaskImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.EpfImportTaskImpl#isIgnoreMissing <em>Ignore Missing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpfImportTaskImpl extends SetupTaskImpl implements EpfImportTask
{
  /**
   * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected static final String INPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected String input = INPUT_EDEFAULT;

  /**
   * The default value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected static final boolean IGNORE_MISSING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected boolean ignoreMissing = IGNORE_MISSING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EpfImportTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SetupExtensionsPackage.Literals.EPF_IMPORT_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInput(String newInput)
  {
    String oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsPackage.EPF_IMPORT_TASK__INPUT, oldInput, input));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIgnoreMissing()
  {
    return ignoreMissing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIgnoreMissing(boolean newIgnoreMissing)
  {
    boolean oldIgnoreMissing = ignoreMissing;
    ignoreMissing = newIgnoreMissing;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsPackage.EPF_IMPORT_TASK__IGNORE_MISSING, oldIgnoreMissing, ignoreMissing));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EPF_IMPORT_TASK__INPUT:
      return getInput();
    case SetupExtensionsPackage.EPF_IMPORT_TASK__IGNORE_MISSING:
      return isIgnoreMissing();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EPF_IMPORT_TASK__INPUT:
      setInput((String)newValue);
      return;
    case SetupExtensionsPackage.EPF_IMPORT_TASK__IGNORE_MISSING:
      setIgnoreMissing((Boolean)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EPF_IMPORT_TASK__INPUT:
      setInput(INPUT_EDEFAULT);
      return;
    case SetupExtensionsPackage.EPF_IMPORT_TASK__IGNORE_MISSING:
      setIgnoreMissing(IGNORE_MISSING_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.EPF_IMPORT_TASK__INPUT:
      return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
    case SetupExtensionsPackage.EPF_IMPORT_TASK__IGNORE_MISSING:
      return ignoreMissing != IGNORE_MISSING_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (input: ");
    result.append(input);
    result.append(", ignoreMissing: ");
    result.append(ignoreMissing);
    result.append(')');
    return result.toString();
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  /**
   * Load the EPF file and set preferences
   */
  @Override
  public void perform(final SetupTaskContext context) throws Exception
  {
    final File preferenceFile = new File(getInput());
    if (!preferenceFile.exists())
    {
      if (isIgnoreMissing())
      {
        context.log("Ignoring missing input '" + preferenceFile + "'.");
      }
      else
      {
        context.log(new Status(IStatus.ERROR, "SetupExtensions", "Input '" + preferenceFile + "' not found"));
      }
      return;
    }

    final IStatus[] result = new IStatus[1];
    Display.getDefault().syncExec(new Runnable()
    {
      @Override
      public void run()
      {
        try
        {
          InputStream is = new BufferedInputStream(new FileInputStream(preferenceFile));
          try
          {
            result[0] = Platform.getPreferencesService().importPreferences(is);
          }
          finally
          {
            is.close();
          }
        }
        catch (IOException ex)
        {
          result[0] = new Status(IStatus.ERROR, "SetupExtensions", "Failed to import preferences from '" + preferenceFile + "'", ex);
        }
        catch (CoreException ex)
        {
          result[0] = new Status(IStatus.ERROR, "SetupExtensions", "Failed to import preferences from '" + preferenceFile + "'", ex);
        }
      }
    });

    if (result[0] != null && !result[0].isOK())
    {
      context.log(result[0]);
    }
  }

} // EpfImportTaskImpl
