package temaPhone;

import org.apache.commons.lang3.ArrayUtils;

public abstract class Samsung implements Phone {
    private int batteryLife;
    private String color;
    private String material;
    String[] callList = new String[0];
    String[] messagesList = new String[0];
    Contact[] contactList = new Contact[0];

    public Samsung(int battery, String color, String material) {
        this.batteryLife = battery;
        this.color = color;
        this.material = material;
    }

    @Override
    public void addContact(Contact contact) {
        contactList = ArrayUtils.add(contactList, contact);
    }

    @Override
    public void listContacts() {
        System.out.println("You contacts are: ");
        for (Contact contact : contactList) {
            System.out.println(contact.getLastName() + " " + contact.getFirstName() + " with phone number: " + contact.getPhoneNumber());
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        int maxLength = 500;
        if (message.length() > maxLength) {
            message = message.substring(0, 500);
        }
        batteryLife = batteryLife - 1;
        messagesList = ArrayUtils.add(messagesList, message);
    }

    @Override
    public void listMessages(String phoneNumber){
        System.out.println("You messaged to the followed numbers: ");
        for (String message: messagesList){
            System.out.println(phoneNumber + " with message: " + message);
        }
    }
    @Override
    public void call(String phoneNumber) {
        batteryLife = batteryLife - 2;
        callList = ArrayUtils.add(callList, phoneNumber);
    }

    @Override
    public void viewHistory(){
        System.out.println("You called to the followed numbers: ");
        for (String phoneNumber: callList){
            System.out.println(phoneNumber);
        }
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}