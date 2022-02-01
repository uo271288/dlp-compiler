# Q & A

## Dónde puedo descargar Java 17

Depende de la implementación de Java que desees:

- Desde la página de Oracle puedes descargar el Zip o el instalador [aquí](https://www.oracle.com/java/technologies/downloads/).
- Si prefieres usar OpenJDK, puedes descargarlo [aquí](https://jdk.java.net/17/). No olvides de crear las variables de entorno correspondientes (`JAVA_HOME` y la carpeta de binarios al `Path`) a donde exportes la carpeta.

> Si tienes macOS o Linux, recomiendo usar [asdf](https://github.com/asdf-vm/asdf) e instalar [el plugin de java](https://github.com/halcyon/asdf-java). Recuerda configurar la última versión.

## Dónde puedo descargar Maven

Dentro de [su página de descargas](https://maven.apache.org/download.cgi), descarga el binario y extráelo en la carpeta que quieras.

Al igual que Java, acuérdate de añadir ese binario a la variable de entorno `Path`. Importante, también necesitas tener bien configurada la variable `JAVA_HOME` para que Maven sepa que versión de Java usar.

Más información sobre la instalación [aquí](https://maven.apache.org/install.html).

> Si tienes macOS o Linux, recomiendo usar [asdf](https://github.com/asdf-vm/asdf) e instalar [el plugin de maven](https://github.com/halcyon/asdf-maven). Recuerda configurar la última versión.

## PlantUML me da fallos

Si al generar el diagrama te da fallos, puede ser porque no tengas Graphviz instalado. Prueba a descargarlo [aquí](https://graphviz.org/download/).

> Si tienes macOS instala primero [Homebrew](https://brew.sh/) y luego [graphviz](https://formulae.brew.sh/formula/graphviz)

## Dónde puedo descargar IntelliJ

Puedes descárgalo desde [aquí](https://www.jetbrains.com/idea/download). Ahí podrás descargar la versión gratuita.

> Pro tip: Como eres estudiante, puedes registrarte usando tu correo de la universidad y usar varios programas de pago de JetBrains de manera gratuita, mientras sigas teniendo acceso al correo.

## Cómo puedo actualizar los cambios

Se han hecho cambios en el repositorio principal y quiero actualizarlos en mi repositorio, ¿cómo puedo hacerlo?

Añade el repositorio como un remoto:

```
git remote add upstream https://github.com/dlp-luis/dlp-compiler.git
```

Cuando se suban cambios al repositorio principal, actualiza tus cambios en local:

```
git fetch upstream
```

Para incluir los cambios en tu rama, solo debes hacer un `merge`:

```
git merge upstream/main
```

## Ejecutar un solo test

Si quieres ejecutar solo un método con maven, después de regenerar el parser, puedes lanzar el comando:

```
 mvn clean antlr4:antlr4 test -Dtest=ParserTest#testFunctionInvalidReturnType
```

La parte importante es `-Dtest=ParserTest#testFunctionInvalidReturnType`, donde `ParserTest` es la clase del test a ejecutar y `testFunctionInvalidReturnType` el test en específico.
