// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class MxObjectEnumValue
{
	private final IMendixObject mxObjectEnumValueMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MxModelReflection.MxObjectEnumValue";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Captions("MxModelReflection.Captions");

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

	public MxObjectEnumValue(IContext context)
	{
		this(context, Core.instantiate(context, "MxModelReflection.MxObjectEnumValue"));
	}

	protected MxObjectEnumValue(IContext context, IMendixObject mxObjectEnumValueMendixObject)
	{
		if (mxObjectEnumValueMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MxModelReflection.MxObjectEnumValue", mxObjectEnumValueMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MxModelReflection.MxObjectEnumValue");

		this.mxObjectEnumValueMendixObject = mxObjectEnumValueMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxObjectEnumValue.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.MxObjectEnumValue initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return mxmodelreflection.proxies.MxObjectEnumValue.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.MxObjectEnumValue initialize(IContext context, IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.MxObjectEnumValue(context, mendixObject);
	}

	public static mxmodelreflection.proxies.MxObjectEnumValue load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.MxObjectEnumValue.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectEnumValue>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MxModelReflection.MxObjectEnumValue" + xpathConstraint))
			result.add(mxmodelreflection.proxies.MxObjectEnumValue.initialize(context, obj));
		return result;
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
	 * @return value of Captions
	 */
	public final java.util.List<mxmodelreflection.proxies.MxObjectEnumCaptions> getCaptions() throws CoreException
	{
		return getCaptions(getContext());
	}

	/**
	 * @param context
	 * @return value of Captions
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.MxObjectEnumCaptions> getCaptions(IContext context) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectEnumCaptions> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectEnumCaptions>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Captions.toString());
		if (valueObject == null)
			return result;
		for (IMendixObject mendixObject : Core.retrieveIdList(context, (java.util.List<IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.MxObjectEnumCaptions.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Captions
	 * @param captions
	 */
	public final void setCaptions(java.util.List<mxmodelreflection.proxies.MxObjectEnumCaptions> captions)
	{
		setCaptions(getContext(), captions);
	}

	/**
	 * Set value of Captions
	 * @param context
	 * @param captions
	 */
	public final void setCaptions(IContext context, java.util.List<mxmodelreflection.proxies.MxObjectEnumCaptions> captions)
	{
		java.util.List<IMendixIdentifier> identifiers = new java.util.ArrayList<IMendixIdentifier>();
		for (mxmodelreflection.proxies.MxObjectEnumCaptions proxyObject : captions)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Captions.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return mxObjectEnumValueMendixObject;
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
			final mxmodelreflection.proxies.MxObjectEnumValue that = (mxmodelreflection.proxies.MxObjectEnumValue) obj;
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
		return "MxModelReflection.MxObjectEnumValue";
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
