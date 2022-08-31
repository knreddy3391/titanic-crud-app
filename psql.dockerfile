FROM postgres:latest
COPY data-initp.sql /docker-entrypoint-initdb.d/
RUN chmod +x /docker-entrypoint-initdb.d/data-initp.sql