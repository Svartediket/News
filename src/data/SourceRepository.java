package data;

import java.util.ArrayList;
import data.SourceDTO;

public class SourceRepository {
    private ArrayList<SourceDTO> listDTO = new ArrayList<>();

    public ArrayList<SourceDTO> getListDTO() {
        return listDTO;
    }

    public void setListDTO(SourceDTO valsDTO) {
        this.listDTO.add(valsDTO);
    }

}
