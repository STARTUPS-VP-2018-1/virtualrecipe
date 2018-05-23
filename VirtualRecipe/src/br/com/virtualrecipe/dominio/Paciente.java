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
public class Paciente {
   
    private String nomePaciente;
    private double dataDeNascimento;
    private String genero;
    private Integer cpf;
    private Integer telefone;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public double getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(double dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nomePaciente);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.dataDeNascimento) ^ (Double.doubleToLongBits(this.dataDeNascimento) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.genero);
        hash = 17 * hash + Objects.hashCode(this.cpf);
        hash = 17 * hash + Objects.hashCode(this.telefone);
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
        final Paciente other = (Paciente) obj;
        if (Double.doubleToLongBits(this.dataDeNascimento) != Double.doubleToLongBits(other.dataDeNascimento)) {
            return false;
        }
        if (!Objects.equals(this.nomePaciente, other.nomePaciente)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }
    
}
