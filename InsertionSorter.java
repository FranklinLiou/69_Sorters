/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
      int indexAlreadySorted = 1;
      while (indexAlreadySorted < elements.size()) {
        insert1( indexAlreadySorted);
        indexAlreadySorted++;
      }
    }

    // pre-condition: there is a list with a sorted section and an
    // unsorted section.
    // synopsis: take the first element of the unsorted section and
    // compare it to the elements in the sorted section from back
    // to front until it is sorted.
    // post-condition: 
    public void insert1( int alreadyInserted) {
  		String valueToInsert = elements.remove(alreadyInserted);
  		if (valueToInsert.compareTo(elements.get(0)) < 0) {
  			elements.add(0, valueToInsert);
  		}
  		else {
  			int indexToCompare = alreadyInserted - 1;
  			while ( indexToCompare > 0) {
  				if (valueToInsert.compareTo(elements.get(indexToCompare)) < 0) {
  					indexToCompare --;
  				}
  				else {
  					elements.add(indexToCompare + 1, valueToInsert);
            break;
  				}
  			}
  		}
  	}
}
