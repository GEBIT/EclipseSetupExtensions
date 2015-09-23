/**
 */
package de.gebit.eclipse.installer.setupextensions.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;

import de.gebit.eclipse.installer.setupextensions.FullBuildTask;
import de.gebit.eclipse.installer.setupextensions.SetupExtensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full Build Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FullBuildTaskImpl extends SetupTaskImpl implements FullBuildTask
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FullBuildTaskImpl()
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
    return SetupExtensionsPackage.Literals.FULL_BUILD_TASK;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    IWorkspace tempWorkspace = ResourcesPlugin.getWorkspace();
    tempWorkspace.build(IncrementalProjectBuilder.FULL_BUILD, context.getProgressMonitor(true));
  }

} // FullBuildTaskImpl
