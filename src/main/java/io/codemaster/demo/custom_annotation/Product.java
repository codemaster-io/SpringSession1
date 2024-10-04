package io.codemaster.custom_annotation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private String name;

    @CustomValue(minValue = 10)
    private int price;
}
