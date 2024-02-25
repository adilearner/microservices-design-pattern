package com.food.ordering.system.domain.event;

public final class EmptyEvent implements DomainEvent<Void> {

    //Creating Single instance of this class with a global instance constant and make this class final
    public static final EmptyEvent INSTANCE = new EmptyEvent();

    //Creating a private constructor here because this empty event is just a
    // marker class and sharing the same instance among different classes
    private EmptyEvent() {

    }

    @Override
    public void fire() {

    }
}
