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
public class ValueType
{
	private final IMendixObject valueTypeMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MxModelReflection.ValueType";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		TypeEnum("TypeEnum"),
		ValueType_MxObjectType("MxModelReflection.ValueType_MxObjectType");

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

	public ValueType(IContext context)
	{
		this(context, Core.instantiate(context, "MxModelReflection.ValueType"));
	}

	protected ValueType(IContext context, IMendixObject valueTypeMendixObject)
	{
		if (valueTypeMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MxModelReflection.ValueType", valueTypeMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MxModelReflection.ValueType");

		this.valueTypeMendixObject = valueTypeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ValueType.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.ValueType initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return mxmodelreflection.proxies.ValueType.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.ValueType initialize(IContext context, IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.ValueType(context, mendixObject);
	}

	public static mxmodelreflection.proxies.ValueType load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.ValueType.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.ValueType> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<mxmodelreflection.proxies.ValueType> result = new java.util.ArrayList<mxmodelreflection.proxies.ValueType>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MxModelReflection.ValueType" + xpathConstraint))
			result.add(mxmodelreflection.proxies.ValueType.initialize(context, obj));
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
	 * Set value of TypeEnum
	 * @param typeenum
	 */
	public final mxmodelreflection.proxies.PrimitiveTypes getTypeEnum()
	{
		return getTypeEnum(getContext());
	}

	/**
	 * @param context
	 * @return value of TypeEnum
	 */
	public final mxmodelreflection.proxies.PrimitiveTypes getTypeEnum(IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TypeEnum.toString());
		if (obj == null)
			return null;

		return mxmodelreflection.proxies.PrimitiveTypes.valueOf((String) obj);
	}

	/**
	 * Set value of TypeEnum
	 * @param typeenum
	 */
	public final void setTypeEnum(mxmodelreflection.proxies.PrimitiveTypes typeenum)
	{
		setTypeEnum(getContext(), typeenum);
	}

	/**
	 * Set value of TypeEnum
	 * @param context
	 * @param typeenum
	 */
	public final void setTypeEnum(IContext context, mxmodelreflection.proxies.PrimitiveTypes typeenum)
	{
		if (typeenum != null)
			getMendixObject().setValue(context, MemberNames.TypeEnum.toString(), typeenum.toString());
		else
			getMendixObject().setValue(context, MemberNames.TypeEnum.toString(), null);
	}

	/**
	 * @return value of ValueType_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getValueType_MxObjectType() throws CoreException
	{
		return getValueType_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueType_MxObjectType
	 */
	public final mxmodelreflection.proxies.MxObjectType getValueType_MxObjectType(IContext context) throws CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ValueType_MxObjectType.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ValueType_MxObjectType
	 * @param valuetype_mxobjecttype
	 */
	public final void setValueType_MxObjectType(mxmodelreflection.proxies.MxObjectType valuetype_mxobjecttype)
	{
		setValueType_MxObjectType(getContext(), valuetype_mxobjecttype);
	}

	/**
	 * Set value of ValueType_MxObjectType
	 * @param context
	 * @param valuetype_mxobjecttype
	 */
	public final void setValueType_MxObjectType(IContext context, mxmodelreflection.proxies.MxObjectType valuetype_mxobjecttype)
	{
		if (valuetype_mxobjecttype == null)
			getMendixObject().setValue(context, MemberNames.ValueType_MxObjectType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ValueType_MxObjectType.toString(), valuetype_mxobjecttype.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return valueTypeMendixObject;
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
			final mxmodelreflection.proxies.ValueType that = (mxmodelreflection.proxies.ValueType) obj;
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
		return "MxModelReflection.ValueType";
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
