import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n===== Menu Program =====");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Trapesium");
        System.out.println("0. Keluar");
        System.out.print("Select menu : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
          case 1:
            System.out.print("\nMasukkan panjang sisi Persegi : ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nHasil kalkulator : " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nMasukkan jari jari lingkaran : ");
            double radius = scanner.nextDouble();
            
            