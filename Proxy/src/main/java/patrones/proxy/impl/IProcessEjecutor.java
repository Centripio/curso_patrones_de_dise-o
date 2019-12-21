package patrones.proxy.impl;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public interface IProcessEjecutor {
    public void ejecuteProcess(int idProcess, String user, String password)throws Exception;
}
