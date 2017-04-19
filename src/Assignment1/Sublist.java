package Assignment1;

import java.util.ArrayList;

/**
 * Created by Entreri on 4/17/17.
 */
public class Sublist
{
   private ArrayList<Integer> subsetIndexList;
   private int sum;
   private int targetSum;

   public Sublist(int targetSum){
      subsetIndexList=new ArrayList<Integer>();
      this.targetSum=targetSum;
      this.sum=0;
   }

   public Sublist(Sublist sublist){
      this.subsetIndexList=sublist.getList();
      this.sum=sublist.getSum();
      this.targetSum=sublist.getTargetSum();
   }

   public void copy(Sublist sublist){
      this.subsetIndexList=sublist.getList();
      this.sum=sublist.getSum();
      this.targetSum=sublist.getTargetSum();
   }

   //adds the index of the given number to index array, and updates sum for given subsetlist.
   public void addItem(int number, int index){
      if(sum+number<=targetSum)
      {
         subsetIndexList.add(index);
         sum+=number;
      }
   }
   public int getTargetSum(){
      return this.targetSum;
   }

   public int getSum(){
      return this.sum;
   }

   public ArrayList<Integer> getList(){
      return this.subsetIndexList;
   }

}
