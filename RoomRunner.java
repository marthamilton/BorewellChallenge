//Martha Chittenden-Milton
import java.io.*;
import java.util.*;
import java.math.*;

public class RoomRunner {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static double valueCheck;
    //method checks that the input dimensions are numbers only and returns null if not a number
    private static java.lang.Double str2Double(String string) {
        try {
            valueCheck = Double.parseDouble(string);
        } catch (Exception e) {
            return null;
        }
        return valueCheck;
    }

    public static void main(String[] args) throws Exception{

        RoomRunner rr = new RoomRunner();

        System.out.println("Please ensure that the dimensions entered are all in metres (m)!");

        System.out.println("Please enter the length of the room: ");
        String stringl = rr.br.readLine();

        System.out.println("Please enter the width of the room: ");
        String stringw = rr.br.readLine();

        System.out.println("Please enter the height of the room: ");
        String stringh = rr.br.readLine();

        if (str2Double(stringl) == null || str2Double(stringw) == null || str2Double(stringh) == null){
            System.out.println("Please enter the dimensions as positive numbers greater than zero with no letters or symbols");
            System.exit(0);
        }
        double l =  str2Double(stringl);
        double w =  str2Double(stringw);
        double h =  str2Double(stringh);


        if (l <= 0 || w <= 0 || h <= 0){
            System.out.println("Please enter the dimensions as positive numbers greater than zero with no letters or symbols");
            System.exit(0);
        }

        Room r = new Room();

        r.Room(l,w,h);

        System.out.println("Area of the floor: " + r.area() + " (2dp)");
        System.out.println("Volume of the room: " + r.volume() + " (2 dp)");
        System.out.println("Surface area that requires paint: " + r.paint() + " (2dp)");


    }


}