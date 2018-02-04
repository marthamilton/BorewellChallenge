//Martha Chittenden-Milton
import java.math.*;

public class Room {
    //Declaring my room dimensions - encapsualting information by making them private
    private double length;
    private double width;
    private double height;

    //Constructor which is called when an instance of the Room object is created
    public void Room(double l, double w, double h){
        length = l;
        height = h;
        width = w;
    }

    //method area to work out the area of the room using the width and length to 2dp
    public BigDecimal area(){
        return (new BigDecimal(width * length)).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    //method volume to work out the volume of the room using the length, height and width to 2dp
    public BigDecimal volume(){
        return (new BigDecimal(width * length * height)).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    //method paint to work out the surface area needed to be painted in the room using the length, height and width to 2dp
    public BigDecimal paint(){
        return (new BigDecimal((width * height *2) + (length * height *2))).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}