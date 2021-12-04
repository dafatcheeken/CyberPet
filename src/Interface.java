import java.util.Scanner;

public class Interface {

    public static void output(String s){
        System.out.println(s);
    }
    public static int getSelection(){
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.valueOf(scanner.nextLine());
        }
        catch(NumberFormatException e){
            return -1;
        }

    }
    public static String getText(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
