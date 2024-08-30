package com.dev.spring.boot.commons.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
    value = {"created_at", "updated_at","created_by","updated_by","Deleted"},
    allowGetters = true
)
@Getter
@Setter
public abstract class DateAudit implements Serializable {

  @JsonIgnore
  @CreatedDate
  @Column(name = "CREATED_AT")
  private Instant createdAt;


  @JsonIgnore
  @CreatedBy
  @Column(name = "CREATED_BY")
  private int createdBy;

  @JsonIgnore
  @LastModifiedDate
  @Column(name = "UPDATED_AT")
  private Instant updatedAt;

  @JsonIgnore
  @LastModifiedBy
  @Column(name = "UPDATED_BY")
  private int updatedBy;


  @JsonIgnore
  @Column(name = "DELETED")
  private  Boolean Deleted=false;


}
