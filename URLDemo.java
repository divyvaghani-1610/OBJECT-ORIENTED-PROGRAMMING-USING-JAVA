//URLDemo.java  
import java.net.*;  
public class URLDemo{  
public static void main(String[] args) throws Exception{  
	
	URL url=new URL("http://www.ddu.ac.in/Technology-Departments5.php");  
  
	System.out.println("Protocol: "+url.getProtocol());  
	System.out.println("Host Name: "+url.getHost());  
	System.out.println("Port Number: "+url.getPort());  
	System.out.println("File Name: "+url.getFile());  


	
}  
}//URLDemo.java  
import java.net.*;  
public class URLDemo{  
public static void main(String[] args) throws Exception{  
/*	
	URL url=new URL("http://www.ddu.ac.in/Technology-Departments5.php");  
  
	System.out.println("Protocol: "+url.getProtocol());  
	System.out.println("Host Name: "+url.getHost());  
	System.out.println("Port Number: "+url.getPort());  
	System.out.println("File Name: "+url.getFile());  
*/
URL url=new URL("https://www.google.com/search?gs_ssp=eJzj4tLP1TcwMTQ2NLA0YPTiSkkpVchLTMlMTAEASBcGhQ&q=ddu+nadiad&oq=ddu&aqs=chrome.2.0i131i355i433i512j46i131i433i512j46i433i512j0i433i650j0i131i433i512j0i433i650j0i512l3j46i175i199i512.8805j0j15&sourceid=chrome&ie=UTF-8");    
    
System.out.println("Protocol: "+url.getProtocol());    
System.out.println("Host Name: "+url.getHost());    
System.out.println("Port Number: "+url.getPort());    
System.out.println("Default Port Number: "+url.getDefaultPort());    
System.out.println("Query String: "+url.getQuery());    
System.out.println("Path: "+url.getPath());    
System.out.println("File: "+url.getFile());    
  
	
}  
}