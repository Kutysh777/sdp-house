public class ModernHouseFactory implements HouseFactory {
    public House createHouse() {
        return new ModernHouse();
    }
    public Roof createRoof() {
        return new ModernRoof();
    }
}