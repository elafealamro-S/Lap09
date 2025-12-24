# Lab 09 – Arrays

## 1. Objective
The purpose of this Lab is to familiarize students with:
1. The concept of one-dimensional (1-D) arrays in Java
2. Performing basic operations on arrays

## 2. Lab Learning Outcomes (LLO)
By completion of the lab, the students should be able to:
1. Create and access array elements
2. Initialize an array with elements
3. Perform basic operations on an array

## 3. Theory Review – Arrays in Java
An array in Java is a data structure used to store multiple values of the same data type in a single variable.
Each element in the array is accessed using its index, starting from index 0.

### Example:
The following example demonstrates creating an array, initializing it with random numbers, and printing its elements:

```java
int A[] = new int[10];

for (int i = 0; i < 10; i++) {
    A[i] = (int)(Math.random() * 10);
}

for (int i = 0; i < 10; i++) {
    System.out.println(i + " : " + A[i]);
}
