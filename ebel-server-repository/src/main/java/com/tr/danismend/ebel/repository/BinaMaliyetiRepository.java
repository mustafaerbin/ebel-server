package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.BinaMaliyeti;
import com.tr.danismend.ebel.domain.GenelKodlar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Repository
public interface BinaMaliyetiRepository extends JpaRepository<BinaMaliyeti, Long> {
}
