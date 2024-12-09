let contador = 0;  // Mover la variable contador fuera de la función

function incrementar() {
    contador++;  // Ahora incrementa la variable que está fuera de la función
    document.getElementById("contador").innerText = contador;
}