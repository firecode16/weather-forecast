# weather-forecast

Pre-requisitos

•	Haber instalado y Ambientado Docker CE en su servidor Linux. Si a un no lo ha instalado seguir los siguientes pasos:
https://docs.docker.com/engine/install/ubuntu/

•	Haber instalado Docker Compose, para la línea de comandos. Pasos de instalación:
https://docs.docker.com/compose/install/linux/#install-using-the-repository

Guía para desplegar el Microservicio weather-forecast junto con la Base de Datos sobre Docker.

1.- Antes de nada se crea una carpeta en la cual se almacera configuraciones e imagenes docker: sudo mkdir -R 777 docker-apps.

![image](https://user-images.githubusercontent.com/69737708/215504322-0347fae5-3c35-482e-ad79-38831a78fc25.png)

2.- Dentro de la carpeta /docker-apps, crear un archivo YML: mkdir -R 777 docker-compose.yml.
3.- Dentro de la carpeta /docker-apps, crear un folder mkdir -R 777 deployments.

![image](https://user-images.githubusercontent.com/69737708/215511896-f99f5b01-d84f-4cab-9e9a-d467b18fccd6.png)

4.- Dentro de la carpeta /deployments colocar el folder /weather-forecast-service, la cual contendra los siguientes archivos:
/target/weather-forecast-0.0.1.jar
/Dockerfile

![image](https://user-images.githubusercontent.com/69737708/215513728-9a17fe33-7eef-4779-ad2c-a9a15bca82b0.png)

4.- Copiar el script de base de datos y el micro servicio de la siguiente url:
https://github.com/firecode16/weather-forecast/blob/master/docker-compose.yml

posteriormente Pegarlo en /docker-compose.yml, que se creo anteriormente en linux.

5.- Procedemos a Levantar la Base de datos con el Micro servicio, colocando el siguiente comando:
  - docker-compose up -d
  
  ![image](https://user-images.githubusercontent.com/69737708/215520402-1f1e06dd-b2d6-4006-919b-7838e1b5a9be.png)

6.- Verificamos las imagenes que acaban de levantarse, con el siguiente comando:
  - docker ps
  
  ![image](https://user-images.githubusercontent.com/69737708/215521178-b2cf5e05-0eec-4a3a-90c6-1ac3f7406b29.png)

  

  
