import io.nosqlbench.engine.api.activityimpl.ActivityDef;
import io.nosqlbench.engine.api.activityimpl.SimpleActivity;

public class NoopActivity extends SimpleActivity {
    public NoopActivity(ActivityDef activityDef) {
        super(activityDef);
    }
}
