## Part 1: Hash Values

Hashes are one of the most important parts of how modern software works today. You don't have to actually create them or work with them directly, but it's pretty important to know how they work. Hashes have a few principles:

-  given some variable data, we can create a fixed-length value
-  when that data is given in the future, the same hash value should result.
-  collisions should be rare, meaning any two pieces of data should have an extremely low possibility of having the same hash value

Show an example of by putting a word on the board, changing each letter to a number (1-26), multiplying by 29, looping at 100, and summing each letter in the word.  

```java
public static int genHash(int hash, char character) {
	return (hash + character - 96) * 29 % 100;	
}

public static void main(String[] args) {
	char[] word = {'h', 'e', 'l', 'l', 'o'};
	int hash = 0;
	
	for(int i=0; i<word.length; i++) {
		hash = genHash(hash, word[i]);
		System.out.println(word[i] + " hash: " + hash);
	}
}
```

Now, our simple hashing function won't work for anything real: collisions are too likely. In reality, the numbers are often larger and some mathematical trickery make the values much more random and harder to predict.

But if you're noticing, hashes would work really well as to create addresses - you could take a fixed length string and easily predict where to find the data it points to by computing its hash. And that leads us to hash maps.
