package com.oeruiz.servicios.servicioitem.clientes;

import com.oeruiz.servicios.servicioitem.models.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="servicio-productos")
public interface ProductoClienteRest {

    @GetMapping("/listar")
    public List<Producto> listar();

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id);

}

