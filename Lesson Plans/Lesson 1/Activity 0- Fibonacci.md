
### Activity 0: Fibonacci

0 1 1 2 3 5 8 13 21 34 55

Counting is fun and easy. Counting the Fibonacci sequence is slightly less easy, but still hopefully fun. 

The Fibonacci sequence starts with the numbers 0 and 1. Each subsequent number is the sum of the two numbers before it. 

So the challenge: Given a number `n`, give the number in the Fibonacci at that position.

#### Example

```java
fibonacci(0) // => 0
fibonacci(1) // => 1
fibonacci(2) // => 1 (0 + 1)
fibonacci(3) // => 2 (1 + 1)
fibonacci(4) // => 3 (1 + 2)
fibonacci(5) // => 5 (2 + 3)
```

#### Test

The following code will automatically check your responses for n=1,n=3,n=5,n=10q

/Activity0Test.java

#### Hint

There are three important pieces to this activity:

- Functions can call themselves.
- `fibonacci(0)` is always 0 and `fibonacci(1)` is always 1
- For numbers you don't know, solve for the `n`th term.

#### Bonus Challenges

0. Use a `HashMap to cache the results of values. This will let your code to run much faster.