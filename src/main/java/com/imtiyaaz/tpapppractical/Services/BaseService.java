package com.imtiyaaz.tpapppractical.Services;

/**
 * Created by Ameer on 2017/09/06.
 */
public interface BaseService <E, ID> {
    E save(E id);
    E findById(ID id);
    E update(E id);
    void delete(E id);
}
