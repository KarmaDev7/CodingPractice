package leetcode.backStringCompare;

import java.util.Arrays;

class Solution {
    public boolean backspaceCompare(String S, String T) {
       
        
       char[] chars1 = S.toCharArray();
        char[] char2 = T.toCharArray();

        int alength1 = chars1.length;
        int alenght2 = char2.length;

        int maxLength = alength1 > alenght2 ? alength1 : alenght2;

        char[] stringA = new char[maxLength];
        char[] stringB = new char[maxLength];
        int currentPointerA = 0;
        int currentPointerB = 0;


           for(int i=0; i < maxLength; i++) {
            if(i< alength1){
                char c = chars1[i];
                if (c == '#') {
                    if(currentPointerA != 0)
                        stringA[--currentPointerA] = getaChar();

                }
                else {
                    stringA[currentPointerA++] = c;
                }


            }

            if(i< alenght2){
                char c = char2[i];
                if (c == '#') {
                    if(currentPointerB != 0)
                        stringB[--currentPointerB] = getaChar();

                }
                else {
                    stringB[currentPointerB++] = c;
                }
            }

        }
       return Arrays.equals(stringA,stringB);
           
           


    }

     private static char getaChar() {
        return Character.MIN_VALUE;
    }

       
}