package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int h = 0;
    private int m = 0;
    private int s = 0;
    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)

    public Time(int hour, int minute, int seconds) {
        this.h = hour;
        this.m = minute;
        this.s = seconds;
    }
    //GETTERS 
    public int geth() {
        return h;
    }
    public int getm() {
        return m;
    }

    public int gets(){
        return s;
    }

    public String info(){

        String result = "";
        if (h < 10) {
            result += "0" + h;
        } else {
            result += h;
        }

        if (m < 10) {
            result += ":0" + m ;
        } else {
            result += ":" + m;
        }

        if (s < 10) {
            result += ":0" + s;
        } else {
            result += ":" + s;
        }

        return result;
    }


    public void tick(){
        s++;
        if(s >= 60){
            s -= 60;
            m++;
            if(m >= 60){
                m -= 60;
                h++;
                if(h >= 24){
                    h -= 24;
                }
            }
        }
    }


    public void add(Time time2){

        this.s += time2.gets();
        this.m += time2.getm();
        this.h += time2.geth();
        while (s >= 60 || m >= 60 || h >= 24) {
        if(s >= 60){
            s -= 60;
            m++;
        }
            if(m >= 60){
                m -= 60;
                h++;
            }
                if(h >= 24){
                    h -= 24;
                }
            
            }
    }
}

