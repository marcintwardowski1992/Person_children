package pl.mtwa.parent_children.model;

public enum AdultOrChildren {

    ADULT('A'),
    CHILD('C');

    AdultOrChildren(char marker) {
        this.marker = marker;
    }

    public char getMarker(){
        return marker;
    }

    private char marker;
}
