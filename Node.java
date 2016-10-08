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
import java.util.List;

public class Node {
    int data;
    ArrayList<Node> children;

    Node(int i){
        data = i;
    }

    @Override
    public String toString() {
        return ""+data;
    }

    List<Node> getChildren(){
        return children;
    }

    public void listLinks(){
        System.out.print("\nNode: "+ this.toString()+" -> ");
        if(this.children!=null) {
            for (Node child : this.children) {
                System.out.print(child.toString() + " ");

            }
            for (Node child : this.children) {
                child.listLinks();
            }
        }


    }
}