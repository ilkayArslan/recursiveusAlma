import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri Giriniz : ");
        int taban = input.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int us = input.nextInt();
        int result = powder(taban,us);
        System.out.println(result);
    }
    static int powder(int a,int b){
            if (b<1){
                return 1;
            }
            return a*powder(a,b-1);
    };
}