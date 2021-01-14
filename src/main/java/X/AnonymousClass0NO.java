package X;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

/* renamed from: X.0NO  reason: invalid class name */
public final class AnonymousClass0NO implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0N5 A02;
    public final /* synthetic */ String A03;

    public AnonymousClass0NO(Context context, AnonymousClass0N5 r2, int i, String str) {
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = str;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        AnonymousClass0NN A002 = AnonymousClass0NM.A00(this.A01, this.A02, this.A00);
        Typeface typeface = A002.A01;
        if (typeface != null) {
            AnonymousClass0NM.A00.A07(this.A03, typeface);
        }
        return A002;
    }
}
