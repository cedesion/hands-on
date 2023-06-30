public class Lasagna {
    private final int COOKING_TIME_IN_MINS = 40; 
    private final int MINS_PREP_PER_LAYER = 2;
    public int expectedMinutesInOven(){
        return COOKING_TIME_IN_MINS;
        }
    public int remainingMinutesInOven(int minutesPassed){
        return this.expectedMinutesInOven() - minutesPassed;
    }
    
    public int preparationTimeInMinutes(int numLayers){
        return MINS_PREP_PER_LAYER * numLayers;
    }
    
    public int totalTimeInMinutes(int numLayers, int minutesPassed){
        return this.preparationTimeInMinutes(numLayers) + minutesPassed;
    }
}
