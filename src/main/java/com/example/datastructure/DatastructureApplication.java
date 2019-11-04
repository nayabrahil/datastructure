package com.example.datastructure;

import com.example.datastructure.common.Node;
import com.example.datastructure.common.TreeUtil;
import com.example.datastructure.tree.Tree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatastructureApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DatastructureApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tree<Integer> tree = new Tree<>();
        tree.setRoot(new Node<>(1));
        tree.getRoot().setLeft(new Node<>(2));
        tree.getRoot().setRight(new Node<>(3));
        tree.getRoot().getLeft().setLeft(new Node<>(4));
        tree.getRoot().getLeft().setRight(new Node<>(5));

        TreeUtil.preOrderTraversal(tree.getRoot());

        System.out.println("=====================");
        TreeUtil.postOrderTraversal(tree.getRoot());

        System.out.println("=====================");
        TreeUtil.inOrderTraversal(tree.getRoot());

        System.out.println("======Height of the Tree======");
        System.out.println(TreeUtil.height(tree.getRoot()));

    }
}
