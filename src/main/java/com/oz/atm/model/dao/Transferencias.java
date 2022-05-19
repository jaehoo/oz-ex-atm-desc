package com.oz.atm.model.dao;

/**
 * <p>Transferencias interface.</p>
 *
 * @author Jaehoo
 * @since 2.0.0
 */
public interface Transferencias {

    /**
     * <p>transferir.</p>
     *
     * @param idCustomer a {@link java.lang.Integer} object.
     * @param amount a double.
     */
    void transferir(Integer idCustomer, double amount);
}
