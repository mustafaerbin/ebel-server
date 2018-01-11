package com.tr.danismend.ebel.repository;

import com.tr.danismend.ebel.domain.Ilce;
import com.tr.danismend.ebel.domain.Mahalle;
import com.tr.danismend.ebel.domain.Parametreler;
import com.tr.danismend.ebel.domain.Tip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Repository
public interface MahalleRepository extends JpaRepository<Mahalle, Long> {

    List<Mahalle> findByIlce(Ilce ilce);

}
