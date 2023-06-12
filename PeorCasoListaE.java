import java.util.LinkedList;

class PeorCasoListaE{
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista = PeoresCasos(5);
    }       

    public static LinkedList PeoresCasos(int a){
        LinkedList<Integer> lista = new LinkedList<Integer>();

        for (int i = a; i > 0; i--) {
            lista.add(i);
        }

        return lista;
    }
}