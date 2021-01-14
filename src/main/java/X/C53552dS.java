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

/* renamed from: X.2dS  reason: invalid class name and case insensitive filesystem */
public class C53552dS implements AbstractC05680Pq {
    public C05740Pw[] A00;
    public final int A01;
    public final int A02;
    public final C05630Pl A03;
    public final AnonymousClass03K A04;
    public final RandomAccessFile A05;

    @Override // X.AbstractC05680Pq
    public void ABn() {
    }

    public C53552dS(RandomAccessFile randomAccessFile, C05630Pl r2, int i, int i2, AnonymousClass03K r5) {
        this.A05 = randomAccessFile;
        this.A03 = r2;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = r5;
    }

    @Override // X.AbstractC05680Pq
    public boolean A2U() {
        return this.A00[A7d(this.A03.A01)].A04();
    }

    @Override // X.AbstractC05680Pq
    public void A2g() {
        for (C05740Pw r0 : this.A00) {
            r0.A00();
        }
    }

    @Override // X.AbstractC05680Pq
    public C05740Pw A3X() {
        return this.A00[this.A03.A01];
    }

    @Override // X.AbstractC05680Pq
    public void A3x(List list) {
        if (AAG()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue != this.A03.A01 && !this.A00[intValue].A04()) {
                    this.A00[intValue].A00();
                }
            }
            return;
        }
        throw new Error("InMemoryMultipleEventBuffersManager: Tried to drop empty buffer");
    }

    @Override // X.AbstractC05680Pq
    public boolean A4I() {
        try {
            for (C05740Pw r0 : this.A00) {
                r0.A01();
            }
            return true;
        } catch (IOException unused) {
            Log.e("InMemoryMultipleEventBufferManager/flushEventBuffers: error while event buffer flush");
            return false;
        }
    }

    @Override // X.AbstractC05680Pq
    public SparseArray A5x() {
        SparseArray sparseArray = new SparseArray();
        C05630Pl r3 = this.A03;
        int A7d = A7d(r3.A01);
        while (A7d != r3.A01) {
            C05740Pw r1 = this.A00[A7d];
            if (!r1.A04()) {
                ByteBuffer byteBuffer = r1.A04.A05;
                sparseArray.put(A7d, Arrays.copyOf(byteBuffer.array(), byteBuffer.position()));
            }
            A7d = A7d(A7d);
        }
        return sparseArray;
    }

    @Override // X.AbstractC05680Pq
    public int A7d(int i) {
        return (i + 1) % this.A00.length;
    }

    @Override // X.AbstractC05680Pq
    public boolean AAG() {
        C05740Pw[] r5 = this.A00;
        for (C05740Pw r1 : r5) {
            if (!(r1.A03() || r1.A04())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC05680Pq
    public void AAf() {
        AAp();
        int i = 0;
        while (true) {
            C05740Pw[] r1 = this.A00;
            if (i < r1.length) {
                C05630Pl r4 = this.A03;
                C05640Pm r6 = r4.A05[i];
                try {
                    r1[i].A02();
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    if (i == r4.A01) {
                        long j = r6.A04;
                        if (j > seconds) {
                            StringBuilder A0S = AnonymousClass008.A0S("InMemoryMultipleEventBuffersManager/initfromfile: current event buffer timestamp is ");
                            A0S.append(j - seconds);
                            A0S.append(" seconds in the future");
                            Log.w(A0S.toString());
                            r6.A04 = seconds;
                        }
                    }
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[6];
                    C05740Pw A3X = A3X();
                    if (A3X.A03()) {
                        objArr[0] = Integer.valueOf(A3X.A02);
                        C05740Pw A3X2 = A3X();
                        if (A3X2.A03()) {
                            objArr[1] = Integer.valueOf(A3X2.A00);
                            C05740Pw A3X3 = A3X();
                            if (A3X3.A03()) {
                                objArr[2] = Integer.valueOf(A3X3.A03.A00.size());
                                objArr[3] = Integer.valueOf(A3X().A04.A05.position());
                                C05740Pw A3X4 = A3X();
                                objArr[4] = Long.valueOf(A3X4.A05.A05[A3X4.A01].A04);
                                C05740Pw[] r5 = this.A00;
                                int i2 = 0;
                                for (C05740Pw r12 : r5) {
                                    if (!r12.A03()) {
                                        i2 = r12.A04.A05.position() + i2;
                                    }
                                }
                                objArr[5] = Integer.valueOf(i2);
                                Log.i(String.format(locale, "InMemoryMultipleEventBuffersManager/initfromfile: opened existing wam file: record_count = %d, event_count = %d, attribute_count = %d, size = %d, create_ts = %d, rotated_size = %d", objArr));
                                i++;
                            } else {
                                throw new UnsupportedOperationException("No attribute count available for rotated buffers");
                            }
                        } else {
                            throw new UnsupportedOperationException("No event count available for rotated buffers");
                        }
                    } else {
                        throw new UnsupportedOperationException("No record count available for rotated buffers");
                    }
                } catch (AnonymousClass2OE e) {
                    throw new AnonymousClass2OI(e.toString());
                }
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC05680Pq
    public void AAp() {
        this.A00 = new C05740Pw[this.A02];
        int i = 0;
        while (true) {
            C05740Pw[] r1 = this.A00;
            if (i < r1.length) {
                r1[i] = new C05740Pw(this.A05, i, this.A03, this.A01, this.A04);
                i++;
            } else {
                return;
            }
        }
    }
}
