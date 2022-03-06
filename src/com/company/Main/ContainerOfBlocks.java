package com.company.Main;

public class ContainerOfBlocks {
    public static void main(String[] args){

        //Choosing odd number between 50 and 100 for amount of blocks
        int amtOfBlocks = (int) (Math.random() * (100-50) + 50);
        for (int i = amtOfBlocks; i <= amtOfBlocks; i++){
            if (amtOfBlocks % 2 != 0){
                System.out.println("We have " + amtOfBlocks + " blocks");
            }
            else {
                amtOfBlocks++;
            }
        }

        //Choosing even number between 5 and 10 for container capacity
        int containerCapacity = (int) (Math.random() * (10-5) + 5);
        for (int i = containerCapacity; i <= containerCapacity; i++){
            if (containerCapacity % 2 == 0){
                System.out.println(containerCapacity + " blocks fit in one container");
            }
            else {
                containerCapacity++;
            }
        }

        //Getting the number of containers that are full
        int full_containers = amtOfBlocks/containerCapacity;
        System.out.println("\nNumber of full containers are: " + full_containers);

        //Getting the number of blocks present in a half-filled container
        int half_containers = amtOfBlocks % containerCapacity;
        System.out.println("Number of blocks in half filled container are: " + half_containers);

        //Getting the total number of containers in general
        int total_containers = full_containers + 1;
        System.out.println("\nTotal number of containers in general: " + total_containers);
    }
}






