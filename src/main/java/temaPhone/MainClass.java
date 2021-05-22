package temaPhone;

public class MainClass {
    public static void main(String[] args) {


        Samsung phone1 = new SamsungGalaxy9Plus(150, "black", "aluminium", 987526);
        IPhone phone2 = new IPhoneXS(100, "green", "aluminium", 645897);
        Phone phone3 = new SamsungGalaxy6(150, "darkblue", "aluminium", 456287);
        Phone phone4 = new IPhone10(100, "white", "aluminium", 546872);

        Contact c1 = new Contact(1, "0741324657", "Ion", "Pop", "test1");
        Contact c2 = new Contact(2, "0741334733", "Maria", "Ardelean", "test2");
        Contact c3 = addContact(3, "0740214653", "Mihai", "Munteanu", "test3");
        Contact c4 = addContact(4, "0748900365", "Andrei", "Moldovan", "test4");

        phone1.addContact(c1);
        phone2.addContact(c2);
        phone3.addContact(c3);
        phone4.addContact(c4);

        Contact[] contacts = new Contact[]{c1, c2, c3, c4};
        System.out.println("Contacts are: " );
        for (Contact contact : contacts){
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " with phone number: " + contact.getPhoneNumber());
        }
/**
 *      2 mesaje = 2x 1h din baterie.
 **/
        phone1.sendMessage("0748900365", " message number 1.");
        phone1.sendMessage("0740214653", " message number 2.");
/**
*      2 apeluri = 2x 2h din baterie.
**/
        phone1.listMessages("0741324657");
        phone2.call("0741324657");
        phone2.call("0748900365");
        phone2.viewHistory();
/**
 *      Am apelat metoda listContacts de test // nu-mi placea ca aparea ca 'never used'.
 **/
        phone1.listContacts();

        System.out.println("Your battery life for " + phone1.getClass() + " is: " + phone1.getBatteryLife() + " hours.");
        System.out.println("Your battery life for " + phone2.getClass() + " is: " + phone2.getBatteryLife() + " hours.");
    }


    private static Contact addContact(int no, String phoneNumber, String firstName, String lastName, String message) {
        Contact contact = new Contact();
        contact.setNo(no);
        contact.setPhoneNumber(phoneNumber);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setMessage(message);
       return contact;
    }
}
