/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.LaboratorioInterface;
import br.com.virtualrecipe.dominio.Laboratorio;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class LaboratorioBusiness implements LaboratorioInterface {

    @Override
    public Laboratorio cadastrarLaboratorio(Laboratorio laboratorio) {
        BancoDeDados.laboratoriBDFake.add(laboratorio);
        return laboratorio;
        
    }

    @Override
    public Laboratorio buscarLaboratorio(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboratorio> buscarLaboratorioPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboratorio> buscarLaboratorioPorTelefone(Integer telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laboratorio> buscarTodosLaboratorios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
