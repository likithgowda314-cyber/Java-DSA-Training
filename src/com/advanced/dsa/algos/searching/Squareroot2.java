package com.advanced.dsa.algos.searching;

public class Squareroot2 {
    public static void main(String[] args) {
        int target=49;
        int result=Squareroot(target);
        if(result==-1){
            System.out.println(target+" Target not found ");
        }else {
            System.out.println(target+" is square root of: "+result);
        }
    }
    public static int Squareroot(int n){
        int start=0;
        int end =n;
        int ans=-1;
        while(start<=end) {
            int mid =start+(end-start)/2;
            if (mid*mid == n) {
                return mid;
            }
            if (mid*mid< n) {
                start = mid + 1;//move to right
            } else {
                end = mid - 1;//move to left
            }
            ans=mid+1;
        }
        return ans;//if target not found
    }
}
