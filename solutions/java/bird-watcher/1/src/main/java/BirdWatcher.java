
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] bLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return bLastWeek;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0; i<7; i++){
            if(birdsPerDay[i]==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays>birdsPerDay.length){
           for(int i=0; i<birdsPerDay.length; i++){
            count += birdsPerDay[i];
           }
        }else{
            for(int i=0; i<numberOfDays; i++){
            count += birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i<7; i++){
            if(birdsPerDay[i]>=5){
                busyDays+=1;
            }
        }
        return busyDays;
    }
}
