package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.17c  reason: invalid class name and case insensitive filesystem */
public final class C236817c {
    public static final Status A03 = new Status(8, "The connection to Google Play services was lost");
    public static final BasePendingResult[] A04 = new BasePendingResult[0];
    public final AbstractC236917d A00 = new C34991jY(this);
    public final Map A01;
    public final Set A02 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public C236817c(Map map) {
        this.A01 = map;
    }
}
