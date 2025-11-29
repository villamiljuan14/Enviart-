/** @type {import('tailwindcss').Config} */
module.exports = {
    content: [
        "./src/main/resources/templates/**/*.html",
        "./src/main/resources/static/js/**/*.js"
    ],
    darkMode: 'class',
    theme: {
        extend: {
            fontFamily: {
                sans: ['Outfit', 'sans-serif'],
            },
            colors: {
                primary: '#3C50E0',
                secondary: '#80CAEE',
                dark: '#1A222C',
                darker: '#24303F'
            }
        },
    },
    plugins: [],
}
