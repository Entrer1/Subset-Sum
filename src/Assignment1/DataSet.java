package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Entreri on 4/17/17.
 */
public class DataSet
{
   //given data
   private ArrayList<Integer> dataSet = new ArrayList<Integer>();

   public DataSet()
   {
      dataSet.add(2);
      dataSet.add(5);
      dataSet.add(9);
      dataSet.add(12);
      dataSet.add(15);
      dataSet.add(19);
      dataSet.add(22);
      dataSet.add(25);
      dataSet.add(29);
   }


   public ArrayList<Integer> subsetSum(int target)
   {
      //sorting dataSet
      //dataSet.sort(Comparator.comparingInt((iTunesEntry)->iTuenesEntry.getlength))
      Collections.sort(dataSet);
      /*
      //trimming dataset.
      for (int i = 0; i < dataSet.size()-1; i++)
      {
         if (dataSet.get(i) > target)
         {
            dataSet.remove(i);
         }
      }
      */
      //making first sublist of smallest numbers possible
      Sublist sublist = new Sublist(target);
      Sublist bestSublist = new Sublist(sublist);
      int SubsetStartingIterator = 0;
      while (!(bestSublist.getSum() == target)&&(SubsetStartingIterator<dataSet.size()))
      {
         int i = SubsetStartingIterator;
         //fixing editing values in sublist to get total
         while (sublist.getSum() < target && (i<dataSet.size()))
         {
            sublist.addItem(dataSet.get(i), i);
            i++;
         }
         int sumDifference = target - sublist.getSum();
         //iterating through sublist to check the values against dataset
         for (int subListIterator = 0; subListIterator < sublist.getList().size(); subListIterator++)
         {
            int indexToSwap = sublist.getList().get(subListIterator);
            //iterator starting at top of dataset
            for (int dataSetIterator = dataSet.size() - 1; dataSetIterator > -1; dataSetIterator--)
            {
               if (!sublist.getList().contains(dataSetIterator) &&
                       (sumDifference == (dataSet.get(dataSetIterator) - dataSet.get(indexToSwap))))
               {
                  sublist.getList().remove(indexToSwap);
                  sublist.addItem(dataSet.get(dataSetIterator), dataSetIterator);
                  bestSublist.copy(sublist);
               }
            }
         }
         SubsetStartingIterator++;
      }
      ArrayList<Integer> toReturn = new ArrayList<>();
      for (int finalIterator = 0; finalIterator < bestSublist.getList().size(); finalIterator++)
      {
         toReturn.add(dataSet.get(bestSublist.getList().get(finalIterator)));
      }
      return toReturn;
   }
}

