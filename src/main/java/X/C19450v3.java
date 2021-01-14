package X;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.0v3  reason: invalid class name and case insensitive filesystem */
public class C19450v3 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Rect[] A04;
    public final String[] A05;
    public final C19480v6[][] A06;

    public C19450v3(String str, String str2, Rect[] rectArr, int i, String[] strArr, C19480v6[][] r8) {
        this.A01 = str;
        String queryParameter = Uri.parse(str).getQueryParameter("v");
        this.A02 = TextUtils.isEmpty(queryParameter) ? "unknown" : queryParameter;
        this.A03 = str2;
        this.A04 = rectArr;
        this.A00 = i;
        this.A05 = strArr;
        this.A06 = r8;
    }
}
