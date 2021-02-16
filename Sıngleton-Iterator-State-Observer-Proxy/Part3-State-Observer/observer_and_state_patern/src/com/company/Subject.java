package com.company;

public interface Subject {
    void register_observers( Observer o );
    void remove_observers( Observer o );
    void notify_observers();

}
