using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructures
{
    class BinarySearchTreeNode
    {
        private int value;
        private BinarySearchTreeNode left;
        private BinarySearchTreeNode right;

        public BinarySearchTreeNode(int value)
        {
            this.value = value;
            left = null;
            right = null;
        }

        public int getValue()
        {
            return value;
        }

        public void setValue(int value)
        {
            this.value = value;
        }

        public BinarySearchTreeNode getLeft()
        {
            return left;
        }

        public void setLeft(BinarySearchTreeNode left)
        {
            this.left = left;
        }

        public BinarySearchTreeNode getRight()
        {
            return right;
        }

        public void setRight(BinarySearchTreeNode right)
        {
            this.right = right;
        }
    }
}
