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
public class Farmaceutico {
    private String nomeFarmaceutico;
    private Integer crf;

    public String getNomeFarmaceutico() {
        return nomeFarmaceutico;
    }

    public void setNomeFarmaceutico(String nomeFarmaceutico) {
        this.nomeFarmaceutico = nomeFarmaceutico;
    }

    public Integer getCrf() {
        return crf;
    }

    public void setCrf(Integer crf) {
        this.crf = crf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nomeFarmaceutico);
        hash = 97 * hash + Objects.hashCode(this.crf);
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
        final Farmaceutico other = (Farmaceutico) obj;
        if (!Objects.equals(this.nomeFarmaceutico, other.nomeFarmaceutico)) {
            return false;
        }
        if (!Objects.equals(this.crf, other.crf)) {
            return false;
        }
        return true;
    }
    
}
