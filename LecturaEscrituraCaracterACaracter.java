import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class LecturaEscrituraCaracterACaracter {

    public static void main(String[] args) {
        int i = 0;
        boolean n = false;
        boolean a = false;
        boolean d = false;
        boolean du = false;
        boolean s = false;
        boolean r = false;
        boolean se = false;
        try(FileWriter fileWriter = new FileWriter("CESURCartelera.txt");
                FileInputStream fin = new FileInputStream("CESURFichero.txt")){
            BufferedWriter bufferedWriter = null;
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("--------------------------------------");
            bufferedWriter.write("\n");
            bufferedWriter.write("Cartelera de Cine");
            bufferedWriter.write("\n");
            bufferedWriter.write("--------------------------------------");
            bufferedWriter.write("\n");
            bufferedWriter.write("-----");
            do{
                i = fin.read();
                if(i!=-1 && n == false && a == false && (char)i =='#'){
                    n = true;
                    bufferedWriter.write("-----");
                    bufferedWriter.write("\n");
                    bufferedWriter.write("Año: ");
                }
                else if(i!=-1 && d == false && a == false && (char)i =='#'){
                    a = true;
                    bufferedWriter.write("\n");
                    bufferedWriter.write("Director: ");
                }
                else if(i!=-1 && d == false && du == false && (char)i =='#'){
                    d = true;
                    bufferedWriter.write("\n");
                    bufferedWriter.write("Duración: ");
                }
                else if(i!=-1 && du == false && s == false && (char)i =='#'){
                    du = true;
                    bufferedWriter.write(" minutos");
                    bufferedWriter.write("\n");
                    bufferedWriter.write("Sinopsis: ");
                }
                else if(i!=-1 && s == false && r == false && (char)i =='#'){
                    s = true;
                    bufferedWriter.write("\n");
                    bufferedWriter.write("Reparto: ");
                }
                else if(i!=-1 && r == false && se == false && (char)i =='#'){
                    r = true;
                    bufferedWriter.write("\n");
                    bufferedWriter.write("Sesión: ");
                }
                else if(i!=-1 && r == true && se == false && (char)i =='@'){
                    n = false;
                    a = false;
                    d = false;
                    du = false;
                    s = false;
                    r = false;
                    bufferedWriter.write(" horas");
                    bufferedWriter.write("\n");
                    bufferedWriter.write("-----");
                }
                else if(i!=-1){
                    bufferedWriter.write((char)i);
                }
                
            }
            while(i!=-1);
            bufferedWriter.write(" horas");
            bufferedWriter.write("\n");
            bufferedWriter.write("--------------------------");
            fin.close();
            bufferedWriter.close();
            fileWriter.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
