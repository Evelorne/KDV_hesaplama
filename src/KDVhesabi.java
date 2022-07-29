import java.util.Scanner;

public class KDVhesabi {

        public static void main(String[] args) {
            double a;
            Scanner input = new Scanner(System.in);
            System.out.print("Ücret tutarını giriniz: ");
            a = input.nextDouble();
            System.out.println("KDV'siz ücretiniz : "+a+" TL");
            double c = (a < 0) ? 0 : 0.08;
            double b = (a>0 && a<=1000) ? 0.18 : c ;
            double d = a * b;
            System.out.println("KDV Tutarınız : "+d+" TL");
            double e = (d!=0)?d + a : 0;
            System.out.println("KDV'li Fiyatınız : "+e+" TL");
        }


}
