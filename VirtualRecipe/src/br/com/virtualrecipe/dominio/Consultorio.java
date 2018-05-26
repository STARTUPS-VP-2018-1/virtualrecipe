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
public class Consultorio {
    private String nomeConsultorio;
    private Integer telefoneConsultorio;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nomeConsultorio);
        hash = 89 * hash + Objects.hashCode(this.telefoneConsultorio);
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
        final Consultorio other = (Consultorio) obj;
        if (!Objects.equals(this.nomeConsultorio, other.nomeConsultorio)) {
            return false;
        }
        if (!Objects.equals(this.telefoneConsultorio, other.telefoneConsultorio)) {
            return false;
        }
        return true;
    }

    public String getNomeConsultorio() {
        return nomeConsultorio;
    }

    public void setNomeConsultorio(String nomeConsultorio) {
        this.nomeConsultorio = nomeConsultorio;
    }

    public Integer getTelefoneConsultorio() {
        return telefoneConsultorio;
    }

    public void setTelefoneConsultorio(Integer telefoneConsultorio) {
        this.telefoneConsultorio = telefoneConsultorio;
    }
    
}