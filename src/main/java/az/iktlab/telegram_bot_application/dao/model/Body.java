package az.iktlab.telegram_bot_application.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Body {

    @JsonProperty("AGRO_SERVICE")
    ArrayList<Object> AGRO_SERVICE;

}
