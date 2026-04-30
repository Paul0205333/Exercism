public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven){
        int expected = new Lasagna().expectedMinutesInOven(); 
        int remainingMinutes = expected  - minutesInOven;
        return remainingMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven){
        int layersPrepTime = new Lasagna().preparationTimeInMinutes(layers);
        int totalTime = layersPrepTime + minutesInOven;
        return totalTime;
    }
}
