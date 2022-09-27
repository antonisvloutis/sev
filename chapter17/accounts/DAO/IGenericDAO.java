package gr.aueb.sev.chapter17.accounts.DAO;

import java.util.Map;

public interface IGenericDAO<T> {
    T insert(Long id, T t);
    void delete(Long id);
    void replace(Long id, T t);
    T get(Long id);
    Map<Long, T> getall();
}
