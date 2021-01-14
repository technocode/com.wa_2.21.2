package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0me  reason: invalid class name and case insensitive filesystem */
public final class C14650me implements Iterable {
    public final Context A00;
    public final ArrayList A01 = new ArrayList();

    public C14650me(Context context) {
        this.A00 = context;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.A01.iterator();
    }
}
