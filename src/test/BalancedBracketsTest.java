package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
@Test
    public void leftBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
}
@Test
    public void rightBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
}
@Test
    public void endOfStringBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Mary had a little lamb []"));
}
@Test
    public void beginningOfStringBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] Mary had a little lamb"));
}
@Test
    public void middleOfStringBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Mary had [a] little lamb"));
}
@Test
    public void doubleBracketsEndBeginningReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] Mary had a little lamb []"));
}
@Test
    public void noClosingBracketsReturnFalse(){
      assertFalse(BalancedBrackets.hasBalancedBrackets("[Mary had a little lamb"));
}
@Test
    public void noOpeningBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Mary had a little lamb]"));
}
@Test
    public void oppositeDirectionBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Mary had a little lamb ]["));
}
@Test
    public void tripleBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Mary] had [a] little [lamb]"));
}
}
