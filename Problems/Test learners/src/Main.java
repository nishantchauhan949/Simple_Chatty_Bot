import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input  = s.nextInt();

        switch (input) {
            case 1:
                System.out.println("Yes!");
                break;

            case 2: case 3: case 4:
                System.out.println("No!");
                break;

            default:
                System.out.println("Unknown number");
                break;
        }
    }
}