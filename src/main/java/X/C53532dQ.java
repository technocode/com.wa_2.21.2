package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2dQ  reason: invalid class name and case insensitive filesystem */
public class C53532dQ implements AnonymousClass15E, AnonymousClass34M {
    public long A00;
    public long A01;
    public long A02;
    public RandomAccessFile A03;
    public boolean A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final C014308b A06 = C014308b.A00();
    public final AnonymousClass00C A07 = AnonymousClass00C.A00();
    public final AnonymousClass01X A08 = AnonymousClass01X.A00();
    public final AnonymousClass0AQ A09 = AnonymousClass0AQ.A00();
    public final AnonymousClass0ML A0A;
    public final AnonymousClass34N A0B;
    public final AnonymousClass3SW A0C;

    @Override // X.AnonymousClass15E
    public void A1u(AnonymousClass15U r1) {
    }

    @Override // X.AnonymousClass34M
    public void ADc(AnonymousClass34N r1, long j) {
    }

    @Override // X.AnonymousClass34M
    public void AFI(int i) {
    }

    @Override // X.AnonymousClass34M
    public void AJR() {
    }

    public C53532dQ(AnonymousClass0ML r3, AnonymousClass34N r4, AnonymousClass3SW r5) {
        this.A0A = r3;
        this.A0B = r4;
        this.A0C = r5;
    }

    @Override // X.AnonymousClass15E
    public /* synthetic */ Map A8n() {
        return Collections.emptyMap();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return Uri.fromFile(this.A0B.A02());
    }

    @Override // X.AnonymousClass34M
    public void AFJ(AnonymousClass34N r4) {
        this.A05.post(new RunnableEBaseShape8S0200000_I1_3(this, r4, 0));
    }

    @Override // X.AnonymousClass34M
    public void AFz(AnonymousClass34N r6) {
        RandomAccessFile randomAccessFile;
        File A022 = this.A0B.A02();
        if (this.A04 && (randomAccessFile = this.A03) != null) {
            try {
                long filePointer = randomAccessFile.getFilePointer();
                try {
                    this.A03.close();
                    this.A03 = null;
                } catch (IOException e) {
                    Log.e(e);
                    this.A03 = null;
                } catch (Throwable th) {
                    this.A03 = null;
                    throw th;
                }
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(A022, "r");
                    this.A03 = randomAccessFile2;
                    randomAccessFile2.seek(filePointer);
                } catch (IOException e2) {
                    Log.e(e2);
                    Log.e("WhatsappChunkAwareDataSource/hotswap failed");
                }
            } catch (IOException e3) {
                Log.e(e3);
                Log.e("WhatsappChunkAwareDataSource/hotswap failed");
            }
        }
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r10) {
        this.A00 = 0;
        long j = r10.A04;
        this.A02 = j;
        AnonymousClass34N r8 = this.A0B;
        synchronized (r8) {
            r8.A0F.add(this);
        }
        AnonymousClass34P r1 = r8.A0E;
        long j2 = this.A02;
        Handler handler = r1.A02;
        handler.removeCallbacks(r1.A01);
        RunnableEBaseShape1S0100100_I1 runnableEBaseShape1S0100100_I1 = new RunnableEBaseShape1S0100100_I1(r1, j2, 3);
        r1.A01 = runnableEBaseShape1S0100100_I1;
        handler.postDelayed(runnableEBaseShape1S0100100_I1, 200);
        long A012 = r8.A01() - j;
        this.A01 = A012;
        return A012;
    }

    @Override // X.AnonymousClass15E
    public void close() {
        RandomAccessFile randomAccessFile = this.A03;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.A03 = null;
                if (this.A04) {
                    this.A04 = false;
                }
            } catch (IOException e) {
                throw new AnonymousClass15I(e);
            } catch (Throwable th) {
                this.A03 = null;
                if (this.A04) {
                    this.A04 = false;
                }
                throw th;
            }
        }
        AnonymousClass34N r1 = this.A0B;
        synchronized (r1) {
            r1.A0F.remove(this);
        }
    }

    @Override // X.AnonymousClass15E
    public int read(byte[] bArr, int i, int i2) {
        long j;
        AnonymousClass34N r6 = this.A0B;
        if (r6.A00() == 0 || r6.A00() == 2) {
            return 0;
        }
        boolean z = false;
        if (r6.A02() != null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "downloadFile is null");
        if (!this.A04) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(r6.A02(), "r");
                this.A03 = randomAccessFile;
                randomAccessFile.seek(this.A02);
                this.A04 = true;
            } catch (IOException e) {
                throw new AnonymousClass15I(e);
            }
        }
        int min = (int) Math.min((long) i2, this.A01 - this.A00);
        if (min == 0) {
            return -1;
        }
        RandomAccessFile randomAccessFile2 = this.A03;
        if (randomAccessFile2 == null) {
            throw null;
        } else if (!r6.A09(randomAccessFile2.getFilePointer())) {
            return 0;
        } else {
            long filePointer = this.A03.getFilePointer();
            synchronized (r6) {
                if (r6.A01 == 3) {
                    j = r6.A04 - filePointer;
                } else if (r6.A09(filePointer)) {
                    if (filePointer <= r6.A01()) {
                        long A072 = r6.A07.A07(filePointer);
                        j = A072 == -1 ? r6.A01() - filePointer : A072 - filePointer;
                    } else {
                        throw new EOFException();
                    }
                }
                if (j != 0) {
                    int read = this.A03.read(bArr, i, (int) Math.min((long) min, j));
                    if (read != -1) {
                        this.A00 += (long) read;
                        return read;
                    } else if (this.A01 == this.A00) {
                        return -1;
                    } else {
                        throw new EOFException();
                    }
                }
            }
            return 0;
        }
    }
}
