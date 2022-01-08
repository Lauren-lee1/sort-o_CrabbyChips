import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Sorts{

  static int bubbleSwap = 0;
  static int selectionSwap = 0;
  static int insertionSwap = 0;

  public static void bubbleSort( ArrayList<Comparable> data )
  {
    int comparisons = 0;
    for(int i = 0; i < data.size()-1; i++) {
      for(int j = data.size() - 1; j > i; j--) {
	      comparisons++;
        if(data.get(j).compareTo(data.get(j - 1)) < 0) {
	        bubbleSwap++;
          int temp = (int)data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j-1, temp);
        }
      }
    }
    System.out.println(bubbleSwap);
  //  int counter = bubbleSwap;
    bubbleSwap = 0;
  //  return counter;
  }

  public static void selectionSort( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int comparisons = 0;
    for(int pass = data.size()-1; pass >= 0; pass--) {
      //System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = 0;
      for( int i = 0; i < pass+1; i++ ) {
	      comparisons++;
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
	        selectionSwap++;
          maxPos = i;
        }
        //System.out.println( "maxPos: " + maxPos );//diag
        //System.out.println( data );//diag
      }
      data.add(pass+1,data.get(maxPos));
      data.remove(maxPos);
      //System.out.println( "after swap: " +  data );//diag
    }
    //int counter = selectionSwap;
    System.out.println(selectionSwap);
    selectionSwap = 0;
    //return counter;
  }//end selectionSort

  public static void insertionSort( ArrayList<Comparable> data )
  {
    int comparisons = 0;
    for(int x = 0; x < data.size()-1; x++  ) {
      //partition marks first item in unsorted region
      int partition = x;
      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );
      //traverse sorted region from right to left
      for( int i = x+1; i>0; i-- ) {
	       comparisons++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) < 0  ) {
          insertionSwap++;
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          data.add(i-1,data.get(i));
          data.remove(i+1);
        }
        else{
          break;
        }
      }
    }
    //int counter = insertionSwap;
    System.out.println(insertionSwap);
    insertionSwap = 0;
    //return counter;
  }//end insertionSortV

}
