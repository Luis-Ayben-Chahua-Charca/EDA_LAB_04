public class PeorCasoDoubleList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        lista = PeoresCasos(5);
    }

    public static DoublyLinkedList PeoresCasos(int a){
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();

        for (int i = a; i > 0; i--) {
            lista.insertFirst(i);
        }

        return lista;
    }
}
