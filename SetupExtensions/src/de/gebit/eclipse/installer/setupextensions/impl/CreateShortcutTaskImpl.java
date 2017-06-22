/**
 */
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;
import org.eclipse.oomph.util.StringUtil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.gebit.eclipse.installer.setupextensions.CreateShortcutTask;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;
import mslinks.ShellLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Shortcut Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.CreateShortcutTaskImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.CreateShortcutTaskImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateShortcutTaskImpl extends SetupTaskImpl implements CreateShortcutTask
{
  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateShortcutTaskImpl()
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
    return SetupExtensionsPackage.Literals.CREATE_SHORTCUT_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsPackage.CREATE_SHORTCUT_TASK__TARGET, oldTarget, target));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsPackage.CREATE_SHORTCUT_TASK__LOCATION, oldLocation, location));
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
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__TARGET:
      return getTarget();
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__LOCATION:
      return getLocation();
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
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__TARGET:
      setTarget((String)newValue);
      return;
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__LOCATION:
      setLocation((String)newValue);
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
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__TARGET:
      setTarget(TARGET_EDEFAULT);
      return;
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__LOCATION:
      setLocation(LOCATION_EDEFAULT);
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
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__TARGET:
      return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
    case SetupExtensionsPackage.CREATE_SHORTCUT_TASK__LOCATION:
      return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
    result.append(" (target: ");
    result.append(target);
    result.append(", location: ");
    result.append(location);
    result.append(')');
    return result.toString();
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  @Override
  public void perform(SetupTaskContext context) throws Exception
  {
    if (location == null || StringUtil.isEmpty(location))
    {
      context.log("location is not set");
      return;
    }
    if (target == null || StringUtil.isEmpty(target))
    {
      context.log("target is not set");
      return;
    }
    ShellLink.createLink(target, location);
  }
} // CreateShortcutTaskImpl