public class Handphone extends Perangkat{
    protected boolean fingerprint;

    //constructor
    public Handphone(int ram, String drive, float processor, boolean fingerprint){
        super(ram, drive, processor);
        this.fingerprint = fingerprint;
    }

    //override function dari parent
    @Override
    public void informasi(){
        String result = (fingerprint) ? "compatible" : "not compatible";
        System.out.println("Handphone ini memiliki spesifikasi diantara lainn yaitu driver tipe "+drive+" Ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz.Selain itu handphone ini "+result+" fingerprint");
    }

    public void telfon(int no_hp){
        System.out.println("Verifikasi Handphone ke "+no_hp+" telah berhasil");
    }

    // overloading: 2 nama function sama dengan parameter berbeda
    public void kirimSMS(int no_hp){
        System.out.println("Verifikasi Handphone ke "+no_hp+" telah berhasil dikirim melalui SMS");
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Verifikasi Handphone berhasil dikirim ke "+no_hp1+" dan "+no_hp2+" melalui SMS");
    }
}
