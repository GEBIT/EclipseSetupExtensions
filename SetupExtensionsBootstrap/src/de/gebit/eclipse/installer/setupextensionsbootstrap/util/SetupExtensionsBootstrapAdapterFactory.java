/**
 */
package de.gebit.eclipse.installer.setupextensionsbootstrap.util;

import org.eclipse.oomph.base.ModelElement;
import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask;
import de.gebit.eclipse.installer.setupextensionsbootstrap.IncludeTask;
import de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage;
import de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage
 * @generated
 */
public class SetupExtensionsBootstrapAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SetupExtensionsBootstrapPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupExtensionsBootstrapAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SetupExtensionsBootstrapPackage.eINSTANCE;
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
  protected SetupExtensionsBootstrapSwitch<Adapter> modelSwitch = new SetupExtensionsBootstrapSwitch<Adapter>()
  {
    @Override
    public Adapter caseUnzipTask(UnzipTask object)
    {
      return createUnzipTaskAdapter();
    }

    @Override
    public Adapter caseCreateShortcutTask(CreateShortcutTask object)
    {
      return createCreateShortcutTaskAdapter();
    }

    @Override
    public Adapter caseIncludeTask(IncludeTask object)
    {
      return createIncludeTaskAdapter();
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
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask <em>Unzip Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask
   * @generated
   */
  public Adapter createUnzipTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask <em>Create Shortcut Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask
   * @generated
   */
  public Adapter createCreateShortcutTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.gebit.eclipse.installer.setupextensionsbootstrap.IncludeTask <em>Include Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.gebit.eclipse.installer.setupextensionsbootstrap.IncludeTask
   * @generated
   */
  public Adapter createIncludeTaskAdapter()
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

} // SetupExtensionsBootstrapAdapterFactory
