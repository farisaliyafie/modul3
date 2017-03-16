
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    private int x;

    public enum Pesanan{
        selesai,
        diproses;
    }
    
    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        Ojek.setPesanan.toString();
    }
    
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan){
        
    }    
    
    public static void ojekLepasPesanan(Ojek Pelayan){
        
    }
    
    public static void pesananDibatalkan(Ojek Pelayan){
        
    }
    
    public static void pesananSelesai(Ojek Pelayan){
        
    }
    
    public static void pesananDibatalkan(Pesanan pesan){
        
    }
    
    public static void pesananSelesai(Pesanan pesan){
        
    }
    
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
}
