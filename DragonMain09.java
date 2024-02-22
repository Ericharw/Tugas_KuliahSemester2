public class DragonMain09 {
    public static void main(String[] args) {

        Dragon09 dragon1 = new Dragon09(11, 11, 10, 10);
        dragon1.printPosition();
        dragon1.moveLeft();
        dragon1.printPosition();
        dragon1.moveRight();
        dragon1.printPosition();
        dragon1.moveUp();
        dragon1.printPosition();
        dragon1.moveDown();
        dragon1.printPosition();
        dragon1.detectCollision();
    }
}

