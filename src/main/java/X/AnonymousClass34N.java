package X;

import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.34N  reason: invalid class name */
public class AnonymousClass34N {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass34O A07;
    public File A08;
    public Long A09;
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass34P A0E = new AnonymousClass34P();
    public final List A0F = new CopyOnWriteArrayList();
    public volatile File A0G;

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized long A01() {
        long j = this.A04;
        if (j != 0) {
            return j;
        }
        return this.A03;
    }

    public synchronized File A02() {
        return this.A0G;
    }

    public synchronized void A03() {
        File file = this.A08;
        if (file != null) {
            if (!file.delete()) {
                Log.w("DownloadContext/unable to delete chunkstore file");
            }
            this.A08 = null;
        }
    }

    public synchronized void A04(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            for (AnonymousClass34M r0 : this.A0F) {
                r0.AFI(i);
            }
        }
    }

    public synchronized void A05(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            for (AnonymousClass34M r0 : this.A0F) {
                r0.AFJ(this);
            }
        }
    }

    public synchronized void A06(long j, long j2) {
        this.A06 = j;
        for (AnonymousClass34M r0 : this.A0F) {
            r0.ADc(this, j2);
        }
    }

    public synchronized void A07(File file) {
        this.A0G = file;
        for (AnonymousClass34M r0 : this.A0F) {
            r0.AFz(this);
        }
    }

    public synchronized boolean A08() {
        return this.A0B;
    }

    public synchronized boolean A09(long j) {
        if (this.A01 == 3) {
            return true;
        }
        if (this.A07 == null) {
            return false;
        }
        if (j <= A01()) {
            return this.A07.A0A(this.A07.A01(j));
        }
        throw new EOFException();
    }
}
