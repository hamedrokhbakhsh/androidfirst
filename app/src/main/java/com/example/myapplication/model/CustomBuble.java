package com.example.myapplication.model;

public class CustomBuble {


    private static   int ADD_BUBLE = 10;
    private static int  numBuble;

    public int getBuble(){

        return  numBuble;
    }


    public  void addBuble(){


        numBuble += ADD_BUBLE;
        

    }

    public  void mines(){

        numBuble--;
    }
}
