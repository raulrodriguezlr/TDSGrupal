import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TDSGrupal {

        public static void main(String[] args) {
            try{
                CharStream input = CharStreams.fromFileName(args[0]);
                // Crear el objeto correspondiente al analizador l�xico con el fichero de entrada
                TDSGrupalLexer analex = new TDSGrupalLexer(input);

                // Identificar al analizador lexico como fuente de tokens para el sintactico
                CommonTokenStream tokens = new CommonTokenStream(analex);
                // Crear el objeto correspondiente al analizador sint�ctico con el objeto sintesis
                sintesis datos = new sintesis();
                TDSGrupalParser anasint = new TDSGrupalParser(tokens, datos);


                String s= ("<!DOCTYPE html>\n<html>\n<head>\n\t<title>"+(String)args[0]+ ".html" +"</title>\n</head>\n<body>");
                PrintStream printStream = new PrintStream(new FileOutputStream((String)args[0]+".html"));
                PrintStream stdout = System.out;//me guardo la salida por pantalla
                System.setOut(printStream);
                System.out.println(s);
                anasint.axioma();
                System.out.println("</body>\n</html>");
                // Llamar al metodo para sacar el resumen de la clase s�ntesis
              //  datos.resumen();
            } catch (RecognitionException e) {
                System.err.println("REC " + e.getMessage());
                //e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.err.println("IO " + e.getMessage());
                //e.printStackTrace();
            } catch (RuntimeException e) {
                System.err.println("RUN " + e.getMessage());
                //e.printStackTrace();
            }
        }
    }

