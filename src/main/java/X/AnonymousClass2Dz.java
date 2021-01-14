package X;

import android.util.Size;
import java.util.Comparator;

/* renamed from: X.2Dz  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Dz implements Comparator {
    public final /* synthetic */ long A00;

    public /* synthetic */ AnonymousClass2Dz(long j) {
        this.A00 = j;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AnonymousClass2Wh.A01(this.A00, (Size) obj, (Size) obj2);
    }
}
