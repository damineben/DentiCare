package ma.dentalTech.entities.Patient;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.SexeEnum;
import ma.dentalTech.entities.enums.AssuranceEnum;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private BaseEntity baseInfo;

    private Long idPatient;
    private String nom;
    private LocalDate dateDeNaissance;
    private SexeEnum sexe;
    private String adresse;
    private String telephone;
    private AssuranceEnum assurance;
}