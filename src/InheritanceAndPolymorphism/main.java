package InheritanceAndPolymorphism;
public class main {
   public static void main(String[]args){
                                                    //Exercise with Constructor Methods
   Humano h = new Humano("Charles Darwin");         //Constants and Bidirectional Associations
 
   Biologo b = new Biologo();
   
   //System.out.println(h.nome);
   
   b.analisar(h);
   
   
   }
}