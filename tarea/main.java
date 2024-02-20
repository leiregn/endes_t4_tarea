package org.tarea;
    public class main {
        public static void main(String[] args) {
            auto auto1 = new auto("Peugeot", "308");
            auto auto2 = new auto("Seat", "Leon");

            concesionario concesionario1 = new concesionario();

            concesionario1.agregarauto(auto1);
            concesionario1.agregarauto(auto2);

            concesionario1.imprimirautos();
        }
    }

