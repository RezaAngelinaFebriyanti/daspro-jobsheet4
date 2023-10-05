import java.util.Scanner;
public class CodingImplementasiHargaBayar26 {
    public static void main(String args []){
        Scanner input =new Scanner(System.in);
        int harga, jumlah, jmlHlmBuku;
        double dis=0.2, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merkbuku yang dibeli");
        merkBuku=input.next();
        System.out.println("Masukkan jmlHlmBuku yang dibeli");
        jmlHlmBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}