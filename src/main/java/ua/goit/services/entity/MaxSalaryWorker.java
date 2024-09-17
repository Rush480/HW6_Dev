package ua.goit.services.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class MaxSalaryWorker {

    private String workerName;
    private int salary;
}
