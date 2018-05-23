/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.business.interfaces.FarmaceuticoInterface;
import br.com.virtualrecipe.dominio.Farmaceutico;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class FarmaceuticoBusiness implements FarmaceuticoInterface{

    @Override
    public Farmaceutico cadastrarFarmaceutico(Farmaceutico farmaceutico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Farmaceutico buscarFarmaceutico(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Farmaceutico> buscarFarmaceuticoPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Farmaceutico> buscarTodosFarmaceuticos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
