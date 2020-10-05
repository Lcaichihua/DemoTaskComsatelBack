package com.DemoTaskComsatel.service;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {

	T save(T t);
	T update(T t);
	T  read(Integer id);
	List<T> list();
	void delete(Integer id);
}

