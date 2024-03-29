package com.meanlightk.study.domain;


import jakarta.persistence.*;

@Entity
public class Member {

    /**
     * IDENTITY 전략: DB에 값을 넣으면 (INSERT) DB가 아이디를 자동으로 생성해주는 것.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * @Column(name = "username") => DB 컬럼명을 입력하여 연결
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
