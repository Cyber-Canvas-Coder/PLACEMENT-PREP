import java.util.Scanner;

class TeamFormation {
	 int calculateMaxTeams(int N, int M) {
        // Each team must have at least 1 experienced player and 1 fresher.
        // The total number of players required for one team is 4.
        // Therefore, the maximum number of teams is determined by the limiting factor:
        // the minimum of N, M, and (N + M) / 4.
        
        return Math.min(Math.min(N, M), (N + M) / 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input values
		System.out.print("n= ");
        int N = scanner.nextInt();
		System.out.println();		// Number of experienced players
		System.out.print("m= ");
        int M = scanner.nextInt(); // Number of freshers
		System.out.println();		// Number of experienced players
       TeamFormation t = new TeamFormation();
	   int result = t.calculateMaxTeams(N,M);
	   System.out.println("the maximum team can be formed: "+result);
	   
    }

   
}
