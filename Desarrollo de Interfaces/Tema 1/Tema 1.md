![[Pasted image 20250918081426.png]]

# TEMA 1 - INTRODUCCIÓN A LAS INTERFACES GRÁFICAS

### Índice de contenidos
[[#1. Interfaces de usuario]]
[[#2. Usabilidad]]
[[#3. Pautas de diseño]]

### Objetivos de aprendizaje
1. Conocer el concepto de interfaz de usuario y sus diferentes tipos.
2. Identificar los factores que influyen en la usabilidad de la interfaz y las formas de evaluarla.
3. Aplicar pautas y recomendaciones en el diseño de los distintos elementos de la interfaz.

---

## Introducción

Cada vez que usamos una aplicación —ya sea para enviar un mensaje, hacer un pedido de comida o trabajar con un programa de gestión en la empresa— nos estamos relacionando con una **interfaz de usuario**. Esa interfaz es la parte visible de la aplicación, aquello con lo que interactuamos, y de su diseño depende que la experiencia sea sencilla, clara y satisfactoria… o todo lo contrario.

En esta unidad vamos a explorar **qué son las interfaces de usuario, qué tipos existen y cómo han evolucionado a lo largo del tiempo**. También veremos qué significa realmente que una aplicación sea **usable**, un concepto que va más allá de la facilidad de uso e incluye aspectos como la eficiencia, la tolerancia a errores o la satisfacción de quien la utiliza.

Por último, aprenderemos a aplicar **pautas de diseño** que nos servirán como guía para construir interfaces que no solo funcionen, sino que resulten útiles, intuitivas y agradables para los usuarios.

La idea central es que el diseño de interfaces no se trata solo de programar botones o ventanas, sino de **pensar en las personas**: sus necesidades, sus contextos y la manera en la que interactúan con la tecnología. Ese enfoque centrado en el usuario será el hilo conductor de toda la unidad.

---

## 1. Interfaces de usuario

Los usuarios de un sistema informático necesitan un medio para interactuar con el sistema, de forma que puedan suministrar información e indicar las tareas que se deben realizar, así como obtener el resultado del procesamiento. La interfaz de usuario engloba todos los elementos utilizados para ese fin.

En este apartado nos centraremos en conceptos generales relacionados con las interfaces de usuario (como el diseño centrado en el usuario) y veremos cómo han ido evolucionando a lo largo del tiempo, influidas en la mayoría de los casos por los avances introducidos por los desarrolladores de sistemas operativos.

---

La interfaz de usuario de un sistema está definida por la forma en que los usuarios interactúan con los componentes de este sistema. Cuando hablamos de sistemas informáticos, podemos distinguir dos tipos de interfaces de usuario:

- **Interfaces hardware**: los componentes físicos que permiten al usuario introducir órdenes y datos al sistema, y obtener los resultados (como el teclado, el ratón o el monitor).
- **Interfaces software**: las aplicaciones utilizadas por los usuarios para llevar a cabo una tarea concreta.

> La **interacción persona-ordenador** (en inglés, Human-Computer Interaction o HCI) es la disciplina científica que se encarga del estudio de las interfaces entre los humanos y los ordenadores en el uso de sistemas interactivos.

En el módulo Desarrollo de Interfaces abordaremos diferentes cuestiones relacionadas con la construcción de interfaces software, así como algunos aspectos relacionados con la implantación de las aplicaciones.

---

### 1.1. Diseño centrado en el usuario (DCU)

Actualmente el diseño de interfaces de usuario se rige por el llamado diseño centrado en el usuario (DCU), una filosofía de diseño en la que **el foco se centra en las características y necesidades de las personas a las que va dirigido un producto o servicio**. Esta corriente surge en contraposición a otras como el diseño centrado en el producto, en la que todo el proceso gira en torno al producto que se desarrolla, y son los usuarios los que deben adaptarse a él.

> El ingeniero americano Donald Norman popularizó el concepto de diseño centrado en el usuario en los años 80 y 90. En el año 1999 se creó la norma ISO 13407, que estandarizaba el proceso de diseño centrado en el usuario para sistemas interactivos. En el año 2010 se revisó y actualizó como ISO 9241-210.

---

El proceso que se asocia al diseño centrado en el usuario se resume en el esquema siguiente:
![[Pasted image 20250918082328.png]]

- **Analizar el contexto de uso**: se investigan todas las características del contexto de uso del producto o servicio, que incluye tanto la tarea a realizar como las particularidades de los usuarios y del entorno de uso.
- **Detallar los requisitos**: teniendo en cuenta el análisis realizado en el paso anterior, se especifican los requisitos que el producto o servicio debe cumplir.
- **Diseñar soluciones**: a continuación, se comenzará con el diseño de posibles soluciones (prototipos) que cumplan los requisitos detallados. Se evolucionará desde un diseño inicial aproximado hasta un diseño completo y detallado.
- **Evaluar con los usuarios**: la evaluación de las soluciones por los usuarios es un punto de vital importancia en el diseño centrado en el usuario, y debe llevarse a cabo desde las primeras versiones de la solución. Como resultado de la evaluación, es probable que se tenga que volver a una etapa anterior del proceso.

---

En este vídeo encontrarás en dos minutos una introducción clara al **Diseño Centrado en el Usuario (DCU)**.

👉 [Ver vídeo: Diseño centrado en el usuario](https://www.youtube.com/watch?v=mwgDklH0UdA)

---

###### Actividad de Clase 1
[[Desarrollo de Interfaces/Tema 1/Actividades de Clase/Actividad de Clase 1]]

---

#### Modelos mentales y modelo conceptual

En el diseño de interfaces hay un concepto fundamental que conviene tener muy claro: la diferencia entre **modelo mental** y **modelo conceptual**.

Cuando una persona se enfrenta a una aplicación, siempre lleva consigo una idea de cómo cree que debería funcionar. Esa idea previa se construye a partir de su experiencia con otras aplicaciones, de metáforas que usa en su día a día (como una papelera para tirar archivos) o de lo que ha visto hacer a otras personas. Esa representación interna es lo que llamamos **modelo mental**.

Por otro lado, el sistema ha sido diseñado con una estructura y un comportamiento específicos: menús en ciertos lugares, botones con un propósito concreto, flujos de interacción que siguen un orden. Todo esto constituye el **modelo conceptual**, es decir, la forma en la que el sistema realmente funciona.

El reto del diseño de interfaces está en lograr que esos dos modelos —el del usuario y el del desarrollador— se acerquen lo máximo posible. Cuanto mayor sea la brecha entre ambos, mayor será la confusión, los errores y la frustración.

---

##### 📌 Ejemplo

Imagina que trabajas con un documento en tu ordenador y pulsas el botón **Guardar**.

- **Modelo mental**: el usuario cree que, al hacerlo, el archivo queda automáticamente en la nube y lo podrá abrir desde cualquier dispositivo.
- **Modelo conceptual**: en realidad, el sistema lo guarda únicamente en el disco local. Si no hay sincronización, el archivo no aparece en ningún otro sitio.

El resultado de esa diferencia es previsible: enfado, pérdida de confianza e incluso pérdida de información.

---

##### 🧠 ¿De dónde salen los modelos mentales?

Los usuarios no inventan estas ideas de la nada. Se construyen a partir de su experiencia acumulada:

- Lo que han visto en **otras aplicaciones** (“en Google Drive se guarda solo”).
- **Metáforas conocidas**: la papelera digital funciona como la física, el carrito online se parece al del supermercado.
- **Patrones repetidos**: la lupa significa buscar, una flecha hacia atrás significa retroceder.
- El propio **contexto**: no es lo mismo usar una app con prisa en el móvil que sentado tranquilamente frente a un PC.

---

##### 🚩 Señales de que algo no encaja

Un diseñador puede sospechar que el modelo mental y el conceptual están desalineados cuando ve comportamientos como estos:

- Personas que hacen clic varias veces en el mismo botón “por si acaso”.
- Usuarios que preguntan dónde está algo que sí existe en la interfaz.
- Formularios enviados dos veces porque no estaba claro si se había enviado.

La regla es clara: **si muchas personas se equivocan de la misma manera, no es culpa del usuario, es un problema de diseño**.

---

##### 🔧 Cómo reducir la brecha en nuestras interfaces

Al diseñar, conviene preguntarse siempre: ¿estoy reforzando lo que la persona espera o le estoy poniendo trampas? Algunas ideas prácticas que ayudan a acercar ambos modelos son:

- Dar **visibilidad del estado**: mostrar claramente si algo se está guardando, cargando o enviando.
- Ofrecer **feedback inmediato y reversible**: confirmar la acción y permitir deshacer en caso de error.
- Usar **significados claros en iconos y botones**: si puede haber duda, acompañar con texto.
- Mantener **consistencia**: que la misma acción produzca siempre el mismo resultado.
- Prevenir errores con **mensajes claros y validación a tiempo**, en lugar de avisos crípticos.
- Usar **valores por defecto seguros**: por ejemplo, pedir confirmación antes de una compra con “1 clic” o antes de eliminar definitivamente un archivo.

---

##### 🌍 Ejemplos
- **WhatsApp**: muchos piensan que “eliminar” borra el mensaje para todos, cuando en realidad solo desaparece en su dispositivo.
- **Netflix**: las series siguen reproduciéndose de manera automática, aunque algunas personas esperan que terminen solas tras un capítulo.
- **Cajeros automáticos**: antes devolvían primero el dinero y luego la tarjeta, lo que provocaba que la gente olvidara la tarjeta dentro. El rediseño invirtió el orden.

En todos los casos, el problema surge porque el modelo mental no coincide con el conceptual.

---

Por tanto, a la hora de diseñar interfaces es importante **entender cómo piensa la persona que las usará** y reducir la distancia entre lo que espera y lo que el sistema realmente hace.

Un diseño centrado en el usuario es, al fin y al cabo, un ejercicio de **empatía**: ponerse en su lugar, anticipar su manera de entender el sistema y acompañarlo para que la interacción sea clara, fluida y satisfactoria.

---

##### ⚠️ IMPORTANTE

A pesar de que la aplicación del diseño centrado en el usuario consume recursos y conlleva un esfuerzo extra en el desarrollo de un proyecto, contribuye a asegurar el éxito final y, por tanto, debe tomarse siempre como guía.

---

##### 💡 ¿Sabías que…?

> - El icono de la papelera de reciclaje en los sistemas operativos fue creado porque las personas esperaban que “tirar algo a la basura” fuera equivalente a eliminarlo. Es un ejemplo perfecto de usar un modelo mental cotidiano para diseñar una metáfora digital.
> - En los cajeros automáticos antiguos, mucha gente olvidaba retirar la tarjeta después de sacar dinero. El rediseño cambió el orden de las acciones: primero la máquina devuelve la tarjeta, y solo después entrega el dinero. Este ajuste al modelo mental de seguridad redujo los olvidos de manera drástica.

---

###### Actividad de Clase 2
[[Actividad de Clase 2]]

---

### 1.2. Evolución de las interfaces de usuario

Cuando hablamos de interfaces de usuario solemos pensar en pantallas, iconos y botones. Pero no siempre fue así. La forma en la que las personas se han comunicado con los ordenadores ha cambiado mucho en los últimos 50 años. De hecho, esa evolución explica por qué hoy usamos aplicaciones de una manera tan natural.

Podemos distinguir tres grandes etapas: **CLI, GUI y NUI**.
![[Pasted image 20250918092044.png]]

> **¿Sabías que…?**
> El primer **GUI** (interfaz gráfica de usuario) apareció en 1973 en el **Xerox Alto**. Aunque fue un ordenador muy avanzado para su época, nunca llegó a venderse de forma masiva. Sin embargo, inspiró los sistemas gráficos que años después popularizaron Apple y Microsoft.

---

#### A. De escribir comandos: las interfaces CLI

Las primeras computadoras no tenían ventanas ni iconos. Solo mostraban una pantalla negra en la que el usuario tenía que escribir órdenes de texto.

A este tipo de interacción se le llama **CLI (Command Line Interface)**.

La idea es simple: escribes un comando y el sistema responde. El problema es que había que **aprenderse la sintaxis exacta** para que funcionara.

Si te equivocabas en una letra, el ordenador no entendía nada.

Aun así, las interfaces de línea de comandos no han desaparecido.

- Muchos administradores de sistemas prefieren usarlas porque permiten automatizar tareas.
- Herramientas modernas como Git se siguen usando casi siempre desde CLI, incluso habiendo clientes gráficos.
- Y si trabajas con la nube (AWS, Azure, Google Cloud), lo más potente está en sus consolas de comandos.

> ¿Sabías que…?
> Los comandos que usamos hoy en Linux o macOS tienen su origen en sistemas de los años 70 como Unix. A pesar de su antigüedad, siguen siendo tan potentes que muchas grandes empresas gestionan sus servidores casi exclusivamente desde la línea de comandos.

---

#### B. De hacer clics: las interfaces GUI

En los años 70 apareció algo revolucionario: una computadora llamada **Xerox Alto** mostraba una “metáfora de escritorio” con ventanas, carpetas y un ratón para moverse. Aquello era la primera **GUI (Graphical User Interface)**.

El Xerox Alto nunca se vendió en masa, pero fue el modelo en el que se inspiraron Apple y Microsoft.

En los años 80, millones de personas comenzaron a **usar ordenadores sin tener que memorizar comandos**. Solo había que mover un ratón y hacer clic.

Las GUI trajeron consigo metáforas visuales que todavía usamos hoy:

- El icono de la **papelera** para borrar.
- El icono del **disquete** para guardar, aunque muchos nunca hayan visto uno.
- Botones que imitan interruptores reales.

Hoy, la mayoría de aplicaciones que programamos para empresas siguen siendo **GUI**, y por eso este módulo se centra en ellas.

---

#### C. De tocar y hablar: las interfaces NUI

Con los móviles y las tabletas llegó otra revolución: las **NUI (Natural User Interface)**.

Aquí ya no hay que depender de un teclado o un ratón, sino que se aprovechan gestos o incluso la voz.

- Deslizar con el dedo para pasar de foto.
- Pellizcar la pantalla para ampliar.
- Decir “Oye Google” o “Alexa, pon música”.

Lo natural de estas interfaces es que usan **habilidades que ya tenemos**: movernos, señalar, hablar.

Eso hace que muchas personas que jamás habrían usado un ordenador tradicional hoy interactúen a diario con dispositivos digitales.

> **¿Sabías que…?**
> Los primeros sistemas de reconocimiento de voz datan de los años 50, pero solo podían reconocer números del 0 al 9. Hoy en día, asistentes como Alexa o Google Assistant reconocen miles de órdenes en distintos idiomas.

---

Si miramos atrás, vemos una línea clara:

- Al principio, los ordenadores exigían que las personas **se adaptaran** a ellos (CLI).
- Después, empezaron a **adaptarse a nuestras metáforas y gestos** (GUI).
- Y hoy intentan ser cada vez más **naturales y humanos** (NUI).

Como futuros desarrolladores de aplicaciones, vuestra tarea será **situaros en esa evolución**: aprovechar lo aprendido del pasado y diseñar pensando en cómo las personas quieren relacionarse con la tecnología en el presente.

---

###### Actividad Propuesta 1
[[Desarrollo de Interfaces/Tema 1/Actividades Propuestas/Actividad Propuesta 1]]

[^9999]: [[Desarrollo de Interfaces]]