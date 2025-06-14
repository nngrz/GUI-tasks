package exercises.Generics;

public class Inscribed<T, K> {
    private T figure1;
    private K figure2;

    public Inscribed(T figure1, K figure2) {
        this.figure1 = figure1;
        this.figure2 = figure2;
    }

    public T getFigureT() {
        return figure1;
    }

    public K getFigureK() {
        return figure2;
    }

    @Override
    public String toString() {
        return figure1 + " is inscribed in " + figure2;
    }
}
