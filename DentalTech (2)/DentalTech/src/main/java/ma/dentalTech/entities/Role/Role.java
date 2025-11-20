package ma.dentalTech.entities.Role;

import ma.dentalTech.entities.enums.RoleEnum;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Long idRole;
    private RoleEnum libellé;
    private List<String> privilèges;
}