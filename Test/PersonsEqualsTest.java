import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

class WrongPerson extends Person{
    WrongPerson(String name,int age){
        super(name,age);
    }
    @Override
    public boolean equals(Object o) {
        return false;
    }
}

public class PersonsEqualsTest extends Person {

    // Testing Correct Implementation of Equals
    @Test
    public void test_equals_with_two_same_person_consturctor() throws Exception {
        Person p1 = new Person("uday",30);
        Assert.assertTrue(p1.equals(p1));
    }

    @Test
    public void test_equals_with_same_person_data_in_different_constructor() throws Exception {
        Person p1 = new Person("uday",18);
        Person p2 = new Person("uday",18);

        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));
        Assert.assertFalse(p1 == p2);
    }

    @Test
    public void test_equals_with_different_person_data_in_different_constructor() throws Exception {
        Person p1 = new Person("uday",18);
        Person p2 = new Person("kunal",20);

        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p2.equals(p1));
        Assert.assertFalse(p1 == p2);
    }

    @Test
    public void test_equals_with_person_constructor_and_null_reference() throws Exception {
        Person p1 = new Person("uday",18);
        Person p2 = null;

        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p1 == p2);
    }

    // Testing Wrong Implementation of Equals
    @Test
    public void test_equals_with_wrong_implementation_gives_false_for_same_references() throws Exception {
        Person p1 = new WrongPerson("swamiji",31);

        Assert.assertFalse(p1.equals(p1));
    }

    @Test
    public void test_equals_with_wrong_implementation_false_for_two_persons_having_same_data() throws Exception {
        Person p1 = new WrongPerson("swamiji",31);
        Person p2 = new WrongPerson("swamiji",31);

        Assert.assertFalse(p1.equals(p2));
    }
}