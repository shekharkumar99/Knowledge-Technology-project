import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class main {
	//Global Edit Distance
	public static void edit_distance(ArrayList<String> edit_misspell, ArrayList<String> edit_dictionary, ArrayList<String> edit_correct)
	{
			double predicted = 0;
			double correct = 0;
			EditDistance ed = new EditDistance(); // instance for edit distance
			for(int i= 0; i<edit_misspell.size(); i++)
			{
				for(int j = 0; j<edit_dictionary.size();j++)
				{
					if(ed.distance(edit_misspell.get(i), edit_dictionary.get(j)) < 2)		// predicting only those words whose distance is less than 2
					{
						predicted++;
						//To check for correct word
						if((ed.distance(edit_misspell.get(i), edit_dictionary.get(j)) == 1) && (edit_dictionary.get(j).equals(edit_correct.get(i))) )
						{
							correct++;
						}
					}
				}
			}
					

			double precision_ed = 0;
			double recall_ed = 0;
			System.out.println("Edit Distance Results:");
			System.out.println("Number of predictions: " +predicted);
			System.out.println("Number of correct words: " +correct);
			precision_ed = (correct/predicted)*100;		//Precision percentage
			recall_ed = (correct/edit_misspell.size())*100;		//Recall percentage
			System.out.printf("Precision: %.2f \n",precision_ed);
			System.out.printf("Recall: %.2f \n\n",recall_ed);
	}
			
		//soundex
	public static void soundex(ArrayList<String> soundex_misspell, ArrayList<String> soundex_dictionary, ArrayList<String> soundex_correctlist)
	{
			Soundex sd = new Soundex(); // instance for soundex
			double soundex_predicted = 0;
			double soundex_correct = 0;		
		for(int x= 0; x<soundex_misspell.size(); x++)
		{
			for(int k = 0; k< soundex_dictionary.size();k++)
			{
				//To check for predicted words
				if(sd.soundex(soundex_misspell.get(x)).equals(sd.soundex(soundex_dictionary.get(k))))
				{
					soundex_predicted++;
					//To check for correct words
					if(soundex_dictionary.get(k).equals(soundex_correctlist.get(x)))
						soundex_correct++;
						}
			}
		}
		double precision_soundex = 0;
		double recall_soundex = 0;
		System.out.println("Soundex Results:");
		System.out.println("Number of predictions: " +soundex_predicted);
		System.out.println("Number of correct words: " +soundex_correct);
		precision_soundex = (soundex_correct/soundex_predicted)*100;		//Precision percentage
		recall_soundex = (soundex_correct/soundex_misspell.size())*100;	//Recall percentage
		System.out.printf("Precision: %.2f \n",precision_soundex);
		System.out.printf("Recall: %.2f \n\n",recall_soundex);
		}
	
	public static void main(String[] args) throws Exception
	{
		//read misspell.txt and put them into an array
		double misspell_counter = 0;
		BufferedReader read_misspell = new BufferedReader(new FileReader("/Users/shekharkumar/eclipse-workspace/KT_project/src/misspell.txt"));
		String misspell_word;
		ArrayList<String>  array_misspell = new ArrayList<>();
		while((misspell_word = read_misspell.readLine())!= null)  
		{
			array_misspell.add(misspell_word);
			misspell_counter++;
		}
	
		//read dictionary.txt and put them into an array
		BufferedReader read_dictionary = new BufferedReader(new FileReader("/Users/shekharkumar/eclipse-workspace/KT_project/src/dictionary.txt"));
		String dictionary_word;
		ArrayList<String> array_dictionary = new ArrayList<>();
		while((dictionary_word = read_dictionary.readLine()) != null) 
		{
				array_dictionary.add(dictionary_word);
		}
						
		//read correct.txt and put them into an array
		BufferedReader read_correct = new BufferedReader(new FileReader("/Users/shekharkumar/eclipse-workspace/KT_project/src/correct.txt"));
		String correct_word;
		ArrayList<String> array_correct = new ArrayList<>();
		while((correct_word = read_correct.readLine()) != null) 
		{
			array_correct.add(correct_word);
		}
		edit_distance(array_misspell, array_dictionary, array_correct);
		soundex(array_misspell, array_dictionary, array_correct);
					
		
}
}

