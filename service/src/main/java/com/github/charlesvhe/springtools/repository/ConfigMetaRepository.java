package com.github.charlesvhe.springtools.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.github.charlesvhe.springtools.entity.ConfigMeta;

@RestResource(path = "ConfigMeta")
public interface ConfigMetaRepository extends JpaRepository<ConfigMeta, Long> {

}
