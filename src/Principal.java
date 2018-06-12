
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gus
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa lucas = new Pessoa();
        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.altura = 1.94f;
        lucas.peso = 94.0f;
        lucas.sexo = 'm';
        lucas.cpf ="123.456.789-12";
        lucas.sobrenome = "Rpdrigo";
        
        Pessoa carlos = new Pessoa();
        carlos.idade = 18;
        carlos.peso = 78f;
        carlos.sexo = 'm';
        carlos.cpf = "987.654.321-98";
        carlos.nome = "Carlos";
        carlos.sobrenome = "Augusto";
        carlos.altura = 1.78f;
        JOptionPane.showMessageDialog(null, lucas);
        JOptionPane.showMessageDialog(null, carlos);
        
        //Macacos
        Macaco prego = new Macaco();
        prego.idade = 1;
        prego.nomeCientifico ="Sapajus";
        prego.apelido ="Macaco Prego";
        prego.corPelo = "marron";
        prego.altura = 0.48f;
        prego.peso = 4.3f;
        prego.reino = "Animalia";
        prego.filo = "Chordata";
        prego.classe = "Mammalia";
        prego.ordem = "Primates";
        prego.familia = "Cebidae";
        prego.genero = "Sapajus";
        prego.especie = "Sapajus";
        
        Macaco micoLeao = new Macaco();
        micoLeao.nomeCientifico = "Leontopithecus";
        micoLeao.idade = 2;
        micoLeao.corPelo = "dourado";
        micoLeao.altura= 0.26f;
        micoLeao.peso = 0.620f;
        micoLeao.reino = "Animalia";
        micoLeao.filo = "Chordata";
        micoLeao.classe = "Mammalia";
        micoLeao.ordem = "primates";
        micoLeao.familia = "Callitrichidae";
        micoLeao.genero = "Leontopithecus";
        micoLeao.especie = "L.rosalia";
        
        Macaco mandril = new Macaco();
        mandril.idade = 2;
        mandril.nomeCientifico = "Mandrillus sphinx";
        mandril.corPelo = "Verde-Oliva";
        mandril.altura = 0.40f;
        mandril.peso = 0.035f;
        mandril.reino = "Animalia";
        mandril.filo = "Chordata";
        mandril.classe = "Mammalia";
        mandril.ordem = "Primates";
        mandril.familia = "Cercopithecidae";
        mandril.genero = "Mandrillus";
        mandril.especie = "Mandrillus sphinx";
        
        Macaco narigudo = new Macaco();
        narigudo.nomeCientifico = JOptionPane.showInputDialog(null, 
                "Informe o Nome Cientifico do Animal","Nasalis larvatus",JOptionPane.PLAIN_MESSAGE);
        Macaco japones = new Macaco();
        
        
    }
    
}
