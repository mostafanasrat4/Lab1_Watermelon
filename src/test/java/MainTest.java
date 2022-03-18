import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Enumeration;
import java.util.Hashtable;

public class MainTest {

    private Hashtable testcases = new Hashtable();

    @Test
    public void solveTest(){
        Main main = new Main();
        this.testcases.put(64, "YES");          // Large Even Number
        this.testcases.put(10, "YES");          // Small Even Number
        this.testcases.put(91, "NO");           // Large Odd Number
        this.testcases.put(5, "NO");            // Small Odd Number
        this.testcases.put(100, "YES");         // Boundary Even Number
        this.testcases.put(0, "NO");            // Boundary Even Number
        this.testcases.put(4, "YES");           // Boundary Even Number
        this.testcases.put(2, "NO");            // Extreme Even Number
        this.testcases.put(3, "NO");            // Extreme Odd Number

        //Loop through all test cases, and assert each value with the expected output
        for (Enumeration k = testcases.keys(); k.hasMoreElements();){
            int w = (int)k.nextElement();
            String result = (String) testcases.get(w);
            assertEquals(result, main.solve(w));
        }

    }
}