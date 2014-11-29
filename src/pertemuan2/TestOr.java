package pertemuan2; //folder pertemuan 2
/*Nama : Agus Saputra
 *NPM : 13120036
 *kelas : B
 */
public class TestOr { //class TestOr
     public static void main (String [] args){ //fungsi utama atau method
        int i=0; //inisialisasi type data integer dengan variabel i yg bernilai o
        int j=10; //inisialisasi type data integer dengan variabel j yg bernilai 10
        /*inisialisasi tipe data boolean  dengan variabel test yang bernilai false
         * NOTE...!!! Tipe data boolean hanya mengenal dua value True(benar) dan False(Salah) saja
         */
        boolean test=false; 
        //Demonstrasi ||
        /*
         * pengecekan kondisi pada variabel test
         * dimana kondisi itu (i=0 < 10)atau (j ++ =11 > 9)
         * Dan Kondisi tersebut bernilai benar (true)
         */
        test = (i < 10) || (j ++ >9); 
        System.out.println(i); //mencetak dilayar nilai variabel i yaitu 0
        System.out.println(j); //mencetak dilayar nilai variabel j yaitu 10
        System.out.println(test); //mencetak variabel test yaitu true
        
        //demonstrasi |
        /*
         * pengecekan kondisi pada variabel test
         * dimana kondisi itu (i=0 < 10)atau (j=10 ++ < 9)
         *adapaun j ++ adalah counter penambahan 1 jadi j ++ bernilai 11
         * Dan Kondisi tersebut bernilai benar (true)
         */
        test = (i < 10) | (j ++ >9); 
        System.out.println(i); //mencetak dilayar nilai variabel i yaitu 0
        System.out.println(j); //mencetak dilayar nilai variabel j yaitu 10
        System.out.println(test); //mencetak variabel test yaitu true
    }//akhir main
}//akhir class
