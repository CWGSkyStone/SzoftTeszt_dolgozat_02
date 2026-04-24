/*
* File: TestEllipsoid.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft I/N
* Date: 2026-04-24
* Github: https://github.com/CWGSkyStone/SzoftTeszt_dolgozat_02.git
* Licenc: MIT
*/


package dev.skystone;


import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEllipsoid {
    @Test
    public void testVolumeCalc_30_35_30() {
        double expected = 131946.89;
        double actual = Ellipsoid.volumeCalc(30, 35, 30);
        Assert.assertEquals(actual, expected, 0.01);
    }
    @Test
    public void testVolumeCalc_125_47_11() {
        double expected = 270700.56;
        double actual = Ellipsoid.volumeCalc(125, 47, 11);
        Assert.assertEquals(actual, expected, 0.01);
    }
    @Test
    public void testVolumeCalc_1_32_1() {
        double expected = 134.04;
        double actual = Ellipsoid.volumeCalc(1, 32, 1);
        Assert.assertEquals(actual, expected, 0.01);
    }
    @Test
    public void testVolumeCalc_zeroPoint1_30_zeroPoint1() {
        double expected = 1.256;
        double actual = Ellipsoid.volumeCalc(0.1, 30, 0.1);
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testVolumeCalc_0_46_2() {
        Ellipsoid.volumeCalc(0, 46, 2);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testVolumeCalc_35_0_4() {
        Ellipsoid.volumeCalc(35, 0, 4);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testVolumeCalc_5_23_0() {
        Ellipsoid.volumeCalc(5, 23, 0);
    }

}
