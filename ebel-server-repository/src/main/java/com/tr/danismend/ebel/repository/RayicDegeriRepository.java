package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.RayicDegeri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@Repository
public interface RayicDegeriRepository extends JpaRepository<RayicDegeri, Long> {
}
