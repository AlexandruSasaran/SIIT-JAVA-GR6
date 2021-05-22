package temaPhone;

public interface Phone {
    void addContact(Contact contact);
    void listContacts();
    void sendMessage(String phoneNumber, String message);
    void listMessages(String phoneNumber);
    void call(String phoneNumber);
    void viewHistory();


}
