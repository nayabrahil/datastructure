package com.example.datastructure.tree;

import com.example.datastructure.common.Node;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tree<T> {

    Node<T> root;

    public Tree(Node<T> data){
        this.root = data;
    }

    public Tree(){}

}
