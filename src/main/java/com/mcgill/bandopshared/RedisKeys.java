package com.mcgill.bandopshared;

public class RedisKeys {

    static final String SEPARATOR = ":";

    static final String EXPERIMENTS_KEY = "experiments";
    static final String CONFIG_KEY = "config";
    static final String DESIGNS_KEY = "designs";
    static final String PENDING_KEY = "pendingRewards";
    static final String COUNT_KEY = "count";
    static final String ALGO_TYPE = "algoType";

    public static String experiments() {
        return EXPERIMENTS_KEY;
    }

    public static String designs(int experimentId) {
        return designs(Integer.toString(experimentId));
    }

    public static String designs(String experimentId) {
        return buildKey(new String[] {EXPERIMENTS_KEY, experimentId, DESIGNS_KEY});
    }

    public static String config(int experimentId) {
        return config(Integer.toString(experimentId));
    }

    public static String config(String experimentId) {
        return buildKey(new String[] {EXPERIMENTS_KEY, experimentId, CONFIG_KEY});
    }

    public static String count(int experimentId) {
        return count(Integer.toString(experimentId));
    }

    public static String count(String experimentId) {
        return buildKey(new String[] {EXPERIMENTS_KEY, experimentId, COUNT_KEY});
    }

    public static String algorithmType(int experimentId) {
        return algorithmType(Integer.toString(experimentId));
    }

    public static String algorithmType(String experimentId) {
        return buildKey(new String[] {EXPERIMENTS_KEY, experimentId, ALGO_TYPE});
    }

    public static String design(int designId) {
        return design(Integer.toString(designId));
    }

    public static String design(String designId) {
        return buildKey(new String[] {DESIGNS_KEY, designId});
    }

    public static String pending(int designId) {
        return pending(Integer.toString(designId));
    }

    public static String pending(String designId) {
        return buildKey(new String[] {DESIGNS_KEY, designId, PENDING_KEY});
    }

    private static String buildKey(String[] parts) {
        String loopDelimiter = "";
        StringBuilder sb = new StringBuilder();

        for (String part : parts) {
            sb.append(loopDelimiter);
            sb.append(part);

            loopDelimiter = SEPARATOR;
        }

        return sb.toString();
    }

}
