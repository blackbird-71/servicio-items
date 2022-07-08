package com.oeruiz.servicios.servicioitem.service;

import com.oeruiz.servicios.servicioitem.models.Item;

import java.util.List;

public interface ItemService {
    List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
