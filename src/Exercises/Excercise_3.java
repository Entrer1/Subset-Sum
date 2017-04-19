package Exercises;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by Entreri on 4/12/17.
 */
public class Excercise_3<E>
{
   public static void main(String[] args)
   {
      Excercise_3 arrayList=new Excercise_3();
      arrayList.push(5);
      arrayList.push(3);
      arrayList.push(2);
      arrayList.push(90909);
      arrayList.push("hello");
      arrayList.push("second String");
      arrayList.push("derp herp");

   }
      private ArrayList<E> arrayList;

   /*
   write generic stack class
   use ArrayList as underlying data structure
   implement methods push(E x, pop, peek, isEmpty, GetSize
   test your stack with integer objects and iTunesEntryObjects
    */
      public Excercise_3() {
      arrayList = new ArrayList<E>();
   }

   public E pop()
   {
      if (arrayList.size() == 0)
      {
         throw new NoSuchElementException();
      }
      E toReturn = arrayList.get(arrayList.size());
      arrayList.remove(arrayList.size() - 1);
      return toReturn;
   }

   public void push(E element)
   {
      arrayList.add(element);
   }

   public E peek(E element)
   {
      return arrayList.get(arrayList.size() - 1);
   }

   public boolean isEmpty()
   {
      return arrayList.size() == 0;
   }

   public int getSize()
   {
      return arrayList.size();
   }


}
