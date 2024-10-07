# 🪙 Convertidor de Monedas - Challenge Programa ONE

## 📖 Descripción

Bienvenido al **Conversor de Monedas**, una aplicación Java diseñada para facilitar la conversión entre diferentes
divisas de manera rápida y precisa. Este proyecto fue desarrollado como parte del Challenge del Programa ONE, utilizando
**Maven** para la gestión de dependencias y asegurando la organización estructurada del ciclo de vida del proyecto.

La aplicación permite a los usuarios seleccionar las monedas de origen y destino, así como ingresar el monto a
convertir.

## 🚀 Funcionalidades Principales

- **Conversión en tiempo real**: Convierta entre las principales monedas mundiales usando tasas de cambio actualizadas.
- **Interfaz intuitiva**: A través de una interfaz de línea de comandos simple, los usuarios pueden ingresar montos y
  elegir las monedas fácilmente.
- **Historial de conversiones**: Registra las conversiones realizadas durante la sesión para que el usuario pueda
  revisar el historial.
- **Manejo de errores**: Gestiona posibles errores como la entrada de datos inválidos o problemas con la disponibilidad
  de la API.

## 🛠️ Tecnologías Implementadas

- **Java 21**: Lenguaje de programación principal utilizado para la lógica del conversor.
- **Maven**: Utilizado para la gestión de dependencias y organización del proyecto.
- **API de tipo de cambio**: Provee las tasas de cambio en tiempo real. En este caso, la aplicación está conectada
  a [ExchangeRate API](https://www.exchangerate-api.com/).

## 📝 Prerrequisitos

Antes de ejecutar el proyecto, asegúrate de tener lo siguiente instalado en tu entorno:

- **JDK 21**: Para poder compilar y ejecutar el código Java.
- **Maven 4.0 o superior**: Necesario para gestionar las dependencias del proyecto.
- **Claves de API**: Necesitarás una clave para conectarte a la API de tasas de cambio.

## 🔧 Configuración e Instalación

Sigue los siguientes pasos para configurar y ejecutar el proyecto en tu máquina local:

1. Clona este repositorio en tu sistema local:

   ```bash
   git clone https://github.com/dromerof/api-conversor-monedas.git

2. Instalar dependencias y compilar el proyecto:

   ```bash
   mvn clean install

3. Configura las variables de entorno necesarias para la conexión con la API:

    * Renombra el archivo .example.env a .env.

    * Abre el archivo .env y agrega tus credenciales de la API y la URL base:

   ```bash
   API_KEY=tu_api_key
   BASE_URL=https://v6.exchangerate-api.com/v6/

4. Inicia la aplicación ejecutando la clase **Main** para empezar a utilizar el conversor.

## 🖥️ Uso de la Aplicación

Una vez ejecutada la aplicación, sigue los pasos en la terminal para seleccionar las monedas de origen y destino,
proporciona el monto a convertir. El sistema hará la conversión utilizando la tasa de cambio en tiempo real y te
mostrará los resultados.

## 📊 Historial de Conversión

Cada vez que realices una conversión, esta se registrará y podrás consultarla más tarde dentro de la misma sesión.

## ⚠️ Errores Comunes

* Asegúrate de ingresar un número válido.
* Verífica que tu clave API sea correcta y que tengas acceso a la API de tasas de cambio.

## 📜 Licencia

Este proyecto está bajo la licencia **MIT**.