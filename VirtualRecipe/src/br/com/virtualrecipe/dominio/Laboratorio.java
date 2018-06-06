/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.dominio;

import java.util.Objects;

/**
 *
 * @author melis_000
 */
public class Laboratorio {
   private Integer id;
  private String nomeLaboratorio;
  private Integer telefoneLaboratorio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeLaboratorio() {
        return nomeLaboratorio;
    }

    public void setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }

    public Integer getTelefoneLaboratorio() {
        return telefoneLaboratorio;
    }

    public void setTelefoneLaboratorio(Integer telefoneLaboratorio) {
        this.telefoneLaboratorio = telefoneLaboratorio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nomeLaboratorio);
        hash = 97 * hash + Objects.hashCode(this.telefoneLaboratorio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laboratorio other = (Laboratorio) obj;
        if (!Objects.equals(this.nomeLaboratorio, other.nomeLaboratorio)) {
            return false;
        }
        if (!Objects.equals(this.telefoneLaboratorio, other.telefoneLaboratorio)) {
            return false;
        }
        return true;
    }
  
}
