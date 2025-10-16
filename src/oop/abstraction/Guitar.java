package oop.abstraction;

public class Guitar implements AbstractionExercises.Playable {
    @Override
    public void play() {
        System.out.println("play guitar");
    }
}
