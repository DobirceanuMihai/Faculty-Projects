import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grammar {
    private HashMap<String, List<String>> productions;
    private String startSymbol;

    public Grammar(String fileName) {
        productions = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            startSymbol = line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("->");
                String nonTerminal = parts[0];
                String production = parts[1];
                if (!productions.containsKey(nonTerminal)) {
                    productions.put(nonTerminal, new ArrayList<>());
                }
                productions.get(nonTerminal).add(production);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public HashMap<String, List<String>> getProductions() {
        return productions;
    }
    
    public String getStartSymbol() {
        return startSymbol;
    }
    
    public static void main(String[] args) {
        Grammar grammar = new Grammar("grammar.txt");
        System.out.println("Start symbol: " + grammar.getStartSymbol());
        System.out.println("Productions: " + grammar.getProductions());

        System.out.println("After removing: ");
        
        RemoveUnproductive removeUnproductive = new RemoveUnproductive(grammar);
        Grammar newGrammar = removeUnproductive.getGrammar();
        System.out.println("Start symbol: " + newGrammar.getStartSymbol());
        System.out.println("Productions: " + newGrammar.getProductions());
    }
}