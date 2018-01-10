import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocationTest {
    @Test
    public void Test(){
        Location l = new Location("A,1");
        int x = l.x;
        int y = l.y;
        assertEquals(1, x);
        assertEquals(1, y);
    }
}