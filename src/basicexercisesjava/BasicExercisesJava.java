
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
    public int multa(int velocidad, boolean string){
       return 0;
    }  
    public static void main(String[] args) {
       BasicExercisesJava exercises = new BasicExercisesJava();
       System.out.print(exercises.fiestaArdillas(50, false));
    }
    
}
