import junit.framework.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;

public class EqualsTests {
    @Test
    public void test_equals_for_same_literal_strings() throws Exception {
        Assert.assertTrue("uday".equals("uday"));
    }

    @Test
    public void test_equals_for_different_literal_strings() throws Exception {
        Assert.assertFalse("uday".equals("mohit"));
    }

    @Test
    public void test_equals_for_same_string_constructors() throws Exception {
        String uday = new String("uday");

        Assert.assertTrue(uday.equals(uday));
    }

    @Test
    public void test_equals_for_different_string_constructors() throws Exception {
        String mohit = new String("mohit");
        String uday = new String("uday");

        Assert.assertFalse(uday.equals(mohit));
    }

    @Test
    public void test_equals_for_same_string_constructor_and_string_literal() throws Exception {
        String uday = new String("uday");

        Assert.assertTrue(uday.equals("uday"));
    }

    @Test
    public void test_equals_for_different_string_constructor_and_string_literal() throws Exception {
        String mohit = new String("mohit");

        Assert.assertFalse(mohit.equals("uday"));
    }

    @Test
    public void test_equals_for_same_string_literal_and_string_constructor() throws Exception {
        String uday = new String("uday");

        Assert.assertTrue("uday".equals(uday));
    }

    @Test
    public void test_equals_for_different_string_literal_and_string_constructor() throws Exception {
        String mohit = new String("mohit");

        Assert.assertFalse("uday".equals(mohit));
    }

    @Test
    public void test_equals_for_string_literal_and_null() throws Exception {
        Assert.assertFalse("uday".equals(null));
    }

    @Test
    public void test_equals_for_string_constructor_and_null() throws Exception {
        String mohit = new String("mohit");

        Assert.assertFalse(mohit.equals(null));
    }
}
