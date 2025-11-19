package ma.dentalTech.entities.Antécédents;

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
public class Antécédents {
    private BaseEntity baseInfo;

    private Long idAntécédent;
    private String nom;
    private String catégorie;
    private RisqueEnum niveauDeRisque;
}