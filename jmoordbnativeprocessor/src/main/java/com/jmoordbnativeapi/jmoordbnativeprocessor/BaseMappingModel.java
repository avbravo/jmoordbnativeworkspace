package com.jmoordbnativeapi.jmoordbnativeprocessor;

import java.time.LocalDateTime;

abstract class BaseMappingModel {

    public LocalDateTime getNow() {
        return LocalDateTime.now();
    }
}
