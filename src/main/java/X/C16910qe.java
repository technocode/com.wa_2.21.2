package X;

import android.content.ComponentName;

/* renamed from: X.0qe  reason: invalid class name and case insensitive filesystem */
public class C16910qe implements Comparable {
    public final ComponentName A00;
    public final C14670mg A01;

    public C16910qe(C14670mg r1, ComponentName componentName) {
        this.A01 = r1;
        this.A00 = componentName;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.A01.A00 - ((C16910qe) obj).A01.A00;
    }
}
