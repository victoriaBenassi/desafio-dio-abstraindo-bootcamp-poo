package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {
    protected static double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calculatXp();
}
