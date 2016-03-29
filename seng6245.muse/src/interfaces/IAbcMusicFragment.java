package interfaces;
import sound.Orchestrator;

public interface IAbcMusicFragment {

    public int getTicksPerBeat();
    public void addToOrchestrator(Orchestrator orchestrator);
    
    @Override
    public boolean equals(Object other);

    @Override
    public String toString();

    @Override
    public int hashCode();
	
}
