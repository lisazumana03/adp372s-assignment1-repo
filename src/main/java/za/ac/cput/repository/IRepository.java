package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

public interface IRepository <T, ID>{
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
