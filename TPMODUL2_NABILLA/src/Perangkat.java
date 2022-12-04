public class Perangkat {
    protected int ram;
    protected String drive;
    protected float processor;

    //constructor
    public Perangkat(int ram, String drive, float processor){
        this.ram = ram;
        this.drive = drive;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat ini memiliki drive bertipe "+drive+" dengan Ram sebesar "+ram+"Gb dan processor secepat "+processor+" Ghz");
    }
}