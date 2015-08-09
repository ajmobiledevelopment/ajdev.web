package ajdev.web.vo;

import java.util.Enumeration;
import java.util.HashMap;



public class ResponseObject {

	private final javax.servlet.http.HttpServletRequest request; 
	
	public ResponseObject( javax.servlet.http.HttpServletRequest request ){
		this.request  = request;
	}



	public HashMap<String,String> getRequest() {
		HashMap<String,String> sessionmap = new HashMap<String,String>( );
		
		Enumeration<String> valuesAttrib = this.request.getHeaderNames();
		String key = null;
		
		for( ;valuesAttrib.hasMoreElements(); ){
			key = valuesAttrib.nextElement();
			sessionmap.put(key, this.request.getHeader(key));
		}
		return sessionmap;
	}

	
	
	
}
