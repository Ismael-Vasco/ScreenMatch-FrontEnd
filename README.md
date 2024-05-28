<h1>ScreenMatch</h1>


Este es un desarrollo de una app en el lenguaje JAVA que almacena series un una base de datos PostgreSQL y lo muestra en un FrontEnd

<h2>Desarrollo</h2>
Esta aplicaión extrae Json de la API: https://www.omdapi.com con el método Https GET
Estos datos Json son almacenados en tablas en PostgreSQL, siendo las clases quienes se convierten en las mismas tablas con JPA, Hibernate
Estos datos se son manejados por diferentes Mappings dentro del Controller '.../controller/serieController.java', cone le repositorio que es el encargado
de hacerle los Queries a PostgreSQL y diferentes aplicaciones más, lo cuál nos permitirá visualizar la información solicitada en el FrontEnd.

<h2>Implementos BackEnd</h2>
1. Se utilizo el FrameWork SpringBoot de Java
2. se uso de dos formas: 
2.1 se conectó a una API para extraer las seres consultadas: ejecutar 'ScreenmachApplicationConsola.java'
2.2 Se conectó a una base de datos PostGreSQL y a un FrontEnd para hacer visibles esos datos almacenados y extraidos con la API

<h2>Implementos FrontEnd</h2>
1. Se realizo en VisualStudio Code con HTML, JavaScript y CSS
2. Se dieron los puntos de entrada del backen 
3. se enRutó las puertas para conectar el Back con el Front


https://github.com/Ismael-Vasco/ScreenMatch-FrontEnd/assets/157051386/27898e30-a917-453e-b3ad-989d80cd72c4



https://github.com/Ismael-Vasco/ScreenMatch-FrontEnd/assets/157051386/fe902250-8a15-4738-8465-8aa45c055ccc

