package X;

import android.graphics.BitmapFactory;

/* renamed from: X.2Ow  reason: invalid class name and case insensitive filesystem */
public class C49062Ow {
    public int A00 = 1;
    public BitmapFactory.Options A01;
    public boolean A02;

    public C49062Ow() {
    }

    public C49062Ow(C49052Ov r2) {
    }

    public String toString() {
        String str;
        int i = this.A00;
        if (i == 0) {
            str = "Cancel";
        } else {
            str = i == 1 ? "Allow" : "?";
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("thread state = ", str, ", options = ");
        A0Z.append(this.A01);
        return A0Z.toString();
    }
}
