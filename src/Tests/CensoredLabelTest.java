package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CensoredLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {" abc def abcdef", "he ate the bat", "the cat arrived", "he fed the dog"};
        CensoredLabel cl1 = new CensoredLabel(new SimpleLabel(labels[0]), "abc");
        CensoredLabel cl2 = new CensoredLabel(new SimpleLabel(labels[1]), "bat");
        CensoredLabel cl3 = new CensoredLabel(new SimpleLabel(labels[2]), "cat");
        CensoredLabel cl4 = new CensoredLabel(new SimpleLabel(labels[3]), "dog");

        assertEquals(" *** def ***def", cl1.getText());
        assertEquals("he ate the ***", cl2.getText());
        assertEquals("the *** arrived", cl3.getText());
        assertEquals("he fed the ***", cl4.getText());
    }
}
