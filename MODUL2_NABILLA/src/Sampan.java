public class Sampan extends Transportasiair{
    protected int layar;
    
    public Sampan(int jumlahKursi,int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah "+jumlahKursi+"dengan biaya sebesar "+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis sampan sedang berlayar menggunakan"+layar+"layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis sampan sedang berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis sampan berlabuh di pantai menggunakan "+jangkar+"jangkar");
    }
}
