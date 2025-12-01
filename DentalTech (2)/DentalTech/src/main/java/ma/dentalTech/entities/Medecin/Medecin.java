package ma.dentalTech.entities.Medecin;

import ma.dentalTech.entities.AgendaMensuel.AgendaMensuel;
import ma.dentalTech.entities.BaseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.Staff.Staff;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Medecin extends Staff {
    private BaseEntity baseInfo;

    private Long idUser;
    private String specialite;
    private AgendaMensuel agendaMensuel;
}