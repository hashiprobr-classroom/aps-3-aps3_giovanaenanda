import java.util.HashMap;
import java.util.Map;

public class Jogo {
    private Integer id;
    private String nome;
    private Map<String, Integer> avaliacoes;

    public Jogo(Integer id, String nome){
        this.id = id;
        this.nome = nome;
        this.avaliacoes = new HashMap<>();
    }
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }

    public void avalia(String apelido, Integer avaliacao){
        avaliacoes.put(apelido, avaliacao);
    }

    public boolean avaliado(String apelido){
        return avaliacoes.containsKey(apelido);
    }

    public double media(){
        Integer soma = 0;
        if (avaliacoes.isEmpty()){
            return 0.0;
        }
        for (Integer vv : avaliacoes.values()){
            soma += vv;
        }
        return (double) soma / avaliacoes.size();
    }
}