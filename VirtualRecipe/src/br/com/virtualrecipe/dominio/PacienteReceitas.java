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
public class PacienteReceitas {
    private Integer idReceita;

    public Integer getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(Integer idReceita) {
        this.idReceita = idReceita;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idReceita);
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
        final PacienteReceitas other = (PacienteReceitas) obj;
        if (!Objects.equals(this.idReceita, other.idReceita)) {
            return false;
        }
        return true;
    }
    
}
