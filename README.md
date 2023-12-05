# Ejercicio-Spring enunciado

Estás trabajando en una empresa de desarrollo de software encargado/a
del bakcend de las aplicaciones y te han pedido la siguiente tarea:
Crea un api rest que me permita realizar operaciones con los clientes de
de una empresa que vende equipos informáticos.

La base de datos se llama : "tecnocom"
La tabla : "clientes"
Los campos de la base de datos son:
    - id (pk, autoincremental)
    - username (varchar 255)
    - password (varchar 255)
    - email (varchar 255)
    - direccion (varchar 255)
    - telefono (int)
    - comunidad_autonoma (varchar 255)
    - provincia(varchar 255)
    - ciudad (varchar 255)

Los endpoints requeridos son los siguientes:

    POST : http://localhost:8080/api/cliente/save (GUARDAR CLIENTES)
    GET :  http://localhost:8080/api/clientes (LISTA DE CLIENTES)
    GET :  http://localhost:8080/api/cliente/{id} (CLIENTES POR ID)
    GET :  http://localhost:8080/api/cliente/user/{username} (CLIENTES POR USERNAME)
    GET :  http://localhost:8080/api/cliente/email/{email}(CLIENTES POR EMAIL)
    GET :  http://localhost:8080/api/cliente/provincia/{provincia}(CLIENTES POR PROVINCIA)
    GET :  http://localhost:8080/api/cliente/comunidad/{comunidad}(CLIENTES POR COMUNIDAD AUTÓNOMA)
