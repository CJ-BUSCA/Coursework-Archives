using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructures
{
    class HashTable
    {
        private LinkedList[] data;

        public HashTable(int size)
        {
            this.data = new LinkedList[size];
            for (int i = 0; i < size; i++)
            {
                this.data[i] = new LinkedList();
            }
        }

        public void insert(String value)
        {
            int index = Math.Abs(hashFunction(value)) % data.Length;
            this.data[index].insert(value);
        }

        public bool search(String value)
        {
            int index = Math.Abs(hashFunction(value)) % data.Length;
            return data[index].search(value);
        }

        public bool delete(String value)
        {
            int index = Math.Abs(hashFunction(value)) % data.Length;
            return data[index].delete(value);
        }

        private int hashFunction(String value)
        {
            int hash = 7;
            foreach (char c in value.ToCharArray())
            {
                hash = hash * 31 + c;
            }
            return hash;
        }

        private int jenkins_hash(String value)
        {
            int hash = 0;

            foreach (char c in value.ToCharArray())
            {
                hash += (c & 0xFF);
                hash += (hash << 10);
                hash ^= (hash >> 6);
            }
            hash += (hash << 3);
            hash ^= (hash >> 11);
            hash += (hash << 15);
            return hash;
        }
    }
}
