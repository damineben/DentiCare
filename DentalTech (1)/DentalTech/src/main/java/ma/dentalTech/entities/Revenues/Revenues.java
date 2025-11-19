package ma.dentalTech.entities.Revenues;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Revenues {
    private String titre;
    private String description;
    private Double montant;
    private LocalDateTime date;
}