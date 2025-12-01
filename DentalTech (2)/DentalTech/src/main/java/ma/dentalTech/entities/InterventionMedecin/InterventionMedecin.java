package ma.dentalTech.entities.InterventionMedecin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.BaseEntity.BaseEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InterventionMedecin {
    private BaseEntity baseInfo;

    private Long IdIM;
    private Double prixDePatient;
    private Integer numDent;
}