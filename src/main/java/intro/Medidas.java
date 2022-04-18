// 1- pacote
package intro;
//2- Referencias de biblioteca

// 3- classes
public class Medidas {
    //3.1 atributos - Caracteristicas

    //3.2 - Métodos e Funções (o que ele sabe fazer)
    //metodo faz e fica quieto (void)
    //funções faz e retorna
    //primeira função tem o nome determinada (funçao estatica)
    //main é o principal = fio da meada que vai chamar as outras estruturas
    //toda primeira função se chama Main[
    //todas funções que o main vai chamar temos que usar static
    public static void main (String []args){
    calcularAreaCurto();
    calcularAreaModoExtenso();

    }
    public  void calcularAreaModoCondensado(){
        System.out.println("Bom dia!");
        System.out.println("calculo de Areas");


        int largura = 5;
        int comprimento = 10;

        System.out.println("Para a Largura de " + largura + " e o comprimento de " + comprimento +
                " A area do tapete é de: " + largura*comprimento + " m² ");
    }

    public static void calcularAreaModoExtenso(){
        int largura;
        int comprimento;
        int resultado;

        largura=4;
        comprimento=3;

        resultado = largura * comprimento;
        System.out.println("Para a Largura de " + largura + " e o comprimento de " + comprimento +
                " A area do tapete é de: " + resultado + " m² ");
    }
    public static void calcularAreaCurto(){
        int largura = 5;
        int comprimento = 10;

        System.out.println("Para a Largura de " + largura + " e o comprimento de " + comprimento +
                " A area do tapete é de: " + largura*comprimento + " m² ");
    }
}
