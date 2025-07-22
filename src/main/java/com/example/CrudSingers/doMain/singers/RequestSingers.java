package com.example.CrudSingers.doMain.singers;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestSingers(
        String id,

        @NotBlank
        String name,

        @NotNull
        Integer age) {
}
