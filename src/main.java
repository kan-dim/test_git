import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city = scanner.next();
        boolean end = city.endsWith("burg");
        System.out.println(end);
    }
}
