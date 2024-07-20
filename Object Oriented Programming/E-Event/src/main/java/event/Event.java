package event;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Event {

    static ArrayList<Event> events = new ArrayList<>();

    public Event(){
    }

    public static void addEvent(int id, String name, String category, String startDate, String endDate, 
            String country, String city, String location, int priceTicket, int nrTickets, String duration) throws FileNotFoundException, IOException{

        boolean flag = false;
        boolean checkEvent = false;
           
        int index = 1;
        try
        {
            File userfile = new File("events.txt");
            Scanner myReader = new Scanner(userfile);
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                index++;
                String[] parts = data.split(" / ");
                if (parts[1].equals(name)) {
                    
                    flag = true;
                    break;
                }
            } 
        } catch (FileNotFoundException e) {
            System.out.println("User file not found.");
            e.printStackTrace();
        }
            
        if(flag){
            JOptionPane.showMessageDialog(null, "The entered event already exists");
        }
        else {
            checkEvent = true;
            JOptionPane.showMessageDialog(null, "Event added successfully");
        }
        
        String eventFormat = index + " / " + name + " / " + category + " / " + startDate + " / " + endDate + " / " + country + " / " + city + " / " + location + " / " + priceTicket + " / " + nrTickets + " / " + duration;
        
        if(checkEvent == true){
            FileWriter fw = new FileWriter("events.txt", true);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(eventFormat);
                bw.newLine();
            }

            File userfile = new File("events.txt");
            Scanner myReader = new Scanner(userfile);
            

            while(myReader.hasNextLine()) {
                index++;
                myReader.nextLine();
            }
        }
    }
    
    public static void removeEvent(String value) throws FileNotFoundException, IOException, ParseException{   
        File file = new File("events.txt");
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" / ");
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date today = Calendar.getInstance().getTime();
                Date dateToGet = format.parse(parts[3]);
                long diffInMilliseconds = dateToGet.getTime() - today.getTime();
                long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
                String days = Long.toString(diffInDays);
                String print = parts[1] + "  -  " + parts[2] + "  |  Tickets available:  " + parts[9] + "  |  " + parts[3] + "  -  " + days + " days until";
                if (!print.equals(value)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void checkEvent(String category, DefaultListModel l) throws ParseException{
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("events.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" / ");
                
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date today = Calendar.getInstance().getTime();
                Date dateToGet = format.parse(parts[3]);
                long diffInMilliseconds = dateToGet.getTime() - today.getTime();
                long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
                String days = Long.toString(diffInDays);
                
                if(Integer.parseInt(days) > 0){
                    lines.add(line);
                }
                if (parts[2].trim().equals(category)) {
                    if(parts[9].equals("0")){
                        parts[9] = "Sold out";
                    }

                    String print = parts[1] + "  -  " + parts[2] + "  |  Tickets available:  " + parts[9] + "  |  " + parts[3] + "  -  " + days + " days until";
                    l.addElement(print);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("events.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String announceEvent() throws ParseException{
        try {
            BufferedReader br = new BufferedReader(new FileReader("events.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" / ");
                
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date today = Calendar.getInstance().getTime();
                Date dateToGet = format.parse(parts[3]);
                long diffInMilliseconds = dateToGet.getTime() - today.getTime();
                long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
                String days = Long.toString(diffInDays);
                
                if(days.equals("10") || days.equals("5") || days.equals("1")){
                    return days + " more day/s until '" + parts[1] + "' begins!";
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "There are no events events happening soon";
    }
    
    public static void checkEventReg(String id, DefaultListModel l) throws ParseException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("events.txt"));

            String line;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(" / ");
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date today = Calendar.getInstance().getTime();
                Date dateToGet = format.parse(parts[3]);
                long diffInMilliseconds = dateToGet.getTime() - today.getTime();
                long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
                String days = Long.toString(diffInDays);
                if (parts[0].trim().equals(id)) {
                    String print = parts[1] + "  -  " + parts[2] + "  |  Tickets available:  " + parts[9] + "  |  " + parts[3] + "  -  " + days + " days until";
                    l.addElement(print);
                }
            }

            br.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }
    }
    
    public static boolean compareEvent(String id, String value) throws ParseException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("events.txt"));

            String line;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(" / ");
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date today = Calendar.getInstance().getTime();
                Date dateToGet = format.parse(parts[3]);
                long diffInMilliseconds = dateToGet.getTime() - today.getTime();
                long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
                String days = Long.toString(diffInDays);
                if (parts[0].trim().equals(id)) {
                    String print = parts[1] + "  -  " + parts[2] + "  |  Tickets available:  " + parts[9] + "  |  " + parts[3] + "  -  " + days + " days until";
                    if(value.equals(print)){
                        return true;
                    }
                }
            }

            br.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }
        return false;

    }
    
    public static void substractTickets(int nrOfTickets, int newNumberOfTickets) {
        try {
            // Read the file line by line
            BufferedReader reader = new BufferedReader(new FileReader("events.txt"));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // Split the line into parts
                String[] parts = line.split(" / ");
                if (parts[9].equals(Integer.toString(nrOfTickets))) {
                    parts[9] = Integer.toString(newNumberOfTickets);
                    line = parts[0] + " / " + parts[1] + " / " + parts[2] + " / " + parts[3] + " / " + parts[4] + " / " + parts[5] + " / " + parts[6] + " / " + parts[7] + " / " + parts[8] + " / " + parts[9] + " / " + parts[10];
                    System.out.println(parts[9]);
                }
                sb.append(line).append("\n");
            }
            reader.close();

            // Write the updated file
            BufferedWriter writer = new BufferedWriter(new FileWriter("events.txt"));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}