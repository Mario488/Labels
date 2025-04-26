package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratedLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {" ", "example", "  example", "    example   "};
        DecoratedLabel ltl1 = new DecoratedLabel(new SimpleLabel(labels[0]));
        DecoratedLabel ltl2 = new DecoratedLabel(new SimpleLabel(labels[1]));
        DecoratedLabel ltl3 = new DecoratedLabel(new SimpleLabel(labels[2]));
        DecoratedLabel ltl4 = new DecoratedLabel(new SimpleLabel(labels[3]));

        assertEquals("-={   }=-", ltl1.getText());
        assertEquals("-={ example }=-", ltl2.getText());
        assertEquals("-={   example }=-", ltl3.getText());
        assertEquals("-={     example    }=-", ltl4.getText());
    }
}
