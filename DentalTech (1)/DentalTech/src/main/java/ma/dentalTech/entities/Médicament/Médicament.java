package ma.dentalTech.entities.Médicament;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.FormeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Médicament {
    private BaseEntity baseInfo;

    private Long IdMct;
    private String nom;
    private String laboratoire;
    private String type;
    private FormeEnum forme;
    private boolean remboursable;
    private Double prixUnitaire;
    private String Description;
}