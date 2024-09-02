//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.*;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i =0; i< 10; i++){
			if (i != 0){
				sb.append("-");
			}
			sb.append(i);
		}
		System.out.println(sb);
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> nums = new ArrayList<>();
		nums.add("1");
		nums.add("12");
		nums.add("123");
		nums.add("1234");
		nums.add("12345");

		System.out.println(nums);

		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println(shortString(nums));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println(firstIsLast(nums));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(combineString(nums));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println(doesItContain(nums, "3"));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
		
		System.out.println(divideBy(numbers));
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(wordLength(nums));

		
		// 9. Create a set of strings and add 5 values
		Set<String> grocery = new HashSet<String>();
		grocery.add("ice cream");
		grocery.add("milk");
		grocery.add("lettuce");
		grocery.add("tomato");
		grocery.add("bread");

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(letterFilter(grocery, 'l' ));
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	
		System.out.println(setToString(grocery));

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> intSet = new HashSet<>();
		intSet.add(3);
		intSet.add(6);
		intSet.add(9);
		intSet.add(10);
		intSet.add(11);

		System.out.println(findEvens(intSet));


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> dic = new HashMap<>();
		dic.put("solidarity","community of feelings, purposes, interests or responsibilities");
		dic.put("boring","causing or marked by boredom");
		dic.put("boredom","the feeling of being weried by dullness");
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(wordDef(dic, "boring"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		

	}
	
	
	// Method 15:
	public static Map<Character, Integer> findStartChar(List<String> myList, char c){
		Map<Character, Integer> final = new HashMap<>();
		int count = 0;
		for (String string: myList){
			if (string.toLowerCase().charAt(0) = c){
				count ++;
			}
		}
		return final.put(c, count);
	}
	
	
	// Method 14:
	public static String wordDef(Map<String, String> map, String string){
		return map.get(string);
	}

	
	// Method 12:
	public static Set<Integer> findEvens(Set<Integer> set){
		Set<Integer> result = new HashSet<>();
		for( int num: set){
			if (num % 2 == 0){
				result.add(num);
			}
		}
		return result;
	} 

	
	// Method 11:
	public static List<String> setToString (Set<String> set){
		List<String> result = new ArrayList<String>();
		for (String str: set){
			result.add(str);
		}
		return result;
	}


	// Method 10:
	
	public static Set<String> letterFilter(Set<String> input, char c){
		Set<String> result = new HashSet<String>();
		for(String string: input){
			if(string.toLowerCase().charAt(0) == c){
				result.add(string);
			}
		}
		return result;
	}
	
	// Method 8:
	public static List<Integer> wordLength(List<String> words){
		List<Integer> result = new ArrayList<>();
		for (String word : words){
			result.add(word.length());
		}
		return result; 
	}

	
	// Method 7:
	public static List<List<Integer>> divideBy (List<Integer> numList){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < 4; i++){
			result.add(new ArrayList<Integer>());
		}
		for(int num : numList){
			if (num % 2 == 0){
				result.get(0).add(num);
			}
			if (num % 3 == 0){
				result.get(1).add(num);
			}
			if (num % 5 == 0){
				result.get(2).add(num);
			}
			if ( num % 2 != 0 && num % 3 != 0 && num % 5 != 0){
				result.get(3).add(num);
			}
		}
		return result;
	}

	
	// Method 6:
	public static List<String> doesItContain(List<String> list, String test){
		List<String> filtered = new ArrayList<>();
		for(String string: list){
			if (string.contains(test)){
				filtered.add(string);
			}
		}
		return filtered;
	}

	
	// Method 5:
	public static String combineString(List<String> nums){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < nums.size(); i++){
			sb.append(nums.get(i));
			if (i != nums.size() -1){
				sb.append(", ");
			}
		}
		return sb.toString();
	}
	
	
	// Method 4:
	public static List<String> firstIsLast(List<String> stringList){
		String stringBuffer = stringList.get(0);
		stringList.set(0, stringList.get(stringList.size() - 1));
		stringList.set(stringList.size() - 1, stringBuffer);
		return stringList;
	}
	
	// Method 3:
	public static String shortString(List<String> stringList){
		String shortest = stringList.get(0);
		for (String list : stringList){
			if (list.length() < shortest.length()){
				shortest = list;
			}
		return shortest;
		}
	}
	

}