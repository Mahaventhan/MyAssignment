package week3.assignment_W3;

public class APIClient_MethodOverLoading {
	
	public void sendRequest(String endpoint) {

		System.out.println("End Point - " +endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {

		System.out.println("End Point - " + endpoint);
		System.out.println("Request Body - " + requestBody);
		 if (requestStatus) {
			System.out.println("Request status - " +requestStatus);
		} else {
			System.out.println("Request status - " +requestStatus);
		}
		
	}

	public static void main(String[] args) {
		
		APIClient_MethodOverLoading client = new APIClient_MethodOverLoading();
		client.sendRequest("postman-echo.com/get");
		client.sendRequest("postman-echo.com/get","{Key , value}", true);
	}

}
