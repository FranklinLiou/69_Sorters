import java.util.ArrayList;

public class SelectionSorter extends Sorter {

	public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }

    public void mySort() {
    	ArrayList< String> unordered = elements;
    	for (int i = 0; i < unordered.size(); i++) {
            int earliestIndex = champIndex(unordered, i);
            String earliest = unordered.get(earliestIndex);
            unordered.set(earliestIndex, unordered.get(i));
            unordered.set(i, earliest);
        }
        elements = unordered;
    }

    private int champIndex( ArrayList<String> unordered, int startAt) {
        int index = startAt;
        String champ = elements.get(index);
        for (int i = index + 1; i < unordered.size(); i++) {
            if (unordered.get(i).compareTo(champ) < 0) {
            	champ = unordered.get(i);
            	index = i;
            }
        }
        return index;
    }
}