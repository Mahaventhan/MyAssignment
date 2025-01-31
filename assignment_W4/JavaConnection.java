package week4.assignment_W4;



public class JavaConnection extends MySqlConnection implements DatabseConnection  {

	@Override
	public void connect() {
		
		System.out.println("Connected the SQL Server");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Disconnected the SQL Server");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Executed the Update Query");
		
	}
	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}

}
