import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        double sum = 0.0;

        for (int i: householdEstimatesKgPerCapitaPerYear) {
            sum += i;
        }

        double mean = sum / householdEstimatesKgPerCapitaPerYear.length + 0.5;

        return (int) mean;

    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {

        double counter = 0.0;

        for (int i: householdEstimatesTonnesPerYear) {
            counter += i;
        }

        double mean = (counter / householdEstimatesTonnesPerYear.length) + 0.5;

        return (int) mean;

    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int sum = 0;

        for (int i: retailEstimatesKgPerCapitaPerYear) {
            sum += i;
        }

        double mean = (double) sum / retailEstimatesKgPerCapitaPerYear.length + 0.5;

        return (int) mean;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        double sum = 0.0;
        for (int i: retailEstimatesTonnesPerYear) {
            sum += i;
        }
        double mean = sum / retailEstimatesTonnesPerYear.length + 0.5;

        return (int) mean;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }
    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {

        int[] array = retailEstimatesTonnesPerYear;

        Arrays.sort(array);

        int length = array.length;

        if (length % 2 == 0) {
            return (int)(array[length / 2 - 1] + array[length / 2] + 0.5) / 2;
        } else {
            return array[length / 2];
        }
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int[] array = retailEstimatesKgPerCapitaPerYear;

        Arrays.sort(array);

        int length = array.length;

        if (length % 2 == 0) {

            return (int)(array[length / 2 - 1] + array[length / 2] + 0.5) / 2;
        } else {
            return array[length / 2];
        }
    }

    public static int meanRetailEstimatesTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        double counter = 0;

        for (int i: retailEstimatesTonnesPerYear) {
            counter += i;
        }

        double mean = counter / retailEstimatesTonnesPerYear.length + 0.5;

        return (int) mean;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {

        double sum = 0;
        for (int i = 0; i < foodServiceEstimatesKgPerCapitaPerYear.length; i++) {
            sum += foodServiceEstimatesKgPerCapitaPerYear[i];
        }

        double mean = sum / foodServiceEstimatesKgPerCapitaPerYear.length + 0.5;

        return (int) mean;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        Arrays.sort(foodServiceEstimatesTonnesPerYear);
        int lengthOfArray = foodServiceEstimatesTonnesPerYear.length;
        if (lengthOfArray % 2 == 0) {
            int positionOfFirstNeededNumber = (lengthOfArray / 2) - 1;
            int positionOfSecondNeededNumber = lengthOfArray / 2;
            int theMedian = (foodServiceEstimatesTonnesPerYear[positionOfFirstNeededNumber] + foodServiceEstimatesTonnesPerYear[positionOfSecondNeededNumber]) / 2;
            return theMedian;
        } else {
            return foodServiceEstimatesTonnesPerYear[lengthOfArray / 2];
        }
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {

        int[] array = foodServiceEstimatesKgPerCapitaPerYear;
        Arrays.sort(array);

        int length = array.length;

        if (length % 2 == 0) {
            return (int)(array[length / 2 - 1] + array[length / 2] + 0.5) / 2;
        } else {
            return array[length / 2];
        }
    }


    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    /**
     * Max Methods
     */

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] a) {

        int max = a[0];

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(country)) {
                return totalWasteKgPerCapitaPerYear[i];
            }
        }
        return -1;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int most = 0;
        String nameOfMost = "";
        for (int i = 0; i < totalWasteKgPerCapitaPerYear.length; i++) {
            if (totalWasteKgPerCapitaPerYear[i] > most) {
                most = totalWasteKgPerCapitaPerYear[i];
                nameOfMost = countries[i];
            }
        }
        return nameOfMost;
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty) {

        //first, figure out what the highest poverty percentage is
        double highestPercentage = percentagesShareInPoverty[0];
        for (int i = 1; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] > highestPercentage) {
                highestPercentage = percentagesShareInPoverty[i];
            }
        }
        // count how many countries have that percentage -> needed when creating the array with the countries in it
        int count = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == highestPercentage) {
                count++;
            }
        }
        // Put in an array the countries with the highest percentage
        String[] arrayOfFinalCountries = new String[count];
        int index = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == highestPercentage) {
                arrayOfFinalCountries[index++] = countries[i];
            }
        }
        return arrayOfFinalCountries;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences) {
// Count how many times the words "High Confidence" appears
        int count = 0;
        for (int i = 0; i < confidences.length; i++) {
            if ("High Confidence".equals(confidences[i])) {
                count++;
            }
        }
        // Put in an array the countries with "High Confidence"
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < confidences.length; i++) {
            if ("High Confidence".equals(confidences[i])) {
                result[index++] = countries[i];
            }
        }
        return result;

    }
}

