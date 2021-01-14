package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.10r  reason: invalid class name and case insensitive filesystem */
public class C222510r {
    public boolean A00 = true;
    public final AbstractC222410q A01;
    public final Map A02 = new HashMap();
    public final Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();

    public C222510r(AbstractC222410q r2) {
        this.A01 = r2;
        r2.A00 = this;
    }

    public void A00(String str) {
        Object obj = this.A02.get(str);
        if (obj != null) {
            this.A03.add(obj);
            if (this.A00) {
                this.A00 = false;
                C33431gl r2 = (C33431gl) this.A01;
                if (!r2.A01) {
                    r2.A01 = true;
                    r2.A00 = SystemClock.uptimeMillis();
                    Choreographer choreographer = r2.A03;
                    Choreographer.FrameCallback frameCallback = r2.A02;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0L("springId ", str, " does not reference a registered spring"));
    }
}
