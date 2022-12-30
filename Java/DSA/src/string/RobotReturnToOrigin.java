package string;

public class RobotReturnToOrigin {

    // Question Link : https://leetcode.com/problems/robot-return-to-origin/description/


    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        for (char direction : moves.toCharArray()) {

            if (direction == 'U') {
                y++;
            } else if (direction == 'D') {
                y--;
            } else if (direction == 'R') {
                x++;
            } else {
                x--;
            }

        }

        return x == 0 && y == 0 ? true : false;


    }

}
