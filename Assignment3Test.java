//Assignment3-Jain
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
public class Assignment3Test {

    //PASS, covers: compute(), sanitize(), makeUniform(), getMeanValue()
    @Test 
    public void meanTest() {
        String inputLst = "7 9 11 13 15";
        String oper = "1"; 
        assertEquals("The Mean is: 11.0", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: compute(), sanitize(), makeUniform(), getMedianValue(), medianGetMidValue()
    @Test 
    public void medianTest() {
        String inputLst = "7 9 11 13 15";
        String oper = "2";
        assertEquals("The Median is: 11.0", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: compute(), sanitize(), makeUniform(), getModeValue(), getModeList(),  modeGetOrderedMode(), modePopulateMap(). 
    @Test 
    public void modeTest() {
        String inputLst = "7 9 11 13 15";
        String oper = "3";
        assertEquals("The Mode is: 7 9 11 13 15", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: compute(), sanitize(), makeUniform(), getMeanValue(), getStandardDeviation()
    @Test 
    public void standarddeviationTest() {
        String inputLst = "7 9 11 13 15";
        String oper = "4";
        assertEquals("The Standard Deviation is: 2.83", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: compute(), sanitize(), makeUniform(), getMeanValue(), getMedianValue(), mediangetMidValue(), getModeValue(), getModeList(), modePopulateMap(), modeGetOrderedMode(), getStandardDeviation() 
    @Test 
    public void alloperationsTest() {
        String inputLst = "7 9 11 13 15";
        String oper = "5";
        assertEquals( 
        "The Mean is: 11.0\n"+
        "The Median is: 11.0\n"+
        "The Mode is: 7 9 11 13 15\n"+
        "The Standard Deviation is: 2.83", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: compute(), sanitize(), makeUniform(), getModeValue(), getModeList(), modeGetOrderedMode(), modePopulateMap() 
    @Test 
    public void semicolonTest() {
        String inputLst = "7;9;11;13;15";
        String oper = "3";
        assertEquals( 
            "The Mode is: 7 9 11 13 15", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: compute(), sanitize(), makeUniform(), getStandardDeviation(), getMeanValue()
    @Test 
    public void bigNumberTest() {
        String inputLst = "100;200;300;400;500";
        String oper = "4";
        assertEquals( 
            "The Standard Deviation is: 141.42", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: compute(), sanitize(), makeUniform()
    @Test 
    public void quitTest(){
        String inputLst = "7;9;11;13;15";
        String oper = "6";
        assertEquals( 
            "The response is: Good Bye :)", Assignment3.compute(inputLst, oper));
    }
    
    //PASS, covers: compute(), sanitize(), makeUniform()
    @Test 
    public void invalidoperationTest() {
        String inputLst = "7 9 11 13 15";
        String oper = "7";
        assertEquals( 
            "The response is: Invalid option", Assignment3.compute(inputLst, oper));
    }

    //PASS, covers: printHelp()
    @Test
    public void printHelpTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Assignment3.printHelp();
        System.setOut(System.out);
        String expectedHelpMessage = "Java Assignment3\n" +
                " Arguments\n" +
                "\t-ln, --list-of-numbers \n" +
                "\t\tList of numbers to compute statistics with\n" +
                "\t-sm, --statistics-mode \n" +
                "\t\tStatitics to apply to the list of numbers. Options are:\n" +
                "\t\t1. Calculate Mean\n" +
                "\t\t2. Calculate Median\n" +
                "\t\t3. Calculate Mode\n" +
                "\t\t4. Print All Computed Averages\n" +
                " \t-h, --help \n" +
                "\t\tPrints this help message\n" +
                " -im, --interactive-mode \n" +
                "\tTriggers the interactive mode from Assignment 2\n";
        assertEquals(expectedHelpMessage, outputStream.toString());
    }
}
