package goodlifemart;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class BinarySearchArrayList {
    public static int BinarySearch(List<Item> itemArrayList, int valueToSearch) {

        int start = 0;
        int end = itemArrayList.size();
        
        while(start < end){
            int midpoint = (start + end)/2;
            if (itemArrayList.get(midpoint).price == valueToSearch) {
                return midpoint;
            } else if(itemArrayList.get(midpoint).price < valueToSearch){ // right half of the array is to be searched
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        } return -1;
    }
}
