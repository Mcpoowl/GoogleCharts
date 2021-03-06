// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlecharts.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class ChartDataSource
{
	private final IMendixObject chartDataSourceMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "GoogleCharts.ChartDataSource";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		cols("GoogleCharts.cols"),
		rows("GoogleCharts.rows");

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

	public ChartDataSource(IContext context)
	{
		this(context, Core.instantiate(context, "GoogleCharts.ChartDataSource"));
	}

	protected ChartDataSource(IContext context, IMendixObject chartDataSourceMendixObject)
	{
		if (chartDataSourceMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("GoogleCharts.ChartDataSource", chartDataSourceMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a GoogleCharts.ChartDataSource");

		this.chartDataSourceMendixObject = chartDataSourceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ChartDataSource.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static googlecharts.proxies.ChartDataSource initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return googlecharts.proxies.ChartDataSource.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static googlecharts.proxies.ChartDataSource initialize(IContext context, IMendixObject mendixObject)
	{
		return new googlecharts.proxies.ChartDataSource(context, mendixObject);
	}

	public static googlecharts.proxies.ChartDataSource load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return googlecharts.proxies.ChartDataSource.initialize(context, mendixObject);
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
	 * @return value of cols
	 */
	public final java.util.List<googlecharts.proxies.Column> getcols() throws CoreException
	{
		return getcols(getContext());
	}

	/**
	 * @param context
	 * @return value of cols
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<googlecharts.proxies.Column> getcols(IContext context) throws CoreException
	{
		java.util.List<googlecharts.proxies.Column> result = new java.util.ArrayList<googlecharts.proxies.Column>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.cols.toString());
		if (valueObject == null)
			return result;
		for (IMendixObject mendixObject : Core.retrieveIdList(context, (java.util.List<IMendixIdentifier>) valueObject))
			result.add(googlecharts.proxies.Column.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of cols
	 * @param cols
	 */
	public final void setcols(java.util.List<googlecharts.proxies.Column> cols)
	{
		setcols(getContext(), cols);
	}

	/**
	 * Set value of cols
	 * @param context
	 * @param cols
	 */
	public final void setcols(IContext context, java.util.List<googlecharts.proxies.Column> cols)
	{
		java.util.List<IMendixIdentifier> identifiers = new java.util.ArrayList<IMendixIdentifier>();
		for (googlecharts.proxies.Column proxyObject : cols)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.cols.toString(), identifiers);
	}

	/**
	 * @return value of rows
	 */
	public final java.util.List<googlecharts.proxies.Row> getrows() throws CoreException
	{
		return getrows(getContext());
	}

	/**
	 * @param context
	 * @return value of rows
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<googlecharts.proxies.Row> getrows(IContext context) throws CoreException
	{
		java.util.List<googlecharts.proxies.Row> result = new java.util.ArrayList<googlecharts.proxies.Row>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.rows.toString());
		if (valueObject == null)
			return result;
		for (IMendixObject mendixObject : Core.retrieveIdList(context, (java.util.List<IMendixIdentifier>) valueObject))
			result.add(googlecharts.proxies.Row.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of rows
	 * @param rows
	 */
	public final void setrows(java.util.List<googlecharts.proxies.Row> rows)
	{
		setrows(getContext(), rows);
	}

	/**
	 * Set value of rows
	 * @param context
	 * @param rows
	 */
	public final void setrows(IContext context, java.util.List<googlecharts.proxies.Row> rows)
	{
		java.util.List<IMendixIdentifier> identifiers = new java.util.ArrayList<IMendixIdentifier>();
		for (googlecharts.proxies.Row proxyObject : rows)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.rows.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return chartDataSourceMendixObject;
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
			final googlecharts.proxies.ChartDataSource that = (googlecharts.proxies.ChartDataSource) obj;
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
		return "GoogleCharts.ChartDataSource";
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
