package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameRepositoryTest {

    @Test
    public void test_findByFirstname_return_Samuel() {
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        int expectedSamuelNames = 2;
        int actualSamuelNames = NameRepository.findByFirstname("Samuel").length;
        assertEquals(expectedSamuelNames, actualSamuelNames);
        // Assert.assertEquals(expectedName,actualName);
        //Assert.assertEquals(expectedName,expectedName);

    }


    @Test
    public void test_findByFirstname_failed() {
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        int expectedSamuelNames = 5;
        int actualSamuelNames = NameRepository.findByFirstname("Samuel").length;
        Assert.assertNotEquals(expectedSamuelNames, actualSamuelNames);
        // Assert.assertEquals(expectedName,actualName);
        //Assert.assertEquals(expectedName,expectedName);

    }


    @Test
    public void testfind() {
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn",
                "Farhad Towfighian"};
        String fullName = "Liljana Ristevska";
        NameRepository.setNames(names);
        String value = NameRepository.find("Liljana Ristevska");
        assertEquals(fullName, value);

    }

    @Test
    public void updateTest() {
        String[] names = {"Mehrdad Javan", "Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn",
                "Farhad Towfighian"};

        NameRepository.setNames(names);
        assertEquals(6, NameRepository.getSize());

        boolean value = NameRepository.update("Nivethitha Jothikumar", "Nivethitha Jayanth");
        assertTrue(value);

        String expectedName = "Nivethitha Jayanth";
        String actualName = NameRepository.find("Nivethitha Jayanth");

        assertEquals(expectedName, actualName);


    }

    @Test
    public void test_findByLastname_return_Okoli() {
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        int expectedOkoliNames = 1;
        int actualOkoliNames = NameRepository.findByLastName("Okoli").length;
        assertEquals(expectedOkoliNames, actualOkoliNames);


    }

    @Test
    public void test_findByLastname_failure() {
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        int expectedOkoliNames = 2;
        int actualOkoliNames = NameRepository.findByLastName("Okoli").length;
        assertNotEquals(expectedOkoliNames, actualOkoliNames);

    }

    public void test_removeTest() {
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        boolean value = NameRepository.remove("Nivethitha Jothikumar");
        assertTrue(value);

        int expectedName = 0;
        int actualName = 0;

        assertEquals(expectedName, actualName);


    }
    @Test
    public void test_Remove_Test(){

        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        boolean expectedOkoliNames = true;
        boolean actualOkoliNames = NameRepository.remove("Veronica Okoli");
        assertEquals(expectedOkoliNames, actualOkoliNames);


    }
    @Test
    public void test_Remove_Test_failure(){

        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        boolean expectedNames = false;
        boolean actualNames = NameRepository.remove("Erik Svensson");
        assertNotEquals(expectedNames, actualNames);


    }



}