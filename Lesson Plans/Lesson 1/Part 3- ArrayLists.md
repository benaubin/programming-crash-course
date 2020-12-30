
## Part 3: ArrayLists

So one of the weird parts about the Mars government - and actually US government, as well - is that multiple regions can tax the same purchase. To handle this, we'll allow the user to select multiple regions.

Let's print and ask the user to list multiple regions:

```java
String regions[] = new String[3];

while (true) {
	System.out.print("Select a region: ");
	String requestedRegionCode = scanner.next();
	
	if (districtTaxes.containsKey(requestedRegionCode)) {
		regions[0] = requestedRegionCode;
	} else {
		break;
	}
	
}
```

Explain the issue of the array, why you have to have a set number of elements.

Now, let's create an `ArrayList`. It's similar to an array, but we can add as many elements as we want to it.

```java
import java.util.HashMap;
```

```java
ArrayList<String> regions = new ArrayList<String>();

while (true) {
	System.out.print("Select a region: ");
	String requestedRegionCode = scanner.next();
	
	if (districtTaxes.containsKey(requestedRegionCode)) {
		regions.add(requestedRegionCode);
	} else {
		break;
	}
}
```

Let's iterate over to show selected regions instead of the `"Select a region: "` text.

```java
System.out.print("selected regions: ");
for(int i=0; i<selectedRegions.size(); i++) {
	String region = selectedRegions.get(i);
	System.out.print(region + ":" + districtTaxes.get(region) + " ");
}
System.out.print("\nSelect another region or press enter: ");
```

Walk through the process of taxes in the martian government (each region taxes in order the portion left of income after the tax from regions before it was taken).

Let's copy and paste to calculate start writing the tax rate you pay'd pay.


```java
double completeTaxRate = 0;

for(int i=0; i<selectedRegions.size(); i++) {
	String region = selectedRegions.get(i);
	double regionTaxRate = districtTaxes.get(region);

	completeTaxRate = completeTaxRate + (1 - completeTaxRate) * regionTaxRate;
}

System.out.println("Total tax rate: " + completeTaxRate * 100 + "%");
```


