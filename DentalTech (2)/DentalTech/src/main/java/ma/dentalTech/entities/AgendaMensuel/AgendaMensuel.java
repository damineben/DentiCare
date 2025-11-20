package ma.dentalTech.entities.AgendaMensuel;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.MoisEnum;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendaMensuel {
    private BaseEntity baseInfo;

    private MoisEnum mois;
    private List<Object> joursNonDisponible;
}