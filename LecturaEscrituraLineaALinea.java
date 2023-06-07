import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class LecturaEscrituraLineaALinea {
    
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("CESURCartelera.txt");
                FileReader fin = new FileReader("CESURFichero.txt");
                BufferedReader fout = new BufferedReader(fin);){
            BufferedWriter bufferedWriter = null;
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("--------------------------------------");
            bufferedWriter.write("\n");
            bufferedWriter.write("Cartelera de Cine");
            bufferedWriter.write("\n");
            bufferedWriter.write("--------------------------------------");
            bufferedWriter.write("\n");
            String e = fout.readLine();
            String[] esp = e.split("@");
            for(int i = 0; i<esp.length;i++){
                String[] espi = esp[i].split("#");
                for(int y = 0; y<espi.length;y++){
                    switch(y){
                        case 0:
                            bufferedWriter.write("-----");
                            bufferedWriter.write(espi[0]);
                            bufferedWriter.write("-----");
                            bufferedWriter.write("\n");
                        break;
                        
                        case 1:
                            bufferedWriter.write("Año: ");
                            bufferedWriter.write(espi[1]);
                            bufferedWriter.write("\n");
                        break;
                        
                        case 2:
                            bufferedWriter.write("Director: ");
                            bufferedWriter.write(espi[2]);
                            bufferedWriter.write("\n");
                        break;
                        
                        case 3:
                            bufferedWriter.write("Duración: ");
                            bufferedWriter.write(espi[3]);
                            bufferedWriter.write(" minutos");
                            bufferedWriter.write("\n");
                        break;
                        
                        case 4:
                            bufferedWriter.write("Sinopsis: ");
                            bufferedWriter.write(espi[4]);
                            bufferedWriter.write("\n");
                        break;
                        
                        case 5:
                            bufferedWriter.write("Reparto: ");
                            bufferedWriter.write(espi[5]);
                            bufferedWriter.write("\n");
                        break;
                        
                        case 6:
                            bufferedWriter.write("Sesión: ");
                            bufferedWriter.write(espi[6]);
                            bufferedWriter.write(" horas");
                            bufferedWriter.write("\n");
                        break;
                    }
                }
            }
            fin.close();
            bufferedWriter.close();
            fileWriter.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
