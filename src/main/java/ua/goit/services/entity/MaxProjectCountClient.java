package ua.goit.services.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MaxProjectCountClient {

    private String clientName;
    private Long projectCount;

}
