import java.util.Scanner;

public class Tiket{
    public static void main(String[] args){
        String Nama;
        String TujuanBis;
        int Kelas;
        int Rute;
        int HargaSatuan=0;
        int JumlahKursi=0;
        int TotalBayar=0;

        for(int i=0; i<2; i++){
            Scanner input = new Scanner(System.in);

            System.out.println("Nama Pemesan :");
            Nama = input.nextLine();
            System.out.println("Rute (1/2/3) :");
            Rute = input.nextInt();
            System.out.print("Kelas [1. AC/2. NONAC] :");
            Kelas = input.nextInt();
            System.out.println("Jumlah Kursi  :");
            JumlahKursi = input.nextInt();

            if(Rute == 1){
                TujuanBis = "Jakarta-Bandung";
            if(Kelas == 1){
                HargaSatuan = 130000;
            }else{
                HargaSatuan = 90000;
              }
              TotalBayar = JumlahKursi * HargaSatuan;

            }
            
            else if(Rute == 2){
                TujuanBis = "Bandung-Jakarta";
            if(Kelas == 1){
                HargaSatuan = 150000;
            }else{
                HargaSatuan = 70000;
             }
             TotalBayar = JumlahKursi * HargaSatuan;
            }

            else if(Rute == 3){
                TujuanBis = "Jakrta-Tasikmalaya";
            if(Kelas == 1){
                HargaSatuan = 70000;
            }else{
                HargaSatuan = 50000;
             }
             TotalBayar = JumlahKursi * HargaSatuan;
            }

            else{
                System.out.println("kelas tidak ditemukan");
            }

            System.out.println("Terimakasih telah memesan tiket bis dengan rincian sebagai berikut");
            System.out.println("");
            System.out.println("Nama Pemesan   :  "+Nama);
            System.out.println("Rute           :  "+Rute);
            System.out.println("Kelas          :  "+Kelas);
            System.out.println("Harga Satuan   :  "+HargaSatuan);
            System.out.println("Jumlah kursi   :  "+JumlahKursi);
            System.out.println("Total Bayar    :  "+TotalBayar);
            System.out.println("Silahkan membayar di Alfamart terdekat");
            
        }
    }
}