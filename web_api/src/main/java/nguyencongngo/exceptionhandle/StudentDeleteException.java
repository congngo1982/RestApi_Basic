/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.exceptionhandle;

/**
 *
 * @author Admin
 */
public class StudentDeleteException extends RuntimeException {

    public StudentDeleteException() {
    }

    public StudentDeleteException(String string) {
        super(string);
    }

    public StudentDeleteException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StudentDeleteException(Throwable thrwbl) {
        super(thrwbl);
    }

    public StudentDeleteException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
