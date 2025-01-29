
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Tarea;
import View.GestorVista;
import Model.GestorTareas1;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TareasController {
    //llamamos a las clase del paquete Model y View
    private GestorTareas1 modelo;
    private GestorVista vista;

    public TareasController(GestorTareas1 modelo, GestorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        // Vincular los botones de la vista con sus eventos
        vista.getBtnAgregar().addActionListener(e -> agregarTarea());
        vista.getBtnCompletar().addActionListener(e -> completarTarea());
        vista.getBtnEliminar().addActionListener(e -> eliminarTarea());
    }

    private void agregarTarea() {
        String nombre = vista.getNombreTarea().getText();
        String descripcion = vista.getDescripcionTarea().getText();

        if (!nombre.isEmpty() && !descripcion.isEmpty()) {
            int nuevoId = modelo.getTareas().size() + 1;
            modelo.agregarTarea(new Tarea(nuevoId, nombre, descripcion));
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(vista, "Llene todos los campos.");
        }
}
    private void completarTarea() {
        int fila = vista.getTablaTareas().getSelectedRow();
        if (fila != -1) {
            int id = (int) vista.getModeloTabla().getValueAt(fila, 0);
            modelo.completarTarea(id);
            actualizarTabla();
        }
    }

    private void eliminarTarea() {
       int fila = vista.getTablaTareas().getSelectedRow();
        if (fila != -1) {
            int id = (int) vista.getModeloTabla().getValueAt(fila, 0);
            modelo.eliminarTarea(id);
            actualizarTabla();
        }
    }

    private void actualizarTabla() {
        
        DefaultTableModel modeloTabla = vista.getModeloTabla();
    modeloTabla.setRowCount(0);

    for (Tarea tarea : modelo.getTareas()) {
        
        modeloTabla.addRow(new Object[]{
            tarea.getId(),
            tarea.getNombre(),
            tarea.getDescripcion(),
            tarea.isCompletada() ? "Completada" : "Pendiente"
            });
        }
    }
}
