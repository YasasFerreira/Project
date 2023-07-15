public class Book extends LibraryItem{
	String author;
	int numPages;
	
	
	public Book(String title,String itemID,String author,int numPages,boolean check){
		
		super(title,itemID,check);
		this.author = author;
		this.numPages = numPages;
		//checkout();
		//checkin();
		getCheck();
		
	}
	
	public void displayItemDetails(){
		System.out.println("Item ID :" + itemID);
		System.out.println("Title : "+ title);
		System.out.println("Author : "+ author);
		System.out.println("No. of Pages : "+ numPages);
		System.out.println("Availability : "+ getCheck());
		System.out.println();
		
	}
	
	
}