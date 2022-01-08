import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Driver{

  public static void main(String[] args){
        Sorts kara = new Sorts();

        //Bubble Sort
        System.out.println( "\nTesting Bubble Sort..." );
        ArrayList bubbleBest = new ArrayList<Integer>();
        bubbleBest.add(1);
        bubbleBest.add(2);
        bubbleBest.add(3);
        bubbleBest.add(4);
        bubbleBest.add(5);
        System.out.println( "\nArrayList bubbleBest before sorting:\n" + bubbleBest );
        kara.bubbleSort(bubbleBest);
        System.out.println("...expecting: 10 comparisons and 0 swaps" );
        System.out.println( "\nArrayList bubbleBest after sorting:\n" + bubbleBest );

        ArrayList bubbleWorst = new ArrayList<Integer>();
        bubbleWorst.add(5);
        bubbleWorst.add(4);
        bubbleWorst.add(3);
        bubbleWorst.add(2);
        bubbleWorst.add(1);
        System.out.println( "\nArrayList bubbleWorst before sorting:\n" + bubbleWorst );
        kara.bubbleSort(bubbleWorst);
        System.out.println("...expecting:10 comparisons and 10 swaps" );
        System.out.println( "\nArrayList bubbleWorst after sorting:\n" + bubbleWorst );

        //Selection Sort
        System.out.println( "\nTesting Selection Sort..." );
        ArrayList selectionBest = new ArrayList<Integer>();
        selectionBest.add(1);
        selectionBest.add(2);
        selectionBest.add(3);
        selectionBest.add(4);
        selectionBest.add(5);
        System.out.println( "\nArrayList selectionBest before sorting:\n" + selectionBest );
        kara.selectionSort(selectionBest);
        System.out.println("...expecting: 10 comparisons and 0 swaps" );
        System.out.println( "\nArrayList selectionBest after sorting:\n" + selectionBest );

        ArrayList selectionWorst = new ArrayList<Integer>();
        selectionWorst.add(5);
        selectionWorst.add(4);
        selectionWorst.add(3);
        selectionWorst.add(2);
        selectionWorst.add(1);
        System.out.println( "\nArrayList selectionWorst before sorting:\n" + selectionWorst );
        kara.selectionSort(selectionWorst);
        System.out.println("...expecting: 10 comparisons and 4 swaps" );
        System.out.println( "\nArrayList selectionWorst after sorting:\n" + selectionWorst );




        //Insertion Sort
	      System.out.println( "\nTesting Insertion Sort..." );
        ArrayList insertionBest = new ArrayList<Integer>();
        insertionBest.add(1);
        insertionBest.add(2);
        insertionBest.add(3);
        insertionBest.add(4);
        insertionBest.add(5);
        System.out.println( "\nArrayList insertionBest before sorting:\n" + insertionBest );
        Sorts.bubbleSort(insertionBest);
        System.out.println("...expecting: 10 comparisons and 0 swaps" );
        System.out.println( "\nArrayList insertionBest after sorting:\n" + insertionBest );


        ArrayList insertionWorst = new ArrayList<Integer>();
        insertionWorst.add(5);
        insertionWorst.add(4);
        insertionWorst.add(3);
        insertionWorst.add(2);
        insertionWorst.add(1);
        System.out.println( "\nArrayList insertionWorst before sorting:\n" + insertionWorst );
        kara.bubbleSort(insertionWorst);
        System.out.println("...expecting: 10 comparisons and 10 swaps" );
        System.out.println( "\nArrayList insertionWorst after sorting:\n" + insertionWorst );



    }
}
