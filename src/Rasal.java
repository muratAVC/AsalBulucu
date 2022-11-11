import java.util.Scanner;

public class Rasal {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        boolean kontrol=true;
        System.out.println("bir sayı giriniz");
        int i=girdi.nextInt();

        for (int j = 2; j < i; j++) {
            if (i%j==0){
                kontrol=false;
            }
        }
        if (kontrol) System.out.print(i+" Sayısı asal sayıdır");
        else System.out.println(i+" Sayısı asal değildir");
        kontrol=true;
    }
}
