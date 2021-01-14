package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Fy  reason: invalid class name and case insensitive filesystem */
public final class C03380Fy {
    public boolean A00;
    public final int A01 = 3;
    public final String A02;

    public C03380Fy(String str, boolean z) {
        this.A02 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" initialize to ");
        sb.append(z);
        Log.log(3, sb.toString());
        this.A00 = z;
    }

    public void A00(boolean z) {
        int i = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append(" ");
        sb.append(this.A00);
        sb.append(" change to ");
        sb.append(z);
        Log.log(i, sb.toString());
        this.A00 = z;
    }
}
