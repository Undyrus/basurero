
package basicexercisesjava;

/**
 *
 * @author Ramiro Diego González
 */
public class BasicExercisesJava {
    public boolean fiestaArdillas(int numBellotas, boolean finde){
        boolean exito;
        if (finde==true){
            exito=true;
        }
        if (finde==false&&(numBellotas>=40&&numBellotas<=60)){
            exito=true;
        }
        else{
            exito=false;
        }
        return exito;
    }  
    public int multa(int velocidad, boolean cumple){
       int multa = 0;
       if ((cumple==false&&velocidad<=60)||(cumple==true&&velocidad<=65)){
           multa = 0;
       }
       else if((cumple==false&&(velocidad>60&&velocidad<=80))||(cumple==true&&(velocidad>65&&velocidad<=85))){
           multa = 1;
       }
       else{
           multa = 2;
       }
       return multa;
    }  
    public static void main(String[] args) {
       BasicExercisesJava exercises = new BasicExercisesJava();
       System.out.print(exercises.fiestaArdillas(50, false));
       System.out.print(exercises.multa(60, false));
    }
    
}
