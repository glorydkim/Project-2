/*
 * Glory Kim 
 * Homework 3 Question 7
 */

/**
 *
 * @author glorykim
 */
package Homework3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        Node root = new Node(0);
        tree.setRoot(root);
        ArrayList<Node> childrenOfRoot = new ArrayList<Node>();
        childrenOfRoot.add(new Node(1));
        childrenOfRoot.add(new Node(2));
        childrenOfRoot.add(new Node(3));
        root.children = childrenOfRoot;

        ArrayList<Node> childrenOfNode1 = new ArrayList<Node>();
        childrenOfNode1.add(new Node(4));
        childrenOfNode1.add(new Node(5));
        root.children.get(0).children = childrenOfNode1;


        ArrayList<Node> childrenOfNode3 = new ArrayList<Node>();
        childrenOfNode3.add(new Node(6));
        childrenOfNode3.add(new Node(7));
        childrenOfNode3.add(new Node(8));
        root.children.get(2).children = childrenOfNode3;

        /* Tree created from above code is this
                      0
                    / | \
                    1  2  3
                   /\     /|\
                  4  5   6 7 8
         */

        //call to recursive method listLinks
        tree.root.listLinks();
    }
}
