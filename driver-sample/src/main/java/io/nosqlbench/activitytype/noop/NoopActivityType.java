package io.nosqlbench.activitytype.noop;

import io.nosqlbench.engine.api.activityapi.core.ActivityType;
import io.nosqlbench.nb.annotations.Service;

@Service(ActivityType.class)
public class NoopActivityType implements ActivityType<NoopActivity> {
    @Override
    public String getName() {
        return "noop";
    }
}
