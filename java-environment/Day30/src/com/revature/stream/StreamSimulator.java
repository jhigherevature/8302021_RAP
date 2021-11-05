package com.revature.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * As a reminder: A stream is an entity which
 * reads information from a source and can provide
 * data to a target location.
 * 
 * However, Java provides a Stream API (interface) which supports
 * various methods that can be pipelined to produce a specific
 * result. These methods will either be intermediate or terminal
 * operations.
 * 
 * Intermediate operations perform some work and produce a new
 * Stream.
 * Terminal operations will result in a final output (generally
 * non-stream value).
 * 
 * Operations performs on a Stream does not effect the original
 * source data.
 */
public class StreamSimulator {
	// Iterate example
	public static void streamIterate(List<Associate> associateList) {
		/*
		 * The forEach method receives a Consumer<T> which 
		 * is a functional interface that takes any object
		 * type (the implementation uses generics) and
		 * a lambda to perform an action on the objects.
		 * 
		 * The Consumer<T> functional interface does not return
		 * any values. i.e. it has a return type of void.
		 */
		associateList.stream().forEach((Associate a) -> {
			System.out.println(a.getFirstName());
		});
	}

	// Filter example
	public static void streamFilter(List<Associate> associateList, String filter) {
		/*
		 * The method filter receives a Predicate<T> which is
		 * a functional interface that takes any object value
		 * as parameter and returns a boolean.
		 */
		associateList.stream().filter(
		// 1. create a stringbuilder using the associate first name
		// 2. if the filter value does not exist within the Stringbuilder stop.
		// 3. otherwise, for every associate first name, print the name
				(Associate a) -> new StringBuilder(a.getFirstName()).indexOf(filter) != -1)
				.forEach((Associate a) -> {
					System.out.println(a.getFirstName());
				});
	}

	public static void main(String[] args) {
		List<Associate> associateList = new ArrayList<>();
		associateList.add(new Associate(1, "Adam", "Hubert"));
		associateList.add(new Associate(2, "Christine", "Flannery"));
		associateList.add(new Associate(3, "Edward", "Douglas"));
		associateList.add(new Associate(4, "Gabbie", "Brown"));

		// Iterate
		System.out.println("Iterating over all list: ");
		streamIterate(associateList);
		System.out.println();

		// Filter
		String filter = "r";
		System.out.println("Iterating over list with filter(" + filter + ")");
		streamFilter(associateList, filter);
		
		// Map
		List<String> letters = Arrays.asList("a","b","c");
		List<String> upper = letters.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		
		for (String l : letters)
			System.out.println(l);
		
		for (String u : upper)
			System.out.println(u);
	}
}
