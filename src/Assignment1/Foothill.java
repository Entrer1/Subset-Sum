package Assignment1;

import java.util.ArrayList;

/**
 * Created by Entreri on 4/12/17.
 */
public class Foothill
{

   public static void main(String[] args) throws Exception
   {
      DataSet dataSet=new DataSet();
      ArrayList<Integer> list=dataSet.subsetSum(25);
      for (Integer i:list)
      {
         System.out.println(i);
      }

   }

}



