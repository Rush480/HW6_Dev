package ua.goit.services.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class YongestOldestWorker {

    private String typeOfAge;
    private String workerName;
    private LocalDate birthDate;
}
