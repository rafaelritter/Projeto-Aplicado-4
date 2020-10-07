package com.projeto.clinicavet.repository;

import com.projeto.clinicavet.model.Veterinario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {

}
