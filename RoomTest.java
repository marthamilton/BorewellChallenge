//Martha Chittenden-Milton
import java.io.*;
import java.util.*;
import java.math.*;
import java.math.*;


public class RoomTest {

    private static void runTest(double l, double w, double h, BigDecimal expectedA, BigDecimal expectedV, BigDecimal expectedP){
        Room r = new Room();
        r.Room(l,w,h);
        BigDecimal areaval = r.area();
        BigDecimal volumeval = r.volume();
        BigDecimal paintval = r.paint();

        if(areaval.equals(expectedA) &&  volumeval.equals(expectedV) && paintval.equals(expectedP)) {
            System.out.println("Passed");
        }
        else {
            if (areaval.equals(expectedA)) {
                System.out.println("Area test Passed");
            } else {
                System.out.println("Area test Failed: expected value =" + expectedA + "actual value = " + areaval);
            }
            if (volumeval.equals(expectedV)) {
                System.out.println("Volume test Passed");
            } else {
                System.out.println("Volume test Failed: expected value =" + expectedV + "actual value = " + volumeval);
            }
            if (paintval.equals(expectedP)){
                System.out.println("Paint test Passed");
            }else {
                System.out.println("Paint test Failed: expected value =" + expectedP + "actual value = " + paintval);
            }
        }

    }


    public static void main(String[] args){
        //Test 1 - all small positive decimal numbers
        System.out.println("Test 1:");
        runTest(3.21, 2.23, 3.46, new BigDecimal("7.16"), new BigDecimal("24.77"), new BigDecimal("37.64"));

        //Test 2 - all small positive numbers
        System.out.println("Test 2:");
        runTest(4, 5, 7, new BigDecimal("20.00"), new BigDecimal("140.00"), new BigDecimal("126.00"));

        //Test 3 - small numbers with many decimal places
        System.out.println("Test 3:");
        runTest(2.5968449,5.596449,3.405496580, new BigDecimal("14.53"), new BigDecimal("49.49"), new BigDecimal("55.80"));
        }

}