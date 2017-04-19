package Exercises;

/**
 * Created by Entreri on 4/12/17.
 */
public class Excercise_1
{
   public static <E extends Comparable<E>> int binarySearch(E[] array, E key)
   {
      int low = 0;
      int high = array.length - 1;
      while (low < high)
      {
         int middle = (high + low / 2);
         if (array[middle].compareTo(key) < 0)
         {
            high = middle;
         }
         else if (array[middle].compareTo(key) > 0)
         {
            low = middle;
         }
         if (array[middle].compareTo(key) == 0)
         {
            return middle;
         }
      }
      return -1;
   }

}
