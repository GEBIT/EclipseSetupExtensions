package de.gebit.eclipse.installer.setupextensionsbootstrap.util;

import org.eclipse.oomph.setup.internal.core.StringFilter;

public class BaseVersionFilter implements StringFilter
{
  /**
   * Remove anything after (including) the first dash
   */
  @Override
  public String filter(String value)
  {
    if (value == null)
    {
      return null;
    }
    int i = value.indexOf('-');
    if (i <= 0)
    {
      return value;
    }
    return value.substring(0, i);
  }
}
