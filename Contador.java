public class Contador{
    public static void main(String[] args) {
        int contador = 0;

        while(contador < 500) {
            contador += 3;
            if(contador > 233 && contador < 456) {
                System.out.println("Adicionando +3: " + contador);
            }
            while(contador < 400 && contador > 300) {
                contador +=5;
                System.out.println("Adicionando +5: " +contador);
            }


        }
    }
}