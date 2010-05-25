package battletris.player;
public interface PlayerInfo extends java.io.Serializable
{
	public int getScore();
	public int getMoney();
	public int getLines();
	public String getDisplayName();
	public String getUri();
	public String getUsername();
	public String toString();
	public boolean equals(Object other);
}