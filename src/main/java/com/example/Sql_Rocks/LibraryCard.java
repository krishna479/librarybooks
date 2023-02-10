package com.example.Sql_Rocks;

import javax.persistence.*;

@Entity
@Table(name="Library_card")
public class LibraryCard {
    @Id
    private int CardNo;
    private int fine;
    private int bookIssued;

  @Enumerated(value = EnumType.STRING)
  private CardStatus cardstatus;
    @OneToOne
    @JoinColumn
    User user;


}
