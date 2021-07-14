package goodlifemart;


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SelectionSort {
    public static void sort(ArrayList<Item> itemArrayList){
        for (int i=0; i<itemArrayList.size()-1; i++){
            int minPos = minPosFinder(itemArrayList,i);
            swap(itemArrayList,minPos,i);
            
        }
    }
    
    public static int minPosFinder(ArrayList<Item> itemArrayList, int from){
        int minPos = from;
        for (int i=from+1; i<itemArrayList.size(); i++){
            if (itemArrayList.get(i).getPrice()<itemArrayList.get(minPos).getPrice())
                minPos = i;
        }
        return minPos;
    }
        
            
    public static void swap(ArrayList<Item> itemArrayList, int minPos, int from){

        Collections.swap(itemArrayList, minPos, from);
         
    }
}
