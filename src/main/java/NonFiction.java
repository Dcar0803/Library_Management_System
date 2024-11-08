/**
 * Represents a Non-Fiction book.
 * NonFiction class is derived from the Book class.
 */
public class NonFiction extends Book {
	
	/**
     * Constructor for Non-Fiction book.
     * 
     * @param title  the title of the book
     * @param author the author of the book
     * @param ISBN   the ISBN number of the book
     */
	
	public NonFiction(String title, String author, String ISBN) {
		
		super(title, author, ISBN);
		
	}//end of NonFiction constructor
	
	/**
     * Returns a description of the book type.
     * 
     * @return a string "Non-Fiction" indicating the type of book
     */
	
	@Override
	public String describe() {
		
		return "NonFiction";
	}//end of describe method 

}//end of NonFiction class
