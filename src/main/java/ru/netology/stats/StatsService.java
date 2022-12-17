package ru.netology.stats;

public class StatsService {
    public long amount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageAmount(long[] sales) {
        long result = amount(sales) / sales.length;
        return result;
    }

    public int maxSaleMonth(long[] sales) {
        int month = 0;
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSaleMonth(long[] sales) {
        int month = 0;
        int minMonth = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                numberMonth = numberMonth + 1;
            }

        }
        return numberMonth;
    }

    public int aboveAverage(long[] sales) {
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                numberMonth = numberMonth + 1;
            }

        }
        return numberMonth;
    }
}
