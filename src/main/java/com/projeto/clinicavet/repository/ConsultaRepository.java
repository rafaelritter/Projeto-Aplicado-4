package com.projeto.clinicavet.repository;

import com.projeto.clinicavet.model.Consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
