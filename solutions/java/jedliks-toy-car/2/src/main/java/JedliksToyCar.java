public class JedliksToyCar {
    private int driven;
    private int percentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.driven + " meters";
    }

    public String batteryDisplay() {
        if(percentage == 0){
            return "Battery empty";
        }
        return "Battery at " + this.percentage + "%";
        
    }

    public void drive() {
        if(this.percentage==0){
            return;
        }else{
            this.driven += 20;
            this.percentage -=1;
        }
    }
}
