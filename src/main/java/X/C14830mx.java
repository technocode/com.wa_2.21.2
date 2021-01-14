package X;

import android.util.Log;
import java.io.Writer;

/* renamed from: X.0mx  reason: invalid class name and case insensitive filesystem */
public class C14830mx extends Writer {
    public StringBuilder A00 = new StringBuilder(128);
    public final String A01 = "FragmentManager";

    public final void A00() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            Log.d(this.A01, sb.toString());
            StringBuilder sb2 = this.A00;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        A00();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        A00();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                A00();
            } else {
                this.A00.append(c);
            }
        }
    }
}
