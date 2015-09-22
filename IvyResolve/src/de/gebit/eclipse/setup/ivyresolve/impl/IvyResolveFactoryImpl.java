//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.setup.ivyresolve.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.gebit.eclipse.setup.ivyresolve.IvyResolveFactory;
import de.gebit.eclipse.setup.ivyresolve.IvyResolvePackage;
import de.gebit.eclipse.setup.ivyresolve.IvyResolveTask;
import de.gebit.eclipse.setup.ivyresolve.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IvyResolveFactoryImpl extends EFactoryImpl implements IvyResolveFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IvyResolveFactory init()
  {
    try
    {
      IvyResolveFactory theIvyResolveFactory = (IvyResolveFactory)EPackage.Registry.INSTANCE.getEFactory(IvyResolvePackage.eNS_URI);
      if (theIvyResolveFactory != null)
      {
        return theIvyResolveFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IvyResolveFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IvyResolveFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case IvyResolvePackage.IVY_RESOLVE_TASK:
      return createIvyResolveTask();
    case IvyResolvePackage.PROJECT:
      return createProject();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IvyResolveTask createIvyResolveTask()
  {
    IvyResolveTaskImpl ivyResolveTask = new IvyResolveTaskImpl();
    return ivyResolveTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IvyResolvePackage getIvyResolvePackage()
  {
    return (IvyResolvePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IvyResolvePackage getPackage()
  {
    return IvyResolvePackage.eINSTANCE;
  }

} // IvyResolveFactoryImpl
