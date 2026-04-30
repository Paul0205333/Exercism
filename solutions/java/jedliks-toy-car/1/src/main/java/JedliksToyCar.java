public class JedliksToyCar {
    public int driven;
    public int percentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + driven + " meters";
    }

    public String batteryDisplay() {
        if(percentage == 0){
            return "Battery empty";
        }else{
            return "Battery at " + percentage + "%";
        }
    }

    public void drive() {

        if(percentage==0){
            return;
        }else{
            driven += 20;
        percentage -=1;
        }
    }
}
