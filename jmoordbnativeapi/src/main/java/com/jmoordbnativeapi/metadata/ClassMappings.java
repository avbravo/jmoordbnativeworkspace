package com.jmoordbnativeapi.metadata;

import java.util.Optional;

public interface ClassMappings {

    EntityMetadata get(Class<?> classEntity);

    EntityMetadata findByName(String name);

    Optional<EntityMetadata> findBySimpleName(String name);

    Optional<EntityMetadata> findByClassName(String name);
}
