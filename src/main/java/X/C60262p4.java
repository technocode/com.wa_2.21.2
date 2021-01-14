package X;

import android.graphics.Bitmap;
import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2p4  reason: invalid class name and case insensitive filesystem */
public class C60262p4 extends AbstractRunnableC57132jl {
    public static final AnonymousClass2TX A0J = new AnonymousClass2TX(30, 72);
    public static final AnonymousClass2TX A0K = new AnonymousClass2TX(48, 96);
    public final PowerManager.WakeLock A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass088 A02;
    public final Mp4Ops A03;
    public final C000300f A04;
    public final AnonymousClass00C A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass00D A07;
    public final AnonymousClass0BV A08;
    public final C002701k A09;
    public final AnonymousClass00Y A0A;
    public final C57162jo A0B;
    public final C02550Cn A0C;
    public final C03030En A0D;
    public final AnonymousClass0AK A0E;
    public final C007703s A0F;
    public final C02220Bc A0G;
    public final C02510Ch A0H;
    public final C03020Em A0I;

    public C60262p4(AnonymousClass00G r3, Mp4Ops mp4Ops, C002701k r5, AnonymousClass009 r6, AnonymousClass088 r7, AnonymousClass00Y r8, C000300f r9, C02220Bc r10, C02550Cn r11, C03020Em r12, AnonymousClass0BV r13, AnonymousClass00C r14, C02510Ch r15, AnonymousClass00D r16, C007703s r17, C03030En r18, AnonymousClass0AK r19, PowerManager.WakeLock wakeLock, C57162jo r21) {
        super(r21);
        this.A06 = r3;
        this.A03 = mp4Ops;
        this.A09 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A0A = r8;
        this.A04 = r9;
        this.A0G = r10;
        this.A0C = r11;
        this.A0I = r12;
        this.A08 = r13;
        this.A05 = r14;
        this.A0H = r15;
        this.A07 = r16;
        this.A0F = r17;
        this.A0D = r18;
        this.A0E = r19;
        this.A00 = wakeLock;
        this.A0B = r21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0281, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0284, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0287, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x028a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x028d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0290, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0293, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0332, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0333, code lost:
        com.whatsapp.Mp4Ops.A01(r0.A00, r0, r10, r3, "remove dolby audio track fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x033e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0386, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0389, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x038c, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x038f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0392, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0395, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0398, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03bb, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03be, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03c1, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03c4, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03c7, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03ca, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03cd, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x041b, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x041e, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0420, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0422, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0424, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0427, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x042a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x050a, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x050d, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x050f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0515, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0517, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x051d, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x051f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0525, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0527, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x052d, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x052f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0535, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0537, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0561, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0563, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0565, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0567, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x056a, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x056d, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0570, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x05d1, code lost:
        if (r1.isHeld() != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x064a, code lost:
        if (r1.isHeld() != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0671, code lost:
        if (r1.isHeld() != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x06ab, code lost:
        if (r1.isHeld() != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x06e4, code lost:
        if (r1.isHeld() != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x06f2, code lost:
        if (r1.isHeld() != false) goto L_0x06f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x06f4, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ae, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b0, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b1, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020c, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0212, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0215, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0218, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021b, code lost:
        r3 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:188:0x03a9, B:193:0x03b3] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0281 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:44:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0386 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:100:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0389 A[ExcHandler: 1Mo (e X.1Mo), Splitter:B:100:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x038c A[ExcHandler: IOException (e java.io.IOException), Splitter:B:100:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038f A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:100:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0392 A[ExcHandler: 3SE (e X.3SE), Splitter:B:100:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0395 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:100:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0398 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:100:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03bb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:188:0x03a9] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x041b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:139:0x029c] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04ea A[SYNTHETIC, Splitter:B:303:0x04ea] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x050a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:269:0x0488] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x050f A[ExcHandler: 1Mo (e X.1Mo), Splitter:B:44:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0527 A[ExcHandler: 3SE (e X.3SE), Splitter:B:44:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x052f A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:44:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0537 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:44:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0561 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:296:0x04c1] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06a7  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x06e0  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cb A[SYNTHETIC, Splitter:B:78:0x01cb] */
    @Override // X.AbstractRunnableC57132jl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2TV A00() {
        /*
        // Method dump skipped, instructions count: 1980
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60262p4.A00():X.2TV");
    }

    public final C57182jq A01(AnonymousClass0M3 r20, C57172jp r21, File file) {
        AnonymousClass0M4 r0;
        File file2;
        byte[] bArr;
        AnonymousClass2TX r02;
        AnonymousClass2TX r03;
        if (!(r20 == null || r20.A06 == null || (r0 = r20.A02) == null || (file2 = r0.A0F) == null || !file2.exists())) {
            try {
                C006803i.A0X(this.A0F, r20.A02.A0F, file);
                if (!r20.A06.equals(C002001d.A1P(this.A01, file))) {
                    C006803i.A0m(file);
                    return null;
                }
                C57162jo r8 = this.A0B;
                boolean z = r8.A04;
                if (z == AnonymousClass1VY.A0b(r20.A0n.A00)) {
                    AnonymousClass0AK r1 = this.A0E;
                    C05440On A0B2 = r20.A0B();
                    if (A0B2 != null) {
                        r1.A02(A0B2);
                        bArr = r20.A0B().A08();
                    } else {
                        throw null;
                    }
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    if (z) {
                        r02 = A0K;
                    } else {
                        r02 = A0J;
                    }
                    int i = r02.A00;
                    if (z) {
                        r03 = A0K;
                    } else {
                        r03 = A0J;
                    }
                    int i2 = r03.A01;
                    C02220Bc r7 = this.A0G;
                    boolean z2 = !z;
                    Bitmap A0X = C002001d.A0X(file, new C04860Mc(0, i2, true));
                    if (A0X == null || (bArr = r7.A08.A01(A0X, i, z2)) == null) {
                        bArr = C002001d.A3j(C002001d.A0V(file));
                    }
                }
                AnonymousClass1O7 r3 = ((AnonymousClass2TS) r8).A01;
                long length = r8.A03.length();
                C43961zH r2 = r3.A03;
                r2.A0I = Long.valueOf(length);
                r2.A0M = Long.valueOf((long) 3);
                r2.A01 = Boolean.valueOf(z);
                r2.A00 = false;
                r2.A05 = Long.valueOf((long) r20.A00);
                r2.A07 = Long.valueOf(file.length());
                r3.A01();
                int i3 = r20.A00;
                r21.A00 = i3;
                r21.A01 = true;
                ((AnonymousClass2TU) r21).A00 = file;
                r21.A03 = bArr;
                r21.A02 = true;
                return new C57182jq(file, bArr, true, i3, true, ((AnonymousClass2TU) r21).A01);
            } catch (IOException e) {
                Log.e("mediatranscodequeue/attemptReuseExistingVideo", e);
                C006803i.A0m(file);
            }
        }
        return null;
    }

    public final void A02(AnonymousClass0JG r8, AnonymousClass1O7 r9, int i, int i2, long j) {
        r9.A03.A0O = "transcode";
        C000300f r1 = this.A04;
        int i3 = 9;
        if (this.A0B.A04) {
            i3 = 6;
        }
        r8.A00 = C02550Cn.A00(r1, i, i2, j, i3);
        r8.A0E();
    }

    public final void A03(Exception exc) {
        C44241zj r2 = new C44241zj();
        r2.A00 = 5;
        r2.A05 = exc.toString();
        this.A0A.A09(r2, 1);
        AnonymousClass00Y.A01(r2, "");
    }

    public final boolean A04(File file, File file2, AnonymousClass1O7 r7) {
        r7.A03.A0O = "checkAndRepair";
        C006803i.A0X(this.A02.A04, file, file2);
        try {
            return this.A03.A06(file2);
        } catch (C26791Mo e) {
            Mp4Ops.A01(this.A06.A00, this.A01, file2, e, "only repair on upload");
            throw e;
        } catch (IOException e2) {
            Log.e("mediatranscodequeue/repair/io-exception/", e2);
            throw e2;
        }
    }
}
