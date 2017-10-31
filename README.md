Ejemplo básico de swagger con spring boot.

Los archivos que se necesitan para configurar swagger son los siguientes:

build.gradle
    Agregar los jars con el grupo io.springfox

com.swagger.template.configuration.SwaggerConfig

    Es necesario agregar la anotación EnableSwagger2 y crear el bean que regrese un tipo Docket.

com.swagger.template.controllerApiController

    Solo con agregar la anotación @Api swagger infiere y crea la interfaz gráfica.


Para ejecutar la aplicación se puede usar gradle wrapper:
    ./gradlew run

la documentación se puede visualiza en:
    http://localhost:8080/swagger-ui.html