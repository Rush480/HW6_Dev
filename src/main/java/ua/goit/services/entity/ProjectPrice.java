package ua.goit.services.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectPrice {
    private int id;
    private int price;
}
