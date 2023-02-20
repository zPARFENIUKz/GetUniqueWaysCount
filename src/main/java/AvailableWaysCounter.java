public class AvailableWaysCounter {
    /**
     *   1  |   |   | D |
     *   0  | R |   |   |
     *  x/y   0   1   2
     * R - robot
     * D - door
     *
     * @param x - x coordinate of the door
     * @param y - y coordinate of the door
     * @return count of available ways
     */
    public static int getCountOfAvailableWaysForRobot(final int x, final int y) {
        final int[][] arr = new int[x + 1][y + 1];
        return getCountOfAvailableWaysForRobot(x, y, arr);
    }

    private static int getCountOfAvailableWaysForRobot(int x, int y, int[][] arr) {
        if (x < 0 || y < 0) return 0;
        else if (x == 0 && y == 0) return 1;
        else if (arr[x][y] == 0) {
            arr[x][y] = getCountOfAvailableWaysForRobot(x - 1, y, arr) + getCountOfAvailableWaysForRobot(x, y - 1, arr);
        }
        return arr[x][y];
    }
}
