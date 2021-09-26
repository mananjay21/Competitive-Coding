import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.next();//it takes only one single string ....
        int value=name.length();
        String low = name.toLowerCase();
        String high = name.toUpperCase();
        System.out.println(value);
        System.out.println(low);
        System.out.println(high);

        String name1= sc.nextLine();//it takes all string ....
        int value1=name1.length();
        String low1 = name1.toLowerCase();
        String high1 = name1.toUpperCase();
        String trm= name1.trim();
        System.out.println(value1);
        System.out.println(low1);
        System.out.println(high1);
        System.out.println(trm);
        System.out.println(name1.substring(2));


    }
}