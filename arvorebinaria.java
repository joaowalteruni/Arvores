public class ArvoreBinaria {

    private No raiz;

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
        } else {
            No novo = new No(valor);
            inserir(raiz, novo);

        }

    }

    private void inserir(No arvore, No novo) {
        if (novo.valor > arvore.valor) {
            if (arvore.direito == null) {
                arvore.direito = novo;
            } else {
                inserir(arvore.direito, novo);
            }
        } else {
            if (arvore.esquerdo == null) {
                arvore.esquerdo = novo;
            } else {
                inserir(arvore.esquerdo, novo);
            }
        }
    }
