package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizedLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {"", "example", "  example"};
        CapitalizedLabel cl1 = new CapitalizedLabel(new SimpleLabel(labels[0]));
        CapitalizedLabel cl2 = new CapitalizedLabel(new SimpleLabel(labels[1]));
        CapitalizedLabel cl3 = new CapitalizedLabel(new SimpleLabel(labels[2]));

        assertEquals("", cl1.getText());
        assertEquals("Example", cl2.getText());
        assertEquals("  example", cl3.getText());
    }
}
