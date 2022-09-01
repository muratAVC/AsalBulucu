public class AsalBulucu {
    public static void main(String[] args) {
        boolean kontrol=true;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    kontrol=false;
                }
            }
            if (kontrol) System.out.print(i+" ");
            kontrol=true;

        }
    }
}
