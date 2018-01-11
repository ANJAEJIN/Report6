/**
 * Created by AJJ on 2017/1/10.
 */

public class Location {
    int x;
    int y;

    /*Create an object that stores the coordinate values of (x, y)*/
    public Location() {
        this.x=x;
        this.y=y;
    }

    /*This method converts the input string contents into numeric coordinate values.*/
    public void SetLocation(String s){
        /*Divide the case according to the number of digits in the y coordinate.*/
        if (s.length() == 3) {
            char c_x = s.charAt(0);
            char c_y = s.charAt(2);
            x = (int) c_x;
            x -= 64;
            y = (int) c_y;
            int z = (int) '0';
            y -= z;
        } else if (s.length() == 4) {
            int y1;
            int y2;
            char c_x = s.charAt(0);
            char c_y1 = s.charAt(2);
            char c_y2 = s.charAt(3);
            x = (int) c_x;
            x -= 64;
            y1 = (int) c_y1;
            y2 = (int) c_y2;
            int z = (int) '0';
            y1 -= z;
            y2 -= z;
            y = 10 * y1 + y2;
        } else {
            System.out.println("Please enter location again:");
        }
    }
}