package ma.dentalTech.entities.Médecin;

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
public class Médecin {
    private BaseEntity baseInfo;
    private Long idUser;
    private String nom;
    private String email;
    private String login;

    private String spécialité;
    private AgendaMensuel agendaMensuel;
}