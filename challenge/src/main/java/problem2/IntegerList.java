package problem2;

import java.util.Arrays;

public class IntegerList {
    int[] list; //values in the list
    int size;
    int nbElement=0;

    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size) {
        list = new int[size];
    }

    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize() {
        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 100) + 1;
    }

    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print() {
        for (int i = 0; i < list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
//Add the capability of doubling the size
//-------------------------------------------------------
    public void increaseSize() {
        size*=2; //double the size
        //copying the elements to the new list
        int[] newlist= Arrays.copyOf(list,size);
        list=newlist;
    }
    //Add element to the list
//-------------------------------------------------------
    public void addElement(int newVAl) {
        if (nbElement>size) {
            nbElement++;
        list[nbElement]=newVAl;
        }
        else increaseSize();

    }
    //Remove the first occurrence
//-------------------------------------------------------
    public void removeFirst(int newVal){
        for(int i=0;i<nbElement;i++){

            if(list[i]==newVal){
                //make the list contiguous by shift the elements to the left
                for(int j=i;j<nbElement;j++) list[j]=list[j+1];
                list[nbElement-1]=0;
                // decrease the number of elements
                nbElement--;
            }
            break;


        }

    }
    //Remove all occurrences
//-------------------------------------------------------
    public void removeAll(int newVal){
        for(int i=0;i<nbElement;i++){
            if(list[i]==newVal){
                //make the list contiguous by shift the elements to the left
                for(int j=i;j<nbElement;j++) list[j]=list[j+1];
                list[nbElement-1]=0;
                // decrease the number of elements
                nbElement--;
            }
        }
        }
}