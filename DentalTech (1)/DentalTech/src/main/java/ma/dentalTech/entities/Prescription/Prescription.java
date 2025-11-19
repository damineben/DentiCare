package ma.dentalTech.entities.Prescription;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.BaseEntity.BaseEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {
    private BaseEntity baseInfo;

    private Long idPr;
    private Integer quantité;
    private String fréquence;
    private Integer duréeEnJours;
}