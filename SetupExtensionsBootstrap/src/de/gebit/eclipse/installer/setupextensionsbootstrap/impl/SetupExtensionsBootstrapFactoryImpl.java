/**
 */
package de.gebit.eclipse.installer.setupextensionsbootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.gebit.eclipse.installer.setupextensionsbootstrap.CreateShortcutTask;
import de.gebit.eclipse.installer.setupextensionsbootstrap.IncludeTask;
import de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapFactory;
import de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage;
import de.gebit.eclipse.installer.setupextensionsbootstrap.UnzipTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetupExtensionsBootstrapFactoryImpl extends EFactoryImpl implements SetupExtensionsBootstrapFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SetupExtensionsBootstrapFactory init()
  {
    try
    {
      SetupExtensionsBootstrapFactory theSetupExtensionsBootstrapFactory = (SetupExtensionsBootstrapFactory)EPackage.Registry.INSTANCE
          .getEFactory(SetupExtensionsBootstrapPackage.eNS_URI);
      if (theSetupExtensionsBootstrapFactory != null)
      {
        return theSetupExtensionsBootstrapFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SetupExtensionsBootstrapFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupExtensionsBootstrapFactoryImpl()
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
    case SetupExtensionsBootstrapPackage.UNZIP_TASK:
      return createUnzipTask();
    case SetupExtensionsBootstrapPackage.CREATE_SHORTCUT_TASK:
      return createCreateShortcutTask();
    case SetupExtensionsBootstrapPackage.INCLUDE_TASK:
      return createIncludeTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnzipTask createUnzipTask()
  {
    UnzipTaskImpl unzipTask = new UnzipTaskImpl();
    return unzipTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateShortcutTask createCreateShortcutTask()
  {
    CreateShortcutTaskImpl createShortcutTask = new CreateShortcutTaskImpl();
    return createShortcutTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IncludeTask createIncludeTask()
  {
    IncludeTaskImpl includeTask = new IncludeTaskImpl();
    return includeTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetupExtensionsBootstrapPackage getSetupExtensionsBootstrapPackage()
  {
    return (SetupExtensionsBootstrapPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SetupExtensionsBootstrapPackage getPackage()
  {
    return SetupExtensionsBootstrapPackage.eINSTANCE;
  }

} // SetupExtensionsBootstrapFactoryImpl
