package ma.dentalTech.entities.Consultation;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.ConsultationStatutEnum;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {
    private BaseEntity baseInfo;

    private Long idConsultation;
    private LocalDate Date;
    private ConsultationStatutEnum statut;
    private String observationMedecin;
}