/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fundementalJava;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args){
        System.out.println("test");
//        int[] arr =  roll(5) ;
//        System.out.println(arr[0]);
        int[] testArr = {1,2,3,4,1} ;
      System.out.println(containsDuplicates(testArr));
        System.out.println(calcAverage(testArr));
        int[][] testArr2 = {{10,10,10} , {2,2,2}};
        System.out.println(lowestAvg2DArr(testArr2));
    }

    public static int[] roll(int n){
        int[] rollDice = new int[n] ;
        for(int i = 0 ; i<rollDice.length ; i++){
            rollDice[i] = (int)(Math.random()*7);
        }
        return  rollDice ;
    }

    public static boolean containsDuplicates(int[] arr){
        ArrayList<Integer> testArr = new ArrayList<>() ;
        for(int i  = 0; i < arr.length ; i++){
            testArr.add(arr[i]);
            if(testArr.indexOf(arr[i]) != i ){
                return  true ;
            }

        }
        return false ;
    }

    public static float calcAverage(int[] arr){
        float sum = 0 ;
        for(int value: arr){
            sum+=value ;
        }
        return  sum / arr.length ;
    }

    public static float lowestAvg2DArr(int[][] arr){
        float sum = 0 ;
        float lowestAvg = 10000;
        for(int row = 0 ; row < arr.length ; row++){
            sum = 0 ;
            for (int col = 0 ; col < arr[row].length ; col++){
                sum+=arr[row][col];
            }
            if((sum / arr[row].length) < lowestAvg){
                lowestAvg = sum / arr[row].length ;
            }
        }
        return  lowestAvg ;
    }
}