package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.Tip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Repository
public interface TipRepository extends JpaRepository<Tip, Long> {
}
