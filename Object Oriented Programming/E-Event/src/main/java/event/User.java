package event;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class User {
    static ArrayList<Event> userevents = new ArrayList<>();
    
    public static void changePassword(String username, String newPassword) {
        try {
            // Read the file line by line
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // Split the line into parts
                String[] parts = line.split("/");
                if (parts[0].equals(username)) {
                    // Update the password
                    parts[1] = newPassword;
                    line = parts[0] + "/" + parts[1] + "/" + parts[2] + "/";
                }
                sb.append(line).append("\n");
            }
            reader.close();

            // Write the updated file
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean checkPassword(String username, String enteredPassword) {
        try {
            // Read the file line by line
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into parts
                String[] parts = line.split("/");
                if (parts[0].equals(username)) {
                    // Check if the entered password matches the stored password
                    if (parts[1].equals(enteredPassword)) {
                        reader.close();
                        return true;
                    } else {
                        reader.close();
                        return false;
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void addEvent(int userid, String event)throws IOException{
        
        try {
            // Read the file and store each line in a list
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));

            // Get the line to be updated
            String line = lines.get(userid);
            
            // Adding event at the end of the line
            StringBuilder newline = new StringBuilder(line);
            if(!User.checkEvent(userid, event)) {
                System.out.println("adding event " + event);
                newline.append(event + "-");
            }
            System.out.println(newline);
            lines.set(userid, newline.toString());
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
            
    }
    
    
    
    public static void removeEvent(int userid, String event)throws IOException{
        
        try {
            // Read the file and store each line in a list
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));

            // Get the line to be updated
            String line = lines.get(userid);
            
            // Making a new line without event
            StringBuilder newline = new StringBuilder(line);
            if(User.checkEvent(userid, event)) {
                System.out.println("removing event " + event);
                newline.reverse();
                int index = newline.indexOf("-" + event);
                if (index != -1)
                {
                    newline.replace(index, index+2, "");
                }
                newline.reverse();
            }
            
            System.out.println(newline);
            lines.set(userid, newline.toString());
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
            
    }
    
    public static boolean checkEvent(int userid, String event)throws IOException{ 
        try
            {
                File userfile = new File("users.txt");
                Scanner myReader = new Scanner(userfile);
                
                for(int i = 0; i < userid; i++) {
                    myReader.nextLine();
                }
                String data = myReader.nextLine();
                String[] parts = data.split("/");

                String[] events = parts[3].split("-");
                
                int check = 0;
                for(int i = events.length-1; i >= 1; i--)
                {
                    // Checks if user is registered to event
                    if(events[i].equals(event))
                    {
                        check = 1;
                    }
                }
            if (check == 1) return true;
            else return false;
                    
        } catch (FileNotFoundException e) {
            System.out.println("User file not found.");
            e.printStackTrace();
        }
        return false;
   }
    
    public static List getEvents(int userid)throws IOException{ 
       
        List<String> regEvents = new ArrayList<String>();  
        try
            {
                File userfile = new File("users.txt");
                Scanner myReader = new Scanner(userfile);
                
                for(int i = 0; i < userid; i++) {
                    myReader.nextLine();
                }
                String data = myReader.nextLine();
                String[] parts = data.split("/");

                String[] events = parts[3].split("-");
                
                for(int i = events.length-1; i >= 1; i--)
                {
                    regEvents.add(events[i]);
                }
                    
        } catch (FileNotFoundException e) {
            System.out.println("User file not found.");
            e.printStackTrace();
        }
        return regEvents;
   }
    
    public static void addCategory(int userid, String category)throws IOException{
        
        try {
            // Read the file and store each line in a list
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));

            // Get the line to be updated
            String line = lines.get(userid);

            // Seperate all lines
            String[] parts = line.split("/");
            int categorynr = 0;
            
            // Seperate the categories
            String[] categories = parts[2].split("-");
            
            // Find what boolean represents the category
            switch(category)
            {
                case "Other": categorynr = 4; break;
                case "Festival": categorynr = 3; break;
                case "Movie": categorynr = 2; break;
                case "Art": categorynr = 1; break;
                case "Concert": 
                    
                default: categorynr = 0; break;
            }
            
            categories[categorynr] = "1";
            
            // Make the new line
            String newcategories = categories[0] + "-" + categories[1] + "-" + categories[2] + "-" + categories[3] + "-" + categories[4];
            StringBuilder newparts = new StringBuilder();
            
            int count = 0;
            for (String s : parts)
            {
                if (count == 2)
                {
                    newparts.append(newcategories);
                    newparts.append("/");
                }
                else
                {
                    newparts.append(s);
                    newparts.append("/");
                }
                count++;
            }
            // Remove last "/" to not interfene with events
            newparts.reverse();
            newparts.replace(0, 1, "");
            newparts.reverse();
            
            lines.set(userid, newparts.toString());
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
            
    }
    
    public static void removeCategory(int userid, String category)throws IOException{
        
        try {
            // Read the file and store each line in a list
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));

            // Get the line to be updated
            String line = lines.get(userid);

            // Seperate all lines
            String[] parts = line.split("/");
            int categorynr = 0;
            
            // Seperate the categories
            String[] categories = parts[2].split("-");
            
            // Find what boolean represents the category
            switch(category)
            {
                case "Other": categorynr = 4; break;
                case "Festival": categorynr = 3; break;
                case "Movie": categorynr = 2; break;
                case "Art": categorynr = 1; break;
                case "Concert": 
                    
                default: categorynr = 0; break;
            }
            
            categories[categorynr] = "0";
            
            // Make the new line
            String newcategories = categories[0] + "-" + categories[1] + "-" + categories[2] + "-" + categories[3] + "-" + categories[4];
            StringBuilder newparts = new StringBuilder();
            
            int count = 0;
            for (String s : parts)
            {
                if (count == 2)
                {
                    newparts.append(newcategories);
                    newparts.append("/");
                }
                else
                {
                    newparts.append(s);
                    newparts.append("/");
                }
                count++;
            }
            // Remove last "/" to not interfene with events
            newparts.reverse();
            newparts.replace(0, 1, "");
            newparts.reverse();
            
            lines.set(userid, newparts.toString());
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
            
    }
    
    public static boolean checkCategory(int userid, String category)throws IOException{
        
        try
            {
                File userfile = new File("users.txt");
                Scanner myReader = new Scanner(userfile);

                for(int i = 0; i < userid; i++) {
                    myReader.nextLine();
                }
                String data = myReader.nextLine();
                String[] parts = data.split("/");

                int categorynr = 0;
                
                switch(category)
                {
                    case "Other": categorynr = 4; break;
                    case "Festival": categorynr = 3; break;
                    case "Movie": categorynr = 2; break;
                    case "Art": categorynr = 1; break;
                    case "Concert": 

                    default: categorynr = 0; break;
                }
                
                String[] categories = parts[2].split("-");
                
                int check = Integer.parseInt(categories[categorynr]);
                if (check == 1)
                {
                    return true;
                }
                    
        } catch (FileNotFoundException e) {
            System.out.println("User file not found.");
            e.printStackTrace();
        }
        return false;
   }
}
