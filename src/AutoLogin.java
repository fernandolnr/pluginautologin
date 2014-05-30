package org.laneveraroja.autologin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class Autologin extends CordovaPlugin {

	    
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		try {
		    if (action.equals("phonegapAutologin")) {
		       String timer = args.getString(0);
		       
		       this.phonegapAutologin(timer);
		 
		       callbackContext.success();
		       return true;
		    }
		    callbackContext.error("No such action defined");
		    return false;
		} catch(Exception e) {
		    callbackContext.error(e.getMessage());
		    return false;
		}

	}
	
    //--------------------------------------------------------------------------
    // LOCAL METHODS
    //--------------------------------------------------------------------------

	private String timer;
	
	public void phonegapAutologin(String timer)
	{
		setTimerAutologin(timer);
		Log.d("Autologin", "Hora=" + timer); 				
	} 
	
	public void setTimerAutologin(String timer)
	{
		this.timer = timer;
	}
	
	public String getTimerAutologin()
	{
		return this.timer;
	}
}
