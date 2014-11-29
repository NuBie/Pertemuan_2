package pertemuan2; //folder pertemuan2
/*Nama : Agus Saputra
 *NPM : 13120036
 *kelas : B
 */
public class TestAnd { //class TestAnd
    public static void main(String[] args) {//fungsi method utama dalam sebuah program
     int i=0; //inisialisasi type data integer dengan variabel i yg bernilai o
        int j=10; //inisialisasi type data integer dengan variabel j yg bernilai 10
        
        /*inisialisasi tipe data boolean  dengan variabel test yang bernilai false
         * NOTE...!!! Tipe data boolean hanya mengenal dua value True(benar) dan False(Salah) saja
         */
        boolean test=false; 
        //Demonstrasi &&
        /*
         * pengecekan kondisi pada variabel test
         * dimana kondisi itu (i=0 < 10)dan (j=10+2 =12 > 9)
         * Dan Kondisi tersebut bernilai benar (true)
         */
        test = (i < 10) && (j +2 >9); 
        System.out.println(i); //mencetak dilayar nilai variabel i yaitu 0
        System.out.println(j); //mencetak dilayar nilai variabel j yaitu 10
        System.out.println(test); //mencetak variabel test yaitu true
        
        //demonstrasi &
        /*
         * pengecekan kondisi pada variabel test
         * dimana kondisi itu (i=0 < 10)dan (j=10 ++ < 9)
         *adapaun j ++ adalah counter penambahan 1 jadi j ++ bernilai 11
         * Dan Kondisi tersebut bernilai Salah (False)
         */
        test = (i < 10) & (j ++ <9); 
        System.out.println(i); //mencetak dilayar nilai variabel i yaitu 0
        System.out.println(j); //mencetak dilayar nilai variabel j yaitu 10
        System.out.println(test); //mencetak variabel test yaitu true
    }  
}
