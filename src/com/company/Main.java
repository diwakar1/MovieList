package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ArrayList <String> al = new ArrayList<String>();
        System.out.println(" Ener an movie name: ");
        String movie = input.nextLine();


          while(!movie.toLowerCase().equals("q")){
              if(al.contains(movie)) {
                  System.out.println(" enter the duplicate movie ");
                  movie = input.nextLine();

              }
              else {
                  al.add(movie);

                  System.out.println("reenter another movie name");
                   movie = input.nextLine();


              }

          }

          for (int i = 0; i < al.size(); i++){
             System.out.println(al.get(i));
          }

        }

    }



