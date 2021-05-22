package temaPhone;

public class Contact {
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String message;
    private int no;

    public Contact() {

    }

    public Contact(int no, String phoneNumber, String firstName, String lastName, String message) {
        this.no = no;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNo(int no) {
        this.no = no;
    }
}



