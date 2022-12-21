package array;

import java.util.Arrays;

public class MaximumPopulationYear {


    // Question Link : https://leetcode.com/problems/maximum-population-year/description/
    public int maximumPopulation(int[][] logs) {

        int[] pop = new int[101];

        for(int[] data : logs){

            for(int i = data[0];i<data[1];i++){
                pop[i-1950]++;
            }

        }


        int max = 0;
        int year = 0;

        for(int i = 0;i<101;i++){
            if(max < pop[i]){
                max = pop[i];
                year = i+ 1950;
            }
        }

        return year;

    }


    public int maximumPopulationBrute(int[][] logs) {

        int[] births = new int[logs.length];
        int[] deaths = new int[logs.length];

        int curr = 0;

        for(int[] data : logs){
            births[curr] = data[0];
            deaths[curr] = data[1];
            curr++;
        }


        Arrays.sort(births);
        Arrays.sort(deaths);

        int max = 0;
        int population = 0;
        int deathYear = 0;
        int year = 0;

        curr = 0;
        while(curr<births.length){

            if(births[curr] < deaths[deathYear]){
                population++;

                if(max<population){
                    max = population;
                    year = births[curr];
                }

                curr++;
            }else{
                population--;
                deathYear++;
            }

        }


        return year;


    }

}
