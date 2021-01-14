package X;

import android.os.Build;
import androidx.work.OverwritingInputMerger;

/* renamed from: X.1cM  reason: invalid class name and case insensitive filesystem */
public final class C31001cM extends AbstractC17690rz {
    public C31001cM(Class cls) {
        super(cls);
        this.A00.A0E = OverwritingInputMerger.class.getName();
    }

    @Override // X.AbstractC17690rz
    public AnonymousClass0s0 A01() {
        if (!this.A03 || Build.VERSION.SDK_INT < 23 || !this.A00.A09.A06) {
            C18030sf r1 = this.A00;
            if (!r1.A0G || Build.VERSION.SDK_INT < 23 || !r1.A09.A06) {
                return new C31011cN(this);
            }
            throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
}
