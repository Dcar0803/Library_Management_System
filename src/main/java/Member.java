/**
 * Represents a library member.
 * Member class is derived from the Person class.
 */
public class Member extends Person {
	
	/**
     * Constructor for Member.
     * 
     * @param name the name of the member
     * @param id   the ID of the member
     */
	
	public Member(String name, String id) {
		super(name, id);
	}
	
	 /**
     * Returns a description of the person type.
     * 
     * @return a string "Member" indicating the type of person
     */
	@Override
	public String describe() {
		return "Member";
	}//end of describe method

}//end of Member class
