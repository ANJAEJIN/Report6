/**
 * Created by AJJ on 2017/1/10.
 */

public class Location {
    int x;
    int y;
    public Location(String s) {
        if (s.length() == 3) {

            char c_x = s.charAt(0);
            char c_y = s.charAt(2);
            x = (int) c_x;
            x -= 64;
            y = (int) c_y;
            int z = (int) '0';
            y -= z;
        } else {
            if (s.length() == 4) {
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
        this.x = x;
        this.y = y;
    }
}