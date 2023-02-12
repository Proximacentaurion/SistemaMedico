# SistemaMedico
Sistema para la administración de las historias médicas y el manejo de citas de sus pacientes
Doctor Ramiro Fernandez:
El doctor Ramiro Fernandez nos contactó porque quiere adquirir un sistema para la administración de las historias médicas y el manejo de citas de sus pacientes. 
Por ello nosotros tenemos la tarea de realizar un sistema:
Que le permita al doctor establecer un horario de disponibilidad por día de la semana. ej (lunes 8am a 5pm, martes 9am a 3 pm ... ) 
Que le permita a el doctor agregar un paciente nuevo 
Que le permita al doctor modificar la información personal del paciente de ser necesario 
Que le permita a los pacientes que están inscritos  agendar citas pero sólo en los horarios disponibles, es decir deben ir saliendo de disponibilidad los horarios que ya han sido tomados.(Hay que definir también cuanto toma cada cita como un estándar para saber qué franja horaria se va ocupando a medida que se van agendando citas)
Que le permita al doctor aceptar o cancelar las citas que se van agendando.(Si el doctor cancela la cita el horario debe volver a pasar a estar disponible)
Que le permita al doctor listar todo el historial médico de un  paciente con todas las interacciones que han tenido.
Por último que le permita eliminar pacientes.

Recuerden aplicar el principio más importante “KISS”!!
Recuerden planear primero a papel y lápiz antes de empezar a generar la solución en código.
Definan:
Cuales son las clases que deben crear
Qué atributos van a tener esas clases
Que endpoints debo habilitar para poder aceptar esas peticiones
Que estructuras de datos me van a permitir a mi almacenar la información
que metodos debo tener
Visualizar el flujo
Por último codificar.

-Aplicar polimorfismo con mínimo dos interfaces y dos clases abstractas
-Prohibido el uso de ciclos FOR, siempre que la intención sea recorrer un arreglo deben usar el api Stream.
-Tener siempre presente los principios Solid
-Aplicar patrones de diseño, identificar al menos 2 en tu código al final a la hora de documentar.
-Añadir documentacion (Readme.md)
-Desarrollar el proyecto bajo una estructura adecuada y por capas (Controller, Service y repository), pueden añadir más capas si consideran necesario.
-Se debe utilizar java y spring boot como framework para construir la api y como gestor de dependencias.
-Mínimo dos controllers
-Se deben utilizar al menos una vez un arrayList, un set y un mapa.

