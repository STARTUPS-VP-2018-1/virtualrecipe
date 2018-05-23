/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.business.interfaces.ConsultorioInterface;
import br.com.virtualrecipe.dominio.Consultorio;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class ConsultorioBusiness implements ConsultorioInterface {

    @Override
    public Consultorio cadastrarConsultorio(Consultorio consultorio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consultorio buscarConsultorio(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Consultorio> buscarConsultorioPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Consultorio> buscarConsultorioPorTelefone(Integer telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Consultorio> buscarTodosConsultorios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}


