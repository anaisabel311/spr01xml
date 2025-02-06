package es.cursosprhib.mediosdepago.persistencia;

import java.util.Collection;
import java.util.List;

public interface DaoGenerico<T , ID> {

	public default T save(T entidad) {
		return null;
	}
	public default List<T> saveAll(Collection<T> entidades) {
		return null;
	}

	public default long count() {
		return 0;
	}

	public default void delete(T entidad) {
	}
	public default void deleteAll(Collection<T> entidades) {
	}

	public default boolean existsById(ID id) {
		return false;
	}

	public default T findById(ID id) {
		return null;
	}
	
	public default T findByIdEager(ID id) {
		return findById(id);
	};
	
	public default List<T> findAll() {
		return null;
	}
	public default List<T> findAllById(Collection<ID> ids) {
		return null;
	}

	public default List<T> findAllEager(){
		return findAll();
	};
}
