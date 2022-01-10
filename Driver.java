import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Driver{

  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  public static void main(String[] args){
        Sorts kara = new Sorts();

        //Bubble Sort
        System.out.println( "\nTesting Bubble Sort..." );

        System.out.println("Bubble Sort Control");
        for (int x = 0; x < 10; x++){
          kara.bubbleSort(populate(5,1,5));
        }

        ArrayList bubbleBestS = new ArrayList<Integer>();
        bubbleBestS.add(1);
        bubbleBestS.add(1);
        bubbleBestS.add(1);
        bubbleBestS.add(1);
        bubbleBestS.add(1);
        System.out.println( "\nArrayList bubbleBestS before sorting:\n" + bubbleBestS );
        kara.bubbleSort(bubbleBestS);
        System.out.print("...expecting: 10 comparisons and 0 swaps\n" );
        System.out.println( "ArrayList bubbleBestS after sorting:\n" + bubbleBestS );

        ArrayList bubbleBestA = new ArrayList<Integer>();
        bubbleBestA.add(1);
        bubbleBestA.add(2);
        bubbleBestA.add(3);
        bubbleBestA.add(4);
        bubbleBestA.add(5);
        System.out.println( "\nArrayList bubbleBestA before sorting:\n" + bubbleBestA );
        kara.bubbleSort(bubbleBestA);
        System.out.print("...expecting: 10 comparisons and 0 swaps\n" );
        System.out.println( "ArrayList bubbleBestA after sorting:\n" + bubbleBestA );

        ArrayList bubbleWorst = new ArrayList<Integer>();
        bubbleWorst.add(5);
        bubbleWorst.add(4);
        bubbleWorst.add(3);
        bubbleWorst.add(2);
        bubbleWorst.add(1);
        System.out.println( "\nArrayList bubbleWorst before sorting:\n" + bubbleWorst );
        kara.bubbleSort(bubbleWorst);
        System.out.print("...expecting:10 comparisons and 10 swaps\n" );
        System.out.println( "ArrayList bubbleWorst after sorting:\n" + bubbleWorst );

        System.out.println();
        System.out.println("----------------------------------------------");

        //Selection Sort

        System.out.println("Selection Sort Control");
        for (int x = 0; x < 10; x++){
          kara.selectionSort(populate(5,1,5));
        }

        System.out.println( "\nTesting Selection Sort..." );

        ArrayList selectionSame = new ArrayList<Integer>();
        selectionSame.add(1);
        selectionSame.add(1);
        selectionSame.add(1);
        selectionSame.add(1);
        selectionSame.add(1);
        System.out.println( "\nArrayList selectionSame before sorting:" + selectionSame );
        kara.selectionSort(selectionSame);
        System.out.print("...expecting: 10 comparisons and 0 swaps\n" );
        System.out.println( "ArrayList selectionSame after sorting:\n" + selectionSame );

        ArrayList selectionBestA = new ArrayList<Integer>();
        selectionBestA.add(1);
        selectionBestA.add(2);
        selectionBestA.add(3);
        selectionBestA.add(4);
        selectionBestA.add(5);
        System.out.println( "\nArrayList selectionBestA before sorting:" + selectionBestA );
        kara.selectionSort(selectionBestA);
        System.out.print("...expecting: 10 comparisons and 0 swaps\n" );
        System.out.println( "ArrayList selectionBestA after sorting:\n" + selectionBestA );

        ArrayList selectionWorst = new ArrayList<Integer>();
        selectionWorst.add(5);
        selectionWorst.add(4);
        selectionWorst.add(3);
        selectionWorst.add(2);
        selectionWorst.add(1);
        System.out.println( "\nArrayList selectionWorst before sorting:\n" + selectionWorst );
        kara.selectionSort(selectionWorst);
        System.out.print("...expecting: 10 comparisons and 4 swaps\n" );
        System.out.println( "ArrayList selectionWorst after sorting:\n" + selectionWorst );

        System.out.println();
        System.out.println("----------------------------------------------");

        //Insertion Sort

        System.out.println("Insertion Sort Control");
        for (int x = 0; x < 10; x++){
          kara.insertionSort(populate(5,1,5));
        }

	      System.out.println( "\nTesting Insertion Sort..." );

        ArrayList insertionBestS = new ArrayList<Integer>();
        insertionBestS.add(1);
        insertionBestS.add(1);
        insertionBestS.add(1);
        insertionBestS.add(1);
        insertionBestS.add(1);
        System.out.println( "\nArrayList insertionBestS before sorting:\n" + insertionBestS );
        Sorts.bubbleSort(insertionBestS);
        System.out.print("...expecting: 10 comparisons and 0 swaps\n" );
        System.out.println( "ArrayList insertionBestS after sorting:\n" + insertionBestS );

        ArrayList insertionBestA = new ArrayList<Integer>();
        insertionBestA.add(1);
        insertionBestA.add(2);
        insertionBestA.add(3);
        insertionBestA.add(4);
        insertionBestA.add(5);
        System.out.println( "\nArrayList insertionBestA before sorting:\n" + insertionBestA );
        Sorts.bubbleSort(insertionBestA);
        System.out.print("...expecting: 10 comparisons and 0 swaps\n" );
        System.out.println( "ArrayList insertionBestA after sorting:\n" + insertionBestA );

        ArrayList insertionWorst = new ArrayList<Integer>();
        insertionWorst.add(5);
        insertionWorst.add(4);
        insertionWorst.add(3);
        insertionWorst.add(2);
        insertionWorst.add(1);
        System.out.println( "\nArrayList insertionWorst before sorting:\n" + insertionWorst );
        kara.bubbleSort(insertionWorst);
        System.out.print("...expecting: 10 comparisons and 10 swaps\n" );
        System.out.println( "ArrayList insertionWorst after sorting:\n" + insertionWorst );
    }
}
