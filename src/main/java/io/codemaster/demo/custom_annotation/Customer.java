package io.codemaster.custom_annotation;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private String name;

    @CustomValue(value = 5000)
    private int balance;
}
