package ss13_search_algorithm.thuchanh;

import static ss13_search_algorithm.thuchanh.BinarySearch.binarySearch;

public class Main {
    public static void main(String[] args) {

        int[] list = new int[0];
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
