public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat(16, "Toshiba", 1.2f);
        perangkat.informasi();

        System.out.println(" ");

        Laptop laptop = new Laptop(20, "Asus Vivobook", 2.5f, true);
        laptop.informasi();
        laptop.bukaGame("Dota");
        laptop.kirimEmail("nabilla@gmail.com");
        laptop.kirimEmail("nabilla@gmail.com","nrizqi@gmail.com");

        System.out.println(" ");

        Handphone hp = new Handphone(8, "Vivo", 4.1f, false);
        hp.informasi();
        hp.telfon(628112233);
        hp.kirimSMS(628987654);
        hp.kirimSMS(628987654, 628567892);
    }
}
