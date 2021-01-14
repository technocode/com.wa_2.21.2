package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.07i  reason: invalid class name and case insensitive filesystem */
public final class C012807i {
    public int A00 = 0;
    public final C012207c A01;
    public final Map A02 = new AnonymousClass05V();

    public C012807i(C012207c r2) {
        this.A01 = r2;
    }

    public final String A00() {
        String string;
        C012207c r3 = this.A01;
        synchronized (r3) {
            string = r3.A01.getString("topic_operaion_queue", "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }
}
