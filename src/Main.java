import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*LinkedList<Integer> list = new LinkedList<>();

		LinkedListUtils.insertSorted(list , 2);
		System.out.println(list);
		LinkedListUtils.insertSorted(list , 3);
		System.out.println(list);
		LinkedListUtils.insertSorted(list , 4);
		System.out.println(list);
		LinkedListUtils.insertSorted(list , 8);
		System.out.println(list);
		LinkedListUtils.insertSorted(list , 5);
		System.out.println(list);
		LinkedListUtils.insertSorted(list , 10);
		System.out.println(list);
		LinkedListUtils.insertSorted(list , 7);
		System.out.println(list);
		LinkedListUtils.insertSorted(list , 1);
		System.out.println(list);*/
		
		/*LinkedList<String> list = new LinkedList<>();
		list.add("hola");
		list.add("hello");
		list.add("123456");
		list.add("a");
		list.add("b");
		list.add("z");
		list.add("hola");
		LinkedListUtils.removeMaximumValues(list, 3);
		System.out.println(list);*/
		
		/*LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		
		list2.add(6);
		list2.add(7);
		list2.add(8);
		boolean result = LinkedListUtils.containsSubsequence(list1, list2);
		
		System.out.println(result);*/
		Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("C:\\Users\\Daniela\\workspace\\DataStructures\\test5.html");
		//Queue<HtmlTag> tags = new LinkedList<>();
		//tags.add(new HtmlTag("b", false));
		/*tags.add(new HtmlTag("i", true));
		tags.add(new HtmlTag("i", false));
		tags.add(new HtmlTag("b", false));
		tags.add(new HtmlTag("b", false));
		tags.add(new HtmlTag("html", false));*/
		//tags.add(new HtmlTag("p", false));
		//tags.add(new HtmlTag("i", true));
		//tags.add(new HtmlTag("i", false));
		//tags.add(new HtmlTag("u", false));
		
		System.out.println(tags);
		
		Stack<HtmlTag> stack = HtmlValidator.isValidHtml(tags );
		
		System.out.println(stack);
		//System.out.println(tags);
		
	}

}
