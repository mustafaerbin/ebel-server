package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.Ilce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@Repository
public interface IlceRepository extends JpaRepository<Ilce, Long> {

    Ilce findByKod(int kod);
}
