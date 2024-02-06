package src.CeluMovil;

public class Operador {

        private String nombre;
        private int cargoFijo;
        private int valorMinutoInternacional;
        private int valorPaqueteDatos;

        public Operador(String nombre, int cargoFijo, int valorMinutoInternacional, int valorPaqueteDatos) {
            this.nombre = nombre;
            this.cargoFijo = cargoFijo;
            this.valorMinutoInternacional = valorMinutoInternacional;
            this.valorPaqueteDatos = valorPaqueteDatos;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCargoFijo() {
            return cargoFijo;
        }

        public int getValorMinutoInternacional() {
            return valorMinutoInternacional;
        }

        public int getValorPaqueteDatos() {
            return valorPaqueteDatos;
        }
    }
