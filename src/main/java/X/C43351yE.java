package X;

import com.whatsapp.util.Log;

/* renamed from: X.1yE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C43351yE implements AnonymousClass1TZ {
    public final /* synthetic */ String A00;

    public /* synthetic */ C43351yE(String str) {
        this.A00 = str;
    }

    @Override // X.AnonymousClass1TZ
    public final void AFW(boolean z, Object obj, Object obj2, Object obj3) {
        String str = this.A00;
        String str2 = (String) obj;
        if (z) {
            StringBuilder sb = new StringBuilder("Bloks: CacheShards evicted ");
            sb.append(str);
            sb.append(" :: ");
            sb.append(str2);
            Log.d(sb.toString());
        }
    }
}
