package Model;

import java.lang.annotation.Documented;
import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User extends BaseEntity{

    String Name;
    String Email;
    String Password;
    String Phone_Number;
    LocalDate Date_Of_Birth;


    public User(){}

    public User(String name, String email, String password, String phone_Number, LocalDate date_Of_Birth) {
        Name = name;
        Email = email;
        Password = password;
        Phone_Number = phone_Number;
        Date_Of_Birth = date_Of_Birth;
    }

    public User(String id, String ray, String mail, String ray123, String number, LocalDate of) {
        super();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public LocalDate getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public void setDate_Of_Birth(LocalDate date_Of_Birth) {
        Date_Of_Birth = date_Of_Birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                ", Date_Of_Birth=" + Date_Of_Birth +
                '}';
    }
}
