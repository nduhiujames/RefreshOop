package com.refresh.oop.inheritance;

public class DevStaff implements WhereToWorkI, CodeI{

    @Override
    public void goToWork(){
        System.out.println("DEV Team: Reports to the office");
    }

    @Override
    public void code() {
        System.out.println("Dev staff to code");
    }
}
