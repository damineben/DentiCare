package ma.dentalTech.entities.CabinetMédicale;

import ma.dentalTech.common.Adresse; // Supposons l'existence d'une classe Adresse
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.BaseEntity.BaseEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CabinetMédicale {
    private BaseEntity baseInfo;

    private Long idCabinet;
    private String nom;
    private String email;
    private String logo;
    private Adresse adresse;
    private String cin;
    private String tel1;
    private String tel2;
    private String siteWeb;
    private String instagram;
    private String facebook;
}