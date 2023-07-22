package geradorRelatoriosBase.Ordenacao;

import java.util.List;

import geradorRelatoriosBase.Produto;
import geradorRelatoriosBase.Ordenacao.Criterio.CriterioComparacao;
import geradorRelatoriosBase.Ordenacao.Criterio.SelecionarEstrategiaCriterio;

public class QuickSort implements AlgoritmoOrdenacao {

    private CriterioComparacao criterio;

    public QuickSort(String criterio) {
        this.criterio = SelecionarEstrategiaCriterio.criarEstrategia(criterio);
    }

    private int particiona(int ini, int fim, List<Produto> produtos) {
        Produto x = produtos.get(ini);
        int i = (ini - 1);
        int j = (fim + 1);

        while (true) {
            do {
                j--;
            } while (criterio.comparar(produtos.get(j), x));

            do {
                i++;
            } while (criterio.comparar(x, produtos.get(i)));

            if (i < j) {
                Produto temp = produtos.get(i);
                produtos.set(i, produtos.get(j));
                produtos.set(j, temp);
            } else {
                return j;
            }
        }
    }

    @Override
    public List<Produto> ordenar(int ini, int fim, List<Produto> produtos) {
        if (ini < fim) {
            int q = particiona(ini, fim, produtos);
            ordenar(ini, q, produtos);
            ordenar(q + 1, fim, produtos);
        }
        return produtos;
    }
}

