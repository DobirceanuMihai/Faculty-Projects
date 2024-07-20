import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveUnproductive {
    private Grammar grammar;
    private Set<String> productiveSymbols;
    
    public RemoveUnproductive(Grammar grammar) {
        this.grammar = grammar;
        productiveSymbols = new HashSet<>();
        findProductiveSymbols();
        removeUnproductive();
    }
    
    private void findProductiveSymbols() {
        Set<String> currentSymbols = new HashSet<>();
        currentSymbols.add(grammar.getStartSymbol());
    
        while (!currentSymbols.isEmpty()) {
            Set<String> newSymbols = new HashSet<>();
            for (String symbol : currentSymbols) {
                if (productiveSymbols.contains(symbol)) {
                    continue;
                }
                productiveSymbols.add(symbol);
                List<String> productions = grammar.getProductions().get(symbol);
                if (productions == null) {
                    continue;
                }
                for (String production : productions) {
                    for (String nonTerminal : production.split(" ")) {
                        if (!productiveSymbols.contains(nonTerminal)) {
                            newSymbols.add(nonTerminal);
                        }
                    }
                }
            }
            currentSymbols = newSymbols;
        }
    }
    
    private void removeUnproductive() {
        Set<String> symbolsToRemove = new HashSet<>();
        for (String symbol : grammar.getProductions().keySet()) {
            if (!productiveSymbols.contains(symbol)) {
                symbolsToRemove.add(symbol);
            }
        }
        for (String symbol : symbolsToRemove) {
            grammar.getProductions().remove(symbol);
        }
    }
    
    public Grammar getGrammar() {
        return grammar;
    }
}