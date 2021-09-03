package chapter03.builder.director;

import chapter03.builder.builder.MazeBuilder;

public abstract class MazeDirector {

    protected MazeBuilder mazeBuilder;

    public MazeDirector(MazeBuilder mazeBuilder) {
        this.mazeBuilder = mazeBuilder;
    }

    public abstract void construct();

}
