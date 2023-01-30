# weather-forecast

Pre-requisitos

•	Haber instalado y Ambientado Docker CE en su servidor Linux. Si a un no lo ha instalado seguir los siguientes pasos:
https://docs.docker.com/engine/install/ubuntu/

•	Haber instalado Docker Compose, para la línea de comandos. Pasos de instalación:
https://docs.docker.com/compose/install/linux/#install-using-the-repository

Guía para desplegar el Microservicio weather-forecast junto con la Base de Datos sobre Docker
1.- Antes de nada se crea una carpeta en la cual se almacera configuraciones e imagenes docker: sudo mkdir -R 777 docker-apps

![image](https://user-images.githubusercontent.com/69737708/215504322-0347fae5-3c35-482e-ad79-38831a78fc25.png)

2.- Dentro de la carpeta /docker-apps, crear un archivo YML: mkdir -R 777 docker-compose.yml.
3.- Dentro de la carpeta /docker-apps, crear un folder mkdir -R 777 deployments.

![image](https://user-images.githubusercontent.com/69737708/215511896-f99f5b01-d84f-4cab-9e9a-d467b18fccd6.png)
