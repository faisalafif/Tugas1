import java.util.Scanner;

public class Parkir{
    public static void main(String[] args){

    for(int i=0; i<2; i++){

        Scanner input = new Scanner(System.in);
        
        String PlatNomor;
        String Jenis_Kendaraan;
        int JenisKendaraan;
        int HargaPertama=0;
        int HargaBerikutnya=0;
        int JamMasuk=0;
        int JamKeluar=0;
        int totalJam=0;
        int totalBayar=0;

    System.out.println("Plat Nomor  : ");
    PlatNomor = input.nextLine();
    System.out.println("Jenis Kendaraan (1/2)  : ");
    JenisKendaraan = input.nextInt();
    System.out.println("Jam Masuk  : ");
    JamMasuk = input.nextInt();
    System.out.println("Jam Keluar  : ");
    JamKeluar = input.nextInt();

    if(JamMasuk > JamKeluar){
        totalJam = (JamKeluar - JamMasuk)+24 ;
    }else{
        totalJam = JamKeluar - JamMasuk ;
    if(totalJam == 0){
        totalJam = 1;
    }
    }
    if(JenisKendaraan == 1 ){
        Jenis_Kendaraan = "Mobil";
        HargaPertama = 5000;
        HargaBerikutnya = 3000 *(totalJam - 1);
        totalBayar = HargaPertama + HargaBerikutnya;

    }else if(JenisKendaraan == 2 ){
        Jenis_Kendaraan = "Motor";
        HargaPertama = 3000;
        HargaBerikutnya = 1500 *(totalJam - 1);
        totalBayar = HargaPertama + HargaBerikutnya;
    }else{
        System.out.println("Tidak Terdefinisi");
    }
    System.out.println("");
    System.out.println("Terima Kasih");
    System.out.println("Plat Nomor       : "+PlatNomor);
    System.out.println("Jenis Kendaraan  : "+JenisKendaraan);
    System.out.println("Lama Pakir       : "+totalJam+"jam");
    System.out.println("Total Bayar      : "+totalBayar);
    System.out.println();
    System.out.println("Semoga pelayanan kami Memuaskan");
    System.out.println();
        }
    }
}