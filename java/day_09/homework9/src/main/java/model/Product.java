package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private int price;
}
