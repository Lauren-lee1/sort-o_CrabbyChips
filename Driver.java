import java.util.ArrayList;
@SuppressWarnings("unchecked")

public class Driver{

  public static void main(String[] args){
    //Bubble Sort
        System.out.println( "\nTesting Bubble Sort..." );
	ArrayList bubbleWorst = new ArrayList<Integer>();
	bubbleWorst.add(5);
        bubbleWorst.add(4);
        bubbleWorst.add(3);
        bubbleWorst.add(2);
        bubbleWorst.add(1);
        System.out.println( "\nArrayList bubbleWorst before sorting:\n" + bubbleWorst );
        Sorts.bubbleSort(bubbleWorst);
        System.out.println( "\nArrayList bubbleWorst after sorting:\n" + bubbleWorst );
	System.out.println( "\nSwaps: " + Sorts.bubbleSort(bubbleWorst) );

        ArrayList bubbleBest = new ArrayList<Integer>();
        bubbleBest.add(1);
        bubbleBest.add(2);
        bubbleBest.add(3);
        bubbleBest.add(5);
        bubbleBest.add(4);
        System.out.println( "\nArrayList bubbleBest before sorting:\n" + bubbleBest );
        Sorts.bubbleSort(bubbleBest);
        System.out.println( "\nArrayList bubbleBest after sorting:\n" + bubbleBest );
        System.out.println( "\nSwaps: " + Sorts.bubbleSort(bubbleBest) );
    //Selection Sort
        System.out.println( "\nTesting Selection Sort..." );
        ArrayList selectionWorst = new ArrayList<Integer>();
        selectionWorst.add(5);
        selectionWorst.add(4);
        selectionWorst.add(3);
        selectionWorst.add(2);
        selectionWorst.add(1);
        System.out.println( "\nArrayList selectionWorst before sorting:\n" + selectionWorst );
        Sorts.selectionSort(selectionWorst);
        System.out.println( "\nArrayList selectionWorst after sorting:\n" + selectionWorst );
        System.out.println( "\nSwaps: " + Sorts.selectionSort(selectionWorst) );

        ArrayList selectionBest = new ArrayList<Integer>();
        selectionBest.add(1);
        selectionBest.add(2);
        selectionBest.add(3);
        selectionBest.add(5);
        selectionBest.add(4);
        System.out.println( "\nArrayList selectionBest before sorting:\n" + selectionBest );
        Sorts.selectionSort(selectionBest);
        System.out.println( "\nArrayList selectionBest after sorting:\n" + selectionBest );
        System.out.println( "\nSwaps: " + Sorts.selectionSort(selectionBest) );
    //Insertion Sort
	System.out.println( "\nTesting Insertion Sort..." );
        ArrayList insertionWorst = new ArrayList<Integer>();
        insertionWorst.add(5);
        insertionWorst.add(4);
        insertionWorst.add(3);
        insertionWorst.add(2);
        insertionWorst.add(1);
        System.out.println( "\nArrayList insertionWorst before sorting:\n" + insertionWorst );
        Sorts.bubbleSort(insertionWorst);
        System.out.println( "\nArrayList insertionWorst after sorting:\n" + insertionWorst );
        System.out.println( "\nSwaps: " + Sorts.insertionSort(insertionWorst) );

        ArrayList insertionBest = new ArrayList<Integer>();
        insertionBest.add(1);
        insertionBest.add(2);
        insertionBest.add(3);
        insertionBest.add(5);
        insertionBest.add(4);
        System.out.println( "\nArrayList insertionBest before sorting:\n" + insertionBest );
        Sorts.bubbleSort(insertionBest);
        System.out.println( "\nArrayList insertionBest after sorting:\n" + insertionBest );
        System.out.println( "\nSwaps: " + Sorts.insertionSort(insertionBest) );
  }

}

