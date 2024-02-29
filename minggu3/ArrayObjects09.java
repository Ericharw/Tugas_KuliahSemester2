import java.util.Scanner;

public class ArrayObjects09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        PersegiPanjang09[] ppArray = new PersegiPanjang09[3];

    for (int i = 0; i < 3; i++)
    {
        ppArray[i] = new PersegiPanjang09();
        System.out.println("Persegi Panjang ke-" + i);
        System.out.print ("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar = sc.nextInt();
    }
    
    for (int i=0; i < 3; i++)
    {
        System.out.println("Persegi panjang ke-" + i);
        System.out.println ("Panjang:  "+ ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
    }
    }
}