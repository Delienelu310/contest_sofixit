package com.contest;

public class App {

    /**
     * 
     * @param spaceship array of positive numbers, as "spaceship" physically cannot have negative
     * @return
     */
    public static int material(int[] spaceship){
        //0. handle special cases (empty array, array with negative numbers etc) 
        //1. find index of first max value
        //2. go from left to right till max value index adding (maxCurrent - spaceship[i]])
        //3. go from right to left till max value index adding (maxCurrent - spaceship[i]))

        int result = 0;

        //0
        //special case 1: empty array or null value
        if(spaceship == null || spaceship.length == 0) return 0;
        
        //special case 2: array with a negative number (invalid input)
        for(int i = 0; i < spaceship.length; i++){
            if(spaceship[i] < 0) throw new NegativeInputException();
        }

        //1
        int maxIndex = 0;
        for(int i = 1; i < spaceship.length; i++){
            if(spaceship[i] > spaceship[maxIndex]){
                maxIndex = i;
            }
        }

        //2
        int maxCurrent = spaceship[0];
        for(int i = 1; i < maxIndex; i++){
            if(maxCurrent > spaceship[i]){
                result += maxCurrent - spaceship[i];
            }else{
                maxCurrent = spaceship[i];
            }
        }

        //3
        maxCurrent = spaceship[spaceship.length - 1];
        for(int i = spaceship.length - 2; i > maxIndex; i--){
            if(maxCurrent > spaceship[i]){
                result += maxCurrent - spaceship[i];
            }else{
                maxCurrent = spaceship[i];
            }
        }

        return result;

    }
}
