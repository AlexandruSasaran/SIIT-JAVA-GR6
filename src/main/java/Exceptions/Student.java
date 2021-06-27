package Exceptions;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String cnp;

    public Student(String firstName, String lastName, String gender, LocalDate birthDate, String cnp) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Filling in this field is mandatory!");
        } else  {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Filling in this field is mandatory!");
        } else  {
            this.lastName = lastName;
        }

        if ( (gender.toLowerCase().contains("m") || gender.toLowerCase().contains("male")) ||
                (gender.toLowerCase().contains("f") || gender.toLowerCase().contains("female")) ) {
            this.gender = gender.toLowerCase();
        } else {
            throw new IllegalArgumentException("Wrong format. Accepted gender: m/f or male/female.");
        }

        if (!validateAge(birthDate)) {
            throw new IllegalArgumentException("Invalid date of birth entered. Age should be above 18");
        } else {
            this.birthDate = birthDate;
        }

        if (cnp == null || cnp.length() != 13) {
            throw new IllegalArgumentException("Wrong format. ID must contain exactly 13 characters");
        }  else {
            this.cnp = cnp;
        }
    }

    private boolean validateAge (LocalDate birthDate) {
        if (birthDate.getYear() < 1900) {
            return false;
        }
        return birthDate.getYear() <= LocalDate.now().getYear() - 18;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
