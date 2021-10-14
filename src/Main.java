import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fzk, kmy, trk, mzk, dersSayisi = 5;
        double average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fzk = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kmy = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        trk = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        mzk = inp.nextInt();

        if (mat<0 || mat>100){
            mat = 0;
            dersSayisi--;
        }
        if (fzk<0 || fzk>100){
            fzk = 0;
            dersSayisi--;
        }
        if (kmy<0 || kmy>100){
            kmy = 0;
            dersSayisi--;
        }
        if (trk<0 || trk>100){
            trk = 0;
            dersSayisi--;
        }
        if (mzk<0 || mzk>100){
            mzk = 0;
            dersSayisi--;
        }

        average = (mat+fzk+kmy+trk+mzk)/dersSayisi;
        if (average <= 55) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
