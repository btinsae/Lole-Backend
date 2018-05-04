/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.utils;

import java.util.List;

/**
 *
 * @author Birhane
 */
public interface Crud<T> {

    T store(T t);

    T show(int id);

    boolean destroy(T t);

    T update(T t, int id);

    List<T> getAll();
}
