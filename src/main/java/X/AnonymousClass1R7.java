package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1R7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1R7 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C41651vP A00;
    public final /* synthetic */ C41661vQ A01;
    public final /* synthetic */ AnonymousClass36K A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass1R7(C41651vP r1, C41661vQ r2, Map map, boolean z, AnonymousClass36K r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = map;
        this.A04 = z;
        this.A02 = r5;
    }

    public final void run() {
        long j;
        C41651vP r11 = this.A00;
        C41661vQ r2 = this.A01;
        Map map = this.A03;
        boolean z = this.A04;
        AnonymousClass36K r10 = this.A02;
        C04600Kz r24 = new C04600Kz("gdrive/backup/selector/download-size-calc");
        try {
            AnonymousClass1RA r0 = r2.A01;
            AtomicBoolean atomicBoolean = r11.A0F;
            long A022 = r0.A02();
            long j2 = 0;
            if (z) {
                j = A022;
                if (A022 > 0) {
                    r10.A00(Boolean.FALSE);
                }
            } else {
                j = 0;
            }
            StringBuilder A0S = AnonymousClass008.A0S("gdrive/backup/selector/calc-approx-total-download total size:");
            long j3 = r0.A02;
            A0S.append(j3);
            A0S.append(" dbSize: ");
            A0S.append(A022);
            A0S.append(" includeDbSize: ");
            AnonymousClass008.A1a(A0S, z);
            if (j3 < 0) {
                Log.e("gdrive/backup/selector/calc-approx-total-download totalSize is negative.");
            }
            if (A022 < 0) {
                Log.e("gdrive/backup/selector/calc-approx-total-download dbSize is negative.");
            }
            long j4 = j3 - A022;
            AnonymousClass088 r02 = r11.A01;
            if (r02.A09().exists()) {
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                int i = 20;
                if (map.size() < 10) {
                    i = 1;
                }
                int i2 = 0;
                long j5 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        StringBuilder A0V = AnonymousClass008.A0V("gdrive/backup/selector/calc-approx-media-download toBeDownloadedSampleSize: ", j2, " totalSampleSize:");
                        A0V.append(j5);
                        A0V.append(" totalSize: ");
                        A0V.append(j4);
                        Log.d(A0V.toString());
                        if (j5 == 0) {
                            if (j2 > 0) {
                                StringBuilder A0V2 = AnonymousClass008.A0V("gdrive/backup/selector/calc-approx-media-download unexpected situation, how can toBeDownloadedSampleSize=", j2, " be greater than totalSampleSize=");
                                A0V2.append(j5);
                                Log.e(A0V2.toString());
                            }
                            j4 = 0;
                        } else {
                            j4 = (long) (((((double) j2) * 1.0d) / ((double) j5)) * ((double) j4));
                        }
                    } else if (atomicBoolean.get()) {
                        Log.i("gdrive/backup/selector/calc-approx-media-download-size/interrupted");
                        j4 = -1;
                        break;
                    } else {
                        String str = strArr[i2];
                        if (str == null) {
                            Log.e("gdrive/backup/selector/calc-approx-media-download-size file upload path is null, unexpected.");
                        } else {
                            AnonymousClass009 r3 = r11.A00;
                            AnonymousClass03R r15 = r11.A07;
                            String A07 = AnonymousClass0JJ.A07(r3, r15, str, r11.A08.A00);
                            if (A07 == null) {
                                AnonymousClass008.A18("gdrive/backup/selector/calc-approx-media-download-size/no-local-path-mapping ", str);
                            } else {
                                Object obj = map.get(str);
                                if (obj != null) {
                                    AnonymousClass1RH r13 = (AnonymousClass1RH) obj;
                                    File file = new File(A07);
                                    if (AnonymousClass0JJ.A0K(file, r02)) {
                                        if (!file.exists() || file.length() == 0) {
                                            long j6 = r13.A00;
                                            j5 += j6;
                                            j2 += j6;
                                            r10.A00(Boolean.FALSE);
                                        } else if (!z) {
                                            j5 += r13.A00;
                                        } else if (i2 % i == 0) {
                                            long j7 = r13.A00;
                                            j5 += j7;
                                            if (C002001d.A0J(A07, r13, r15, r11.A09) == 4) {
                                                j2 += j7;
                                                r10.A00(Boolean.FALSE);
                                            }
                                        }
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        }
                        i2++;
                    }
                }
            }
            long j8 = j + j4;
            boolean z2 = false;
            if (j8 == 0) {
                z2 = true;
            }
            r10.A00(Boolean.valueOf(z2));
            long A023 = z ? j8 - r0.A02() : j8;
            RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r11.A0E.get();
            if (restoreFromBackupActivity != null) {
                restoreFromBackupActivity.A0h(j8, A023);
            }
        } catch (AnonymousClass1R5 e) {
            Log.e(e);
        }
        r24.A01();
    }
}
