public class Prado extends Toyota{
    private double loadCapacity;

    public Prado(String model, String driveUnit,
                 double volume, double machineWeight, TypeBodyEnum typeBody, int maxSpeed, double loadCapacity) {
        super(model, driveUnit, volume, machineWeight, typeBody, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Load capacity of "+getModel()+": "+getLoadCapacity());
    }
}
