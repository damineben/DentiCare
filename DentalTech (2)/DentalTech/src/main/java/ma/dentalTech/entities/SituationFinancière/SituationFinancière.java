package ma.dentalTech.entities.SituationFinancière;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.SituationStatutEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SituationFinancière {
    private BaseEntity baseInfo;

    private Long idSF;
    private Double totaleDesActes;
    private Double totalePayé;
    private Double crédit;
    private SituationStatutEnum statut;
    private Boolean enPromo;
}