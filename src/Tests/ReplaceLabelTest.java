package Tests;

import Labels.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceLabelTest {
    @Test
    public void testGetText(){
        String[] labels = {" abc abcdef", "he ate the bat", "the cat arrived", "he fed the dog"};
        ReplacedLabel rl1 = new ReplacedLabel(new SimpleLabel(labels[0]), "abc", "d");
        ReplacedLabel rl2 = new ReplacedLabel(new SimpleLabel(labels[1]), "bat", "egg");
        ReplacedLabel rl3 = new ReplacedLabel(new SimpleLabel(labels[2]), "cat", "bat");
        ReplacedLabel rl4 = new ReplacedLabel(new SimpleLabel(labels[3]), "dog", "fox");

        assertEquals(" d ddef", rl1.getText());
        assertEquals("he ate the egg", rl2.getText());
        assertEquals("the bat arrived", rl3.getText());
        assertEquals("he fed the fox", rl4.getText());
    }
}
