package com.refresh.oop.inheritance;

public class QaStaff implements WhereToWorkI, CodeI{

    @Override
    public void goToWork(){
        System.out.println("QA Team: Works from home");
    }

    @Override
    public void code() {
        System.out.println("QA staff to code");
    }
}
