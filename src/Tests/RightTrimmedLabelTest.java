package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RightTrimmedLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {"   ", "example ", "  example   "};
        RightTrimmedLabel rtl1 = new RightTrimmedLabel(new SimpleLabel(labels[0]));
        RightTrimmedLabel rtl2 = new RightTrimmedLabel(new SimpleLabel(labels[1]));
        RightTrimmedLabel rtl3 = new RightTrimmedLabel(new SimpleLabel(labels[2]));

        assertEquals("", rtl1.getText());
        assertEquals("example", rtl2.getText());
        assertEquals("  example", rtl3.getText());
    }
}
