package org.tarea;
import java.util.ArrayList;
/** clase que representa un concesonario
 * la clase concesonarios representa los automoviles disponibles
 * @author leire
 * @version 1.0, 20/02/2024
 */
public class concesionario {
         /**
        * la lista de autos
        * la lista de autos, escrita en diferentes idiomas
          * */

         /**
          * lista de los autos*/
        private ArrayList<auto> autos;

        /**
         * contructor publico de auto
         * arraylist es para tranajar con listas dinamicas
         * new arraylist crera un nuevo objeto vacio*/
        public concesionario() {
            autos = new ArrayList<>();
        }

        /**
         *
        * @param auto auto del concesonario
        */
        /**
         *mantener un registro de los autos disponibles en el concesionario
         */
        public void agregarauto(auto auto) {
            autos.add(auto);
        }

        /**
         * método devuelve una lista de objetos de tipo auto
         * @return autos; Esta línea devuelve la lista de objetos autos*/
        public ArrayList<auto> listarautos() {
            return autos;
        }

    /**
     * metodo imprimirautos
     * el metodo devuleve un auto con del concesonario
     * imprime una representación de cada auto
     */
        public void imprimirautos(){
            for (auto auto: autos){
                System.out.println(auto);
            }
        }
    }

