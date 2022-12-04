public class Laptop extends Perangkat {
    protected boolean webcam;

    // constructor
    public Laptop(int ram, String drive, float processor, boolean webcam) {
        super(ram, drive, processor);
        this.webcam = webcam;
    }

    // override function dari parent
    @Override
    public void informasi() {
        String result = (webcam) ? "compatible" : "not compatible";
        System.out.println("Laptop ini memiliki spesifikasi driver bertipe " + drive + ", Ram sebesar " + ram
                + "GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini " + result + " webcam");
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop compatible dalam membuka game " + nama_game);
    }

    // overloading: 2 nama function sama dengan parameter berbeda
    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("laptop berhasil mengirim email ke " + email1 + " dan " + email2);
    }
}