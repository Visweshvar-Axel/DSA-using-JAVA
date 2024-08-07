package com.ust.LP1.JAVA_M1;
public class BinaryToDecimal {
    public int BtoD(String b){
        int conv = 1;
        int result = 0;
        for (int i = 1; i <= b.length(); i++){
            if(b.charAt(b.length()-i) == '1')
                result += conv;
            conv *= 2;
        }
        return result;
    }
    public int BtoDAlt$(String b){
        int res = 0;
        for (int i =1; i<=b.length();i++){
            if (b.charAt(b.length()-i)=='1')
                res += Math.pow(2, i-1);
        }
        return res;
    }
    public static void main(String[] args){
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println(binaryToDecimal.BtoD("10110"));
        System.out.println(binaryToDecimal.BtoDAlt$("10110"));
    }
}
