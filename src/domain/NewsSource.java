package domain;

import java.util.Comparator;

public class NewsSource implements Comparator<NewsSource>{
    private String idOuter;
    private String nameOuter;
    private String authorOuter;
    private String titleOuter;
    private String publishedAtOuter;
    private String categoryOuter;
    private String languageOuter;
    private String countryOuter;

    @Override
    public int compare(NewsSource o1, NewsSource o2) {
        System.out.println("222 = " + o1.getLanguage());
        return o1.getLanguage().compareToIgnoreCase(o2.getLanguage());
    }

    public static class Builder implements Comparator<NewsSource.Builder> {

        private NewsSource newsSource = new NewsSource();
        //параметры, котрые видны всегда
        private String name;
        private String category;
        private String language;
        private String country;

        //необязательные параметры
        private String id = "";
        private String author = "";
        private String title = "";
        private String publishedAt = "";

        public Builder(String name, String category, String language, String country) {
            newsSource.nameOuter = name;
            newsSource.categoryOuter = category;
            newsSource.languageOuter = language;
            newsSource.countryOuter = country;
        }

        public Builder id(String id) {
            newsSource.idOuter = id;
            return this;
        }

        public Builder author(String author) {
            newsSource.authorOuter = author;
            return this;
        }

        public Builder title(String title) {
            newsSource.titleOuter = title;
            return this;
        }

        public Builder publishedAt(String publishedAt) {
            newsSource.publishedAtOuter = publishedAt;
            return this;
        }

        public NewsSource getNewsSource() {
            return newsSource;
        }

        public String getLanguageFromNewsSource() {
            return newsSource.getLanguage();
        }

        @Override
        public int compare(NewsSource.Builder o1, NewsSource.Builder o2) {
            System.out.println("222 = " + o1.getLanguageFromNewsSource());
            return o1.getLanguageFromNewsSource().compareToIgnoreCase(o2.getLanguageFromNewsSource());
        }
    }
    public void getAllArticles(){
        System.out.println("id = " + idOuter);
        System.out.println("name = " + nameOuter);
        System.out.println("author = " + authorOuter);
        System.out.println("title = " + titleOuter);
        System.out.println("publishedAt = " + publishedAtOuter);
        System.out.println("category = " + categoryOuter);
        System.out.println("language = " + languageOuter);
        System.out.println("country = " + countryOuter);
    }

    public String getLanguage() {
        return languageOuter;
    }
}
