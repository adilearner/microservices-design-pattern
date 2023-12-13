package com.food.ordering.system.order.service.domain.dto.track;

import com.food.ordering.system.domain.valueObject.OrderStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderResponse {
    @NotNull
    private final UUID orderTrackingId;
    @NotNull
    private final OrderStatus orderStatus;
    //FailureMessage can be null in case there is no failure so not using @NotNull
    private final List<String> failureMessage;
}
