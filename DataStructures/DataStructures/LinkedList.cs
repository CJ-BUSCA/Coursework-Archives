using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructures
{
    class LinkedList
    {
        private class Node
        {

            private String value;
            private Node next;

            public Node(String value, Node next)
            {
                this.value = value;
                this.next = next;
            }

            public String getValue()
            {
                return value;
            }

            public void setValue(String value)
            {
                this.value = value;
            }

            public Node getNext()
            {
                return next;
            }

            public void setNext(Node next)
            {
                this.next = next;
            }
        }

        private Node head;

        public LinkedList()
        {
            this.head = null;
        }

        public void insert(String value)
        {
            this.head = new Node(value, this.head);
        }

        public bool search(String value)
        {
            Node n = this.head;
            while (n != null)
            {
                if (n.getValue() == value)
                {
                    return true;
                }
                n = n.getNext();
            }
            return false;
        }

        public bool delete(String value)
        {
            if (this.head == null)
            {
                return false;
            }
            else if (this.head.getValue() == value)
            {
                //deleting head
                this.head = this.head.getNext();
                return true;
            }

            Node previous = this.head;
            Node current = this.head.getNext();
            while (current != null)
            {
                if (current.getValue() == value)
                {
                    previous.setNext(current.getNext());
                    return true;
                }
                previous = current;
                current = current.getNext();
            }
            return false;
        }

        public void print()
        {
            Node n = this.head;
            while (n != null)
            {
                Console.Write(n.getValue() + " > ");
                n = n.getNext();
            }
            Console.WriteLine("null");
        }
    }
}
