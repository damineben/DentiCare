package ma.dentalTech.entities.Staff;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.Utilisateur.Utilisateur;

import java.time.LocalDate;

public class Staff extends Utilisateur {
    private BaseEntity baseInfo;

    private double salaire;
    private double prime;
    private LocalDate dateRecrutement;
    private Integer soldeConge;
}
