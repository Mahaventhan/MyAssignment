package week2.assignment;

public class LibraryManagement {
	
	public static void main(String[] args) {
		
		Library l = new Library();
		String bookTitle = l.addBook("Money Manage");
		System.out.println("Added Book Name : \"" +bookTitle+"\"");
		l.issueBook();
		
		
		
		
	}

}
