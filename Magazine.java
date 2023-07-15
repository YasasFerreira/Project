public class Magazine extends LibraryItem{

	String issueDate;
	String publisher;
	
	
	public Magazine(String title,String itemID,String issueDate,String publisher,boolean check ){
		super(title,itemID,check);
		this.issueDate = issueDate;
		this.publisher = publisher;
		
	}
	
	public void displayItemDetails(){
		System.out.println("Title : "+ title);
		System.out.println("Item ID : "+ itemID);
		System.out.println("Issue Date :"  + issueDate);
		System.out.println("Publisher : "+ publisher);
		System.out.println("Availability : "+getCheck());
		System.out.println();
	}
	
	
}