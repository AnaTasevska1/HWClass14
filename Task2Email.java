package HWClass14;
/*
Create a method createEmail(). Based on values of users firstName, lastName and email type,
your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */
public class Task2Email {

    String createEmail(String firstName, String lastName, String domain) {
        return firstName + lastName + '@' + domain + ".com";
    }

    public static void main(String[] args) {
        Task2Email email = new Task2Email();
        System.out.println(email.createEmail("John", "Snow", "gmail"));
    }
}


