package X;

import android.graphics.Bitmap;
import java.util.Vector;

/* renamed from: X.0v7  reason: invalid class name and case insensitive filesystem */
public class C19490v7 {
    public static final Vector A02 = new Vector();
    public int A00;
    public final Object[] A01;

    public C19490v7(int i) {
        this.A01 = new Object[i];
        A02.add(this);
    }

    public synchronized Object A00() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.A00 = i2;
        return obj;
    }

    public synchronized void A01() {
        Object[] objArr = this.A01;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof Bitmap)) {
                ((Bitmap) obj).recycle();
            }
            objArr[i] = null;
        }
        this.A00 = 0;
    }

    public synchronized void A02(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i < i2) {
                if (this.A01[i] == obj) {
                    break;
                }
                i++;
            } else {
                Object[] objArr = this.A01;
                if (i2 < objArr.length) {
                    objArr[i2] = obj;
                    this.A00 = i2 + 1;
                    return;
                }
            }
        }
    }
}
