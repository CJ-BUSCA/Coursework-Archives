using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructures
{
    class BinarySearchTree
    {
        BinarySearchTreeNode root;

        public BinarySearchTree()
        {
            this.root = null;
        }

        public void insert(int value)
        {
            if (this.root == null)
            {
                this.root = new BinarySearchTreeNode(value);
                return;
            }

            BinarySearchTreeNode parent = null;
            BinarySearchTreeNode current = this.root;
            while (current != null)
            {
                parent = current;
                if (current.getValue() < value)
                {
                    current = current.getRight();
                }
                else if (current.getValue() > value)
                {
                    current = current.getLeft();
                }
                else
                {
                    //the value you are inserting is already in tree
                    return;
                }
            }

            if (parent.getValue() < value)
            { //parent will never be null
                parent.setRight(new BinarySearchTreeNode(value));
            }
            else
            {
                parent.setLeft(new BinarySearchTreeNode(value));
            }
        }

        public bool search(int value)
        {
            BinarySearchTreeNode current = this.root;
            while (current != null)
            {
                if (current.getValue() > value)
                {
                    current = current.getLeft();
                }
                else if (current.getValue() < value)
                {
                    current = current.getRight();
                }
                else
                {
                    return true;
                }
            }
            return false;
        }

        public bool delete(int value)
        {
            if (this.root == null)
            { // in case tree is empty
                return false;
            }

            BinarySearchTreeNode current = this.root;
            BinarySearchTreeNode parent = null;

            while (current.getValue() != value)
            {
                parent = current;

                if (current.getValue() > value)
                {
                    current = current.getLeft();
                }
                else if (current.getValue() < value)
                {
                    current = current.getRight();
                }

                if (current == null)
                {
                    // value is not in this tree
                    return false;
                }
            }

            // now we have in current the node that we want to delete
            //case 1
            //  current is a leaf
            if ((current.getLeft() == null) && (current.getRight() == null))
            {
                if (current == this.root)
                {
                    this.root = null;
                }
                else if (parent.getValue() < current.getValue())
                {
                    parent.setRight(null);
                }
                else
                {
                    parent.setLeft(null);
                }
                return true;
            }

            //case 2
            //  current have one child
            if (current.getLeft() == null)
            {
                if (current == this.root)
                {
                    this.root = current.getRight();
                }
                else if (parent.getValue() < current.getValue())
                {
                    parent.setRight(current.getRight());
                }
                else
                {
                    parent.setLeft(current.getRight());
                }
                return true;
            }
            else if (current.getRight() == null)
            {
                if (current == this.root)
                {
                    this.root = current.getLeft();
                }
                else if (parent.getValue() < current.getValue())
                {
                    parent.setRight(current.getLeft());
                }
                else
                {
                    parent.setLeft(current.getLeft());
                }
                return true;
            }

            //case 3
            //  current have left and right child
            if ((current.getLeft() != null) && (current.getRight() != null))
            {
                BinarySearchTreeNode successor = getBiggestNodeFromLeftSubtree(current);
                successor.setLeft(current.getLeft());
                successor.setRight(current.getRight());
                if (current == this.root)
                {
                    this.root = successor;
                }
                else if (parent.getValue() < successor.getValue())
                {
                    parent.setRight(successor);
                }
                else
                {
                    parent.setLeft(successor);
                }
                return true;
            }
            return false;
        }

        public void print()
        {
            BinarySearchTreeNode[] nodes = { this.root };
            if (this.root == null)
            {
                return;
            }
            int height = Math.Max(getHeight(this.root.getLeft()), getHeight(this.root.getRight()));

            while (haveNodesToPrint(nodes))
            {
                int offset = (int)Math.Pow(2, height + 1);

                foreach (BinarySearchTreeNode node in nodes)
                {
                    printSpace(offset); // offset before every number
                    if (node != null)
                    {
                        Console.Write(node.getValue());
                    }
                    else
                    {
                        Console.Write("  ");
                    }
                    printSpace(offset - 2); // minus 2 because we expect the number to have length of 2

                }
                //print the spaces
                for (int i = 0; i <= height; i++)
                {
                    Console.WriteLine();
                }

                // prepare for printing next line
                BinarySearchTreeNode[] newNodes = new BinarySearchTreeNode[nodes.Length * 2]; // every node have 2 childs
                int index = 0;
                foreach (BinarySearchTreeNode node in nodes)
                {
                    if (node != null)
                    {
                        newNodes[index] = node.getLeft();
                        index++;
                        newNodes[index] = node.getRight();
                        index++;
                    }
                    else
                    {
                        //even if it is null you need to print spaces
                        newNodes[index] = null;
                        index++;
                        newNodes[index] = null;
                        index++;
                    }
                }

                nodes = newNodes;
                height--;
            }
        }

        private int getHeight(BinarySearchTreeNode current)
        {
            if (current == null)
            {
                return 0;
            }
            return 1 + Math.Max(getHeight(current.getLeft()), getHeight(current.getRight()));
        }

        private BinarySearchTreeNode getBiggestNodeFromLeftSubtree(BinarySearchTreeNode start)
        {

            BinarySearchTreeNode parent = start.getLeft(); // in left subtree
            BinarySearchTreeNode rightChild = parent.getRight(); // represents most right node

            if (rightChild == null)
            { // in case left subtree of start have no right child
                start.setLeft(parent.getLeft());
                return parent;
            }

            while (rightChild.getRight() != null)
            {
                parent = rightChild;
                rightChild = rightChild.getRight();
            }
            //in rightChild is the most right (biggest) node
            //  if biggest node have leftChild it will be set as right child of parent
            //  if leftChild is null, the right child of parent will be also null
            parent.setRight(rightChild.getLeft());

            return rightChild;
        }

        private bool haveNodesToPrint(BinarySearchTreeNode[] nodes)
        {
            foreach (BinarySearchTreeNode node in nodes)
            {
                if (node != null)
                {
                    return true;
                }
            }
            return false;
        }

        private void printSpace(int n)
        {
            while (n != 0)
            {
                Console.Write(" ");
                n--;
            }
        }
    }
}
