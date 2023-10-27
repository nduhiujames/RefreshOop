package com.refresh.oop;

import com.refresh.oop.inheritance.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*ItStaff devStaff = new DevStaff();
        devStaff.goToWork();

        ItStaff qaStaff = new QaStaff();
        qaStaff.goToWork();

        ItStaff networkingStaff = new NetworkingStaff();
        networkingStaff.goToWork(); */

        //Poly
        WhereToWorkI dev = new DevStaff();
        WhereToWorkI qa = new QaStaff();
        WhereToWorkI net = new NetworkingStaff();

        CodeI devCoder = new DevStaff();
        CodeI qaCoder = new QaStaff();



        List<WhereToWorkI> staffs = new ArrayList<>();
        staffs.add(new DevStaff());
        staffs.add(new QaStaff());
        staffs.add(new NetworkingStaff());

        for (WhereToWorkI staff : staffs)
            staff.goToWork();

        System.out.println();
        System.out.println();

        List<CodeI> coders = new ArrayList<>();
        coders.add(new DevStaff());
        coders.add(new QaStaff());

        for (CodeI coder : coders)
            coder.code();


    }
}
