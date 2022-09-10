FROM mysql:8
COPY data-init.sql /docker-entrypoint-initdb.d/
RUN chmod +x /docker-entrypoint-initdb.d/data-init.sql