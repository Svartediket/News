package data;

import domain.NewsSource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface NewsMapper {
    @Mapping(target = "name", ignore = true)
    NewsSource sourceDtoToNewsSource (SourceDTO sDTO);
}
