package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pojo.Alumno;

public class AlumnoModel {

    public void crearAlumno(List<Alumno> lista, Alumno alumno) {

        lista.add(alumno);

    }

    public void eliminarAlumno(List<Alumno> lista, String matricula) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getMatricula().compareTo(matricula) == 0) {

                lista.remove(i);
                //mostrarDatosTabla();
                break;

            }

        }

    }

    public void actualizarAlumno(List<Alumno> lista, Alumno alumno) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getMatricula().compareTo(alumno.getMatricula()) == 0) {

                lista.set(i, alumno);
                //mostrarDatosTabla();
                break;

            }

        }
    }

    public void mostrarAlumnos(List<Alumno> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[2]; // la dimensión corresponde a las
            //columnas
            fila[0] = lista.get(i).getNombre();
            fila[1] = lista.get(i).getMatricula();

            modelo.addRow(fila);
        }
    }

}
