package playground.core;

import java.util.Objects;

public class Result {
    private final Object value;

    public Result(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result result)) return false;
        return value == result.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
