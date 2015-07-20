// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailtemplate.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class ReplaceCustomToken extends CustomJavaAction<Boolean>
{
	private String Tokenobject;
	private String ReplaceValue;
	private IMendixObject __Emailobject;
	private emailtemplate.proxies.Email Emailobject;

	public ReplaceCustomToken(IContext context, String Tokenobject, String ReplaceValue, IMendixObject Emailobject)
	{
		super(context);
		this.Tokenobject = Tokenobject;
		this.ReplaceValue = ReplaceValue;
		this.__Emailobject = Emailobject;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.Emailobject = __Emailobject == null ? null : emailtemplate.proxies.Email.initialize(getContext(), __Emailobject);

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "ReplaceCustomToken";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
