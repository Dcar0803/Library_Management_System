/**
 * Abstract class representing a person associated with the library.
 * Contains details such as name and ID that will be used by the staff and member classes.
 */
public abstract class Person {
	
	protected String name;
	//ID of member or staff
	protected String id; 
	
	/**
     * Constructor for the Person class.
     * 
     * @param name the name of the person
     * @param id   the ID of the person
     */
	
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}//end of Person constructor
	
	/**
     * Abstract method to describe the person type.
     * 
     * @return a string indicating the type of person (e.g., Member, Staff)
     */
	
	public abstract String describe();
	

}//end of Person class
