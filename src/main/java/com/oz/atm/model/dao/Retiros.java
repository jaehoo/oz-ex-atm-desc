package com.oz.atm.model.dao;

/**
 * <p>Retiros interface.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public interface Retiros {

    /**
     * <p>retirar.</p>
     *
     * @param idCustomer a {@link java.lang.Integer} object.
     * @param amount a double.
     */
    void retirar(Integer idCustomer, double amount);

}
