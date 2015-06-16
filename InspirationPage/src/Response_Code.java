

import org.apache.http.client.fluent.Request;


public class Response_Code {

	//http://www.ninthavenue.com.au/how-to-get-the-http-status-code-in-selenium-webdriver
	public static void main(String[] args) {
			System.out.println(checkResponse("https://www.mrandmrssmith.com/collections"));
			System.out.println(checkResponse("https://smithhotels.com"));
		

	}
	public static boolean checkResponse(String url){
		try {
            int resp_code= Request.Get(url).execute().returnResponse().getStatusLine()
                    .getStatusCode();
            System.out.println("Respose code for URL "+ url +" is -> "+ resp_code);
           if(resp_code == 200)
        	   return true;
           else
        	   return false;
        } catch (Exception e) {
     	   return false;
        }
	}

}
