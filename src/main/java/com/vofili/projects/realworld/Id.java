package com.vofili.projects.realworld;

import java.util.Objects;

public class Id {
    String id;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Id id1 = (Id) o;
        return Objects.equals(id, id1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Id{" +
                "id='" + id + '\'' +
                '}';
    }
}
