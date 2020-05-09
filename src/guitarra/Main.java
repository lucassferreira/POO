
package guitarra;

public class Main {
    
    //o metodo main() é o metodo principal da classe

    public static void main(String[] args) {
     //instanciamos um objeto chamado "minhaGuitarra" que sera do tipo "Guitarra"
        //Os valores passados são usados pelo construtor da classe para criar
        // o objeto   
    Guitarra guitarra = new Guitarra("01020304","fender",  "telecaster","elétrica", "mogno", 1500.00);
        
        System.out.println("Numero de Serie: " + guitarra.getNumeroSerie());
        System.out.println("Fabricante: " + guitarra.getFabricante());
        System.out.println("Madeira: " + guitarra.getMadeira());
        System.out.println("Tipo: " + guitarra.getTipo());
        System.out.println("Modelo: " + guitarra.getModelo());
        System.out.println("Preço: " + guitarra.getPreco());
        
    }
    
}

