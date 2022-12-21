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
        String nameOfCaller2 = "Петров Пётр";
        String numberOfCaller2 = "+7999333333";

        //assert
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(nameOfCaller0, numberOfCaller0);
        phoneBook.add(nameOfCaller1, numberOfCaller1);


        //act
        Assertions.assertEquals(numberOfCaller0, phoneBook.callersMap.get(nameOfCaller0)); //Проверка добавления
        Assertions.assertEquals(numberOfCaller1, phoneBook.callersMap.get(nameOfCaller1)); //Проверка добавления
        Assertions.assertEquals(0, phoneBook.add(nameOfCaller1, numberOfCaller1)); //Проверка на дублирование
        Assertions.assertEquals(3, phoneBook.add(nameOfCaller2, numberOfCaller2)); //Проверка на отсутствие дублирования
    }

}
