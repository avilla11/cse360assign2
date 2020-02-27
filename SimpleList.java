/**
    * Name: Aurelio Villalobos
    * Class ID: 317
    * Assignment Number: 1
    * Description: This is a class that creates an array and a count variable
    * the class has an add, a remove, a search, a toString and a count method 
    */
import java.util.*;

/**
 * This is the class SimpleList that holds all the methods. It includes the add, remove, search
 * toString and count methods.
 * <p> 
 *
 * @param  list  a private array that will hold 10 integers
 * @param  count a private variable used to keep track of number of times number added or deleted from array
 */
public class SimpleList{
  private int[] list;
  private int count;
  
  /**
   * Class constructor that creates the list array and 
   * initializes the count variable to 0
   * @param list an integer array with the capacity for 10 integers
   * @param count the count variable initialized to 0
   */
  public SimpleList(){
    list = new int[10];
    count = 0;
  }


  /**
   * The add method enables the user to input integers up to the 
   * size of the array and stores them in such a way that it adds the parameters to the list
   * at index 0 and moves the following elements over so there is room. If the array is full,
   * the last element will fall off the list
   * @param list an integer array with the capacity for 10 integers
   * @param count the variable that increments each time a number is added
   * @param number the integer the use wishes to add to the array
   * @param index the starting position of the for loop for the array
   */
  public void add(int number){
      for(int index = 9; index > 0; index--){
          list[index] = list[index-1];
      }
      
      list[0] = number;
      count++;

      
  }

  /**
   * The remove method enables the user to input an integer and if the number entered is in
   * the array, it will be removed and the other elements will be shifted down to where
   * the last element becomes a 0. 
   * @param list an integer array with the capacity for 10 integers
   * @param count the variable that decrements each time a number is deleted
   * @param number the integer the use wishes to remove from the array
   * @param index the starting position of the for loop for the array
   * @param max it holds the max size of the array
   * @rightIndex used for the right index of the array
   */
  public void remove(int number){
	  int max = 10;
      int rightIndex = -1;
      for(int index = 0; index < max; index++){
          if(list[index] == number){
              rightIndex = index;
              count--;
          }
      }
      if(rightIndex != -1){
          for(int index = rightIndex; index < max-1; index++){
              list[index] = list[index+1];
          }
          list[max - 1] = 0;
      }
  }

  /**
   * The search method enables the user to input an integer and search for it 
   * in the array. If it exists, the index of the number will be returned. Otherwise,
   * -1 will be returned to mean that the integer did not exist in the array. 
   * @param list an integer array with the capacity for 10 integers
   * @param index the starting position in the for loop for the array
   * @param number the integer the use wishes to search for in the array
   * @return index returning the index where the number the user wishes to search for is at
   * @return -1 the value returned if the element the user is searching for is not in array
   */
  public int search(int number){
    int index = 0;
      while (index < 10) { 
            if (list[index] == number) { 
                return index; 
            } 
            else { 
                index = index + 1; 
            } 
        } 
        return -1; 

  }

  /**
   * The toString method returns the integer array into a string separated by spaces
   * between each element
   * @param list an integer array with the capacity for 10 integers that will be converted to a string
   * @param count the variable that increments each time a number is added
   * @param number the integer the use wishes to add to the array
   * @param list1 the string holding the list array after Arrays.toString is called on it
   * @param list2 the string holding the list array after commas are replaced with spaces
   * @param list3 the string holding the list array as a string with the left bracket deleted
   * @param list4 the string holding the list array as a string with the right bracket deleted
   * @return the list array returned as a string separated only with spaces between elements 
   */
  public String toString(){
      String list1 = Arrays.toString(list);
      String list2 =list1.replace(",", "");
      String list3 = list2.replace("[", "");
      String list4 = list3.replace("]","");
      return list4;

  }
  
  /**
   * The count method is used to return the number of elements in the array after the 
   * user has performed additions and removals
   * @return the number count is currently at is returned
   */
  public int count(){
      return count;
  }

}