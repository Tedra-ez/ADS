# HashTable & BST Java Implementation

A concise Java project demonstrating:

- A generic **chained hash table** (`MyHashTable<K, V>`)
- A **non-recursive binary search tree** (`BST<K, V>`) with in-order iterator
- A simple **test harness** (`HashTableTest`) to exercise and visualize bucket distribution
- A **demo application** (`BSTDemo`) to show BST operations and iteration

---

## Features

- **MyHashTable**
    - `put(K key, V value)`, `get(K key)`, `remove(K key)`
    - `contains(V value)`, `getKey(V value)`
    - Automatic chaining, customizable bucket count
    - `getBucketSizes()` for analyzing distribution

- **HashTableTest**
    - Custom key class with user-defined `hashCode()`
    - Inserts 10 000 random entries and prints per-bucket counts

- **BST**
    - Generic, non-recursive `put`, `get`, `delete`
    - Maintains element count (`size()`)
    - Implements `Iterable<Node>` with an in-order iterator

- **BSTDemo**
    - Sample code showing insertion, deletion, `size()`, and iteration

---
## Yskak Zhanibek SE-2437