package linkedlist;

import java.util.*;

public class IntersectionOfLinkedList {
    /**
     * Linked List Intersection Question
     *
     * You are given a collection of singly-linked lists (SLLs). Return true of any if them share a common node (or “intersect”), or
     * false otherwise. Please don’t use recursion. Assume the SLLs might be very large in length (in the millions).
     * Stop traversing and return immediately if you detect a common node. If a cycle is detected, please throw an error. Aim to be as efficient as possible from a time complexity perspective.
     *
     * Implement this function with this signature:
     *
     * DoLinkedListsIntersect(Collection<SinglyLinkedList>) returns bool
     *
     * Input:
     *
     * Your program should read lines of text from the standard input in Codevue. The first lines of the input will describe the singly-linked-lists in a directed acyclic graph (DAG) format. The graph description language is a similar idea to the GraphViz graph description language, see: https://en.wikipedia.org/wiki/DOT_(graph_description_language).
     * Each node is described as a string token, which is a unique identifier for the node. So “a->b” means a DAG with node “a” directionally connected to node “b”. As we are describing singly-linked-lists, take it as a given that the out degree of every node is either zero or one.
     *
     * After each of the edges has been described, then each subsequent line will include a set of SLL starting nodes to traverse from. We advise that you draw a diagram to help you understand the example more clearly.
     *
     * Note: we have added an attachment image to show this visually.
     *
     * Output:
     * For each SLL print true or false based on whether any of the traversals intersect, which is to say, whether they share a common node.
     *
     * Test 1 Input
     * a->b
     * r->s
     * b->c
     * x->c
     * q->r
     * y->x
     * w->z
     * a,q,w
     * a,c,r
     * y,z,a,r
     * a,w
     * Test 1 Output
     * False
     * True
     * True
     * False
     * Test 2 Input
     * A->B
     * G->B
     * B->C
     * C->D
     * D->E
     * H->J
     * J->F
     * A,G,E
     * H,A
     * Expected OutputDownload Test 2 Output
     * True
     * False
     * Complete question
     */

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

