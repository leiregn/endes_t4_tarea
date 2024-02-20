package org.tarea;
import java.util.ArrayList;
/** clase que representa un automovil
 * la clase auto representa las caracteristacas de un automovil
 * de la marca y el modelo
 * @author leire
 * @version 1.0, 20/02/2024
 */
public class auto {
    /**
     * la marca del coche
     * la marca del coche, escrita en diferentes idiomas*/
        private String marca;

    /**
     * el modelo del coche
     * el modelo del coche, solo podria tener uno
     */
        private String modelo;


        /**
          * @param marca marca del coche
        * @param  modelo modelo del coche
        */

        /**
         * Contructor de marca y modelo
         * */
        public auto(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }
        /**
         * Get devuelve el valor actual
         * del atributo marca del auto
         * */

        public String getMarca() {
            return marca;
        }

        /**
         *Set asigna un nuevo valor al atributo marca del auto*/
        public void setMarca(String marca) {
            this.marca = marca;
        }


        public String getModelo() {
            return modelo;
        }


        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

    /**
     * metodo que convierte la instancia en un String
     * el metodo devuleve un String con toda la informacion necesaria
     * @return un string sobre la marca y modelo*/
        @Override
        public String toString() {
            return "auto [marca=" + marca + ", modelo=" + modelo + "]";
        }
    }

