package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.CtvTarifesi;
import com.tr.danismend.ebel.domain.Ilce;
import com.tr.danismend.ebel.domain.Mahalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/15/2018
 */
@Repository
public interface CtvTarifesiRepository extends JpaRepository<CtvTarifesi, Long> {

    List<CtvTarifesi> findByYil(int yil);

}
