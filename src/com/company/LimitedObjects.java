package com.company;

//
public class LimitedObjects {
    public static int count;

    public LimitedObjects(){
        count++;
    }

    public static void main(String[] args) throws IllegalAccessException {
        int limit = 5;

        LimitedObjects O1 = new LimitedObjects();
        LimitedObjects O2 = new LimitedObjects();
        LimitedObjects O3 = new LimitedObjects();
        LimitedObjects O4 = new LimitedObjects();
        LimitedObjects O5 = new LimitedObjects();

        System.out.println("Objects under limit :"+ LimitedObjects.count);

        if(count>limit){
            throw new IllegalAccessException();
        }
    }
}
