package HWClass14;
/*
Create a method that will say Hello in different language
 based on the country that will passed when method is executed.
 */
public class Task1Hello {
    public static void sayHello(String country) {
        switch (country) {
            case "Canada":
                System.out.println("Hello!");
                break;
            case "Macedonia":
                System.out.println("Zdravo!");
                break;
            case "Spain":
                System.out.println("Hola!");
                break;
            default:
                System.out.println("Not sure!");
        }
    }
    public static void main(String[] args) {
        Task1Hello obj = new Task1Hello();
        obj.sayHello("Macedonia");
    }
}