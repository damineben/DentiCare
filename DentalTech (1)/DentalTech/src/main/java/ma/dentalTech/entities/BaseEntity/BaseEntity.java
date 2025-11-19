package ma.dentalTech.entities.BaseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    private Long idEntite;
    private LocalDate dateCréation;
    private LocalDateTime dateDernièreModification;
    private String modifiéPar;
    private String crééPar;
}