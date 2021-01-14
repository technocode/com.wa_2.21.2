package X;

import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Pp  reason: invalid class name and case insensitive filesystem */
public class C05670Pp implements AbstractC05680Pq {
    public C05740Pw A00;
    public final int A01;
    public final int A02;
    public final C05630Pl A03;
    public final AnonymousClass03K A04;
    public final RandomAccessFile A05;

    public C05670Pp(RandomAccessFile randomAccessFile, C05630Pl r2, int i, int i2, AnonymousClass03K r5) {
        this.A05 = randomAccessFile;
        this.A03 = r2;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = r5;
    }

    public final C05740Pw A00(int i) {
        C05740Pw r3 = new C05740Pw(this.A05, i, this.A03, this.A01, this.A04);
        try {
            r3.A02();
            return r3;
        } catch (AnonymousClass2OE e) {
            StringBuilder A0S = AnonymousClass008.A0S("InMemorySingleEventBufferManager/readEventBufferFromDisk: error in reading event buffer");
            A0S.append(e.toString());
            Log.e(A0S.toString());
            return r3;
        }
    }

    @Override // X.AbstractC05680Pq
    public boolean A2U() {
        return A00(A7d(this.A03.A01)).A04();
    }

    @Override // X.AbstractC05680Pq
    public void A2g() {
        C05740Pw r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    @Override // X.AbstractC05680Pq
    public C05740Pw A3X() {
        return this.A00;
    }

    @Override // X.AbstractC05680Pq
    public void A3x(List list) {
        if (AAG()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue != this.A03.A01) {
                    C05740Pw A002 = A00(intValue);
                    if (!A002.A04()) {
                        A002.A00();
                        try {
                            A002.A01();
                        } catch (IOException e) {
                            StringBuilder A0S = AnonymousClass008.A0S("InMemorySingleEventBufferManager/dropSentData: error while event buffer flush");
                            A0S.append(e.toString());
                            Log.e(A0S.toString());
                        }
                    }
                }
            }
            return;
        }
        throw new Error("InMemorySingleEventBufferManager/dropSentData: Tried to drop empty buffer");
    }

    @Override // X.AbstractC05680Pq
    public boolean A4I() {
        try {
            this.A00.A01();
            return true;
        } catch (IOException unused) {
            Log.e("InMemorySingleEventBufferManager/flushEventBuffers: error while event buffer flush");
            return false;
        }
    }

    @Override // X.AbstractC05680Pq
    public SparseArray A5x() {
        SparseArray sparseArray = new SparseArray();
        C05630Pl r3 = this.A03;
        int A7d = A7d(r3.A01);
        while (A7d != r3.A01) {
            C05740Pw A002 = A00(A7d);
            if (!A002.A04()) {
                ByteBuffer byteBuffer = A002.A04.A05;
                sparseArray.put(A7d, Arrays.copyOf(byteBuffer.array(), byteBuffer.position()));
            }
            A7d = A7d(A7d);
        }
        return sparseArray;
    }

    @Override // X.AbstractC05680Pq
    public int A7d(int i) {
        return (i + 1) % this.A02;
    }

    @Override // X.AbstractC05680Pq
    public boolean AAG() {
        for (int i = 0; i < this.A02; i++) {
            if (!(i == this.A03.A01 || A00(i).A04())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC05680Pq
    public void AAf() {
        C05630Pl r3 = this.A03;
        C05640Pm[] r0 = r3.A05;
        int i = r3.A01;
        C05640Pm r6 = r0[i];
        C05740Pw r02 = new C05740Pw(this.A05, i, r3, this.A01, this.A04);
        this.A00 = r02;
        try {
            r02.A02();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j = r6.A04;
            if (j > seconds) {
                StringBuilder A0S = AnonymousClass008.A0S("InMemorySingleEventBufferManager/init event from file: current event buffer timestamp is ");
                A0S.append(j - seconds);
                A0S.append(" seconds in the future");
                Log.w(A0S.toString());
                r6.A04 = seconds;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            C05740Pw r32 = this.A00;
            boolean A032 = r32.A03();
            if (A032) {
                objArr[0] = Integer.valueOf(r32.A02);
                if (A032) {
                    objArr[1] = Integer.valueOf(r32.A00);
                    if (A032) {
                        objArr[2] = Integer.valueOf(r32.A03.A00.size());
                        objArr[3] = Integer.valueOf(this.A00.A04.A05.position());
                        C05740Pw r2 = this.A00;
                        objArr[4] = Long.valueOf(r2.A05.A05[r2.A01].A04);
                        Log.i(String.format(locale, "InMemorySingleEventBufferManager/initfromfile: opened existing wam file: record_count = %d, event_count = %d, attribute_count = %d, size = %d, create_ts = %d", objArr));
                        return;
                    }
                    throw new UnsupportedOperationException("No attribute count available for rotated buffers");
                }
                throw new UnsupportedOperationException("No event count available for rotated buffers");
            }
            throw new UnsupportedOperationException("No record count available for rotated buffers");
        } catch (AnonymousClass2OE e) {
            throw new AnonymousClass2OI(e.toString());
        }
    }

    @Override // X.AbstractC05680Pq
    public void AAp() {
        RandomAccessFile randomAccessFile = this.A05;
        C05630Pl r3 = this.A03;
        this.A00 = new C05740Pw(randomAccessFile, r3.A01, r3, this.A01, this.A04);
    }

    @Override // X.AbstractC05680Pq
    public void ABn() {
        this.A00 = A00(this.A03.A01);
    }
}
