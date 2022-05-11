package main

object Implementation {
    def main(args : Array[String]) : Unit = {
      val tree = {
         BinaryTree( BinaryNode(  BinaryNode( BinaryNode(NullNode, NullNode, 69) ,  BinaryNode( BinaryNode( BinaryNode(NullNode, NullNode, 1000), NullNode, 134) , NullNode, 458), 99),  NullNode  , 3))
      }
      println(tree.heightOfTree(tree.rootNode))
      println(tree.noOfLeafNodes(tree.rootNode))
      println(tree.preOrderTraversal(tree.rootNode))
    }
  }
/*
 Binary
                                     3
                         99                   x

                   69         458         x           x

                 x    x     134    x    x     x    x    x

               x  x  x  x 1000 x  x x  x  x  x  x  x x  x x
*/
