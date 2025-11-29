# Tailwind CSS Build Process

Este proyecto ahora utiliza Tailwind CSS compilado en lugar del CDN.

## Scripts disponibles

- `npm run build:css` - Compila el CSS y observa cambios (modo desarrollo)
- `npm run build:css:prod` - Compila el CSS optimizado para producción (minificado)

## Configuración

- **Archivo de entrada**: `src/main/resources/static/css/input.css`
- **Archivo de salida**: `src/main/resources/static/css/output.css`
- **Configuración**: `tailwind.config.js`

## Uso durante desarrollo

1. Ejecuta `npm run build:css` en una terminal separada para observar cambios
2. Los cambios en los archivos HTML se detectarán automáticamente
3. El CSS se regenerará cuando modifiques clases de Tailwind

## Producción

Antes de desplegar, ejecuta:
```bash
npm run build:css:prod
```

Esto generará un archivo CSS minificado y optimizado con solo las clases que realmente usas.

## Ventajas sobre el CDN

1. **Rendimiento**: Archivo CSS más pequeño (solo incluye clases usadas)
2. **Personalización**: Configuración centralizada en `tailwind.config.js`
3. **Funciones avanzadas**: Acceso a `@apply`, `@layer`, etc.
4. **Sin dependencia externa**: No requiere conexión a CDN
5. **Versionado**: Control total sobre la versión de Tailwind
