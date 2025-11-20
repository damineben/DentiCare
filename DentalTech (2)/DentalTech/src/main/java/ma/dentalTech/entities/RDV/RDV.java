package ma.dentalTech.entities.RDV;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.RDVStatutEnum;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RDV {
    private BaseEntity baseInfo;

    private Long idRDV;
    private LocalDate Date;
    private LocalTime heure;
    private String motif;
    private RDVStatutEnum statut;
    private String noteMedecin;
}