public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int product = speed * 221;
        double finalProduct = 0;
        if(speed<5){
            finalProduct = product;
        } else if(speed<9){
            finalProduct = product * 0.9;
        } else if (speed==9){
            finalProduct = product * 0.8;
        } else{
            finalProduct = product * 0.77;
        }
        return finalProduct;
    }

    public int workingItemsPerMinute(int speed) {
        int workingItems = (int)(productionRatePerHour(speed)/60);
        return workingItems;
    }
}
