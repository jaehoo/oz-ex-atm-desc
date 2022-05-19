
package com.oz.atm.service;


/**
 * <p>Cajero interface.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public interface Cajero {

    /**
     * Retiro de efectivo por la cantidad solicitada
     *
     * @param idCustomer identificador del cliente
     * @param amount importe a retirar
     */
    void retirar(Integer idCustomer, double amount);
    
    /**
     * Transfiere el efectivo a otro Banco
     *
     * @param idCustomer identificador del cliente
     * @param amount importe a transferir
     */
    void transferir(Integer idCustomer, double amount);
    
}
