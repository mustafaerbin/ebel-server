package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.Parametreler;
import com.tr.danismend.ebel.domain.Tip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Repository
public interface ParametrelerRepository extends JpaRepository<Parametreler, Long> {

    List<Parametreler> findByTip(Tip tip);

    List<Parametreler> findByTip_id(Long id);

}
