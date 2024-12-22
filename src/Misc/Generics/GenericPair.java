package Misc.Generics;

class GenericPair<T, V> {
    T first;
    V second;

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public V getSecond() {
        return second;
    }
}
