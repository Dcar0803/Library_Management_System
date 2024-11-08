import java.util.List;
import java.util.ArrayList;

/**
 * Represents a library that manages books, members, and staff.
 */

public class Library {
	 List<Book> books;
	 List<Member> members;
	 List<Staff> staff;
	 
	 
	    /**
	     * Constructor for Library. Initializes empty lists for books, members, and staff.
	     */
	public Library() {
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
		this.staff = new ArrayList<>();
	}//end of Library constructor
	
	/**
     * Adds a new book to the library.
     * 
     * @param book the book to be added
     */
	
	public void add_book(Book book) {
		books.add(book);
		
	}//end of add_book method
	
	
	 /**
     * Registers a new member in the library.
     * 
     * @param member the member to be registered
     */
	public void register_member(Member member) {
		members.add(member);
		
	}//end of register_member method
	
	 /**
     * Prints a list of all books in the library.
     */
	public void List_books() {
		for (Book book: books) {
			System.out.println(book.title + " by " + book.author + " - " + book.describe() + (book.is_checked_out ? " (Checked Out)" : ""));System.out.println(books);
		}//end of for loop
		
	}//end of List_book method
	
    /**
     * Prints a list of all members in the library.
     */
	public void List_member() {
		for (Member member: members) {
			System.out.println(member.name + " - " + member.describe());
		}//end of for loop
		
	}//end of list_member method
	
	 /**
     * Prints a list of all staff in the library.
     */
	
	public void List_staff() {
		for (Staff staffMember: staff) {
			System.out.println(staffMember.describe());
		}//end of for loop 
		
	}//end of staff method 
	

}//end of library class
