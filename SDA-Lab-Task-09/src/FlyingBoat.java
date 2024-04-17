public interface FlyingBoat extends Plane, Boat {
    default void swimAndFly() {
        swim();
        fly();
    }
}
