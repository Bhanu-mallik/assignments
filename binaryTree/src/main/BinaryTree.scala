package main


/*
2. Implement Binary tree with the following logic
* Calculate the height of Binary tree
* Number of leaf nodes
* preorder traversal of tree
Scala
* Should use case classes to represent the binary tree
* Should use recursion to implement the above 2 functions
* Should not use var or mutable data structures


Binary tree should have root Node, data member, and left node and right node.
if we need to construct a generic class then ?
should traverse and store the values in the 1 & 2 problem, for 3 problem need to evaluate it.
*/


trait Tree {

  val rootNode : Node
  //    def addNodeToTree(node : Node, insertNode : Node): Unit
  //    def heightOfTree(t : Node) : Int
  //    def noOfLeafNodes(t : Tree) : Int
  //    def preOrderTraversal(t : Tree) : Int
  // other generic methods for tree.
}

trait Node {}

case class BinaryNode( leftNode : BinaryNode,  rightNode : BinaryNode,  data : Int) extends Node{
}

object NullNode extends BinaryNode(leftNode =  BinaryNode(null, null, 0) : BinaryNode, rightNode =  BinaryNode(null, null, 0) : BinaryNode , data = 0 : Int) {
}

case class BinaryTree( rootNode : BinaryNode) extends Tree{

  //   def addNodeToTree(insertAtNode : BinaryNode, newNode : Node, isleftOrright : String): Unit = isleftOrright match {
  //     case left =>
  //     case right =>
  //   }
  def heightOfTree(rootNode : BinaryNode) : Int = {
    if(rootNode == NullNode) 0
    else Math.max(1+ heightOfTree(rootNode.rightNode) ,1+ heightOfTree(rootNode.leftNode))
  }

  def noOfLeafNodes(rootNode : BinaryNode) : Int = {
    if(rootNode.rightNode == NullNode && rootNode.leftNode == NullNode) 1
    else
      (if (rootNode.leftNode == NullNode) 0 else noOfLeafNodes(rootNode.leftNode)) +
        (if (rootNode.rightNode == NullNode) 0 else noOfLeafNodes(rootNode.rightNode))

  }

  def preOrderTraversal(rootNode : BinaryNode) : String = {
    print(rootNode.data + " ")
    if(rootNode.leftNode == NullNode) "" else preOrderTraversal(rootNode.leftNode)
    if(rootNode.rightNode == NullNode) "" else preOrderTraversal(rootNode.rightNode)
  }
}





