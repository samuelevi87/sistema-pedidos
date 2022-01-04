package com.slevi.sdp.domain.enums;

import java.util.Objects;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int cod;
    private String descricao;

    private TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod) {
        if (Objects.isNull(cod)) {
            return null;
        }

        for (TipoCliente cliente : TipoCliente.values()) {
            if (cod.equals(cliente.getCod())) {
                return cliente;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);

    }
}
