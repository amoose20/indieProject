package com.liveodds.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type Team.
 */
@Entity
@Table(name = "team", catalog = "live_odds") // case sensitive!
public class Team {

    @Column (name = "name")
    private String name;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "teams")
    private Set<User> users = new HashSet<User>(0);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int teamId;

    /**
     * Instantiates a new Team.
     */
    public Team() {
    }

    /**
     * Instantiates a new Team.
     *
     * @param name the name
     */
    public Team(String name) {
        this.name = name;
    }

    /**
     * Instantiates a new Team.
     *
     * @param name  the name
     * @param users the user
     */
    public Team(String name, Set<User> users) {
        this.name = name;
        this.users = users;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public Set<User> getUser() {
        return this.users;
    }

    /**
     * Sets user.
     *
     * @param users the users
     */
    public void setUser(Set<User> users) {
        this.users = users;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return teamId;
    }

    /**
     * Sets id.
     *
     * @param teamId the id
     */
    public void setId(int teamId) {
        this.teamId = teamId;
    }


}
