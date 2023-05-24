package student_package;
import java.util.Scanner;
public class TiketApp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Person orang = new Person();
        Tiket tiket = new Tiket();

        System.out.println("===Progam Cek Tiket===");
        System.out.print("Masukkan Nama\t\t: ");
        orang.setNama(input.nextLine());
        System.out.print("Masukkan No Hp\t\t: ");
        orang.setNoHp(input.nextLine());
        System.out.print("Masukkan No Tiket\t: ");
        tiket.setTiket(input.nextLine());


        System.out.println("=================================");
        System.out.println("\n==Biodata dan Keterangan Tiket==");
        System.out.println("Nama\t\t: "+orang.getNama());
        System.out.println("No Hp\t\t: "+orang.getNoHp());
        System.out.println("No Tiket\t: "+tiket.getTiket());
        System.out.print("Keterangan\t: ");
        tiket.tentangTiket();
        
    }
}
