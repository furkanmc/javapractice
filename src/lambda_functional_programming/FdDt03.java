package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FdDt03 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        printInUpperCases01(l);
        System.out.println();
//        printInUpperCases02(l);
        printElementsSortedByLength(l);
        System.out.println();
        printElementsReversedSortedByLength(l);
        System.out.println();
        printDistinctSortedByLastCharacter(l);
        System.out.println();
        printSortedByLenghtThenSortedByInitial(l);
        System.out.println();
//        removeIfTheLengthIsGreaterThanFive(l);
//        printRemoveIfStartingWithAorEngingWithN01(l);
//        printRemoveIfStartingWithAorEngingWithN02(l);
//        removeElementByLengthAndChar(l);
       
        
        
	}
	//1) Create a method to print all list elements in uppercase
	public static void printInUpperCases01(List<String> list) {
		list.stream().map(String::toUpperCase).forEach(UtilsDt::printInSameLineWithSpace);
	}
	//2.WAY
//	public static void printInUpperCases02(List<String> list) {
//		list.replaceAll(String::toUpperCase); //immutable so changes effects after that
//		System.out.println(list);
//	}
	//2) Create a method to print the elements after ordering according to their lengths
	public static void printElementsSortedByLength(List<String> list) {
		list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsDt::printInSameLineWithSpace);	
	}
	//3) Create a method to print the elements after ordering according to their lengths (In reverse order)
	public static void printElementsReversedSortedByLength(List<String> list) {
		list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsDt::printInSameLineWithSpace);	
	}
	//4) Create a method to sort the distinct elements by using their last characters
	public static void printDistinctSortedByLastCharacter(List<String> list) {
		list.stream().distinct().sorted(Comparator.comparing(UtilsDt::getLastChar)).forEach(UtilsDt::printInSameLineWithSpace);	
	}
	//5) Create a method to sort the elements according to their lengths then according to their first character
	public static void printSortedByLenghtThenSortedByInitial(List<String> list) {
		list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(UtilsDt::printInSameLineWithSpace);
	}
	//6) Remove the elements if the length of the element is greater than 5
//	public static void removeIfTheLengthIsGreaterThanFive(List<String> list) {
//		list.removeIf(t->t.length()>5);//mutable change the list
//		System.out.println(list);
//	}
	//7) Remove the elements if the element is starting with ‘A’, ‘a’ or ending with ‘N’, ‘n’
	//1.WAY
//	public static void printRemoveIfStartingWithAorEngingWithN01(List<String> list) {
//		Predicate<String> checkCondition = t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n';
//		list.removeIf(t->checkCondition.test(t));
//		System.out.println(list);
//	}
	//2.WAY
//	public static void printRemoveIfStartingWithAorEngingWithN02(List<String> list) {
//		Predicate<String> checkCondition = t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n");
//		list.removeIf(t->checkCondition.test(t));
//		System.out.println(list);
//	}
	//8) Remove the elements if the length is between 8 and 10 or ending with 'o'
//	public static void removeIfLengthIsBetween8And10EndingWithO(List<String> list) {		
//		Predicate<String> checkCondition = t -> (t.length()>7 && t.length()<11) || t.endsWith("o");		
//		list.removeIf(t->checkCondition.test(t));		
//		System.out.println(list);		
//	}
	
	//9) Create a method to check if the lengths of all elements are less than 12
	public static boolean checkLengthToBeLessThanTwelve(List<String> list) {		
		return list.stream().allMatch(t->t.length()<12);		
	}
	
	//10) Create a method to check if the initial of any element is not ‘X’
	public static boolean checkNotToStartWithX(List<String> list) {		
		return list.stream().noneMatch(t->t.startsWith("X"));		
	}
	
	//11) Create a method to check if at least one of the elements ending with “r”
	public static boolean checkAnyOneEndsWithR(List<String> list) {		
		return list.stream().anyMatch(t->t.endsWith("r"));		
	}
}