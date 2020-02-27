
/**
 * Name: Aurelio Villalobos
 * Class ID: 317
 * Assignment Number: 2
 * Description: This is a class that creates an array and a count variable
 * the class has an add, a remove, a search, a toString, a count method, an append
 * a first, a last and a size method.
 */
import java.util.*;

/**
 * This is the class SimpleList that holds all the methods. It includes the add,
 * remove, search toString and count methods.
 * <p>
 *
 * @param list  a private array that will hold 10 integers
 * @param count a private variable used to keep track of number of times number
 *              added or deleted from array
 */
public class SimpleList {
	private int[] list;
	private int count;

	/**
	 * Class constructor that creates the list array and initializes the count
	 * variable to 0
	 *
	 * @param list  an integer array with the capacity for 10 integers
	 * @param count the count variable initialized to 0
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}

	/**
	 * The add method enables the user to input integers up to the size of the array
	 * and stores them in such a way that it adds the parameters to the list at
	 * index 0 and moves the following elements over so there is room. If the array
	 * is full, the last element will fall off the list
	 *
	 * @param list   an integer array with the capacity for 10 integers
	 * @param count  the variable that increments each time a number is added
	 * @param number the integer the use wishes to add to the array
	 * @param index  the starting position of the for loop for the array
	 */
	public void add(int number) {

		if (count == list.length) {
			list = Arrays.copyOf(list, (int) (list.length + list.length / 2));
		}
		for (int index = list.length - 1; index > 0; index--) {
			list[index] = list[index - 1];
		}
		list[0] = number;
		count++;
	}

	/**
	 * The remove method enables the user to input an integer and if the number
	 * entered is in the array, it will be removed and the other elements will be
	 * shifted down to where the last element becomes a 0. if the count is greater
	 * than 1 and if the count is less than .75 then resize the list
	 *
	 * @param number the integer the use wishes to remove from the array
	 */
	public void remove(int number) {
		int max = count;
		int rightIndex = -1;
		for (int index = 0; index < count; index++) {
			if (list[index] == number) {
				rightIndex = index;
			}
		}
		if (rightIndex != -1) {
			for (int index = rightIndex; index < max - 1; index++) {
				list[index] = list[index + 1];
			}
// list[max - 1] = 0;
			count--;
		}
		if (count > 1) {
			if (count / list.length < .75) {
				list = Arrays.copyOf(list, (int) (list.length - list.length * .25));
			}
		}
	}

	/**
	 * The search method enables the user to input an integer and search for it in
	 * the array. If it exists, the index of the number will be returned. Otherwise,
	 * -1 will be returned to mean that the integer did not exist in the array.
	 *
	 * @param number the integer the use wishes to search for in the array
	 * @return index returning the index where the number the user wishes to search
	 *         for is at
	 * @return -1 the value returned if the element the user is searching for is not
	 *         in array
	 */
	public int search(int number) {
		int index = 0;
		while (index < 10) {
			if (list[index] == number) {
				return index;
			} else {
				index = index + 1;
			}
		}
		return -1;

	}

	/**
	 * The toString method returns the integer array into a string separated by
	 * spaces between each element
	 *
	 * @return the list array returned as a string separated only with spaces
	 *         between elements
	 */
	public String toString() {

		String emptyString = "";
		if (count > 0) {
			for (int index = 0; index < count - 1; index++) {
				emptyString = emptyString + String.valueOf(list[index]) + " ";
				emptyString.trim();
			}
		}
		return emptyString;
	}

	/**
	 * The count method is used to return the number of elements in the array after
	 * the user has performed additions and removals
	 *
	 * @return the number count is currently at is returned
	 */
	public int count() {
		return count;
	}

	/**
	 * The append method adds an element to the end of the array. If the count is
	 * equal to the size of the aray it expands by 50 percent to make room
	 */
	public void append(int n) {
		if (count == list.length) {
			list = Arrays.copyOf(list, (int) (list.length + list.length / 2));
		}
		list[count] = n;
		count++;
	}

	/**
	 * The first method returns the first element in the array if the count is
	 * greater than or equal to 1. Else it returns - 1
	 *
	 * @return list[0] if count is greater than 1 else minus one
	 */
	public int first() {
		if (count >= 1) {
			return list[0];
		} else {
			return -1;
		}

	}

	/**
	 * The size method returns the number of elements the array is able to hold
	 *
	 * @return list.length or minus one if empty
	 */
	public int size() {
		return list.length;
	}

	/**
	 * The last method returns the last element of the array if count is greater
	 * than 1
	 *
	 * @return the last element of the array if count is greater than 1. Else return
	 *         minus one
	 */
	public int last() {
		if (count >= 1) {
			return (list[count - 1]);
		} else {
			return -1;
		}

	}

}