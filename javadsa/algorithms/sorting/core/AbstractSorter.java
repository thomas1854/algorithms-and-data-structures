package javadsa.algorithms.sorting.core;

/**
 * A base class that provides common utility methods for
 * sorting algorithm implementations.  Concrete subclasses
 * only need to implement {@link Sorter#sort(Object[])}.
 *
 * @param <T> element type, must implement {@link Comparable}
 */
public abstract class AbstractSorter<T extends Comparable<T>> implements Sorter<T> {
    /**
     * Swap the elements at the two provided indices in the array.
     *
     * @param arr the array containing elements to swap, must not be {@code null}
     * @param i index of first element
     * @param j index of second element
     * @throws NullPointerException if {@code arr} is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code i} or {@code j} are out of bounds
     */
    protected void swap(T[] arr, int i, int j)
    {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Return {@code true} if {@code a} is strictly less than {@code b}
     * according to their natural ordering.
     *
     * @param a first element to compare, must not be {@code null}
     * @param b second element to compare, must not be {@code null}
     * @return {@code true} if {@code a.compareTo(b) < 0}
     * @throws NullPointerException if {@code a} or {@code b} is {@code null}
     * @throws ClassCastException if {@code a} and {@code b} are not mutually comparable
     */
    protected boolean less(T a, T b)
    {
        return a.compareTo(b) < 0;
    }
}
