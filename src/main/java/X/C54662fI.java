package X;

import com.whatsapp.util.Log;

/* renamed from: X.2fI  reason: invalid class name and case insensitive filesystem */
public class C54662fI extends AnonymousClass2Q1 {
    public final /* synthetic */ C54672fJ A00;
    public final /* synthetic */ CharSequence A01;
    public final /* synthetic */ boolean A02;

    public C54662fI(C54672fJ r2, CharSequence charSequence, boolean z) {
        this.A00 = r2;
        this.A01 = charSequence;
        this.A02 = z;
        A01(null);
    }

    public final void A01(String str) {
        StringBuilder sb = new StringBuilder("gif/search/tenor/loading next search page \"");
        sb.append(str);
        sb.append("\"");
        Log.d(sb.toString());
        this.A00.A08.ANC(new C59932oW(this, this.A01, str), new Void[0]);
    }
}
