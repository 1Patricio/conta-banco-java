package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class MeusCarros {
        private List<Veiculo> listaCarros;

        public MeusCarros() {
            listaCarros = new ArrayList<>();
        }

         void adicionarCarros (Veiculo veiculo) {
            listaCarros.add(veiculo);
         }
}
