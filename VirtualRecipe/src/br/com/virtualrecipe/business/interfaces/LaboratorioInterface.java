/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.business.interfaces;

import br.com.virtualrecipe.dominio.Laboratorio;
import java.util.List;

/**
 *
 * @author melis_000
 */
public interface LaboratorioInterface {
    public Laboratorio cadastrarLaboratorio(Laboratorio laboratorio);
    public List<Laboratorio> buscarLaboratorioPorNome(String nome);
    public List<Laboratorio> buscarLaboratorioPorTelefone(Integer telefone);
    public List<Laboratorio> buscarTodosLaboratorios();
}
