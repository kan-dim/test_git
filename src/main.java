import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city = scanner.next();
        boolean end = city.endsWith("burger");
        System.out.println(end);
    }
}
