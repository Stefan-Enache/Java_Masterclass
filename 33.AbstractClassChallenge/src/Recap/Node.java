package Recap;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setNext(ListItem right) {
        this.rightLink = right;
        return this.rightLink;
    }

    @Override
    ListItem setPrevious(ListItem left) {
        this.leftLink = left;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
//            int compare = ((String) item.getValue()).compareTo((String) value);
//            return compare;

            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;
    }
}
