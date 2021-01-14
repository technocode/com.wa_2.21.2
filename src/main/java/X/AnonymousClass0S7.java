package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: X.0S7  reason: invalid class name */
public class AnonymousClass0S7 extends ContextWrapper {
    public LayoutInflater A00;
    public final AnonymousClass0LB A01;
    public final AnonymousClass01W A02;
    public final AnonymousClass01X A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0S7(android.content.Context r3, X.AnonymousClass01X r4, X.AnonymousClass0LB r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0S7.<init>(android.content.Context, X.01X, X.0LB):void");
    }

    public Context createConfigurationContext(Configuration configuration) {
        return new AnonymousClass0S7(super.createConfigurationContext(configuration), this.A03, this.A01);
    }

    public Resources getResources() {
        return this.A02;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        AnonymousClass0LK r1 = this.A01.A00;
        AnonymousClass00E.A04(r1, "setFactory() not called");
        C06450Th r0 = new C06450Th(r1.A00, LayoutInflater.from(getBaseContext()), this);
        this.A00 = r0;
        return r0;
    }
}
