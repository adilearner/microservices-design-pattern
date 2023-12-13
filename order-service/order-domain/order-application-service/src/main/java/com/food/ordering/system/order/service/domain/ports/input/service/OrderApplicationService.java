package com.food.ordering.system.order.service.domain.ports.input.service;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;
import jakarta.validation.Valid;

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}

// So, I have created three input ports.One is order application service
//that will be used by the client of this application,like the postman calls
//that I will make to initiate an order.The second and third input ports are
//the message listeners for payments and restaurant approvals.
//the domain event listeners are special type of application services,
//and they are triggered by domain events,not by the clients.As you will see
// when we implement the payment in a restaurant services,we will raise domain
// events on those services, and it'll trigger the message listeners here
// in the order service.