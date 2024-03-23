package com.rst.ms.proyectos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rst.ms.proyectos.domain.ProyectoInvestigacion;

public interface ProyectoRepository extends JpaRepository<ProyectoInvestigacion, Long> {

}
