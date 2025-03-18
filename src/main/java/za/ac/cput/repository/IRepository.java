package za.ac.cput.repository;

public interface IRepository <T, id>{
    T create(id id);
    T read(id id);
    T update(T t);
    void delete(T t);
}
