package ru.netology.stats.massiveqa.service;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi + 1;
    }

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales (long[] sales) {
        long sumAllSales = sumAllSales(sales);
        return sumAllSales / 12;
    }

    public long aboveAverage (long[] sales) {
        int count = 0;
        long avegage = averageSales(sales);
        for (long sale : sales){
            if (sale > avegage){
                count++;
            }
        }
        return count;
    }

    public long belowAverage(long[] sales){
        int countMax = 0;
        long averageMax = averageSales(sales);
        for (long sale : sales){
            if (sale < averageMax) {
                countMax++;
            }
        }
        return countMax;
    }

}
