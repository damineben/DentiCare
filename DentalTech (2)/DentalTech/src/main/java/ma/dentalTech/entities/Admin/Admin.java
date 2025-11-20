package ma.dentalTech.entities.Admin;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.SexeEnum;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private BaseEntity baseInfo;
    private Long idUser;
    private String nom;
    private String email;
    private String login;
    private String motDePass;
    private SexeEnum sexe;
    private LocalDate dateNaissance;
}