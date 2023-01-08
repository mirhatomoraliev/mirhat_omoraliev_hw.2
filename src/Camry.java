public class Camry extends Toyota{

    private int numberOfSeats;
    private String panoramicRoof;


    public Camry(String model, String driveUnit, double volume, double machineWeight, TypeBodyEnum typeBody,
                 int maxSpeed, int numberOfSeats, String panoramicRoof) {
        super(model, driveUnit, volume, machineWeight, typeBody, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.panoramicRoof = panoramicRoof;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getPanoramicRoof() {
        return panoramicRoof;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of seats: "+getNumberOfSeats()+"\nPanorama: "+getPanoramicRoof()+"\n--------------------");
    }
}
