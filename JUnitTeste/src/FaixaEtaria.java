
/**
 *
 * @author Felipe Gomes Mendes
 */
public class FaixaEtaria extends InformaIdade {
    public String autoriza;
    public String nãoAutoriza;
    
    public void verificaFaixaEtaria(){
        if(this.idade < 18){
            this.nãoAutoriza = "Não";
            System.out.println("Individuo Menor de Idade");
        }else if(this.idade >= 18){
            this.autoriza = "Sim";
            System.out.println("Individuo Maior de Idade");
        }
    }
}
