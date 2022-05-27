/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.AlumnoModel;
import pojo.Alumno;

/**
 *
 * @author labdessw04
 */
public class AlumnoController {

    //instanciar al alumno model
    AlumnoModel modelo = new AlumnoModel();

    public void crearAlumno(List<Alumno> lista, Alumno alumno) {

        modelo.crearAlumno(lista, alumno);

    }

    public void eliminarAlumno(List<Alumno> lista, String matricula) {

        modelo.eliminarAlumno(lista, matricula);

    }

    public void actualizarAlumno(List<Alumno> lista, Alumno alumno) {

        modelo.actualizarAlumno(lista, alumno);

    }

    public void mostrarAlumnos(List<Alumno> lista, DefaultTableModel model) {
        modelo.mostrarAlumnos(lista, model);
    }
}
