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
public class MxObjectEnum extends mxmodelreflection.proxies.MxObjectMember
{
	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MxModelReflection.MxObjectEnum";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AttributeName("AttributeName"),
		AttributeType("AttributeType"),
		AttributeTypeEnum("AttributeTypeEnum"),
		CompleteName("CompleteName"),
		DescriptiveName("DescriptiveName"),
		FieldLength("FieldLength"),
		IsVirtual("IsVirtual"),
		Values("MxModelReflection.Values"),
		MxObjectMember_MxObjectType("MxModelReflection.MxObjectMember_MxObjectType"),
		MxObjectMember_Type("MxModelReflection.MxObjectMember_Type");

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

	public MxObjectEnum(IContext context)
	{
		this(context, Core.instantiate(context, "MxModelReflection.MxObjectEnum"));
	}

	protected MxObjectEnum(IContext context, IMendixObject mxObjectEnumMendixObject)
	{
		super(context, mxObjectEnumMendixObject);
		if (!Core.isSubClassOf("MxModelReflection.MxObjectEnum", mxObjectEnumMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MxModelReflection.MxObjectEnum");
	}

	/**
	 * @deprecated Use 'MxObjectEnum.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.MxObjectEnum initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return mxmodelreflection.proxies.MxObjectEnum.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.MxObjectEnum initialize(IContext context, IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.MxObjectEnum(context, mendixObject);
	}

	public static mxmodelreflection.proxies.MxObjectEnum load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.MxObjectEnum.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.MxObjectEnum> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectEnum> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectEnum>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MxModelReflection.MxObjectEnum" + xpathConstraint))
			result.add(mxmodelreflection.proxies.MxObjectEnum.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Values
	 */
	public final java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> getValues() throws CoreException
	{
		return getValues(getContext());
	}

	/**
	 * @param context
	 * @return value of Values
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> getValues(IContext context) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectEnumValue>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Values.toString());
		if (valueObject == null)
			return result;
		for (IMendixObject mendixObject : Core.retrieveIdList(context, (java.util.List<IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.MxObjectEnumValue.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Values
	 * @param values
	 */
	public final void setValues(java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> values)
	{
		setValues(getContext(), values);
	}

	/**
	 * Set value of Values
	 * @param context
	 * @param values
	 */
	public final void setValues(IContext context, java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> values)
	{
		java.util.List<IMendixIdentifier> identifiers = new java.util.ArrayList<IMendixIdentifier>();
		for (mxmodelreflection.proxies.MxObjectEnumValue proxyObject : values)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Values.toString(), identifiers);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxmodelreflection.proxies.MxObjectEnum that = (mxmodelreflection.proxies.MxObjectEnum) obj;
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
		return "MxModelReflection.MxObjectEnum";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}