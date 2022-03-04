import java.util.*;
import java.util.function.Function;
/*
        Dados as seguintes informações de id e contato, crie um dicionário e ordene esse dicionário)
        * */

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\t Ordem aleatória\t--");

        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(2, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};

        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println();
        System.out.println("--\t Ordem inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(2, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};

        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println();
        System.out.println("--\t Ordem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        //utilizando classe anônima
/*
        System.out.println();
        System.out.println("--\t Ordem numero telefone\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }

        });

        //utilizando functional interface

        System.out.println();
        System.out.println("--\t Ordem numero telefone\t--");

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing
                (new Function<Map.Entry<Integer,Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
}
*/
        //utilizando expressão lambda

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing
                (cont -> cont.getValue().getNumero()));

    }
}

