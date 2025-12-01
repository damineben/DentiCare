package ma.dentalTech.entities.Antecedents;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.RisqueEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Antecedents {
    private BaseEntity baseInfo;

    private Long idAntecedent;
    private String nom;
    private String categorie;
    private RisqueEnum niveauDeRisque;
}