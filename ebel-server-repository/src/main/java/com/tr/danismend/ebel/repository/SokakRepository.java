package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.Mahalle;
import com.tr.danismend.ebel.domain.Sokak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Repository
public interface SokakRepository extends JpaRepository<Sokak, Long> {

    List<Sokak> findByMahalle_Id(Long mahalleId);
}
