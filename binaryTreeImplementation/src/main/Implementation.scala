package main

import main.{BinaryNode, BinaryTree, NullNode}

object Implementation {
  def main(args: Array[String]): Unit = {
    val tree = {
       BinaryTree( BinaryNode( BinaryNode( BinaryNode(NullNode, NullNode, 69), BinaryNode( BinaryNode( BinaryNode(NullNode, NullNode, 1000), NullNode, 134), NullNode, 458), 99), NullNode, 3))
    }
    println(tree.heightOfTree(tree.rootNode))
    println(tree.noOfLeafNodes(tree.rootNode))
    println(tree.preOrderTraversal(tree.rootNode))
  }

}
