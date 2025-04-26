package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratedLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {" ", "example", "  example", "    example   "};
        DecoratedLabel dl1 = new DecoratedLabel(new SimpleLabel(labels[0]));
        DecoratedLabel dl2 = new DecoratedLabel(new SimpleLabel(labels[1]));
        DecoratedLabel dl3 = new DecoratedLabel(new SimpleLabel(labels[2]));
        DecoratedLabel dl4 = new DecoratedLabel(new SimpleLabel(labels[3]));

        assertEquals("-={   }=-", dl1.getText());
        assertEquals("-={ example }=-", dl2.getText());
        assertEquals("-={   example }=-", dl3.getText());
        assertEquals("-={     example    }=-", dl4.getText());
    }
}
