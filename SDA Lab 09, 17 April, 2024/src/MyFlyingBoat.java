public class MyFlyingBoat implements FlyingBoat {
    @Override
    public void swim() {
        System.out.println("The Boat is swimming and the boat length is " + boatLenght + " meters.");
    }

    public void fly() {
        System.out.println("The Boat is flying and the max altitude is " + maxAttitude + " meters.");
    }
}
