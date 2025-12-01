package ma.dentalTech.entities.DossierMedicale;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.BaseEntity.BaseEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DossierMedicale {
    private BaseEntity baseInfo;

    private Long idDM;
    private LocalDate dateDeCreation;
}