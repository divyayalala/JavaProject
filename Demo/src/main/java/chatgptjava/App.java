package chatgptjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;


public class App 
{
    public static void main( String[] args ) throws IOException, JSONException
    {

	 // Set ChatGPT endpoint and API key
        String endpoint = "https://api.openai.com/v1/engines/davinci-codex/completions";
        String apiKey = "jFrxufNxs8AELmcQ5zOLT3BlbkFJeXWIegLzWu5L7GEoS3lX";

        // Prompt user for input string
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your message: ");
        String input = reader.readLine();

        // Send input to ChatGPT API and display response
        String response = ChatBot.sendQuery(input, endpoint, apiKey);
        System.out.println("Response: " + response);

    }
}
