# 🌌 StarWarsAPI - Consulta de Películas

Este proyecto en Java permite consultar información de películas del universo de **Star Wars** a través de la API pública [SWAPI](https://swapi.py4e.com/). Una vez realizada la consulta, los datos de la película se muestran por consola y se guardan en un archivo JSON.

---

## 🚀 Funcionalidades

- Consulta información de una película de Star Wars por número (ID).
- Muestra detalles como título, director, productor y fecha de lanzamiento.
- Guarda la información obtenida en un archivo `.json` con el nombre de la película.

---

## 📦 Requisitos

- Java 17+
- [Gson](https://github.com/google/gson) (para la conversión a JSON)
- Acceso a internet (para consultar la API)

---

## 🛠️ Estructura del código

- `Principal.java`: Punto de entrada. Solicita al usuario el número de película y coordina el flujo.
- `ConsultaPelicula.java`: Realiza una solicitud HTTP a la API de Star Wars y obtiene los datos.
- `Pelicula.java`: Representa el modelo de datos de una película.
- `GeneradorDeArchivo.java`: Convierte la película a JSON y la guarda en un archivo local.

---

## 📈 Ejemplo de uso

```bash
$ java Principal
Escribe el numero de la pelicula que quieres buscar: 
1
