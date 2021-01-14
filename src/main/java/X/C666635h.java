package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Writer;

/* renamed from: X.35h  reason: invalid class name and case insensitive filesystem */
public class C666635h extends Writer {
    public StringBuilder A00 = new StringBuilder(16384);

    public final void A00() {
        if (this.A00 == null) {
            throw new IOException("Stream closed");
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        if (this.A00 != null) {
            try {
                flush();
            } finally {
                this.A00 = null;
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        A00();
        if (Log.level >= 4) {
            StringBuilder sb = this.A00;
            if (sb.length() >= 262144) {
                sb.append("...");
            }
            Log.logToLogcat(4, Log.log("LL_D ", sb.toString()));
            this.A00 = new StringBuilder();
        }
    }

    @Override // java.io.Writer
    public void write(int i) {
        A00();
        if (Log.level >= 4) {
            StringBuilder sb = this.A00;
            if (sb.length() < 262144) {
                sb.append((char) i);
            }
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        A00();
        if (Log.level >= 4) {
            StringBuilder sb = this.A00;
            if (sb.length() < 262144) {
                sb.append((CharSequence) str, i, i2);
            }
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        A00();
        if (Log.level >= 4) {
            StringBuilder sb = this.A00;
            if (sb.length() < 262144) {
                sb.append(cArr, i, i2);
            }
        }
    }
}
