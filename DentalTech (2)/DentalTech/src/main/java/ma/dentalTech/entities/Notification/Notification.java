package ma.dentalTech.entities.Notification;

import ma.dentalTech.entities.BaseEntity.BaseEntity;
import ma.dentalTech.entities.enums.NotificationTypeEnum;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import ma.dentalTech.entities.enums.PrioriteEnum;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private BaseEntity baseInfo;

    private Long id;
    private NotificationTypeEnum titre;
    private String message;
    private LocalDate date;
    private LocalTime time;
    private NotificationTypeEnum type;
    private PrioriteEnum priorité;
    private String description;
}