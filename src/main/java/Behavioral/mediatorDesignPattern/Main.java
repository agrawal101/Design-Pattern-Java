package Behavioral.mediatorDesignPattern;

public class Main {

    public static void main(String[] args) {

        CollaborativeDocument doc = new CollaborativeDocument();

        User a = new User("A",doc);
        User b = new User("B",doc);
        User c = new User("C",doc);

        doc.join(a);
        doc.join(b);
        doc.join(c);

        a.makeChange("Title Updated");
        b.makeChange("Corrected grammer");
    }

}
