/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class OjeKampus
{
    /**
     * Fungsi utama OjeKampus
     * @param   args    Array string yang dapat menjadi argumen, default:null
     * @return  none
     */
    public static void main(String[] args) {
        Ojek ojek_farisali = new Ojek(DatabaseUser.getIDPelangganTerakhir()
        , "farisali", new Lokasi("UI", 14, 06, "Depok"));
        Pelanggan p_yafie = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(),
        "yafie");
        Lokasi per_yafie_awal = new Lokasi("Bekasi", 5, 7, "perum");
        Lokasi per_yafie_akhir = new Lokasi("Bandung", 6, 7, "nangor");
        Pesanan pes_yafie = new Pesanan (p_yafie, "ojek", per_yafie_awal, per_yafie_akhir,
        "eka", "pabe", 100000);
        
        DatabaseUser.addOjek(ojek_farisali);
        DatabaseUser.addPelanggan(p_yafie);
        DatabasePesanan.addPesanan(pes_yafie);
        
        DatabaseUser.getUserOjek().printData();
        DatabaseUser.getUserPelanggan().printData();
    }
}
