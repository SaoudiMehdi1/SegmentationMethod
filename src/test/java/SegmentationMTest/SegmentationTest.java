package SegmentationMTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static SegmentationM.MainClass.Segmentation;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SegmentationTest {

    @Test
    public void SegmentationPerOneElement() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Collection<List<Integer>> myCollection = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4), Arrays.asList(5), Arrays.asList(6), Arrays.asList(7), Arrays.asList(8), Arrays.asList(9), Arrays.asList(10));
        assertEquals(myCollection, Segmentation(list,1));
    }

    @Test
    public void SegmentationPerTwoElements() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Collection<List<Integer>> myCollection = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5,6), Arrays.asList(7,8), Arrays.asList(9,10));
        assertEquals(myCollection, Segmentation(list,2));
    }

    @Test
    public void SegmentationPerThreeElements() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Collection<List<Integer>> myCollection = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9), Arrays.asList(10));
        assertEquals(myCollection, Segmentation(list,3));
    }

    @Test
    public void SegmentationPerFourElements() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Collection<List<Integer>> myCollection = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(9,10));
        assertEquals(myCollection, Segmentation(list,4));
    }


}
