package com.liveodds.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type User.
 */
@Entity
@Table(name = "user", catalog = "live_odds")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int userId;

    @Column(name = "name")
    private String name;

    @Column(name = "Age")
    private int age;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_teams", catalog = "live_odds", joinColumns = {
            @JoinColumn(name = "user_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "team_id",
                    nullable = false, updatable = false) })
    private Set<Team> teams = new HashSet<Team>(0);


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param name the username
     * @param age       the age
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * Instantiates a new User.
     *
     * @param name the username
     * @param age       the age
     */
    public User(String name, int age, Set<Team> teams) {
        this.name = name;
        this.age = age;
        this.teams = teams;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return userId;
    }

    /**
     * Sets id.
     *
     * @param userId the userId
     */
    public void setId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets first name.
     *
     * @param name the username
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets teams.
     *
     * @return the teams
     */

    public Set<Team> getTeams() {
        return this.teams;
    }

    /**
     * Sets teams.
     *
     * @param teams the teams
     */
    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }


}
