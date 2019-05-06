/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        // your code here, if necessary
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
      int indexAlreadySorted = dweebIndex(elements, 0);
      while (indexAlreadySorted <= elements.size()) {
        insert1(elements, indexAlreadySorted + 1);
        indexAlreadySorted++;
    }

    public void insert1( ArrayList< String>, int alreadyInserted) {
  		String valueToInsert = elements.get(alreadyInserted);
  		if (valueToInsert < elements.get(0)) {
  			elements.add(0, valueToInsert);
  		}
  		else {
  			int indexToCompare = elements.size();
  			while ( indexToCompare > 0) {
  				if (valueToInsert.compareTo(elements[ indexToCompare]) < 0) {
  					indexToCompare --;
  				}
  				else {
  					elements.add(indexToCompare + 1, valueToInsert);
  				}
  			}
  		}
  	}

  	// from hw62 solutions
  	private int dweebIndex( ArrayList< String> list, int startAt) {
          // use the starting element as a first guess
          int dweebAt = startAt;
          String dweeb = elements.get( dweebAt);

          for( int testAt = startAt +1
             ; testAt < elements.size()
             ; testAt++)
              if( elements.get( testAt).compareTo( dweeb) < 0) {
                  // Found a smaller value. Remember it.
                  dweebAt = testAt;
                  dweeb = elements.get( dweebAt);
              }
          return dweebAt;
  	}
}
