package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueObject.OrderStatus;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderResponse {
    @NotNull
    private  UUID orderTrackingId;
    @NotNull
    private  OrderStatus orderStatus;
    @NotNull
    private  String message;
}
