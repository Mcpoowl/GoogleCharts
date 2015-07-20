// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Color
{
	private final IMendixObject colorMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "TestSuite.Color";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		RAL("RAL"),
		IsPrimary("IsPrimary"),
		ColorCode("ColorCode");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Color(IContext context)
	{
		this(context, Core.instantiate(context, "TestSuite.Color"));
	}

	protected Color(IContext context, IMendixObject colorMendixObject)
	{
		if (colorMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("TestSuite.Color", colorMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a TestSuite.Color");

		this.colorMendixObject = colorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Color.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testsuite.proxies.Color initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return testsuite.proxies.Color.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testsuite.proxies.Color initialize(IContext context, IMendixObject mendixObject)
	{
		return new testsuite.proxies.Color(context, mendixObject);
	}

	public static testsuite.proxies.Color load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return testsuite.proxies.Color.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of RAL
	 */
	public final Integer getRAL()
	{
		return getRAL(getContext());
	}

	/**
	 * @param context
	 * @return value of RAL
	 */
	public final Integer getRAL(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.RAL.toString());
	}

	/**
	 * Set value of RAL
	 * @param ral
	 */
	public final void setRAL(Integer ral)
	{
		setRAL(getContext(), ral);
	}

	/**
	 * Set value of RAL
	 * @param context
	 * @param ral
	 */
	public final void setRAL(IContext context, Integer ral)
	{
		getMendixObject().setValue(context, MemberNames.RAL.toString(), ral);
	}

	/**
	 * @return value of IsPrimary
	 */
	public final Boolean getIsPrimary()
	{
		return getIsPrimary(getContext());
	}

	/**
	 * @param context
	 * @return value of IsPrimary
	 */
	public final Boolean getIsPrimary(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.IsPrimary.toString());
	}

	/**
	 * Set value of IsPrimary
	 * @param isprimary
	 */
	public final void setIsPrimary(Boolean isprimary)
	{
		setIsPrimary(getContext(), isprimary);
	}

	/**
	 * Set value of IsPrimary
	 * @param context
	 * @param isprimary
	 */
	public final void setIsPrimary(IContext context, Boolean isprimary)
	{
		getMendixObject().setValue(context, MemberNames.IsPrimary.toString(), isprimary);
	}

	/**
	 * @return value of ColorCode
	 */
	public final String getColorCode()
	{
		return getColorCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ColorCode
	 */
	public final String getColorCode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ColorCode.toString());
	}

	/**
	 * Set value of ColorCode
	 * @param colorcode
	 */
	public final void setColorCode(String colorcode)
	{
		setColorCode(getContext(), colorcode);
	}

	/**
	 * Set value of ColorCode
	 * @param context
	 * @param colorcode
	 */
	public final void setColorCode(IContext context, String colorcode)
	{
		getMendixObject().setValue(context, MemberNames.ColorCode.toString(), colorcode);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return colorMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testsuite.proxies.Color that = (testsuite.proxies.Color) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "TestSuite.Color";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
