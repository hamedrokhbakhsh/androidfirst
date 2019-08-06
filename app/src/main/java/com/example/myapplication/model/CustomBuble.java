package com.example.myapplication.model;

import android.widget.Toast;

public class CustomBuble {




    private static   int ADD_BUBLE = 10;
    private   int  numBuble;

    /*


            singelton
     */
    private CustomBuble(){

    }


    private static CustomBuble instance ;
    public  static CustomBuble getInstance(){

        if (instance == null){
            instance = new CustomBuble();
        }
        return instance;
    }


    /*
        normal object

     */
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
