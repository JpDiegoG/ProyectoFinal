package gestortareas;

import Controller.TareasController;
import View.GestorVista;
import Model.GestorTareas1;

public class GestorTareas {

    public static void main(String[] args) {
        // Crear el modelo y la vista
        GestorTareas1 model = new GestorTareas1();
        GestorVista view = new GestorVista();

        // Crear el controlador
        new TareasController(model, view);

        // Mostrar la vista
        view.setVisible(true);
    }
    }
