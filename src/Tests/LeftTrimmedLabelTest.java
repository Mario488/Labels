package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeftTrimmedLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {" ", "example", "  example", "    example   "};
        LeftTrimmedLabel ltl1 = new LeftTrimmedLabel(new SimpleLabel(labels[0]));
        LeftTrimmedLabel ltl2 = new LeftTrimmedLabel(new SimpleLabel(labels[1]));
        LeftTrimmedLabel ltl3 = new LeftTrimmedLabel(new SimpleLabel(labels[2]));
        LeftTrimmedLabel ltl4 = new LeftTrimmedLabel(new SimpleLabel(labels[3]));

        assertEquals("", ltl1.getText());
        assertEquals("example", ltl2.getText());
        assertEquals("example", ltl3.getText());
        assertEquals("example   ", ltl4.getText());
    }

}
