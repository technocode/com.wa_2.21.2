package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.22h  reason: invalid class name and case insensitive filesystem */
public class C449522h {
    public static final int A00 = TriggerRegistry.A00.A02("WhatsApp");
    public static final String A01;
    public static final List A02;

    static {
        String str;
        List asList;
        if (Math.random() < 0.5d) {
            str = "wall_time_stack_trace";
        } else {
            str = "stack_trace";
        }
        A01 = str;
        if ("x86_64".equals(C006803i.A0E())) {
            asList = Arrays.asList("qpl", A01, "other", "system_counters", "high_freq_main_thread_counters");
        } else {
            asList = Arrays.asList("atrace", "qpl", A01, "other", "system_counters", "high_freq_main_thread_counters");
        }
        A02 = asList;
    }
}
