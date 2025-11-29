# Guía de Setup - Proyecto Enviart

Esta guía te ayudará a configurar el proyecto después de clonarlo en una nueva máquina.

## Requisitos Previos

- **Java 17 o superior**
- **Maven 3.6+**
- **Node.js** (opcional, solo si quieres modificar estilos de Tailwind)

## Pasos de Instalación

### 1. Clonar el Repositorio

```bash
git clone <url-del-repositorio>
cd Enviart/Enviart
```

### 2. Configurar Base de Datos

Edita `src/main/resources/application.properties` con tus credenciales:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/enviart
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

### 3. Instalar Dependencias de Maven

```bash
mvn clean install
```

### 4. Ejecutar la Aplicación

```bash
mvn spring-boot:run
```

La aplicación estará disponible en: `http://localhost:8080`

## Configuración de Tailwind CSS (Opcional)

**Solo necesario si vas a modificar los estilos.**

### Opción A: Usar el CSS ya compilado (Recomendado)

El archivo `src/main/resources/static/css/output.css` ya está compilado y listo para usar.
**No necesitas hacer nada más.**

### Opción B: Compilar Tailwind desde cero

Si necesitas modificar estilos de Tailwind:

1. **Descargar el binario de Tailwind:**

```bash
# Linux/Mac
curl -sLO https://github.com/tailwindlabs/tailwindcss/releases/latest/download/tailwindcss-linux-x64
chmod +x tailwindcss-linux-x64
mv tailwindcss-linux-x64 tailwindcss

# Windows
# Descarga manualmente desde: https://github.com/tailwindlabs/tailwindcss/releases/latest
# Renombra a: tailwindcss.exe
```

2. **Instalar dependencias de Node (opcional):**

```bash
npm install
```

3. **Compilar CSS:**

```bash
# Modo desarrollo (observa cambios)
npm run build:css

# Modo producción (minificado)
npm run build:css:prod
```

## Estructura del Proyecto

```
Enviart/
├── src/
│   ├── main/
│   │   ├── java/           # Código Java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   ├── input.css    # Entrada de Tailwind
│   │       │   │   └── output.css   # CSS compilado (usar este)
│   │       │   └── js/
│   │       └── templates/           # Plantillas HTML
│   └── test/
├── tailwind.config.js      # Configuración de Tailwind
├── package.json            # Scripts de Node
└── pom.xml                 # Dependencias Maven
```

## Solución de Problemas

### Error: "No plugin found for prefix 'spring-boot'"

Asegúrate de estar en el directorio correcto:
```bash
cd Enviart/Enviart  # Nota: hay dos niveles de "Enviart"
mvn spring-boot:run
```

### El CSS no se ve correctamente

1. Verifica que existe: `src/main/resources/static/css/output.css`
2. Si no existe, compílalo: `npm run build:css:prod`
3. Reinicia la aplicación Spring Boot

### Cambios en Tailwind no se reflejan

1. Asegúrate de estar editando `input.css`, no `output.css`
2. Ejecuta `npm run build:css` para recompilar
3. Refresca el navegador (Ctrl+F5 para limpiar caché)

## Notas Importantes

- ✅ El archivo `output.css` **SÍ debe estar en el repositorio** (ya está compilado)
- ✅ Los archivos `node_modules/` y `tailwindcss` **NO** están en el repo (están en .gitignore)
- ✅ Si solo vas a ejecutar la app, **no necesitas Node.js ni npm**
- ⚠️  Solo necesitas compilar Tailwind si vas a **modificar estilos**

## Comandos Útiles

```bash
# Ejecutar aplicación
mvn spring-boot:run

# Compilar proyecto
mvn clean package

# Ejecutar tests
mvn test

# Compilar CSS (solo si modificas estilos)
npm run build:css:prod
```

## Contacto y Soporte

Para más información, consulta la documentación en el repositorio.
