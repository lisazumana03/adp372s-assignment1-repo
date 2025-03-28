package za.ac.cput.repository;
// User UserFactoryTest  class
//Author: Bonga Velem (220052379)
//Date: 20 March 2025

public interface IRepository <T, id>{
    T create(T id);
    T read(id id);
    T update(T t);
    void delete(T t);
}
