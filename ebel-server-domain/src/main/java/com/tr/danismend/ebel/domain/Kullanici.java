package com.tr.danismend.ebel.domain;

import com.tr.nebula.security.db.domain.User;

import javax.persistence.Entity;

/**
 * Created by Mustafa Erbin on 04/01/2018.
 */
@Entity
public class Kullanici extends User {

    private String email;
    private String tel;
    private String tc;

    public Kullanici(Long userId) {
        super();
        this.setOid(userId);
    }

    public Kullanici() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
}
