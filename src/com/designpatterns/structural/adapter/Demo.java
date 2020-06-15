package com.designpatterns.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        // Round fits round
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg with radius=5 fits round hole with radius=5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg with width=2 fits round hole with radius=5");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg with width=20 does not fit round hole with radius=5");
        }
    }
}
