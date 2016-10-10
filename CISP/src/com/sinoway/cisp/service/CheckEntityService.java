package com.sinoway.cisp.service;

import org.springframework.stereotype.Service;

import com.sinoway.cisp.entitys.IdMapper;

@Service
public interface CheckEntityService<T> {
	public String check(IdMapper idMapper, T entity);
}
