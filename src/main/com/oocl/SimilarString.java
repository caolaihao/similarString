package com.oocl;

public class SimilarString {
    boolean isSimilarString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            return isContainRepeatedChar(A);
        } else {
//            char[] a = A.toCharArray();
//            char[] b = B.toCharArray();
//            int count =0;
//            int record = 0;
//            for(int i=0; i<a.length;i++){
//                if(a[i] != b[i]){
//                    count ++;
//                    record+=a[i]-b[i];
//                }
//            }
//            return count == 2 && record == 0;

            int firstDifferentIndex = -1;
            int secondDifferentIndex = -1;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (firstDifferentIndex == -1) {
                        firstDifferentIndex = i;
                    } else if (secondDifferentIndex == -1) {
                        secondDifferentIndex = i;
                    } else {
                        return false;
                    }
                }
            }
            return A.charAt(firstDifferentIndex) == B.charAt(secondDifferentIndex)
                    && A.charAt(secondDifferentIndex) == B.charAt(firstDifferentIndex);
        }
    }

    private boolean isContainRepeatedChar(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.indexOf(str.charAt(i), i + 1) != -1) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] argu){
        System.out.print('A'-'A');
    }
}
