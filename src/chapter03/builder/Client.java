package chapter03.builder;

import chapter03.builder.builder.MazeBuilder;
import chapter03.builder.builder.StandMazeBuilder;
import chapter03.builder.director.MazeDirector;
import chapter03.builder.director.SmallMazeDirector;
import chapter03.builder.product.Maze;

public class Client {

    public static void main(String[] args) {
        MazeBuilder mazeBuilder = new StandMazeBuilder();
        MazeDirector mazeDirector = new SmallMazeDirector(mazeBuilder);

        mazeDirector.construct();

        Maze maze = mazeBuilder.build();
    }

}
