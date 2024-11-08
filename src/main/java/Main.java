public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Staff staff1 = new Staff("Maria", "S001");
        Member member1 = new Member("Casey", "M001");

        Book book1 = new Fiction("To Kill a Mockingbird", "Harper Lee", "123456789");
        Book book2 = new NonFiction("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "987654321");

        // Register a book and a member using a staff member
        staff1.register_book(library, book1);
        staff1.register_book(library, book2);
        staff1.register_member(library, member1);

        // List all books, members, and staff
        System.out.println("Books:");
        library.List_books();
        System.out.println("\nMembers:");
        library.List_member();
        System.out.println("\nStaff:");
        library.List_staff();
    }
}//end of Main class
