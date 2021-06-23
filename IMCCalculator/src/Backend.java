/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class Backend {
  
    public static String calcular (Double v1, Double v2){
                    
       Double resultado = v2 / (v1*v1);
       
       
       
       if (resultado >= 18.6 && resultado <= 24.9) {
       
            String imc = String.format("%.1f",resultado);
            
            String resultadoString = "<html>Meus parabéns, seu IMC é de " + imc + " Ou seja você esta dentro do peso ideal</html>";
            
            return resultadoString;
           
       } else if (resultado < 18.5) {
       
            String imc = String.format("%.1f",resultado);
            
            String resultadoString = "<html>Que pena,seu IMC é de " + imc + " Ou seja você esta abaixo do peso ideal</html>";
       
            return resultadoString;
       
       } else if (resultado >= 25.0 && resultado <= 29.9) {
           
            String imc = String.format("%.1f",resultado);
            
            String resultadoString = "<html>Que pena,seu IMC é de " + imc + " Ou seja seu você esta um pouco acima do peso ideal</html>";
            
            return resultadoString;
           
       } else if (resultado >= 30.0 && resultado <= 34.9) {
            
            String imc = String.format("%.1f",resultado);
            
            String resultadoString = "<html>Que pena,seu IMC é de " + imc + " Ou seja seu você esta em obesidade grau 1</html>";
            
            return resultadoString;
           
       } else if (resultado >= 35.0 && resultado <= 39.9) {
            
            String imc = String.format("%.1f",resultado);
            
            String resultadoString = "<html>Que pena,seu IMC é de " + imc + " Ou seja seu você esta em obesidade grau 2 (severa)</html>";
            
            return resultadoString;
           
       } else {
        
        String imc = String.format("%.1f",resultado);
        
            String resultadoString = "<html>Que pena,seu IMC é de " + imc + " Ou seja seu você esta em obesidade grau 3 (mórbida)</html>";
            
            return resultadoString;
        
        }
       
       
       
    }
    
}
