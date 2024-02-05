@RunWith(Parameterized.class)
  public class CheckIsAdultTest {
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
      	this.age = age;
        this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
  return new Object[][] {
        {19, true},
        {17, false},
        {18, true},
        {21, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Ошибка! ожидаемый результат не совпал с фактическим!",result,isAdult);
  }
}
