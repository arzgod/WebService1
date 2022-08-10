/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ufg.ejemplo.webservices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;

/**
 *
 * @author diego
 */
@WebService(name = "Prueba1")
public class Webserviceholamundo {

    /**
     *
     * @param apodo
     * @return
     */
    @WebMethod(operationName = "test")
    public String test(@WebParam(name = "apodo") String apodo) {
        return "Hello " + apodo + " fecha: " + new Date();
    }

    /**
     *
     * @param val1
     * @param val2
     * @return
     */
    @WebMethod(operationName = "suma")
     public String suma(@WebParam(name = "val1") Double val1, @WebParam(name = "val2") Double val2 ){
         double resultado = val1 + val2;
         return "resultado = " + resultado;
     }

    /**
     *
     * @param val1
     * @param val2
     * @return
     */
    @WebMethod(operationName = "resta")
     public String resta(@WebParam(name = "val1") Double val1, @WebParam(name = "val2") Double val2 ){
         double resultado = val1 - val2;
         return "resultado = " + resultado;
     }

    /**
     *
     * @param val1
     * @param val2
     * @return
     */
    @WebMethod(operationName = "multiplicacion")
     public String multiplicacion(@WebParam(name = "val1") Double val1, @WebParam(name = "val2") Double val2 ){
         double resultado = val1 * val2;
         return "resultado = " + resultado;
     }

    /**
     *
     * @param val1
     * @param val2
     * @return
     */
    @WebMethod(operationName = "division")
     public String division(@WebParam(name = "val1") Double val1, @WebParam(name = "val2") Double val2 ){
         if (val2 == 0){
             return "No se puede dividir entre cero";
         }
         double resultado = val1 / val2;
         return "resultado = " + resultado;
     }

    /**
     *
     * @param gradosFa
     * @return
     */
    @WebMethod(operationName = "FaToC")
     public String fatoc(@WebParam(name = "gradosFa") Double gradosFa){
         double celsius = ((gradosFa - 32) * 5) / 9;
         
         return "Grados Celsius = " + celsius;
     }

    /**
     *
     * @param gradosC
     * @return
     */
    @WebMethod(operationName = "CToF")
     public String ctofa(@WebParam(name = "gradosC") Double gradosC){
         double farenheit = (gradosC * 9/5) + 32;
         
         return "Grados Farenheit = " + farenheit;
     }
}

