package com.bsavi.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsavi.minhasfinancas.model.entity.Lancamentos;

public interface LancamentoRepository extends JpaRepository<Lancamentos, Long>{

}
