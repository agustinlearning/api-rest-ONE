package med.voll.api.controller;

import med.voll.api.bla.Especialidad;

public record DatosRegistroMedico(String nombre, String email, String documento, Especialidad especialidad) {
}
