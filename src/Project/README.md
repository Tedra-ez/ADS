# Java Custom Data Structures Project

## Description
This project implements its own set of data structures in Java without using standard collections (except for Iterator). The project implements:
- **MyList interface** – contains methods for working with collections:
- `add`, `set`, `add(int index, T item)`, `addFirst`, `addLast`
- `get`, `getFirst`, `getLast`
- `remove`, `removeFirst`, `removeLast`
- `sort` (either with the `T extends Comparable<T>` constraint or using Comparator)
- `indexOf`, `lastIndexOf`, `exists`, `toArray`, `clear`, `size`

- **MyArrayList** – implementation of a list based on a dynamic array (Object[]). The class implements the MyList interface and is automatically extended when elements are added.

- **MyLinkedList** – implementation of a doubly linked list with an internal class for storing links to the previous and next elements. Also implements the MyList interface.

- **Logical data structures** – built on the basis of physical ones:
- **MyStack** – stack (LIFO), implemented on the basis of MyArrayList.
- **MyQueue** – queue (FIFO), implemented on the basis of MyLinkedList.
- **MyMinHeap** – minimum heap (minimum element at the top), implemented on the basis of MyArrayList with the methods of "popping up" and "dropping".

## Project Structure

```
/src
MyList.java
MyArrayList.java
MyLinkedList.java
MyStack.java
MyQueue.java
MyMinHeap.java
Main.java
```

## Build and Run
1. **Compile:**
   In the command line, go to the directory with the source files and run:
```
javac *.java
```
2. **Run:**
   After successful compilation, run:
```
java Main
```

## GitHub Instructions

1. **Initialize a local repository:**
- Open a terminal in the project directory and run:
```
git init
```

2. **Add files and the first commit:**
- Add all files:
```
git add .
```
- Make your first commit:
```
git commit -m "Initial commit: added all project files"
```

3. **Creating a repository on GitHub:**
- Go to [GitHub](https://github.com) and create a new repository.
- Do not add additional files (like README) if they are already present in the project.

4. **Linking a local repository to a remote one:**
- Run the command (replace `<repo_URL>` with your repository URL):
```
git remote add origin <repo_URL>
```

5. **Pushing a project to GitHub:**
- Push changes to the remote repository:
```
git push -u origin master
```
- In the future, use:
```
git add <changed files>
git commit -m "Description of changes made"
git push
```

## Commits and documentation
- Commit regularly after making significant changes.
- Commit messages should be informative (e.g. "Added sort() method to MyArrayList" or "Implemented MyQueue").
- The README.md file and comments in the code (if necessary) will help in protecting the project and demonstrate the quality of the documentation.

## Conclusion
This project demonstrates the ability to work with algorithms and data structures, as well as the principles of object-oriented programming in Java. In addition, the project demonstrates skills in working with the Git version control system and the GitHub platform.