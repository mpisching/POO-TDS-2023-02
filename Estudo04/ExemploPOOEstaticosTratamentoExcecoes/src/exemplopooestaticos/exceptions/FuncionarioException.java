/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exemplopooestaticos.exceptions;

/**
 *
 * @author mpisc
 */
public class FuncionarioException extends Exception{

    /**
     * Creates a new instance of <code>FuncionarioException</code> without
     * detail message.
     */
    public FuncionarioException() {
    }

    /**
     * Constructs an instance of <code>FuncionarioException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FuncionarioException(String msg) {
        super(msg);
    }
}
