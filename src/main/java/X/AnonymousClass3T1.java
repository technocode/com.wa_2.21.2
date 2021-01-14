package X;

import android.net.Uri;
import com.whatsapp.Mp4Ops;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3T1  reason: invalid class name */
public class AnonymousClass3T1 implements AnonymousClass15E {
    public long A00 = 0;
    public AnonymousClass34Q A01;
    public FileInputStream A02;
    public boolean A03;
    public final AbstractC34481iY A04;
    public final AnonymousClass009 A05;
    public final Mp4Ops A06;
    public final AnonymousClass00G A07;
    public final File A08;

    @Override // X.AnonymousClass15E
    public void A1u(AnonymousClass15U r1) {
    }

    public AnonymousClass3T1(AnonymousClass00G r4, Mp4Ops mp4Ops, AnonymousClass009 r6, String str) {
        this.A07 = r4;
        this.A06 = mp4Ops;
        this.A05 = r6;
        C455725j r0 = new C455725j(str);
        this.A04 = new C455625i(r0.A02, ((AbstractC34461iW) r0).A00);
        this.A08 = new File(r4.A00.getExternalCacheDir(), UUID.randomUUID().toString());
    }

    @Override // X.AnonymousClass15E
    public /* synthetic */ Map A8n() {
        return Collections.emptyMap();
    }

    @Override // X.AnonymousClass15E
    public Uri A9a() {
        return this.A04.A9a();
    }

    @Override // X.AnonymousClass15E
    public long ALs(AnonymousClass15G r26) {
        long j;
        AnonymousClass15G r6 = r26;
        long j2 = r6.A04;
        this.A00 = j2;
        if (this.A03) {
            File file = this.A08;
            long length = file.length();
            if (this.A00 < length) {
                FileInputStream fileInputStream = new FileInputStream(file);
                this.A02 = fileInputStream;
                fileInputStream.skip(this.A00);
                j = (length - this.A00) + 0;
                r6 = new AnonymousClass15G(r6.A05, r6.A08, length, length, -1, r6.A06, r6.A00);
            }
            j = 0;
        } else {
            if (j2 != 0) {
                r6 = new AnonymousClass15G(r6.A05, r6.A08, 0, 0, -1, r6.A06, r6.A00);
            }
            j = 0;
        }
        long ALs = ((C455625i) this.A04).ALs(r6) + j;
        if (ALs >= 0 && !this.A03) {
            this.A01 = new AnonymousClass34Q(this.A07, this.A06, this.A05, this.A08, ALs);
        }
        return ALs;
    }

    @Override // X.AnonymousClass15E
    public void close() {
        ((C455625i) this.A04).close();
        FileInputStream fileInputStream = this.A02;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.A02 = null;
        }
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass15E
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T1.read(byte[], int, int):int");
    }
}
