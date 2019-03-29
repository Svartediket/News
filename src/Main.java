import data.SourceDTO;
import data.SourceRepository;

import java.util.*;

import domain.NewsSource;
import domain.NewsSourseUseCases;

public class Main {

    public static void main(String[] args) {
        SourceRepository obj = new SourceRepository();

        obj.setListDTO((new SourceDTO( null , "Pjmedia.com", null,
                "Live Blog | March 26, 2019 11:33:28 - PJ Media",
                "Mueller report fallout and much, much more.",
                "https://pjmedia.com/blog/liveblogevent/live-blog-215/entry-256668/",
                "https://static.pjmedia.com/user-content/51/files/2019/03/jussie-smollett-mugshot-1.sized-770x415xc.jpg",
                "2019-03-26T15:39:55Z",
                "Media takes serious hit from Mueller conclusions.",
                "sociality", "rus", "ru")));

        obj.setListDTO((new SourceDTO("cnn" , "CNN", "Ariane de Vogue, CNN Supreme Court Reporter",
                "Supreme Court rules against USS Cole victims in Sudan lawsuit - CNN",
                "The Supreme Court on Tuesday ruled against victims and families of the October 2000 attack on the USS Cole in their lawsuit against Sudan.",
                "https://www.cnn.com/2019/03/26/politics/supreme-court-sudan-uss-cole/index.html",
                "https://cdn.cnn.com/cnnnext/dam/assets/120131040132-uss-cole-story-top.jpg",
                "2019-03-26T15:47:27Z", "null", "general",
                "en", "us")));

        obj.setListDTO((new SourceDTO( null , "LiveBlog.com", null,
                "Live Blog NEW | March 26, 2019 11:33:28 - PJ Media",
                "It is description.",
                "https://pjmedia.com/blog/liveblogevent/live-blog-215/entry-256668/",
                "https://static.pjmedia.com/user-content/51/files/2019/03/jussie-smollett-mugshot-1.sized-770x415xc.jpg",
                "2019-01-26T15:39:55Z",
                "Media takes.",
                "sociality", "rus", "ru")));

        System.out.println("Вам будут представлены поля поумолчанию: name, category, language, country." +
                "\nЕсли вы хотите отобразить дополнительные поля (id -1, author - 2, title - 3, publishedAt - 3) введите соответствующее полю, как показано в примере." +
                "\n(При вводе любого другого числа будет предоставлен вывод по умолчанию!)");
        Scanner scannIn = new Scanner(System.in);
        String strsScannField = scannIn.nextLine();
        NewsSourseUseCases news = new NewsSourseUseCases();

        System.out.println("На каком языке предпочитаете читать? " +
                "\n1 - русский;" +
                "\n2 - английский." +
                "(При вводе любого другого числа будут предоставлены новости на всех языках!)");
        scannIn = new Scanner(System.in);
        String strsScannLanguage = scannIn.nextLine();

        ArrayList<NewsSource.Builder> map = news.mapping(obj, strsScannField);
        ArrayList<NewsSource.Builder> sortedList = news.sort(map, strsScannLanguage);

        for(NewsSource.Builder a : sortedList)
           a.getNewsSource().getAllArticles();
    }

}
