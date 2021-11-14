package com.frontend;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

public interface Interfaz {

    // Metodos en una clase interfaz para que las clases Paciente, Empleado, y Odontologo compartan funciones - Inicio
    public void listaPersona(DefaultListModel modelo, JList<String> listaJFrame); // Servira para listar las personas en cada categoria

    public void retirarPersona(JComboBox<String> variableCombo);  // Servira para retirar personas, ya sean pacientes o empleados del programa
    // Servira para retirar personas, ya sean pacientes o empleados del programa

    public void detallesPersona(JComboBox<String> variableCombo, JTextField valor1, JTextField valor2, JTextField valor3, JTextField valor4, JTextField valor5, JTextField valor6, JTextField valor7); // Servira para mostrar en pantalla los detalles de cada persona en el programa
    // Metodos en una clase interfaz para que las clases Paciente, Empleado, y Odontologo compartan funciones - Fin
}
