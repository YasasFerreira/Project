public class LibraryMember {
	
	String memberID ;
	String name ;
	
	public LibraryMember(String memberID,String name){
		this.memberID = memberID ;
		this.name = name;
	}
	
	public String getmemberID(){
		return memberID;
	}
	public String getname(){
		return name;
	}
	
	public void displayMemberDetails(){
		System.out.println("Member ID : " + memberID);
		System.out.println("Name : "+ name);
		System.out.println();
	}
	
	


}