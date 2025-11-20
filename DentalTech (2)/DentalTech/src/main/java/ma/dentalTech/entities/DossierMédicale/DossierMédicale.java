package ma.dentalTech.entities.DossierMédicale;

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
public class DossierMédicale {
    private BaseEntity baseInfo;

    private Long idDM;
    private LocalDate dateDeCréation;
}