//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

import org.apache.ivyde.eclipse.cp.IvyClasspathContainer;
import org.apache.ivyde.eclipse.cp.IvyClasspathContainerHelper;

import java.util.Collection;
import java.util.List;

import de.gebit.eclipse.installer.setupextensions.IvyResolveTask;
import de.gebit.eclipse.installer.setupextensions.Project;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ivy Resolve Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.gebit.eclipse.installer.setupextensions.impl.IvyResolveTaskImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IvyResolveTaskImpl extends SetupTaskImpl implements IvyResolveTask
{
  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> projects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IvyResolveTaskImpl()
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
    return SetupExtensionsPackage.Literals.IVY_RESOLVE_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Project> getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentEList<Project>(Project.class, this, SetupExtensionsPackage.IVY_RESOLVE_TASK__PROJECTS);
    }
    return projects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.IVY_RESOLVE_TASK__PROJECTS:
      return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case SetupExtensionsPackage.IVY_RESOLVE_TASK__PROJECTS:
      return getProjects();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupExtensionsPackage.IVY_RESOLVE_TASK__PROJECTS:
      getProjects().clear();
      getProjects().addAll((Collection<? extends Project>)newValue);
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
    case SetupExtensionsPackage.IVY_RESOLVE_TASK__PROJECTS:
      getProjects().clear();
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
    case SetupExtensionsPackage.IVY_RESOLVE_TASK__PROJECTS:
      return projects != null && !projects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void perform(SetupTaskContext context) throws Exception
  {
    for (IProject tempProject : ResourcesPlugin.getWorkspace().getRoot().getProjects())
    {
      List<IvyClasspathContainer> tempIvyContainers = IvyClasspathContainerHelper.getContainers(tempProject);
      for (IvyClasspathContainer tempIvyContainer : tempIvyContainers)
      {
        // resolving happens synchronously
        context.log("Resolving in " + tempProject.getName() + ": " + tempIvyContainer.getDescription());
        tempIvyContainer.launchResolve(false, null);
      }
    }
  }

} // IvyResolveTaskImpl
