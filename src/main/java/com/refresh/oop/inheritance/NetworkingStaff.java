package com.refresh.oop.inheritance;

public class NetworkingStaff  implements WhereToWorkI{

    @Override
    public void goToWork(){
        System.out.println("Networking Team: Works in a client site");
    }
}
