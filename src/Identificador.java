
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FLAVIO
 */
public class Identificador{
    public static int identId;
    public static String identNome;
    public static String identData;
    public static String identSexo;
    public byte[] imagem;    
    
    public int getId(){
        return identId;
    }
    public void setId(int valor){
        this.identId = valor;
    }
    public String getNome(){
        return identNome;
    }
    public void setNome(String nome){
        this.identNome = nome;
    }
    public String getData(){
        return identData;
    }
    public void setData(String data){
        this.identData = data;
    }
    public String getSexo(){
        return identSexo;
    }
    public void setSexo(String sexo){
        this.identSexo = sexo;
    }
    public byte[] getImagem(){
        return imagem;
    }
    public void setImagem(byte[] ima){
        this.imagem = ima;
    }
    public void copyFile( File from, File to ) throws IOException {
        Files.copy( from.toPath(), to.toPath() );
     }
        
}
