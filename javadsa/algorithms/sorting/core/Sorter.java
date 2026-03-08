package javadsa.algorithms.sorting.core;

/**
 * A generic contract for sorting implementations.  Classes
 * implementing this interface provide a concrete sorting
 * algorithm for arrays of a comparable type.
 *
 * @param <T> the element type; must implement {@link Comparable}
 */
public interface Sorter<T extends Comparable<T>> 
{
    /**
     * Sorts the supplied array in-place according to the natural
     * ordering of its elements.
     *
     * @param arr the array to sort, must not be {@code null}
     * @throws NullPointerException if {@code arr} is {@code null}
     * @throws ClassCastException if elements in the array are not mutually comparable
     */
    void sort(T[] arr);

    /**
     * Returns a human-readable name for the sorter implementation.
     * The default returns the class' fully qualified name.
     *
     * @return the name of this sorter
     */
    default String getName() {return getClass().getName();}
}
