package data;

public class SourceDTO {
    private String id;
    private String name;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
    private String category;
    private String language;
    private String country;

    public SourceDTO(String id, String name, String author, String title,
                     String description, String url, String urlToImage,
                     String publishedAt, String content, String category,
                     String language, String country) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
        this.category = category; //?
        this.language = language; //?
        this.country = country; //?
    }

    public void getDTO(){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("author = " + author);
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("url = " + url);
        System.out.println("urlToImage = " + urlToImage);
        System.out.println("publishedAt = " + publishedAt);
        System.out.println("content = " + content);
        System.out.println("category = " + category);
        System.out.println("language = " + language);
        System.out.println("country = " + country);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }
}
