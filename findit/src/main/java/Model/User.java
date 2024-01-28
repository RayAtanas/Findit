package Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "users")
public class User extends BaseEntity {

   public String FirstName;
   public String LastName; // Added LastName field
   public String Email;
   public String Password;
   public String Phone_Number;


    public User() {
        // Default constructor
    }

    public User(String firstName, String lastName, String email, String password, String phone_Number) {
        super();
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        Phone_Number = phone_Number;

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                '}';
    }
}
