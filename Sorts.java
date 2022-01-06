public class Sorts{

  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for(int i = 0; i < data.size()-1; i++) {
      for(int j = data.size() - 1; j > i; j--){
        if((int)data.get(j) < (int)data.get(j - 1)) {
          int temp = (int)data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j-1, temp);
        }
      }
    }
  }

  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size()-1; pass >= 0; pass--) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = 0;

      for( int i = 0; i < pass+1; i++ ) {
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
      }
      data.add(pass+1,data.get(maxPos));
      data.remove(maxPos);
      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort

  public static void insertionSortV( ArrayList<Comparable> data )
  {
    shuffle(data);
    for(int x = 0; x < data.size()-1; x++  ) {
      //partition marks first item in unsorted region
      int partition = x;

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for( int i = x+1; i>0; i-- ) {
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) < 0  ) {
          //Comparable o = data.get(i);
          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          data.add(i-1,data.get(i));
          data.remove(i+1);
        }
        else{
          break;
        }
      }
    }
  }//end insertionSortV

}
