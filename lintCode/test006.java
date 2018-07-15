package lintCode;

import java.util.Arrays;

public class test006 {

    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {1};

        int[] c = mergeSortedArray(a,b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] mergeSortedArray(int[] A, int[] B) {
        int[] c= new int[A.length+ B.length];
        int index1 = 0;
        int index2 = 0;
        int curr =0 ;
        while(index1 < A.length && index2 < B.length ) {
            if(A[index1] < B[index2] ) {
                c[curr] = A[index1];
                index1++;
            }
            else {
                c[curr] = B[index2];
                index2++;
            }
            curr++;
        }

        if (index1 == A.length){
            for (int i = index1+index2; i < c.length; i++) {
                c[i] = B[index2];
                index2++;
            }
        }

        if (index2 == B.length){
            for (int i = index1+index2; i < c.length; i++) {
                c[i] = A[index1];
                index1++;
            }
        }

        return c;
    }
}
