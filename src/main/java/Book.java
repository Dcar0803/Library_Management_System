/**
 * Abstract class representing a Book in the library.
 * Contains the book details such as title, author, ISBN, and checkout status.
 */
public abstract class Book {
	
	//Four required Book class fields
	String title;
	String author;
	String ISBN;
	Boolean is_checked_out; 
	
	
	/**
     * Constructor for the Book class.
     * 
     * @param title  the title of the book
     * @param author the author of the book
     * @param ISBN   the ISBN number of the book
     */
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.is_checked_out = false;
	}//end of Book constructor
	
	/**
     * Marks the book as checked out.
     */
	
	public void check_out() {
		is_checked_out = true;
		
	}//end of check_out method
	
	/**
     * Marks the book as returned.
     */
	
	public void return_book() {
		is_checked_out = false;
		
	}//end of return_book method
	
	 /**
     * Abstract method to return a description of the book type.
     * 
     * @return a string indicating the type of book
     */
	
	public abstract String describe();

}//end of Book class 
