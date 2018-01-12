package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.AsinmaPayiIndirimOrani;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Repository
public interface AsinmaPayiIndirimOraniRepository extends JpaRepository<AsinmaPayiIndirimOrani, Long> {

    List<AsinmaPayiIndirimOrani> findByYapiTur_Id(Long yapiTurId);
}
