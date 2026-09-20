public class BrickHouseFactory implements HouseFactory {
    public House createHouse() {
        return new BrickHouse();
    }
    public Roof createRoof() {
        return new BrickRoof();
    }
}