package strings;

public class ReversingWords {

	public static void main(String[] args) {
		
		String eg = "  I love Java,    the coffee           ";
		String spaceRemoving = "";
		for(int i = 0; i <= eg.length(); i++) {
			spaceRemoving = eg.replaceAll("\\s+"," ");
			}
		String trimmed = spaceRemoving.trim();
		
		String split[] = trimmed.split(" ");
		String result = "";
		for(int i = split.length - 1; i >= 0; i--) {
			result += split[i] + " ";
		}
		System.out.println(result);
	}

}
