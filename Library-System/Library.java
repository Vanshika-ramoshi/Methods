public class Library {

    void issueBook(String bookName, boolean isAvailable) {

        if (isAvailable) {
            System.out.println(bookName + " Book Issued Successfully");
        } else {
            System.out.println(bookName + " Book is Not Available");
        }
    }
}
