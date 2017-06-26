/**
 */
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.Trigger;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;
import org.eclipse.oomph.util.StringUtil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

  /**
   * Execute at installation time
   */
  @Override
  public int getPriority()
  {
    return PRIORITY_CONFIGURATION;
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    if (location == null || StringUtil.isEmpty(location))
    {
      // for the default launcher we can only run on BOOTSTRAP
      return context.getTrigger() == Trigger.BOOTSTRAP;
    }
    else
    {
      // only when already up
      if (context.isSelfHosting())
      {
        return false;
      }

      return true;
    }
  }

  @Override
  public void perform(SetupTaskContext context) throws Exception
  {
    if (location == null || StringUtil.isEmpty(location))
    {
      if (context.getTrigger() == Trigger.BOOTSTRAP)
      {
        location = new File(context.getInstallationLocation(), context.getLauncherName()).getAbsolutePath();
      }
      else
      {
        context.log("location is not set");
        return;
      }
    }
    // replace environment vars in location
    String pattern = "\\%([A-Za-z0-9_]+)\\%";
    Pattern expr = Pattern.compile(pattern);
    StringBuffer effectiveLocation = new StringBuffer();
    Matcher matcher = expr.matcher(location);
    while (matcher.find())
    {
      String envValue = System.getenv(matcher.group(1).toUpperCase());
      if (envValue == null)
      {
        envValue = "";
      }
      else
      {
        envValue = envValue.replace("\\", "\\\\");
      }
      matcher.appendReplacement(effectiveLocation, envValue);
    }
    matcher.appendTail(effectiveLocation);
    if (target == null || StringUtil.isEmpty(target))
    {
      context.log("target is not set");
      return;
    }
    // remove .lnk extension if provided (will be added later)
    if (effectiveLocation.length() > 4 && effectiveLocation.substring(effectiveLocation.length() - 4).equalsIgnoreCase(".lnk"))
    {
      effectiveLocation.delete(effectiveLocation.length() - 4, effectiveLocation.length());
    }
    context.log("Creating shortcut to " + target + " at " + effectiveLocation.toString());
    File shortcutFile = new File(effectiveLocation.toString());
    File parentLocation = shortcutFile.getParentFile();
    if (!parentLocation.exists())
    {
      context.log("Creating folder at " + parentLocation.toString());
      parentLocation.mkdirs();
    }
    // int unique = 2;
    // while (shortcutFile.exists())
    // {
    // // make unique
    // shortcutFile = new File(effectiveLocation.toString() + " (" + unique++ + ")");
    // }
    ShellLink.createLink(target, shortcutFile.getAbsolutePath() + ".lnk");
  }
} // CreateShortcutTaskImpl
