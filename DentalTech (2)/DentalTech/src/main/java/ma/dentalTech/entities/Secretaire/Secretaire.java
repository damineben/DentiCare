package ma.dentalTech.entities.Secretaire;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.Staff.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Secretaire extends Staff {
    private BaseEntity baseInfo;

    private String numCNSS;
    private Double commission;
}