import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PhoneBookTest {


    @Test
    public void testAdd() {
        String nameOfCaller0 = "Иванов Иван";
        String numberOfCaller0 = "+79991111111";
        String nameOfCaller1 = "Сидоров Сидр";
        String numberOfCaller1 = "+79992222222";

        //assert
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(nameOfCaller0, numberOfCaller0);
        phoneBook.add(nameOfCaller1, numberOfCaller1);

        //act
        Assertions.assertEquals(phoneBook.collersMap.get(nameOfCaller0), numberOfCaller0);
        Assertions.assertEquals(phoneBook.collersMap.get(nameOfCaller1), numberOfCaller1);
    }

}
