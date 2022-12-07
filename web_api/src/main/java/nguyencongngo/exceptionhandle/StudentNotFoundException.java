/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.exceptionhandle;

/**
 *
 * @author Admin
 */
public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException() {
    }

    public StudentNotFoundException(String string) {
        super(string);
    }

    public StudentNotFoundException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StudentNotFoundException(Throwable thrwbl) {
        super(thrwbl);
    }

    public StudentNotFoundException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
