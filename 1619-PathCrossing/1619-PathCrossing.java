// Last updated: 10/13/2025, 11:30:16 PM
import java.util.*;

class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add("0,0");

        for (char direction : path.toCharArray()) {
            if (direction == 'N') y++;
            else if (direction == 'S') y--;
            else if (direction == 'E') x++;
            else if (direction == 'W') x--;

            String pos = x + "," + y;
            if (visited.contains(pos)) {
                return true;
            }
            visited.add(pos);
        }

        return false;
    }
}
