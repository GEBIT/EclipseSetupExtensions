//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensionsbootstrap.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage;
import de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unzip Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensionsbootstrap.impl.UnzipTaskImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link de.gebit.eclipse.installer.setupextensionsbootstrap.impl.UnzipTaskImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnzipTaskImpl extends SetupTaskImpl implements UnzipTask
{
  /**
   * The default value of the '{@link #getArchive() <em>Archive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchive()
   * @generated
   * @ordered
   */
  protected static final String ARCHIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArchive() <em>Archive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchive()
   * @generated
   * @ordered
   */
  protected String archive = ARCHIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected String destination = DESTINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnzipTaskImpl()
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
    return SetupExtensionsBootstrapPackage.Literals.UNZIP_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArchive()
  {
    return archive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArchive(String newArchive)
  {
    String oldArchive = archive;
    archive = newArchive;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsBootstrapPackage.UNZIP_TASK__ARCHIVE, oldArchive, archive));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDestination(String newDestination)
  {
    String oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupExtensionsBootstrapPackage.UNZIP_TASK__DESTINATION, oldDestination, destination));
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
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__ARCHIVE:
      return getArchive();
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__DESTINATION:
      return getDestination();
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
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__ARCHIVE:
      setArchive((String)newValue);
      return;
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__DESTINATION:
      setDestination((String)newValue);
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
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__ARCHIVE:
      setArchive(ARCHIVE_EDEFAULT);
      return;
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__DESTINATION:
      setDestination(DESTINATION_EDEFAULT);
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
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__ARCHIVE:
      return ARCHIVE_EDEFAULT == null ? archive != null : !ARCHIVE_EDEFAULT.equals(archive);
    case SetupExtensionsBootstrapPackage.UNZIP_TASK__DESTINATION:
      return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (archive: ");
    result.append(archive);
    result.append(", destination: ");
    result.append(destination);
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
    byte data[] = new byte[4096];

    ZipFile tempZipfile = null;
    try
    {
      tempZipfile = new ZipFile(getArchive());

      File tempDestinationDir = new File(getDestination());
      if (!tempDestinationDir.exists())
      {
        tempDestinationDir.mkdirs();
      }

      Enumeration<? extends ZipEntry> e = tempZipfile.entries();

      while (e.hasMoreElements())
      {
        ZipEntry tempEntry = e.nextElement();
        context.log("Extracting: " + tempEntry);

        InputStream is = new BufferedInputStream(tempZipfile.getInputStream(tempEntry));
        try
        {
          FileOutputStream fos = new FileOutputStream(new File(tempDestinationDir, tempEntry.getName()));

          OutputStream tempOut = new BufferedOutputStream(fos, data.length);
          try
          {
            int count;
            while ((count = is.read(data, 0, data.length)) != -1)
            {
              tempOut.write(data, 0, count);
            }
          }
          finally
          {
            tempOut.flush();
            tempOut.close();
          }
        }
        finally
        {
          is.close();
        }
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      if (tempZipfile != null)
      {
        tempZipfile.close();
      }
    }
  }

} // UnzipTaskImpl
