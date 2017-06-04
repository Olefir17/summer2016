package impl;

import forpeople.People;

/**
 * Created by Admin on 29.06.2016.
 */
public class DriverBus implements Driver,Transport {

    private People people;
    private String  category;
    private int speed = 90;

    @Override
    public void setCategory(String c) {
        this.category=c;
        people = new People("Victoriya", "Zoyd", 53, null );
    }

    @Override
    public void go(){
        if(people != null ){
            System.out.println("GOOOOOOOOO!");
        }
        else {
            System.out.println("STOP!Don't driver");
        }

    }

    @Override
    public int getSpeed(){
        return this.speed;
    }
}
