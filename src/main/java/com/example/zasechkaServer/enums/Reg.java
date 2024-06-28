package com.example.zasechkaServer.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Reg {
    Open("Открыта"),
    Close("Закрыта");

    private final String value;

    Reg(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
