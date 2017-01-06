package com.bx.java.samples.mapper;

import java.util.List;

/**
 * Created by eduardo on 06/01/17.
 */
public interface Mapper<T,V> {

    T transform(T tClass, V vClass);
    List<T> transformList(List<T> tClass, List<V> vClass);
}
