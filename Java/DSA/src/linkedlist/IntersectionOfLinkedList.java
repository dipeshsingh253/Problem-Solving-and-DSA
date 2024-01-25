package linkedlist;

import java.util.*;

public class IntersectionOfLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<LinkedList> input = new ArrayList<>();
        int numOfInput = 7;
        System.out.println("Provide Input:");
        while(numOfInput-- > 0){
            LinkedList<Character> singlyLinkedList = new LinkedList<>();


            String inputLine = sc.nextLine();
            for(char c : inputLine.toCharArray()){
                if (c != '-' && c != '>') {
                    singlyLinkedList.add(c);
                }

            }

            input.add(singlyLinkedList);

        }

        System.out.println("Given Input:");
        input.stream().forEach(ls -> displayList(ls));
        System.out.println();


        int tc = 2;

        List<String> tcList = new ArrayList<>();
        while(tc-->0){
            String testCase = sc.nextLine();
            tcList.add(testCase);
        }

        System.out.println("Given TCs:");
        tcList.stream().forEach(System.out::println);

        System.out.println("Output:");
        for (String testCase: tcList){
            List<Character> testValues = Arrays.stream(testCase.split(","))
                    .flatMapToInt(String::chars)
                    .mapToObj(ch -> (char)ch)
                    .toList();
            System.out.println(doLinkedListsIntersect(input,testValues));
        }


        sc.close();
    }

    private static void displayList(LinkedList<Character> singlyLinkedList) {
        for(Character ch : singlyLinkedList){
            System.out.print(ch);
        }
        System.out.print(" ");

    }

    private static boolean doLinkedListsIntersect(Collection<LinkedList> singlyLinkedList, List<Character> testcase){
        HashSet<Character> set = new HashSet<Character>();

        for (Character ch: testcase){
            if(set.contains(ch)){
                return true;
            }
            for(LinkedList list : singlyLinkedList){
                if(list.contains(ch)){
                    set.addAll(list);
                    if(set.size()%2 != 0){
                        return true;
                    }
                }
            }
        }

        return false;
    }


}
