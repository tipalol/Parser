import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    //Адрес сайта, с которого будет вестись парсинг
    private URL url;
    //Документ, с узлами которого ведется работа
    private Document document;
    //Конструкторы
    public Parser(String url) throws MalformedURLException {
        this.url = new URL(url);
    }
    public Parser(URL url) {
        this.url = url;
    }

    //Начать парсинг
    public void Parse() throws IOException {
        document = Jsoup.parse( url, 3000 );
    }
    //Возвращает текущий документ
    public Document GetDocument() {
        return document;
    }
    //Возвращает запрошенные элементы
    public Elements GetElements(String queryString) {
        return document.select(queryString);
    }
    //Возвращает запрошенный элемент, или, если таких элементов несколько
    //возвращает первый найденный
    public Element GetElement(String queryString) {
        return document.selectFirst(queryString);
    }
}
