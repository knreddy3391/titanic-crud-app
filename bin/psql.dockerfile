FROM postgres:latest
EXPOSE 5432
COPY data-initp.sql /docker-entrypoint-initdb.d/
RUN chmod +x /docker-entrypoint-initdb.d/data-initp.sql