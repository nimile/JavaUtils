package de.haevn.utils.enumeration;

public enum MicroTimeUnits {

    MICROSECONDS(1),
    MILLISECONDS(MICROSECONDS.getValue() * 1000),
    SECONDS(MILLISECONDS.getValue() * 1000),
    MINUTES(SECONDS.getValue() * 60),
    HOURS(MINUTES.getValue() * 60),
    DAYS(HOURS.getValue() * 24),
    WEEKS(DAYS.getValue() * 7),
    MONTHS(DAYS.getValue() * 30),
    YEARS(DAYS.getValue() * 365);


    private final long value;

    private MicroTimeUnits(final long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
