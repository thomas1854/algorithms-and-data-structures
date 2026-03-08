package javadsa.algorithms.sorting.implementation;

import javadsa.algorithms.sorting.core.AbstractSorter;

/**
 * Simple generic insertion sort implementation.  Elements
 * are compared using their natural {@link Comparable}
 * ordering and the array is mutated in-place.
 *
 * @param <T> the element type, must implement {@link Comparable}
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorter<T> {
    /**
     * Sorts the supplied array in-place according to the natural
     * ordering of its elements using the insertion sort algorithm.
     *
     * @param arr the array to sort, must not be {@code null}
     * @throws NullPointerException if {@code arr} is {@code null}
     * @throws ClassCastException if elements in the array are not mutually comparable
     */
    @Override
    public void sort(T[] arr)
    {
        if (arr == null) {
            throw new NullPointerException("Array must not be null");
        }
        
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            T value = arr[i];
            int j = i - 1;
            while (j >= 0 && !less(arr[j], value))
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = value;
        }
    }

    /**
     * Sorts the specified portion of the array using insertion sort.
     * Elements between indices {@code left} and {@code right} (inclusive)
     * are sorted in-place using their natural {@link Comparable} ordering.
     *
     * @param arr the array to be sorted, must not be {@code null}
     * @param left the starting index (inclusive) of the portion to sort
     * @param right the ending index (inclusive) of the portion to sort
     * @throws NullPointerException if {@code arr} is {@code null}
     * @throws IndexOutOfBoundsException if {@code left} or {@code right} are out of bounds
     * @throws ClassCastException if elements in the array are not mutually comparable
     */
    public void sort(T[] arr, int left, int right)
    {
        if (arr == null) {
            throw new NullPointerException("Array must not be null");
        }
        if (left < 0 || right >= arr.length || left > right)
        {
            throw new IndexOutOfBoundsException("Invalid left or right indices");
        }   

        int n = right + 1;
        for (int i = left + 1; i < n; i++)
        {
            T value = arr[i];
            int j = i - 1;
            while (j >= left && !less(arr[j], value))
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = value;
        }
    }
}
