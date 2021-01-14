package X;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: X.16h  reason: invalid class name */
public final /* synthetic */ class AnonymousClass16h implements Comparator {
    public static final Comparator A00 = new AnonymousClass16h();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).A01.compareTo(((Scope) obj2).A01);
    }
}
