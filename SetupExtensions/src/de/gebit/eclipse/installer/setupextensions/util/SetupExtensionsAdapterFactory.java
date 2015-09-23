//
// Copyright (C) 2015
// GEBIT Solutions GmbH,
// Berlin, Duesseldorf, Stuttgart (Germany)
// All rights reserved.
//
//
package de.gebit.eclipse.installer.setupextensions.util;

import org.eclipse.oomph.base.ModelElement;
import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.gebit.eclipse.installer.setupextensions.CommandParameter;
import de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask;
import de.gebit.eclipse.installer.setupextensions.FullBuildTask;
import de.gebit.eclipse.installer.setupextensions.IvyResolveTask;
import de.gebit.eclipse.installer.setupextensions.Project;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;
import de.gebit.eclipse.installer.setupextensions.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage
 * @generated
 */
public class SetupExtensionsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SetupExtensionsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupExtensionsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SetupExtensionsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetupExtensionsSwitch<Adapter> modelSwitch = new SetupExtensionsSwitch<Adapter>()
  {
    @Override
    public Adapter caseFullBuildTask(FullBuildTask object)
    {
      return createFullBuildTaskAdapter();
    }

    @Override
    public Adapter caseExecuteCommandTask(ExecuteCommandTask object)
    {
      return createExecuteCommandTaskAdapter();
    }

    @Override
    public Adapter caseCommandParameter(CommandParameter object)
    {
      return createCommandParameterAdapter();
    }

    @Override
    public Adapter caseIvyResolveTask(IvyResolveTask object)
    {
      return createIvyResolveTaskAdapter();
    }

    @Override
    public Adapter caseProject(Project object)
    {
      return createProjectAdapter();
    }

    @Override
    public Adapter caseUnzipTask(UnzipTask object)
    {
      return createUnzipTaskAdapter();
    }

    @Override
    public Adapter caseModelElement(ModelElement object)
    {
      return createModelElementAdapter();
    }

    @Override
    public Adapter caseSetupTask(SetupTask object)
    {
      return createSetupTaskAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object)
    {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensions.FullBuildTask <em>Full Build Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensions.FullBuildTask
   * @generated
   */
  public Adapter createFullBuildTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask <em>Execute Command Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensions.ExecuteCommandTask
   * @generated
   */
  public Adapter createExecuteCommandTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensions.CommandParameter <em>Command Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensions.CommandParameter
   * @generated
   */
  public Adapter createCommandParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensions.IvyResolveTask <em>Ivy Resolve Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensions.IvyResolveTask
   * @generated
   */
  public Adapter createIvyResolveTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensions.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensions.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensions.UnzipTask <em>Unzip Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensions.UnzipTask
   * @generated
   */
  public Adapter createUnzipTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.oomph.base.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.oomph.base.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.oomph.setup.SetupTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.oomph.setup.SetupTask
   * @generated
   */
  public Adapter createSetupTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} // SetupExtensionsAdapterFactory
