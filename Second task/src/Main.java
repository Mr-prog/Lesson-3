import java.util.*;

public class Main {
    public static void main(String[] args) {     //Вообще не понял, как я с этим справился :)
        Phonebook book = new Phonebook();

        book.addContact("Ивановский", "89653456");
        book.addContact("Емельяненко", "89653456");
        book.addContact("Ивановский", "896578556");
        book.addContact("Снимщиков", "89653456");
        book.addContact("Яндиев", "89653456");
        book.addContact("Камянецький", "89028293599");


        book.findAndPrint("Ивановский");
        book.findAndPrint("Снимщиков");
        book.findAndPrint("Яндиев");

    }
}
