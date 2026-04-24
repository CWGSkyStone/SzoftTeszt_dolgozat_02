/*
* File: Ellipsoid.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft I/N
* Date: 2026-04-24
* Github: https://github.com/CWGSkyStone/SzoftTeszt_dolgozat_02.git
* Licenc: MIT
*/

package dev.skystone;

import java.util.InputMismatchException;

public class Ellipsoid {
    public static double volumeCalc(double sideA, double sideB, double sideC) {
        if(sideA <= 0 || sideB <= 0 || sideC <= 0) throw new InputMismatchException();
        return 4 * (Math.PI * sideA * sideB * sideC) / 3;
    }
}
