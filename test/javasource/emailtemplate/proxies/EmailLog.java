// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailtemplate.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class EmailLog
{
	private final IMendixObject emailLogMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "EmailTemplate.EmailLog";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Created("Created"),
		Logtype("Logtype"),
		Message("Message"),
		ErrorMessage("ErrorMessage"),
		TriggeredInMF("TriggeredInMF"),
		StackTrace("StackTrace");

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

	public EmailLog(IContext context)
	{
		this(context, Core.instantiate(context, "EmailTemplate.EmailLog"));
	}

	protected EmailLog(IContext context, IMendixObject emailLogMendixObject)
	{
		if (emailLogMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("EmailTemplate.EmailLog", emailLogMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a EmailTemplate.EmailLog");

		this.emailLogMendixObject = emailLogMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'EmailLog.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static emailtemplate.proxies.EmailLog initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return emailtemplate.proxies.EmailLog.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static emailtemplate.proxies.EmailLog initialize(IContext context, IMendixObject mendixObject)
	{
		return new emailtemplate.proxies.EmailLog(context, mendixObject);
	}

	public static emailtemplate.proxies.EmailLog load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return emailtemplate.proxies.EmailLog.initialize(context, mendixObject);
	}

	public static java.util.List<emailtemplate.proxies.EmailLog> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<emailtemplate.proxies.EmailLog> result = new java.util.ArrayList<emailtemplate.proxies.EmailLog>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//EmailTemplate.EmailLog" + xpathConstraint))
			result.add(emailtemplate.proxies.EmailLog.initialize(context, obj));
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
	 * @return value of Created
	 */
	public final java.util.Date getCreated()
	{
		return getCreated(getContext());
	}

	/**
	 * @param context
	 * @return value of Created
	 */
	public final java.util.Date getCreated(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Created.toString());
	}

	/**
	 * Set value of Created
	 * @param created
	 */
	public final void setCreated(java.util.Date created)
	{
		setCreated(getContext(), created);
	}

	/**
	 * Set value of Created
	 * @param context
	 * @param created
	 */
	public final void setCreated(IContext context, java.util.Date created)
	{
		getMendixObject().setValue(context, MemberNames.Created.toString(), created);
	}

	/**
	 * Set value of Logtype
	 * @param logtype
	 */
	public final emailtemplate.proxies.LogType getLogtype()
	{
		return getLogtype(getContext());
	}

	/**
	 * @param context
	 * @return value of Logtype
	 */
	public final emailtemplate.proxies.LogType getLogtype(IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Logtype.toString());
		if (obj == null)
			return null;

		return emailtemplate.proxies.LogType.valueOf((String) obj);
	}

	/**
	 * Set value of Logtype
	 * @param logtype
	 */
	public final void setLogtype(emailtemplate.proxies.LogType logtype)
	{
		setLogtype(getContext(), logtype);
	}

	/**
	 * Set value of Logtype
	 * @param context
	 * @param logtype
	 */
	public final void setLogtype(IContext context, emailtemplate.proxies.LogType logtype)
	{
		if (logtype != null)
			getMendixObject().setValue(context, MemberNames.Logtype.toString(), logtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.Logtype.toString(), null);
	}

	/**
	 * @return value of Message
	 */
	public final String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final String getMessage(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(IContext context, String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of ErrorMessage
	 */
	public final String getErrorMessage()
	{
		return getErrorMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of ErrorMessage
	 */
	public final String getErrorMessage(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ErrorMessage.toString());
	}

	/**
	 * Set value of ErrorMessage
	 * @param errormessage
	 */
	public final void setErrorMessage(String errormessage)
	{
		setErrorMessage(getContext(), errormessage);
	}

	/**
	 * Set value of ErrorMessage
	 * @param context
	 * @param errormessage
	 */
	public final void setErrorMessage(IContext context, String errormessage)
	{
		getMendixObject().setValue(context, MemberNames.ErrorMessage.toString(), errormessage);
	}

	/**
	 * @return value of TriggeredInMF
	 */
	public final String getTriggeredInMF()
	{
		return getTriggeredInMF(getContext());
	}

	/**
	 * @param context
	 * @return value of TriggeredInMF
	 */
	public final String getTriggeredInMF(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.TriggeredInMF.toString());
	}

	/**
	 * Set value of TriggeredInMF
	 * @param triggeredinmf
	 */
	public final void setTriggeredInMF(String triggeredinmf)
	{
		setTriggeredInMF(getContext(), triggeredinmf);
	}

	/**
	 * Set value of TriggeredInMF
	 * @param context
	 * @param triggeredinmf
	 */
	public final void setTriggeredInMF(IContext context, String triggeredinmf)
	{
		getMendixObject().setValue(context, MemberNames.TriggeredInMF.toString(), triggeredinmf);
	}

	/**
	 * @return value of StackTrace
	 */
	public final String getStackTrace()
	{
		return getStackTrace(getContext());
	}

	/**
	 * @param context
	 * @return value of StackTrace
	 */
	public final String getStackTrace(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.StackTrace.toString());
	}

	/**
	 * Set value of StackTrace
	 * @param stacktrace
	 */
	public final void setStackTrace(String stacktrace)
	{
		setStackTrace(getContext(), stacktrace);
	}

	/**
	 * Set value of StackTrace
	 * @param context
	 * @param stacktrace
	 */
	public final void setStackTrace(IContext context, String stacktrace)
	{
		getMendixObject().setValue(context, MemberNames.StackTrace.toString(), stacktrace);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return emailLogMendixObject;
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
			final emailtemplate.proxies.EmailLog that = (emailtemplate.proxies.EmailLog) obj;
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
		return "EmailTemplate.EmailLog";
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
