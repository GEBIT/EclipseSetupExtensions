/**
 */
package de.gebit.eclipse.installer.setupextensionsbootstrap.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.Trigger;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.ecore.EClass;

import de.gebit.eclipse.installer.setupextensionsbootstrap.IncludeTask;
import de.gebit.eclipse.installer.setupextensionsbootstrap.SetupExtensionsBootstrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IncludeTaskImpl extends SetupTaskImpl implements IncludeTask
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncludeTaskImpl()
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
    return SetupExtensionsBootstrapPackage.Literals.INCLUDE_TASK;
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    if (context.getTrigger() == Trigger.BOOTSTRAP)
    {
      // for the default launcher we can only run on BOOTSTRAP
      return true;
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
    // nothing
  }

  /**
   * Execute at installation time
   */
  @Override
  public int getPriority()
  {
    return PRIORITY_CONFIGURATION;
  }
} // IncludeTaskImpl
