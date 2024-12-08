## ¿Qué es un thread?
Un thread (o hilo) es la unidad más pequeña de procesamiento que puede ejecutar un programa. En Java, un programa puede tener varios threads trabajando simultáneamente.

## ¿Por qué usar threads?
Mejorar el rendimiento: Permite que múltiples tareas se ejecuten al mismo tiempo, como leer datos de un archivo mientras se procesan otros.
Mantener la interfaz gráfica responsiva: En aplicaciones con interfaz gráfica, los threads permiten que el programa responda al usuario mientras realiza tareas en segundo plano.
Optimizar recursos: En sistemas con múltiples núcleos, los threads pueden distribuir las tareas entre ellos.
Cómo crear threads en Java

Existen dos formas principales de crear un thread en Java:

1. Extender la clase Thread: Se crea una clase que extiende la clase Thread y se sobrescribe el método run() con el código que se quiere ejecutar en el thread.
2. Implementar la interfaz Runnable: Se crea una clase que implementa la interfaz Runnable y se define el código a ejecutar en el método run(). Este enfoque es preferido si necesitas heredar de otra clase, ya que Java no soporta herencia múltiple.

## Métodos importantes en la clase Thread
- start(): Inicia el thread (invoca el método run() en un nuevo hilo).
- run(): Contiene el código que el thread ejecutará.
- join(): Hace que el thread principal espere hasta que otro thread termine.
- sleep(milliseconds): Pausa el thread por el tiempo especificado.
- isAlive(): Verifica si el thread está en ejecución.

## Consejos al trabajar con threads
- Usa synchronized para evitar problemas de acceso concurrente a recursos compartidos.
- Considera el uso de Executor Framework (de java.util.concurrent) para manejar threads en programas más complejos.
- Evita el uso excesivo de threads, ya que puede provocar sobrecarga en el sistema.
