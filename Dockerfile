FROM mariadb
ENV  MARIADB_ROOT_PASSWORD=1101
COPY ./init.sql  /docker-entrypoint-initdb.d 
EXPOSE 8080


