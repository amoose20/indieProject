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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
     */
    public User(String name) {
        this.name = name;
    }
    /**
     * Instantiates a new User.
     *
     * @param name the username
     * @param age       the age
     */
    public User(String name, int age, Set<Team> teams) {
        this.name = name;
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
     * Gets username.
     *
     * @return the username
     */
    public String getName() {
        return name;
    }

    /**
     * Sets username.
     *
     * @param name the username
     */
    public void setName(String name) {
        this.name = name;
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

    public void addTeams(Team newTeam) {
        teams.add(newTeam);
        newTeam.setUser((Set<User>) this);
    }

    public void removeTeam(Team newTeam) {
        teams.remove(newTeam);
        newTeam.setUser(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId == Objects.equals(name, user.name) && Objects.equals(teams, user.teams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, teams);
    }
}
