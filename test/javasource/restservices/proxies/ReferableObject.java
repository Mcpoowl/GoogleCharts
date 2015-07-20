// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class ReferableObject extends restservices.proxies.AnyObject
{
	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "RestServices.ReferableObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		URL("URL"),
		ETag("ETag");

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

	public ReferableObject(IContext context)
	{
		this(context, Core.instantiate(context, "RestServices.ReferableObject"));
	}

	protected ReferableObject(IContext context, IMendixObject referableObjectMendixObject)
	{
		super(context, referableObjectMendixObject);
		if (!Core.isSubClassOf("RestServices.ReferableObject", referableObjectMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a RestServices.ReferableObject");
	}

	/**
	 * @deprecated Use 'ReferableObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.ReferableObject initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return restservices.proxies.ReferableObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static restservices.proxies.ReferableObject initialize(IContext context, IMendixObject mendixObject)
	{
		return new restservices.proxies.ReferableObject(context, mendixObject);
	}

	public static restservices.proxies.ReferableObject load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.ReferableObject.initialize(context, mendixObject);
	}

	/**
	 * @return value of URL
	 */
	public final String getURL()
	{
		return getURL(getContext());
	}

	/**
	 * @param context
	 * @return value of URL
	 */
	public final String getURL(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.URL.toString());
	}

	/**
	 * Set value of URL
	 * @param url
	 */
	public final void setURL(String url)
	{
		setURL(getContext(), url);
	}

	/**
	 * Set value of URL
	 * @param context
	 * @param url
	 */
	public final void setURL(IContext context, String url)
	{
		getMendixObject().setValue(context, MemberNames.URL.toString(), url);
	}

	/**
	 * @return value of ETag
	 */
	public final String getETag()
	{
		return getETag(getContext());
	}

	/**
	 * @param context
	 * @return value of ETag
	 */
	public final String getETag(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ETag.toString());
	}

	/**
	 * Set value of ETag
	 * @param etag
	 */
	public final void setETag(String etag)
	{
		setETag(getContext(), etag);
	}

	/**
	 * Set value of ETag
	 * @param context
	 * @param etag
	 */
	public final void setETag(IContext context, String etag)
	{
		getMendixObject().setValue(context, MemberNames.ETag.toString(), etag);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final restservices.proxies.ReferableObject that = (restservices.proxies.ReferableObject) obj;
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
		return "RestServices.ReferableObject";
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
