package com.food.ordering.system.dataaccess.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(RestaurantEntityId.class)
@Table(name = "order_restaurant_m_view",schema = "restaurant")
@Entity
public class RestaurantEntityId implements Serializable {
    @Id
    private UUID restaurantId;
    @Id
    private UUID productId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantEntityId that = (RestaurantEntityId) o;
        return restaurantId.equals(that.restaurantId) && productId.equals(that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurantId, productId);
    }
}
