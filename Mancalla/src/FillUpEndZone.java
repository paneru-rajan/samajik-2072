import java.util.Objects;

public class FillUpEndZone {


    public static void main(String WhoIsPlaying,int positionToFill) {
if(WhoIsPlaying.equals("player"))
{
if(positionToFill==6) {
    InitialBoard.positions[positionToFill] = InitialBoard.positions[positionToFill] + 1;
    FillUp.getValue--;
}
}
if(WhoIsPlaying.equals("computer"))
{
    if(positionToFill==0) {
        InitialBoard.positions[positionToFill] = InitialBoard.positions[positionToFill] + 1;
        ComputerFillup.getValue--;
    }
}

    }
}
