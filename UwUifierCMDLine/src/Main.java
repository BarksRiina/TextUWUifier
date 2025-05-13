import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        System.out.println("Put text hewe to UwUify it. Type \"bweak\" to end it");
        while (true) {
            String textToUwU = inputText.nextLine();
            if (textToUwU.equals("bweak")) {
                break;
            } else {
                System.out.println(textToUwU.replace('r', 'w').replace('l', 'w').replace('L', 'W').replace('R', 'W'));
            }
        }
    }
}