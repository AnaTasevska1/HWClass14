package HWClass14;
// Write a method to return whether given number is prime or not?
public class Task3Prime {

     boolean isPrime(int a) {
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Task3Prime obj=new Task3Prime();
        System.out.println(obj.isPrime(8));
    }
}
