package ru.netology.statistic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class StatisticsServiceTest {
       @Test
    void findMaxEx1() {
        StatisticsService service = new StatisticsService();
           long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 10};
           long expected = 12;
           long actual = service.findMax(incomesInBillions);
           assertEquals(expected, actual);
       }
    @Test
    void findMaxE2() {
       StatisticsService service = new StatisticsService();
       long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 18, 6, 11, 11, 10};
       long expected = 18;
      long actual = service.findMax(incomesInBillions);
       assertEquals(expected, actual);
    }
}