package estrutura.de.repetição;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class EstruturaDeRepetição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolvido com Array
        int cont [] = new int[5];
        for(int i = 0; i < 10; i++)
        {
            int idades = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite as Idades" + "Idade" + " " +i));
            if(idades <= 15){
                cont[0]++;
            }else if (idades > 15 && idades < 30){
                cont[1]++;
            }else if (idades > 31 && idades < 45){
                cont[2]++;
            }else if (idades > 46 && idades < 60){
                cont[3]++;
            }else if (idades > 60){
                cont[4]++;
            }
        }
        JOptionPane.showMessageDialog(null,"Idades Até 15 Foram" + " " + "->" + cont[0] + "\n" +
                                            "Idades Entre 16 e 30 Foram" + " " + "->" + cont[1] + "\n" +
                                            "Idades Entre 31 e 45 Foram" + " " + "->" + cont[2] + "\n" +
                                            "Idades Entre 46 e 60 Foram" + " " + "->" + cont[3] + "\n" +
                                            "Idades Acima de 60 Foram" + " " + "->" + cont[4] 
                                             );
    
        /*
        // Resolvido com Contador
        int i;
        int cont = 0,cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0;
        for(i = 0; i < 10; i++)
        {
            int idades = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite as Idades" + "Idade" + " " +i));
            if(idades <= 15){
                cont++;
            }else if (idades > 15 && idades < 30){
                cont1++;
            }else if (idades > 31 && idades < 45){
                cont2++;
            }else if (idades > 46 && idades < 60){
                cont3++;
            }else if (idades > 60){
                cont4++;
            }
        }
        JOptionPane.showMessageDialog(null,"Idades Até 15 Foram" + cont + "\n" +
                                            "Idades Entre 16 e 30 Foram" + " " + "->" + cont1 + "\n" +
                                            "Idades Entre 31 e 45 Foram" + " " + "->" + cont2 + "\n" +
                                            "Idades Entre 46 e 60 Foram" + " " + "->" + cont3 + "\n" +
                                            "Idades Acima de 60 Foram" + " " + "->" + cont4 
                                             );
         */
    }
    
}
