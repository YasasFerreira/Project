public class Main{
	public static void main(String args[]){
		
		Book B1 = new Book("The Catcher in the Rye","B001","J.D.Salinger",240,true);
		Book B2 = new Book("To Kill a Mockingbird","B002","Harper Lee" ,281,true);
		Book B3 = new Book("1984","B003","George Orwell", 328,true);
		Book B4 = new Book("Pride and Prejudice","B004","jane Austen",432,true);
		Book B5 = new Book("The Hobbit","B005","J.R.R.Tolkein",320,true);
	
		Magazine M1 = new Magazine("National Geographic","M001","August 2023","National Geographic Society",true);
		Magazine M2 = new Magazine("Time","M002","September 2023","Time USA, LLC",true);
		Magazine M3 = new Magazine("Forbes","M003","June 2023","Forbes Media",true);
		Magazine M4 = new Magazine("Vogue","M004","July 2023","Conde Nast",true);
		Magazine M5 = new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition",true);
	
		LibraryMember L1 = new LibraryMember("L001","John Doe");
		LibraryMember L2 = new LibraryMember("L002","Jane Smith");
		LibraryMember L3 = new LibraryMember("L003","David Johnson");
		LibraryMember L4 = new LibraryMember("L004","Sarah Williams");
		LibraryMember L5 = new LibraryMember("L005","Michael Brown");
	
		//Display Books Details
		B1.displayItemDetails();
		B2.displayItemDetails();
		B3.displayItemDetails();
		B4.displayItemDetails();
		B5.displayItemDetails();
		
		System.out.println("*************************************************");
		
		//Display Magazines Details
		M1.displayItemDetails();
		M2.displayItemDetails();
		M3.displayItemDetails();
		M4.displayItemDetails();
		M5.displayItemDetails();
		
		System.out.println("*************************************************");
		
		//Display Members Details
		L1.displayMemberDetails();
		L2.displayMemberDetails();
		L3.displayMemberDetails();
		L4.displayMemberDetails();
		L5.displayMemberDetails();
		
		
		
	
	}
	
}