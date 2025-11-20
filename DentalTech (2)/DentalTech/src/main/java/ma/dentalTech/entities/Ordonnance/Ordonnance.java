package ma.dentalTech.entities.Ordonnance;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.BaseEntity.BaseEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ordonnance {
    private BaseEntity baseInfo;

    private Long idOrd;
    private LocalDate date;
}