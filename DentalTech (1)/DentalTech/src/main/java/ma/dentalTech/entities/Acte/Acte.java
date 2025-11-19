package ma.dentalTech.entities.Acte;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.BaseEntity.BaseEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Acte {
    private BaseEntity baseInfo;

    private Long idActe;
    private String libellé;
    private String catégorie;
    private Double prixDeBase;
}