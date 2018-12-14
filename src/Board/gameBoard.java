package Board;

import Rooms.Room;

public class gameBoard {

    private gameBoard [][]map;

    public gameBoard (Room[][] map)
    {
        this.map =map;
    }

    public void print ()
    {
        String row = "";
        for(int i=0; i<map.length; i++)
        {
            row = "";
        }
        for (int j=0; j<map[i].length; j++)
        {
            row += map [i][j].toString();
        }
        System.out.println(row);
    }
}
