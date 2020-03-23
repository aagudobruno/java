package practica61;


/**
 *
 * @author adria
 */
public interface FigurasGeometricas {
    final static double pi=Math.PI;
    double calcularArea() throws NumberFormatException ;/*que calculará el área de dicha figura e imprimirá 
    dicho cálculo junto a sus características.
*/
    double calcularVolumen();/*que calculará el área de dicha figura e imprimirá 
    dicho cálculo junto a sus características.
*/
    void imprimirCaracteristicas(); /* imprimirá por pantalla un texto 
    “Calculadora de nombre+apellidos”, y a continuación imprimirá las 
    características de cada figura geométrica así como su volumen y área.
*/
}