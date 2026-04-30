class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryDrained = 0;
    private int distanceDriven = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryDrained + this.batteryDrain>100;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(this.batteryDrained + this.batteryDrain>100){
            return;
        }
        this.batteryDrained += this.batteryDrain;
        this.distanceDriven += this.speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getBatteryDrain(){
        return this.batteryDrain;
    }
    
    public int getSpeed(){
        return this.speed;
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((100/car.getBatteryDrain()) * car.getSpeed()) >= this.distance;
    }
}
