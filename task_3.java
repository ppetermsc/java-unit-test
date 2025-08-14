import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age; // Инициализация поля age
        this.result = result; // Инициализация поля result
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {17, false},
                {18, true},
                {20, true},
                {21, true},  // Совершеннолетний для стран, где совершеннолетие с 21 года
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age); // Передаем возраст пользователя
        // Сравниваем полученный и ожидаемый результаты
        assertEquals("Ожидаемый результат для возраста " + age, result, isAdult);
    }
}