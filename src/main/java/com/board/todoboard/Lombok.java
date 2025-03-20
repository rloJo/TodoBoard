package com.board.todoboard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lombok {
    private String hello;
    private int lombok;

    public static void main(String[] args) {
        Lombok helloLombok = new Lombok();
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
