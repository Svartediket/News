package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import data.SourceDTO;
import data.SourceRepository;

public class NewsSourseUseCases {

    private ArrayList<NewsSource.Builder> listNewsSource;

    public ArrayList<NewsSource.Builder> mapping(SourceRepository obj, String fields){

        listNewsSource = new ArrayList<>();
        int index = 0;
        for (SourceDTO s: obj.getListDTO()){
            listNewsSource.add(new NewsSource.Builder(s.getName(), s.getCategory(),s.getLanguage(),s.getCountry()));
            if(fields.contains("1")){
                listNewsSource.get(index).id(s.getId());
            }
            if(fields.contains("2")){
                listNewsSource.get(index).author(s.getAuthor());
            }
            if(fields.contains("3")){
                listNewsSource.get(index).title(s.getTitle());
            }
            if(fields.contains("4")){
                listNewsSource.get(index).publishedAt(s.getPublishedAt());
            }
            index++;
        }
        return listNewsSource;
    }

    public ArrayList<NewsSource.Builder> sort (ArrayList<NewsSource.Builder> list, String strLanguage){

        list.sort(Comparator.comparingInt(o2 -> o2.getLanguageFromNewsSource().length()));

        if(strLanguage != null){
            if(strLanguage.contains("1")){
                list.removeIf(o -> (!o.getLanguageFromNewsSource().equalsIgnoreCase("rus")));
            }
            if(strLanguage.contains("2")){
                list.removeIf(o -> (!o.getLanguageFromNewsSource().equalsIgnoreCase("en")));
            }
            return list;
        } return list;


    }
}
