# Gestor de Tareas Personales

Esta es una aplicación de escritorio en Java utilizando el patrón arquitectónico Modelo-Vista-Controlador (MVC) y componentes gráficos de Swing. La aplicación será un gestor de tareas simples que permita al usuario:

- Crear nuevas tareas.
- Listar tareas existentes.
- Marcar tareas como completadas.
- Eliminar tareas.

## Estuctura del Proyecto

El codigo se estructura de la siguiente manera:
Se crean el proyecto y dentro de el se crean 4 paquetes, en los cuales 3 son del patron MVC y el otro contiene la clase main.

#### Model
Clases que manejan los datos:

Tarea.java          // Clase que representa una tarea
GestorTareas1.java    // Clase que gestiona la lista de tareas

#### View:
Clase de la interfaz gráfica:

GestorVista.java     // Ventana principal (JFrameForm)

#### Controller
Clase que gestionan la lógica:

TareasController.java // Controlador que maneja eventos
#### gestortareas
Clase main:

GestorTareas.java    //Clase principal que ejecuta la aplicación

## Como Ejecutar el Codigo

1. Abrir NetBeans y cargar el proyecto (GestorTareas).
2. Ejecutar GestorTareas.java desde el IDE.
3. Interfaz gráfica (Swing) se abrirá automáticamente y permitirá agregar, ver, completar y eliminar tareas.

## Funcionalidades Agregadas
✅ Agregar tareas:

- Permite ingresar nombre y descripción de una tarea.
- Se agrega a la tabla automáticamente.

✅ Listar tareas:

- Todas las tareas se muestran en una tabla (JTable).

✅ Marcar tarea como completada:

- Botón "Completar Tarea" cambia el estado de "Pendiente" a "Completada".

✅ Alternar estado:

- Botón "Alternar Estado" permite cambiar entre "Pendiente" y "Completada".

✅ Eliminar tareas:

- Permite borrar tareas seleccionadas de la lista.

✅ Persistencia temporal:

- Usa un ArrayList<Tarea> para almacenar los datos mientras el programa está en ejecución.

## Fin
