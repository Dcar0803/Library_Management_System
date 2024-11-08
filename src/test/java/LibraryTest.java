import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library;
    Staff staff;
    Member member;
    Book fictionBook;
    Book nonFictionBook;

    @BeforeEach
    void setUp() {
        library = new Library();
        staff = new Staff("Alice", "S001");
        member = new Member("Bob", "M001");
        fictionBook = new Fiction("To Kill a Mockingbird", "Harper Lee", "123456789");
        nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", "987654321");
    }

    @Test
    void testAddBook() {
        staff.register_book(library, fictionBook);
        staff.register_book(library, nonFictionBook);
        assertEquals(2, library.books.size());
        assertEquals("To Kill a Mockingbird", library.books.get(0).title);
    }

    @Test
    void testRegisterMember() {
        staff.register_member(library, member);
        assertEquals(1, library.members.size());
        assertEquals("Bob", library.members.get(0).name);
    }

    @Test
    void testListBooks() {
        staff.register_book(library, fictionBook);
        staff.register_book(library, nonFictionBook);
        library.List_books();
    }

    @Test
    void testListMembers() {
        staff.register_member(library, member);
        library.List_member();
    }

    @Test
    void testListStaff() {
        library.staff.add(staff);
        library.List_staff();
    }

    @Test
    void testCheckOutAndReturnBook() {
        staff.register_book(library, fictionBook);
        fictionBook.check_out();
        assertTrue(fictionBook.is_checked_out);
        fictionBook.return_book();
    }
}
