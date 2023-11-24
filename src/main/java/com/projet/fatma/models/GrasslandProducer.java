package com.example.exacttool.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="grasslandSystemsTotal")

public class GrasslandSysTotal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String userNotesGrassland;

    private GrasslandManagement startGrasslandManagement2;
    private GrasslandManagement withoutGrasslandManagement2;
    private GrasslandManagement withGrasslandManagement2;
    private Boolean withoutFireMang2;
    static final int year3 = 5;
    private Boolean withFireMang2;
    static final int year4 = 5;
    private int startYield2;
    private int withoutYield2;
    private int withYield2;
    private int startAreaGrassland2;
    private int withoutAreaGrassland2;
    private Type typeWithoutAreaGrassland2;
    private int withAreaGrassland2;
    private Type typeWithAreaGrassland2;
    private int withoutTotEmissionsGrassland2;
    private int withTotEmissionsGrassland2;
    private int balanceGrassland2;
    private int withoutTotGrasslandSys;
    private int withTotGrasslandSys;
    private int balanceTotGrasslandSys;

}
