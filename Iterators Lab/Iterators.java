	package IteratorsLab;
	
	import java.util.ArrayList;
	import java.util.ListIterator;
	import java.util.Random;
	
	public class Iterators<T> {
		
		public static void main(String[] args) {
				ArrayList<Integer> theList = new ArrayList<>();
		       initializeList(theList);
		       displayList(theList);
		       scanAndRemovePairs(theList);
		       displayList(theList);
		}
		
		public static void initializeList(ArrayList<Integer> theList){
		       Random rand = new Random();
		       int minRand=10;
		       int maxRand=99;
		       int rang = maxRand-minRand;
		       for(int i=0;i<40;i++){
		           int randNum = Math.abs(rand.nextInt(rang))+minRand;
		           theList.add(randNum);
		       }
		   }
		public static boolean scanAndRemovePairs(ArrayList<Integer> theList){
		      
		       while(true){
		           ListIterator<Integer> lItr = theList.listIterator();
		           int num1;;
		           int num2;
		           boolean isRemoved = false;
		           while(lItr.hasNext()){
		               num1 = lItr.next();
		               if(!lItr.hasNext()){
		                   break;
		               }
		               num2 = lItr.next();
		               if(removable(num1, num2)){
		                   System.out.println("Removed "+num1+" and "+num2);
		                   lItr.remove();
		                   lItr.previous();
		                   lItr.remove();
		                   isRemoved = true;
		                   continue;
		               }
		           }
		           if(!isRemoved){
		               break;
		           }
		       }
		       if(theList.size()==0)
		           return true;
		       return false;
		   }
		   public static boolean removable(Integer x, Integer y){
		       if(x/10 == y/10 || x%10 ==y%10){
		           return true;
		       }
		       return false;
		   }
		   public static void displayList(ArrayList<Integer> theList){
		       ListIterator<Integer> lItr = theList.listIterator();
		       System.out.print("\n ");
		       while(lItr.hasNext()){
		           System.out.print(" "+lItr.next()+" ");
		       }
		       System.out.print(" \n");
		   }
	}
