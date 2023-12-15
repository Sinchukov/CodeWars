import jdk.jfr.Unsigned;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kata a = new Kata();
        String str1 = sc.nextLine(), str2 = sc.nextLine();
        System.out.println(a.add(str1, str2));


    }
}