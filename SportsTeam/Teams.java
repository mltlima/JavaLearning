/**
 *
 * @author Miguel
 */
public class Teams {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public Teams(String home,String visiting,int hPoints,int vPoints) {
        this.homeTeam = home;
        this.visitingTeam = visiting;
        this.homePoints = hPoints;
        this.visitingPoints = vPoints;
    }
    
    public String getName() {
        return this.homeTeam;
    }
    
    public String getVisitor() {
        return this.visitingTeam;
    }
    
    public int homeScore() {
        return this.homePoints;
    }
    
    public int visitorScore() {
        return this.visitingPoints;
    }
    
    @Override
    public String toString() {
        return "Games: " + this.homePoints;
    }
    
}
