import junit.framework.Assert;
import org.junit.Test;

public class PersonsHashCodeTest {
    // Person With correct implementation of hashCode
    @Test
    public void test_hashCode_of_two__persons_with_same_data_is_same() throws Exception {
        Person p1 = new Person("swamiji",32);
        Person p2 = new Person("swamiji",32);

        int hash1 = p1.hashCode();
        int hash2 = p2.hashCode();

        Assert.assertTrue(p1.equals(p2));
        Assert.assertEquals(hash1, hash2);
    }

    @Test
    public void test_hashCode_of_same_person_constructor_is_same() throws Exception {
        Person p1 = new Person("swamiji",32);

        int hash1 = p1.hashCode();
        int hash2 = p1.hashCode();

        Assert.assertEquals(hash1, hash2);
    }

    // Person With wrong implementation of hashCode
    @Test
    public void test_hashCode_which_is_wrongly_implemented_of_same_person_is_different() throws Exception {
        Person p1 = new Person("swamiji",32){
            int hashCode;

            @Override
            public int hashCode() {
                hashCode += 4;
                return hashCode;
            }
        };

        int hash1 = p1.hashCode();
        int hash2 = p1.hashCode();

        Assert.assertFalse(hash1 == hash2);
    }
}
