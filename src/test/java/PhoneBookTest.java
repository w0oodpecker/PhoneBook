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


    @Test
    public void findByNumber() {
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
        phoneBook.add(nameOfCaller2, numberOfCaller2);

        //act
        Assertions.assertEquals(nameOfCaller1, phoneBook.findByNumber(numberOfCaller1)); //Поиск абонента по номеру
    }

    @Test
    public void findByName() {
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
        phoneBook.add(nameOfCaller2, numberOfCaller2);

        //act
        Assertions.assertEquals(numberOfCaller1, phoneBook.findByName(nameOfCaller1)); //Поиск абонента по имени
    }


    @Test
    public void printAllNames(){
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
        phoneBook.add(nameOfCaller2, numberOfCaller2);

        String[] patternList = new String[3];
        patternList[0] = nameOfCaller0;
        patternList[1] = nameOfCaller2;
        patternList[2] = nameOfCaller1;

        String[] resultList = phoneBook.printAllNames();

        //act
        Assertions.assertEquals(patternList[0], resultList[0]);
        Assertions.assertEquals(patternList[1], resultList[1]);
        Assertions.assertEquals(patternList[2], resultList[2]);

    }

}
