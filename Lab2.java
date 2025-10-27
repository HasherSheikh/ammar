class Person {
	
	private String firstname;
	private String lastname;
	
	public Person (){
		
	}
	public String get_firstname(){
		return firstname;
	}
public void set_firstname(String firstname){
	this.firstname = firstname;
}
public String get_lastname(){
	return lastname;
}
public void set_lastname(String lastname){
	this.lastname= lastname;
}
public static void main(String args[]){
	
}
			
}
class Lab2{
	public static void main (String args[]){
		String string;
		Person person_f=new Person();
		person_f.set_firstname( "Rumaisa");
		string=person_f.get_firstname();
		System.out.println(string);
		
		Person person=new Person();
		person.set_lastname("Mallick");
		string=person.get_lastname();
		System.out.println(string);
	}
}


