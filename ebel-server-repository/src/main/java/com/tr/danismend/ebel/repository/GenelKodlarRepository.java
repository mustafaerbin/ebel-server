package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.GenelKodlar;
import com.tr.danismend.ebel.domain.Tip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Repository
public interface GenelKodlarRepository extends JpaRepository<GenelKodlar, Long> {
}
