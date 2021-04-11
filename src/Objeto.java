/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon Ruiz
 */
public class Objeto {

    public Objeto() {
    }
    
    public int potencia(int x, int y){
        
        if(y==1){ //Si la potencia(y) es igual a 1 entra al if
           x = x*1;  //Multiplicamos el numero a elevar(x) por 1 
           return x; //Retornamos x 
        }
        //si la potencia(y) es mayor a 1
        y--; //Le restamos 1 a la potencia(y) para que asi la recursion pueda tener un fin y no se vuelva "infinita".
        x = x*potencia(x,y); //indicamos que ´x´ es igual a el mismo por el producto del llamado a nuestra funcion y asi 
                             //habra recursividad hasta que ´y´ sea igual a 1, entonces se multiplicara ´x´ a si mismo 
                             //hasta llegar a la funcion original o llamado cero
        return x;// en este punto se retorna el valor o final, o el valor ya exponenciado
    }
}
