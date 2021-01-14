package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Xf  reason: invalid class name and case insensitive filesystem */
public class C29141Xf {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C29141Xf(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        this.A09 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A07 = str6;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public static final void A00(List list, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            list.add(new AnonymousClass0OS(str, str2, null, (byte) 0));
        }
    }

    public AnonymousClass0M5 A01(boolean z) {
        return new AnonymousClass0M5("sticker", (AnonymousClass0OS[]) ((AbstractCollection) A02(z)).toArray(new AnonymousClass0OS[0]), null, null);
    }

    public List A02(boolean z) {
        ArrayList arrayList = new ArrayList();
        A00(arrayList, "url", this.A09);
        A00(arrayList, "media_key", this.A07);
        A00(arrayList, "enc_filehash", this.A05);
        A00(arrayList, "direct_path", this.A04);
        A00(arrayList, "filehash", this.A06);
        A00(arrayList, "mimetype", this.A08);
        if (z) {
            A00(arrayList, "weight", this.A03);
        }
        arrayList.add(new AnonymousClass0OS("size", Integer.toString(this.A01), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("width", Integer.toString(this.A02), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("height", Integer.toString(this.A00), null, (byte) 0));
        return arrayList;
    }
}
