# Verificación y Validación del Software 2021
GRUPO IWM-42 ``<- Modificar``

## Instrucciones para utilizar este proyecto

* Cada alumno debe crearse un usuario de Github
* Un miembro del grupo debe hacer fork a este proyecto y añadir al repositorio forkeado a sus compañeros de grupo y al profesor como colaboradores.
* Descargar el proyecto utilizando git clone desde el terminal o desde el IDE.
* Seguir las indicaciones del enunciado para añadir las dependencias necesarias para empezar a realizar las pruebas
* Modificar este fichero añadiendo el número de grupo correspondiente y las instrucciones para ejecutar la práctica

### Instrucciones para empezar este proyecto

* Descargar el proyecto utilizando git clone desde el terminal o desde el IDE
* Lo primero hace el click derecho en el proyecto y selecciona Propertie -> Java Build Path -> Order and Export y selecciona el jar de SingleList, en caso de si no esta vamos a Libraries para añadir el jar.
* En vamos a configurar el Maven, Run -> Run Configurations.. -> Maven Build -> New Configurations (Click Derecho en Maven Build), en Name ponesmos el nombre del proyecto, en Base directory seleccionamos el proyecto clonado o descargado y en Goals ponemos el siguiente codigo: install:install-file -Dfile=/Ubicacion del jar -DgroupId=com.singleList -DartifactId=SingleList -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar, dar click a run y tiene que salir Build Succes.
* Despues de hacer todo anterior vamos a dar click derecho en los proyectos -> Maven -> Update Proyect...
* Dar click derecho en el proyecto -> Run As.. -> Maven Install.
* Cuando tiene todo hecho anteriores pasos ya es posibles de empezar el proyecto y los test de caminos estan en carpeta de test.
