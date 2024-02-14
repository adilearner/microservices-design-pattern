package com.food.ordering.system.order.service.domain.dto.create;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @NotNull
    private  UUID productId;
    @NotNull
    private  Integer quantity;
    @NotNull
    private  BigDecimal price;
    @NotNull
    private  BigDecimal subTotal;

}
