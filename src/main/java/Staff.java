/**
 * Represents a library staff member.
 * Staff class is derived from the Person class.
 */
public class Staff extends Person {
	
	/**
     * Constructor for Staff.
     * 
     * @param name the name of the staff member
     * @param id   the ID of the staff member
     */
	
	public Staff(String name, String id) {
		
		super(name, id);
		
	}//end of Staff constructor
	
	 /**
     * Returns a description of the person type.
     * 
     * @return a string "Staff" indicating the type of person
     */
	
	@Override 
	public String describe() {
		return "Staff";
		
	}//end of describe method
	
	 /**
     * Registers a new member in the library.
     * 
     * @param library the library to which the member will be added
     * @param member  the member to be registered
     */
	
	public void register_member(Library library, Member member) {
		library.register_member(member);
	}//end of register_member method
	
	/**
     * Registers a new book in the library.
     * 
     * @param library the library to which the book will be added
     * @param book    the book to be registered
     */
	public void register_book(Library library, Book book) {
		library.add_book(book);
	}//end of register_book method 

}//end of Staff class 
