package com.slevi.sdp.domain.enums;

import java.util.Objects;

public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private int cod;
    private String descricao;

    private EstadoPagamento(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer cod) {
        if (Objects.isNull(cod)) {
            return null;
        }

        for (EstadoPagamento ep : EstadoPagamento.values()) {
            if (cod.equals(ep.getCod())) {
                return ep;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);

    }
}
