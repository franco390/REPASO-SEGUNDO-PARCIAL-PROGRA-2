package Enum;

public enum TipoActividad {

        AventuraExtrema(0.5), RelajacionYBienestar(0.2);

        private double descuento;

    TipoActividad(double descuento) {
        this.descuento = descuento;
    }
}
