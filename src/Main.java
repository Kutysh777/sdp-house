public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method: ");
        System.out.println();
        HouseCreator creator = new SimpleHouseCreator();
        House house = creator.createHouse();
        house.show();

        creator = new LuxuryHouseCreator();
        house = creator.createHouse();
        house.show();

        System.out.println();
        System.out.println("Abstract Factory: ");
        System.out.println();
        HouseFactory factory = new BrickHouseFactory();

        house = factory.createHouse();
        Roof roof = factory.createRoof();

        house.show();
        roof.show();

        factory = new ModernHouseFactory();

        house = factory.createHouse();
        roof = factory.createRoof();

        house.show();
        roof.show();
    }
}