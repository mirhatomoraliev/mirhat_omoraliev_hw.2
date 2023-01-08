public abstract   class Toyota implements Printable{
    private String model, driveUnit;
    private double volume, machineWeight;
    private TypeBodyEnum typeBody;
    private int maxSpeed;

    public Toyota(String model, String driveUnit, double volume, double machineWeight,
                  TypeBodyEnum typeBody, int maxSpeed) {
        this.model = model;
        this.driveUnit = driveUnit;
        this.volume = volume;
        this.machineWeight = machineWeight;
        this.typeBody = typeBody;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public double getVolume() {
        return volume;
    }

    public double getMachineWeight() {
        return machineWeight;
    }

    public TypeBodyEnum getTypeBody() {
        return typeBody;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void print() {
        System.out.println("Model: Toyota "+getModel()+"\nVolume: "+getVolume()+"\nType body: "+getTypeBody()+
                "\nDrive unit: "+getDriveUnit()+"\nWeight: "+getMachineWeight()+"kg."+
                "\nMax speed: "+getMaxSpeed()+"km/h");
    }
}
