import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AlgoFPGrowth {
	private int transactionCount = 0; 
	private int itemsetCount;
	public int minSupportRelative;
	BufferedWriter writer = null;
	private int[] itemsetBuffer = null;
	private FPNode[] fpNodeTempBuffer = null;
	private int[] itemsetOutputBuffer = null;
	private int maxPatternLength = 1000;
public AlgoFPGrowth() {
		
	}


	public void runAlgorithm(String input, double minsupp)throws FileNotFoundException, IOException {
		itemsetCount = 0;
		final Map<Integer, Integer> mapSupport = scanDatabaseToDetermineFrequencyOfSingleItems(input);
		this.minSupportRelative = (int) Math.ceil(minsupp * transactionCount);
		FPTree tree = new FPTree();
		BufferedReader reader = new BufferedReader(new FileReader(input));
		String line;
		while( ((line = reader.readLine())!= null)) { 
			
			if (line.isEmpty() == true ||	line.charAt(0) == '#' || line.charAt(0) == '%'
				|| line.charAt(0) == '@') {
				continue;
			}
		}
		String[] lineSplited = line.split(" ");
		List<Integer> transaction = new ArrayList<Integer>();
		for(String itemString : lineSplited){  
			Integer item = Integer.parseInt(itemString);
			if(mapSupport.get(item) >= minSupportRelative){
				transaction.add(item);	
			}
		}
		Collections.sort(transaction, new Comparator<Integer>(){
			public int compare(Integer item1, Integer item2){
				
				int compare = mapSupport.get(item2) - mapSupport.get(item1);
				
				if(compare == 0){ 
					return (item1 - item2);
				}
				
				return compare;
			}
		});
		tree.addTransaction(transaction);
	}
	
		
		
			
		
		
		

		
	}


	private Map<Integer, Integer> scanDatabaseToDetermineFrequencyOfSingleItems(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
