package com.example.datastructure.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Node<T> {
    T data;
    Node<T> left, right;

    public Node(T data){
        this.data = data;
    }
}
