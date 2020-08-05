package com.sample.LMS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserType")
public class UserType {
  @Id
  private int id;
  private String type;
}
