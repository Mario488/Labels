package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NormalizedSpaceLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {"   ", "example  ", "  example   "};
        NormalizedSpaceLabel nsl1 = new NormalizedSpaceLabel(new SimpleLabel(labels[0]));
        NormalizedSpaceLabel nsl2 = new NormalizedSpaceLabel(new SimpleLabel(labels[1]));
        NormalizedSpaceLabel nsl3 = new NormalizedSpaceLabel(new SimpleLabel(labels[2]));

        assertEquals(" ", nsl1.getText());
        assertEquals("example ", nsl2.getText());
        assertEquals(" example ", nsl3.getText());
    }

}
