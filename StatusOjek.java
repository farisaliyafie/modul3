
/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author (Faris Ali Yafie)
 * @version (16 Maret 2017)
 */
public enum StatusOjek
{

    StatusOjek(String deskripsi){
        this.deskripsi=deskripsi;
    }
    
    public String toString(){
        return deskripsi;
    }
    
    public static void main(String[] args){
        System.out.println(StatusOjek.Antar.toString());
        System.out.println(StatusOjek.Idle.toString());
        System.out.println(StatusOjek.Jemput.toString());
    }
}
