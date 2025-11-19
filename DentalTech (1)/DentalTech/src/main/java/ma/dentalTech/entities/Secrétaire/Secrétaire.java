package ma.dentalTech.entities.Secrétaire;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.SexeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Secrétaire {
    private BaseEntity baseInfo;
    private Long idUser;
    private String nom;

    private SexeEnum sexe;
    private String numCNSS;
    private Double commission;
}