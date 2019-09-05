//Пример приложения с использованием Parser
public class App {
    public static void main(String[] args) {
        //Создаем новывй парсер, передаем адрес сайта, с которого будет парсить
        Parser parser = new Parser("https://www.gismeteo.ru/weather-moscow-4368/now/");
        //Загружаем код страницы
        parser.Parse();

        //Получаем нужный нам элемент
        String weatherValue =  parser.GetText("span[class=nowvalue__text_l]");
        //И ещё один
        String weatherDescription = parser.GetText("div[class=now__desc]");

        //Выводим полученную информацию
        System.out.println("Сейчас в Москве: " + weatherValue + ". " + weatherDescription);
    }
}
