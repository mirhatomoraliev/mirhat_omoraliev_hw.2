public class Crown extends Toyota{
    private String features;

    public Crown(String model, String driveUnit, double volume, double machineWeight,
                 TypeBodyEnum typeBody, int maxSpeed, String features) {
        super(model, driveUnit, volume, machineWeight, typeBody, maxSpeed);
        this.features = features;
    }

    public String getFeatures() {
        return features;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Features of "+getModel()+": "+getFeatures()+"\n--------------------");
    }
}
