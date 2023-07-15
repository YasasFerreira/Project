abstract class LibraryItem{
	String title;
	String itemID;
	boolean check = true ;
	
	public LibraryItem(String title,String itemID,boolean check){
		this.title = title;
		this.itemID = itemID;
		this.check = check ;
		
	}
	
	public void checkIn(){
		check = true ;
	}
	
	public String getCheck (){
		String Availability;
		if (check == true ){
			Availability = "Available";
			return Availability;
		}
		else {
			Availability = "Not Available";
			return Availability;
		}
	}
	public void displayItemDetails(){
		
	}

}