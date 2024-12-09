function calcularSuma() {
    const num1 = +document.getElementById('num1').value; // Convierte a número
    const num2 = +document.getElementById('num2').value; // Convierte a número
    const suma = num1 + num2; 
    document.getElementById('resultado').innerText = `La suma es: ${suma}`;
}