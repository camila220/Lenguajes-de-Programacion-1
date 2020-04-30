### LENGUAJE DE PROGRAMACIÓN

Mi nombre es Maria Camila Castellanos Botero, soy estudiante de la universidad de San Buenaventura, estoy en 2 semestre 

****
Este espacio sera utilizado para compartir informacion acerca de nuestros proyectos, informacion y trabajos 
****

[Crabble](#Crabble)
- [Descripcion](#Descripcion):
[Funcionamiento](#Funcionamiento),
[ Stakeholders ](#Stakeholders).
- [Requerimientos](#Requerimientos).


# Crabble

![](https://www.google.com.co/url?sa=i&url=https%3A%2F%2Fwww.trecebits.com%2F2020%2F01%2F02%2F10-videojuegos-que-no-puedes-perderte-este-2020%2F&psig=AOvVaw2RbzEw_A3JW5Ij53lbxNew&ust=1588298265754000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIC3hKWGj-kCFQAAAAAdAAAAABAD)


## Descripcion

### Descripcion.
En generaciones pasadas nuestros padres interactuaban constantemente con el mundo de los videojuegos, Air Music hace alusión al juego “Space Invaders”, en el cual hemos querido brindar un homenaje a esa generación de videojuegos con la que crecimos.
### Funcionamiento
Según el BPN (vibraciones por segundo de la música o en términos más simples es su velocidad) al momento de ser reproducida la canción el juego será capaz de reconocer el numero de BPN de la canción para de esa forma generar los enemigos y también en la que serán generados. Su velocidad también será importante en el juego ya que entre más BPN mayor velocidad. 
El juego reconoce los picos de frecuencia de la canción colocada por el jugador y terminar en qué momento generar más enemigos en el mapa.


## Stakeholders.

### Stakeholders 

- Gamer:El jugador sera el sujeto promedio jugador casual que solo quiere disfrutar del juego cuando el lo quiera. (unicamente un jugador por partida)

- Desarrolladores: Camila Castellanos, Stiven Colungue
- Diseñadores: Camila Castellanos Stiven Colungue 


## Requerimientos.

A continuación, se presentará el listado de los requerimientos funcionales y los requerimientos no funcionales de la aplicación. Siendo RF_x como requerimiento funcional_ número del requerimiento y RNF_x como requerimiento no funcional_ número del requerimiento.

| ID Requerimiento | Descripción  | Prioridad |
| :------------ |:---------------:| -----:|
| `RF_1` |El juego iniciara con un paneo en negro que ilustrala la imagen de la serie “Rick and Morty” con la seccion para introducir el usuario. | Alta |
| `RF_2` |El juego iniciara con un paneo en negro que ilustrala la imagen de la serie “Rick and Morty” con la seccion para introducir el usuario.|Alta|
|`RF_3`|En la trancicion del juego aparecera la nave del jugador por la pantalla, unicamente por el eje Y en la parte izquierda de la pantalla de manera recta sin interferencia en su recorrido.|Alta|
|`RF_4`|El Usuario tendra solo un boton de Jugar al iniciar el juego en el menu principal del seguido del nombre de Usuario ( Ya resgistrado en la base de datos)|Alta|
|`RF_5`|El Usuario o jugador podra ingresar unicamente si se encuantra registrado en la base de datos. Por el momento se encuantran los desarrolladores y el jugador que lo probara (luis) sin mayusculas ni numeros.| Alta|
|`RF_6`|El juego permite ir acorde a la canción propuesta (MOCKUP).|Alta|
|`RF_7`|La nave podrá moverse por el eje Y en la pantalla del jugador teniendo cuidado de no tocar los obstáculos que en este caso son los disparos de las naves enemigas|Alta|
|`RF_8`|La Nave podrá dispararles a sus enemigos una clase de proyectil automáticamente sin necesidad de que el jugador tenga que accionarlo|Alta|
|`RNF_1`|Las naves enemigas tendrán un proyectil al igual que la nave principal con la diferencia que sus disparos se harán automáticamente cada medio segundo, haciendo daño a la nave el jugador bajando su nivel de resistencia.|Alta|
|`RNF_2`|La nave del jugador si es impactada por un proyectil de la nave enemiga 3 veces; esta generara un sonido de daño|Alta|
|`RNF_4`|El juego acabara con la animación de la nave explotando en caso de que haya sido impactada 3 veces por un proyectil enemigo dando lugar a una imagen con un mensaje de perdida de la partida en la pantalla. |Alta|

