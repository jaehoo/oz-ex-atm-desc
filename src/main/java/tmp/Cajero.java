package tmp;

/**
 * Created with IntelliJ IDEA.
 * User: asanchez
 * Date: 20/02/13
 * Time: 10:55
 *
 * @author <a href="jaehoo@gmail.com">Alberto Sánchez</a>
 *         Contact me by:
 *         <ul><li>Twitter: @jaehoox</li><ul>
 */
public interface Cajero {

    void retirar(Integer idCustomer, double amount);
    void transferir(Integer idCustomer, double amount);
}

