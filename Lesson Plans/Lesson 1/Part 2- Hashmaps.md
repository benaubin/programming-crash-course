## Part 2: Hashmaps
By using these hashes, we could really easily put different values into "buckets". Explain on board

To do this, we'll create a `HashMap`. Hash maps allow you to access data, called a value, with a second piece of data, called a key. It takes care of the math of hashing the values for you. We'll use this to retrieve the tax rate of a district by the district's initials. Ask for the initials and tax rate. Make sure to pause for a few moments to explain why you're writing the numbers in decimal form.

```java
import java.util.HashMap;
```

```java
HashMap<String, Double> districtTaxes = new HashMap<String, Double>();

districtTaxes.put("A", 0.01);
districtTaxes.put("B", 0.12);
districtTaxes.put("C", 0.30);
districtTaxes.put("D", 0.08);
```

Let's get input (ask the class if they remember how) and return the tax rate for the region.

```java
import java.util.Scanner;
```

```java
Scanner scanner = new Scanner(System.in);
String requestedRegionCode = scanner.next();
System.out.println(districtTaxes.get(requestedRegionCode));
```

Let's try it out!

