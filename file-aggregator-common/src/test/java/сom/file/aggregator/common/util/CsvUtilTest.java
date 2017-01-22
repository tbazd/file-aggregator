package сom.file.aggregator.common.util;

import com.file.aggregator.common.util.CsvUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * {@link CsvUtil} test.
 */
public class CsvUtilTest {

    private static final String CSV_STRING = "First Name, Last Name, Address, Phone, Age, Tax\n" +
                    "Vasya, Man, Kyiv, 1234-12-34, 20, 23.49\n" +
                    "Bat, Man, Gothem, 3234-12-34, 27, 25.49";

    @Test
    public void multiplyTest() {
        int result = CsvUtil.multiply(3, 4);
        assertEquals(12, result);
    }
}
