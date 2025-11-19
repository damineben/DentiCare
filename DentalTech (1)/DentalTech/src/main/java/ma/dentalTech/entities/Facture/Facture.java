package ma.dentalTech.entities.Facture;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.FactureStatutEnum;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    private BaseEntity baseInfo;

    private Long idFature;
    private Double totaleFacture;
    private Double totalePayé;
    private Double Reste;
    private FactureStatutEnum statut;
    private LocalDateTime dateFacture;
}