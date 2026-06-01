package com.vofili.projects.realworld;

import java.util.Objects;

public class Message {
    String content;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(content, message.content);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(content);
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                '}';
    }
}
