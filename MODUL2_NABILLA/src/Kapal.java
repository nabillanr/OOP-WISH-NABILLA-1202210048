public class Kapal extends Transportasiair{
    protected String Mesin;
    public Kapal(int jumlahKursi, int biaya, int layar, String Mesin){
        super(jumlahKursi, biaya);
        this.Mesin = Mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi jenis kapal dengan kursi berjumlah "+jumlahKursi+"ditetapkan dengan biaya sebesar "+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi jenis kapal sedang berlayar menggunakan "+Mesin+" dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi jenis kapal sedang berlayar menggunakan "+Mesin+" dengan kecepatan stabil di kisaran "+kecepatan+" knot");
    }
    public void berlabuh(){
        System.out.println("Transportasi jenis kapal dengan berlabuh di kapal");
    }
}
