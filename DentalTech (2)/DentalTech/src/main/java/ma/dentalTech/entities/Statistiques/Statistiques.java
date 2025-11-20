package ma.dentalTech.entities.Statistiques;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.StatistiqueCategorieEnum;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Statistiques {
    private BaseEntity baseInfo;

    private Long id;
    private String nom;
    private StatistiqueCategorieEnum catégorie;
    private Double chiffre;
    private LocalDate dateCalcul;
}