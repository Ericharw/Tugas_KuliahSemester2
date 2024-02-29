public class ArrayBalok09 {
    public static void main(String[] args) {
        Balok09[] blArray = new Balok09[3];

        blArray[0] = new Balok09(100, 30,12);
        blArray[1] = new Balok09(120, 40,15);
        blArray[2] = new Balok09(210, 50,25);

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}