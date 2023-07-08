# Content API

This repository contains the configurations for running the Content API server. Below you will find information about the various configuration options available.

## API Configuration

To configure the API settings, modify the following properties:

```properties
server.port=8080
server.servlet.context-path=/content-api/v1
```

The `server.port` property specifies the port number on which the API server will listen. By default, it is set to `8080`. You can change it to a different port if needed.

The `server.servlet.context-path` property sets the base URL path for the API endpoints. In this case, it is set to `/content-api/v1`. You can customize it according to your requirements.

## Logging Configuration

To configure the logging level for the API server, use the following property:

```properties
logging.level.org.springframework.web=DEBUG
```

The `logging.level.org.springframework.web` property sets the logging level for the `org.springframework.web` package to `DEBUG`. You can adjust the logging level as per your debugging needs.

## MySQL Configuration

To configure the MySQL database settings, modify the following properties:

```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/content-api
spring.datasource.username=<USERNAME>
spring.datasource.password=<PASSWORD>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
```

The `spring.jpa.hibernate.ddl-auto` property controls the behavior of Hibernate's schema generation tool. In this case, it is set to `update`, which means the schema will be updated automatically. You can change it to `create` or `none` as per your requirements.

The `spring.datasource.url` property specifies the URL of the MySQL database. Update it with the appropriate database URL.

The `spring.datasource.username` and `spring.datasource.password` properties store the credentials (username and password) required to connect to the MySQL database. Replace `<USERNAME>` and `<PASSWORD>` with the actual credentials.

The `spring.datasource.driver-class-name` property sets the driver class name for the MySQL database.

The `spring.jpa.show-sql` property enables or disables the SQL logging. Set it to `true` to enable SQL logging.

## OpenAI API Configuration

To configure the OpenAI API settings, modify the following properties:

```properties
openai.model=gpt-3.5-turbo
openai.api.url=https://api.openai.com/v1/chat/completions
openai.api.key=<YOUR-API-KEY>
```

The `openai.model` property specifies the version of the OpenAI model to be used. Currently, it is set to `gpt-3.5-turbo`. You can update it if a newer version is available.

The `openai.api.url` property stores the URL endpoint for the OpenAI API. By default, it is set to `https://api.openai.com/v1/chat/completions`.

The `openai.api.key` property holds your API key for accessing the OpenAI API. Replace `<YOUR-API-KEY>` with your actual API key.

Please make sure to keep your API key secure and do not expose it publicly.

Feel free to modify these configurations as needed to suit your application's requirements.