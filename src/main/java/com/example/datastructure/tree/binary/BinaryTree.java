package com.example.datastructure.tree.binary;

import com.example.datastructure.common.Node;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BinaryTree<T> {
    Node<T> root;
}
