package com.mycompany.calltomemory;

public class MyPoint {
    private int x;
    private int y;

    MyPoint(int x,int y){
        this.x = x;
        this.y = y;
    }

    int getX(){ 
        return this.x;
    }
    
    void setX(int x){ 
        this.x = x;
    }
    
    int getY() {
        return this.y; 
    }
      
    void setY(int y){ 
        this.y = y;
    }
    
    @Override
    public boolean equals(Object other) {
        if(this == other)
            return true;
        if(other == null)
            return false;
        if(getClass() != other.getClass())
            return false;

        MyPoint test = (MyPoint)other;
        if(this.x == test.getX() && this.y == test.getY())
            return true;
        return false;
    }
}