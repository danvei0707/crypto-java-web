# Aplicación básica en Springboot
Trata de ser el servidor de una página web, con funcionalidades de usuario y de consulta a APIs de terceros.

## Dependencias
[Coin Gecko API](https://docs.coingecko.com/v3.0.1/reference/trnding-search)

## Base de datos
* ### H2
Como base de datos de prueba, se utiliza H2. Una vez iniciada la aplicación, podemos buscar: ```http://localhost:8080/h2-console/``` para acceder al login de la consola. Necesitaremos introducir en "url" aquella que se genere al iniciar el servidor, en la consola de desarrollo.


## Principales controladores
* ### Ping controller
    Este controlador se usa a modo de prueba. Buscando ```http://localhost:8080/api/ping ``` la aplicación realiza una petición a la API de coingecko y devuelve el estado de la misma en forma de objeto JSON.