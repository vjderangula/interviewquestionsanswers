package com.interviewquestionsanswers.codility;

public class StringPathChanger {
    public String changeDirectoryString(String currentDirectory, String command) {
        // Split the command by space to extract the action and the path
        String[] parts = command.split(" ", 2);
        
        // If the command is "cd", change the directory accordingly
        if (parts[0].equals("cd")) {
            // If the command is to go up one directory
            if (parts[1].equals("..")) {
                // Split the current directory path by "/"
                String[] directories = currentDirectory.split("/");
                // Remove the last directory
                StringBuilder newPath = new StringBuilder();
                for (int i = 0; i < directories.length - 1; i++) {
                    newPath.append(directories[i]).append("/");
                }
                // Remove the trailing "/" if necessary
                if (newPath.length() > 0) {
                    newPath.deleteCharAt(newPath.length() - 1);
                }
                return newPath.toString();
            } else {
                // If the command is to change to a specific directory, append it to the current path
                return currentDirectory + "/" + parts[1];
            }
        } else {
            // If the command is not recognized (e.g., not "cd"), throw an IllegalStateException
            throw new IllegalStateException("Invalid command: " + command);
        }
    }

    public static void main(String[] args) {
        // Example usage
        String currentDirectory = "/home/user";
        StringPathChanger pathChanger = new StringPathChanger();
        
        // Change to the parent directory
        System.out.println(pathChanger.changeDirectoryString(currentDirectory, "cd ..")); // Output: /home
        
        // Change to a specific directory
        System.out.println(pathChanger.changeDirectoryString(currentDirectory, "cd documents")); // Output: /home/user/documents
        
        // Handle IllegalStateException
        // Uncomment the line below to test
         System.out.println(pathChanger.changeDirectoryString(currentDirectory, "wrong")); // Throws IllegalStateException
    }
}

