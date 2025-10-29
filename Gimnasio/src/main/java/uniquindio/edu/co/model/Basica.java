package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Basica extends Membresia{

    public Basica(LocalDate fechaInicio,TipoMembresia tipoMembresia) {
super(tipoMembresia, calcularPrecio(tipoMembresia), fechaInicio, calcularFechaFin(fechaInicio, tipoMembresia));
}

private static double calcularPrecio(TipoMembresia tipoMembresia) {

}

private static LocalDate calcularFechaFin (LocalDate fechaInicio, TipoMembresia tipoMembresia) {

}
}
