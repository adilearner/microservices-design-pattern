package com.food.ordering.system.order.service.domain.dto.create;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderAddress {
    @NotNull
    @Max(value = 50)
    private  String street;
    @NotNull
    @Max(value = 10)
    private  String postalCode;
    @NotNull
    @Max(value = 50)
    private  String city;
}
