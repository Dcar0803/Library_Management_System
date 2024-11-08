/**
 * Represents a Fiction book.
 * Fiction class is derived from the Book class.
 */
public class Fiction extends Book{
	
	 /**
     * Constructor for Fiction book.
     * 
     * @param title  the title of the book
     * @param author the author of the book
     * @param ISBN   the ISBN number of the book
     */
	
	public Fiction(String title, String author, String ISBN) {
		super(title, author, ISBN);
		
	}//end of Fiction method 
	
	/**
     * Returns a description of the book type.
     * 
     * @return a string "Fiction" indicating the type of book
     */
	
	@Override 
	public String describe() {
		return "Fiction";
	}


}//end of Fiction class
