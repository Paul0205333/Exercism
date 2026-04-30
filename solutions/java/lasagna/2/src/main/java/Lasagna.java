public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven){
        int expected = new Lasagna().expectedMinutesInOven(); 
        int remainingMinutes = expected  - minutesInOven;
        return remainingMinutes;
    }

    public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven){
        int layersPrepTime = new Lasagna().preparationTimeInMinutes(layers);
        int totalTime = layersPrepTime + minutesInOven;
        return totalTime;
    }
}
