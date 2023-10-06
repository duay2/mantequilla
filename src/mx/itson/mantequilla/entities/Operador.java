/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mantequilla.entities;

/**
 *
 * @author vagui
 */
public class Operador {
    
    public String SacarCurp(String lastnameDad, String lastnameMom, String name, String dayborn, String monthborn, String yearborn, String gender, String state){
        String curp="";
        //SACAR LAS LETRAS DEL APELLIDO PATERNO(2 PRIMERAS LETRAS DE 18)
        lastnameDad = lastnameDad.toUpperCase().trim().toUpperCase()
               .replace("!", " ").replace("#", "").replace(">", "")
               .replace("$", "").replace("%", "").replace("&", "")
               .replace("/", "").replace("(", "").replace(")", "")
               .replace("=", "").replace("?", "").replace("¡", "")
               .replace("¿", "").replace("|", "").replace("<", "")
               .replace("*", "").replace("+", "").replace("~", "")
               .replace("{", "").replace("[", "").replace("^", "")
               .replace("}", "").replace("]", "").replace("-", "")
               .replace("_", "").replace(".", "").replace(",", "")
               .replace(":", "").replace(";", "").replace("°", "")
               .replace("<", "");
        char [] letters = lastnameDad.toCharArray();
        curp+= letters[0];
        //Saber las vocales
        char [] vowels = {'A','E','I','O','U'};
        char letravocal = 0;
       for (int a = letters.length - 1; a>=1; a--)
	for (int b = vowels.length - 1; b>=0; b--){
	    if (letters[a] == vowels[b] ){
             letravocal = letters [a] ;      
            }            
       }
       curp+=letravocal;
       
       
        //la primera letra del apellido materno 3/18
        lastnameMom = lastnameMom.toUpperCase().replace(" ", "");
        char [] letter = lastnameMom.toCharArray();
        curp += letter[0];
        if(lastnameMom.equals("")){
            lastnameMom="X";
            curp+=lastnameMom;
        }
        
        //letra del nombre 4/18
       name = name.toUpperCase().trim().toUpperCase()
               .replace("!", " ").replace("#", "").replace(">", "")
               .replace("$", "").replace("%", "").replace("&", "")
               .replace("/", "").replace("(", "").replace(")", "")
               .replace("=", "").replace("?", "").replace("¡", "")
               .replace("¿", "").replace("|", "").replace("<", "")
               .replace("*", "").replace("+", "").replace("~", "")
               .replace("{", "").replace("[", "").replace("^", "")
               .replace("}", "").replace("]", "").replace("-", "")
               .replace("_", "").replace(".", "").replace(",", "")
               .replace(":", "").replace(";", "").replace("°", "")
               .replace("<", "");
char[] lettername = name.toCharArray();
        curp+=lettername[0];
        
        //año de nacimiento 6/18
        yearborn = yearborn.toUpperCase().replace(" ", "").replace("!", " ").replace("#", "").replace(">", "")
               .replace("$", "").replace("%", "").replace("&", "")
               .replace("/", "").replace("(", "").replace(")", "")
               .replace("=", "").replace("?", "").replace("¡", "")
               .replace("¿", "").replace("|", "").replace("<", "")
               .replace("*", "").replace("+", "").replace("~", "")
               .replace("{", "").replace("[", "").replace("^", "")
               .replace("}", "").replace("]", "").replace("-", "")
               .replace("_", "").replace(".", "").replace(",", "")
               .replace(":", "").replace(";", "").replace("°", "")
               .replace("<", "").replace("A", "").replace("B", "")
               .replace("D", "").replace("E", "").replace("F", "")
               .replace("G", "").replace("H", "").replace("I", "")
               .replace("J", "").replace("K", "").replace("L", "")
               .replace("M", "").replace("N", "").replace("Ñ", "")
               .replace("O", "").replace("P", "").replace("Q", "")
               .replace("R", "").replace("S", "").replace("T", "")
               .replace("U", "").replace("V", "").replace("W", "")
               .replace("X", "").replace("Y", "").replace("Z", "").replace("C", "");
        char [] years = yearborn.toCharArray();
        curp+=years [2];
        curp+=years [3];
        
        //mes de nacimiento 8/16
        monthborn = monthborn.toUpperCase().replace(" ", "").replace("!", " ").replace("#", "").replace(">", "")
               .replace("$", "").replace("%", "").replace("&", "")
               .replace("/", "").replace("(", "").replace(")", "")
               .replace("=", "").replace("?", "").replace("¡", "")
               .replace("¿", "").replace("|", "").replace("<", "")
               .replace("*", "").replace("+", "").replace("~", "")
               .replace("{", "").replace("[", "").replace("^", "")
               .replace("}", "").replace("]", "").replace("-", "")
               .replace("_", "").replace(".", "").replace(",", "")
               .replace(":", "").replace(";", "").replace("°", "")
               .replace("<", "").replace("A", "").replace("B", "")
               .replace("D", "").replace("E", "").replace("F", "")
               .replace("G", "").replace("H", "").replace("I", "")
               .replace("J", "").replace("K", "").replace("L", "")
               .replace("M", "").replace("N", "").replace("Ñ", "")
               .replace("O", "").replace("P", "").replace("Q", "")
               .replace("R", "").replace("S", "").replace("T", "")
               .replace("U", "").replace("V", "").replace("W", "")
               .replace("X", "").replace("Y", "").replace("Z", "").replace("C", "");
        char [] months = monthborn.toCharArray();
        curp+=months [0];
        curp+=months [1];
        
        //dia de nacimiento 10/18
        dayborn = dayborn.replace(" ", "").toUpperCase().replace(" ", "").replace("!", " ").replace("#", "").replace(">", "")
               .replace("$", "").replace("%", "").replace("&", "")
               .replace("/", "").replace("(", "").replace(")", "")
               .replace("=", "").replace("?", "").replace("¡", "")
               .replace("¿", "").replace("|", "").replace("<", "")
               .replace("*", "").replace("+", "").replace("~", "")
               .replace("{", "").replace("[", "").replace("^", "")
               .replace("}", "").replace("]", "").replace("-", "")
               .replace("_", "").replace(".", "").replace(",", "")
               .replace(":", "").replace(";", "").replace("°", "")
               .replace("<", "").replace("A", "").replace("B", "")
               .replace("D", "").replace("E", "").replace("F", "")
               .replace("G", "").replace("H", "").replace("I", "")
               .replace("J", "").replace("K", "").replace("L", "")
               .replace("M", "").replace("N", "").replace("Ñ", "")
               .replace("O", "").replace("P", "").replace("Q", "")
               .replace("R", "").replace("S", "").replace("T", "")
               .replace("U", "").replace("V", "").replace("W", "")
               .replace("X", "").replace("Y", "").replace("Z", "").replace("C", "");
       int day = Integer.parseInt(dayborn);
       curp += day;
       
       //GENERO 12/16
       if(gender.startsWith("H")){
           curp+="H";
           
       }else{
           curp+="M";
           
       }
           //ESTADO Y/o ENTIDAD fereativa 14/18 letras de la curp
           
           if (state.equals("AGUASCALIENTES")){
           curp += "AS";
       }
       if (state.equals("BAJA CALIFORNIA NTE")){
           curp += "BC";
       }
       if (state.equals("BAJA CALIFORNIA SUR")){
           curp += "BS";
       }
       if (state.equals("CAMPECHE")){
           curp += "CC";
       }
       if (state.equals("COAHUILA")){
           curp += "CL";
       }
       if (state.equals("COLIMA")){
           curp += "CM";
       }
       if (state.equals("CHIAPAS")){
           curp += "CS";
       }
       if (state.equals("CHIHUAHUA")){
           curp += "CH";
       }
       if (state.equals("DISTRITO FEDERAL")){
           curp += "DF";
       }
       if (state.equals("DURANGO")){
           curp += "DG";
       }
       if (state.equals("GUANAJUATO")){
           curp += "GT";
       }
       if (state.equals("GUERRERO")){
           curp += "GR";
       }
       if (state.equals("HIDALGO")){
           curp += "HG";
       }
       if (state.equals("JALISCO")){
           curp += "JC";
       }
       if (state.equals("MEXICO")){
           curp += "MC";
       }
       if (state.equals("MICHOACAN")){
           curp += "MN";
       }
       if (state.equals("MORELOS")){
           curp += "MS";
       }
       if (state.equals("NAYARIT")){
           curp += "NT";
       }
       if (state.equals("NUEVO LEON")){
           curp += "NL";
       }
       if (state.equals("OAXACA")){
           curp += "OC";
       }
       if (state.equals("PUEBLA")){
           curp += "PL";
       }
       if (state.equals("QUERETARO")){
           curp += "QT";
       }
       if (state.equals("QUINTANA ROO")){
           curp += "QR";
       }
       if (state.equals("SAN LUIS POTOSI")){
           curp += "SP";
       }
       if (state.equals("SINALOA")){
           curp += "SL";
       }
       if (state.equals("SONORA")){
           curp += "SR";
       }
       if (state.equals("TABASCO")){
           curp += "TC";
       }
       if (state.equals("TAMAULIPAS")){
           curp += "TS";
       }
       if (state.equals("TLAXCALA")){
           curp += "TL";
       }
       if (state.equals("VERACRUZ")){
           curp += "VZ";
       }
       if (state.equals("YUCATAN")){
           curp += "YN";
       }
       if (state.equals("ZACATECAS")){
           curp += "ZS";
       }
       if (state.equals("NACIDO EN EL EXTRANJERO")){
           curp += "NE";
       }
       
       //CONSONANTE apellido paterno 15/18
       
       char [] consonants = {'B' ,'C' ,'D' ,'F' ,'G' ,'H' ,'J' ,'K' ,'L' ,'M' ,'N' ,'Ñ' ,'P' ,'Q' ,'R' ,'S' ,'T' ,'V' ,'X' ,'Z' ,'W' ,'Y'};
       char letterConsonant=0;
       for (int i = letters.length -1; i>=1;i--)
           for(int a = consonants.length-1; a>=0; a--){
               if(letters[i]==consonants[a]){
                 letterConsonant = letters[i];  
               }
               
               
           }
       
       curp+=letterConsonant;
       
        //CONSONANTE APELLIDO MATERNO 16/18
        char lettercon = 0;
        for (int i = letter.length - 1; i >= 1; i--) 
            for (int a = consonants.length - 1; a >= 0; a--) {
                if (letter[i] == consonants[a]) {
                    lettercon = letter[i];

                }
            }
            curp+=lettercon;

        
        
        //consonante del nombre 17/18
        
        String fullname;
        if(name.contains("JOSE")){
            String[] parts = name.split(" ");
            fullname = parts[1].substring(0,1);
            curp+=fullname.charAt(0);
            
        }else if(name.contains("MARIA")){
            String [] parts = name.split(" ");
            fullname=parts[1].substring(0,1);
            curp+=fullname.charAt(0);
            
        }else{
            char numConsonants = 0;
            for(int i=lettername.length-1;i>=1;i--)
                for(int a = consonants.length -1; a>=0;a--){
                    if(lettername[i]== consonants[a]){
                        numConsonants=lettername[i];
                    }
                }
                curp+=numConsonants;
            
        }
        
        // determinante milenio 18/18
        int year = Integer.parseInt(yearborn);
        int limit = 2000;
        if(limit<=year){
            curp+="A";
        }else{
            curp+="0";
        }
        curp+="1";
        return curp;
    }
    
}
