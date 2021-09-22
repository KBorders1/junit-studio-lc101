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
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // 2 - check return type for boolean
    @Test
    public void returnTypeOfMethod () {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]"), true);
    }
    // 3 - check return type not null
    @Test
    public void returnTypeNotNull () {
        assertNotNull(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    // 4 - check for double brackets, returns true
    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    // 5 - check for triple brackets, returns true
    @Test
    public void tripleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[a[]a]]"));
    }
    // 6 - check for only open bracket, returns false
    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    // 7 - check for only closed bracket, returns false
    @Test
    public void singleClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    // 8 - check what happens with no brackets, returns true (BONUS: throw error & returns)
    @Test
    public void stringWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("aaaabbbccc"));
    }
    // 9 - properly handles long strings
    // 10 - properly handles empty & null strings
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    // 11 - check for brackets in the right order, returns false (but currently returns true)
    @Test
    public void wrongOrderedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    // 12 - check that other brackets are not considered, returns true
    @Test
    public void onlyConsidersBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }
    // 13 - check multiple imbalanced brackets, returns false

    @Test
    public void multipleImbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[aa["));
    }

}
