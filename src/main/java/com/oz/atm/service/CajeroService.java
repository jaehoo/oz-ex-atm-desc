/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oz.atm.service;

import com.oz.atm.model.Retiros;
import com.oz.atm.model.Transferencias;

/**
 *
 * @author jaehoo
 */
public interface CajeroService  {

    /**
     * Retiro de efectivo por la cantidad solicitada
     * @param importe importe a retirar
     */
    void retiro(Double importe);
    
    /**
     * Transfiere el efectivo a otro Banco
     * @param importe importe a transferir
     */
    void transferencia(Double importe);
    
}
