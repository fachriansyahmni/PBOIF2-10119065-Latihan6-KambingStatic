/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan nama kambing secara 
 *                        static
 *
 */
package pboif2_10119065_latihan6_kambingstatic;

public class Mamalia{
     public static int jumlahKambing;
}
public class PBOIF2_10119065_Latihan6_KambingStatic {
    
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                + Mamalia.jumlahKambing);
    }
    
}
