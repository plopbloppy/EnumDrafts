public class Library {

    public static void main(String[] args) {
        System.out.println("Books in this library:");

        for (int i = 0; i < Book.values().length; i++) {
            System.out.println((i + 1) + ". " + (Book.values()[i]));
        }

        String[] aboutBook = Book.ANIMAL_FARM.aboutBook();

        for (int i = 0; i < aboutBook.length; i++) {
            System.out.println(aboutBook[i]);
        }

        String author = "Atwood";
    }
}
