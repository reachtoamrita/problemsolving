package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int count = 0;
        int firstElement;
        int secondElement;
        int thirdElement;
        int finalCount = 0;
        Set<Triplet> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            firstElement = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    if (j < arr.length - 1)
                        j++;
                    else
                        break;
                }
                secondElement = arr[j];
                for (int k = 0; k < arr.length; k++) {
                    if (i == k) {
                        if (k < arr.length - 1)
                            k++;
                        else
                            break;
                    }
                    if (j == k) {
                        if (k < arr.length - 1)
                            k++;
                        else
                            break;
                    }

                    thirdElement = arr[k];
                    System.out.println(firstElement + " " + secondElement + " " + thirdElement);
                    set.add(new Triplet(firstElement, secondElement, thirdElement));
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(set.size());

        for (Triplet triplet: set) {

        }
    }

    static class Triplet {
        private int first;
        private int second;
        private int third;

        public Triplet(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        @Override
        public boolean equals(Object object) {
            Triplet triplet = (Triplet) object;
            return (this.first == triplet.first) && (this.second == triplet.second)
                    && (this.third == triplet.third);
        }

        @Override
        public int hashCode() {
            return (43 + 777);
        }
    }
}
