package X;

import android.text.TextUtils;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1RG  reason: invalid class name */
public class AnonymousClass1RG {
    public final AnonymousClass009 A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass0HQ A02;
    public final C41401uy A03;
    public final GoogleBackupService A04;
    public final AnonymousClass0JJ A05;
    public final AbstractC03860Ib A06;
    public final AnonymousClass1RF A07;
    public final AnonymousClass03R A08;
    public final AnonymousClass03S A09;
    public final AnonymousClass00D A0A;
    public final AnonymousClass00Y A0B;
    public final C446420x A0C;
    public final AnonymousClass0FU A0D;
    public final String A0E;
    public final AtomicLong A0F = new AtomicLong(0);
    public final AtomicLong A0G;
    public final AtomicLong A0H;

    public AnonymousClass1RG(AnonymousClass009 r4, AnonymousClass088 r5, AnonymousClass00Y r6, AnonymousClass03R r7, AnonymousClass1RF r8, AnonymousClass0JJ r9, AnonymousClass0FU r10, AnonymousClass03S r11, AnonymousClass00D r12, AnonymousClass0HQ r13, String str, C41401uy r15, GoogleBackupService googleBackupService, C446420x r17, AtomicLong atomicLong, AtomicLong atomicLong2, AbstractC03860Ib r20) {
        this.A00 = r4;
        this.A01 = r5;
        this.A0B = r6;
        this.A08 = r7;
        this.A07 = r8;
        this.A05 = r9;
        this.A0D = r10;
        this.A09 = r11;
        this.A0A = r12;
        this.A0E = str;
        this.A03 = r15;
        this.A04 = googleBackupService;
        this.A0G = atomicLong2;
        this.A0H = atomicLong;
        this.A06 = r20;
        this.A02 = r13;
        this.A0C = r17;
        r17.A0A = 2;
    }

    public final boolean A00(Map map) {
        int i;
        boolean z;
        boolean z2 = this.A0A.A00.getBoolean("gdrive_restore_overwrite_local_files", false);
        HashSet hashSet = new HashSet();
        hashSet.add(this.A01.A09().getName());
        if (this.A02.A00 == 2) {
            C446420x r1 = this.A0C;
            if (r1 != null) {
                r1.A0B = 0L;
            } else {
                throw null;
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("gdrive/restore-media/restore-files called with filePathPrefix [");
        A0S.append(TextUtils.join(",", hashSet));
        A0S.append("]");
        Log.d(A0S.toString());
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        C04600Kz r22 = new C04600Kz("gdrive/restore-media/get-files-to-be-downloaded");
        AtomicReference atomicReference = new AtomicReference(null);
        Set keySet = map.keySet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        CountDownLatch countDownLatch = new CountDownLatch(keySet.size());
        int size = keySet.size();
        if (this.A09.A06()) {
            Iterator it = keySet.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (i2 % 100 == 0) {
                        AnonymousClass008.A0y("gdrive/restore-media/get-files-to-be-downloaded ", i2, "/", size);
                    }
                    i2++;
                    if (!this.A06.A00()) {
                        break;
                    }
                    AnonymousClass1R5 r12 = (AnonymousClass1R5) atomicReference.get();
                    if (r12 == null) {
                        C41401uy r9 = this.A03;
                        long j = (long) i2;
                        long j2 = (long) size;
                        int i3 = r9.A01;
                        if (j2 > 0) {
                            i3 = (int) ((100 * j) / j2);
                        }
                        if (i3 != r9.A01) {
                            Log.i(String.format(Locale.ENGLISH, "gdrive-service/media-restore-preparation-progress %d/%d (%d%%)", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i3)));
                            r9.A01 = i3;
                            synchronized (((AnonymousClass01G) r9).A00) {
                                Iterator it2 = ((AnonymousClass01G) r9).A00.iterator();
                                while (true) {
                                    AnonymousClass0AY r13 = (AnonymousClass0AY) it2;
                                    if (!r13.hasNext()) {
                                        break;
                                    }
                                    ((AbstractC09090cH) r13.next()).AHf(r9.A01);
                                }
                            }
                        }
                        AnonymousClass1RH r3 = (AnonymousClass1RH) map.get(str);
                        String A072 = AnonymousClass0JJ.A07(this.A00, this.A08, str, this.A04);
                        if (A072 != null) {
                            File file = new File(A072);
                            Iterator it3 = hashSet.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (str.startsWith((String) it3.next())) {
                                        C27561Qm.A02.execute(new AnonymousClass1R9(this, atomicBoolean, z2, file, r3, str, synchronizedList, atomicReference, countDownLatch));
                                        break;
                                    }
                                } else {
                                    TextUtils.join(",", hashSet);
                                    countDownLatch.countDown();
                                    break;
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("gdrive/restore-media/get-files-to-be-downloaded/skipping-null-download-path relative path: ");
                            sb.append(str);
                            Log.e(sb.toString());
                            countDownLatch.countDown();
                        }
                    } else if (r12 instanceof C41461v5) {
                        throw ((C41461v5) r12);
                    } else {
                        throw new IllegalStateException(r12);
                    }
                } else {
                    AnonymousClass1R5 r14 = (AnonymousClass1R5) atomicReference.get();
                    if (r14 == null) {
                        try {
                            Log.i("gdrive/restore-media/get-files-to-be-downloaded waiting for all files to be processed.");
                            countDownLatch.await();
                            if (atomicBoolean.get()) {
                                StringBuilder A0S2 = AnonymousClass008.A0S("gdrive/restore-media/restore-files/num-files-to-be-downloaded/");
                                A0S2.append(synchronizedList.size());
                                Log.i(A0S2.toString());
                                r22.A01();
                                long j3 = this.A0A.A00.getLong("gdrive_already_downloaded_bytes", 0);
                                this.A0H.set(j3);
                                for (Object obj : synchronizedList) {
                                    AnonymousClass1RH r0 = (AnonymousClass1RH) map.get(obj);
                                    if (r0 != null) {
                                        this.A0H.addAndGet(r0.A00);
                                    }
                                }
                                Collections.sort(synchronizedList, new C27661Qx());
                                AnonymousClass0HQ r92 = this.A02;
                                int A0A2 = C002001d.A0A(r92.A0T, r92.A0P);
                                StringBuilder A0S3 = AnonymousClass008.A0S("gdrive-conditions-manager/calc-max-concurrent-reads/network_type=");
                                A0S3.append(r92.A00);
                                A0S3.append(", year class = ");
                                A0S3.append(A0A2);
                                Log.i(A0S3.toString());
                                int i4 = 4;
                                if (r92.A00 != 1 || A0A2 < 2011) {
                                    i4 = Math.min(4, 2);
                                }
                                this.A0C.A03 = Double.valueOf((double) synchronizedList.size());
                                this.A0C.A0D = Long.valueOf((long) i4);
                                ArrayList arrayList = new ArrayList();
                                AtomicInteger atomicInteger = new AtomicInteger(0);
                                this.A0G.set(j3);
                                this.A0F.set(0);
                                CountDownLatch countDownLatch2 = new CountDownLatch(synchronizedList.size());
                                AtomicReference atomicReference2 = new AtomicReference(null);
                                AnonymousClass008.A0v("gdrive-util/max concurrent reads ", i4);
                                ThreadPoolExecutor A0P = C006803i.A0P(0, i4, TimeUnit.SECONDS, "Google Drive Read Worker #");
                                Iterator it4 = synchronizedList.iterator();
                                int i5 = 0;
                                while (it4.hasNext()) {
                                    String str2 = (String) it4.next();
                                    i5++;
                                    if (i5 % 100 == 0) {
                                        StringBuilder A0T = AnonymousClass008.A0T("gdrive/restore-media/restore-files enqueuing download  ", i5, "/");
                                        A0T.append(synchronizedList.size());
                                        A0T.append(": ");
                                        A0T.append(str2);
                                        Log.i(A0T.toString());
                                    }
                                    AnonymousClass1RH r02 = (AnonymousClass1RH) map.get(str2);
                                    if (r02 != null) {
                                        A0P.execute(new RunnableEBaseShape0S1600000_I1(this, r02, atomicReference2, arrayList, str2, atomicInteger, countDownLatch2, 1));
                                    } else {
                                        Log.e("gdrive/restore-media/restore-files resId cannot be null, skipping.");
                                        countDownLatch2.countDown();
                                    }
                                }
                                i = 0;
                                try {
                                    Log.i("gdrive/restore-media/restore-files waiting for all files to be restored.");
                                    countDownLatch2.await();
                                    AnonymousClass1R5 r15 = (AnonymousClass1R5) atomicReference2.get();
                                    if (r15 != null) {
                                        if (r15 instanceof C41491v9) {
                                            throw ((C41491v9) r15);
                                        } else if (r15 instanceof C41481v8) {
                                            throw ((C41481v8) r15);
                                        } else if (r15 instanceof C41571vH) {
                                            throw ((C41571vH) r15);
                                        } else if (r15 instanceof C41551vF) {
                                            throw ((C41551vF) r15);
                                        } else if (r15 instanceof C41511vB) {
                                            throw ((C41511vB) r15);
                                        } else if (r15 instanceof C41461v5) {
                                            throw ((C41461v5) r15);
                                        }
                                    }
                                    if (arrayList.size() > 0) {
                                        AnonymousClass008.A1b(arrayList, AnonymousClass008.A0S("gdrive/restore-media/restore-files/failed-files/"));
                                        AnonymousClass009 r5 = this.A00;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(arrayList.size());
                                        sb2.append(" files ");
                                        sb2.append(" out of total ");
                                        sb2.append(synchronizedList.size());
                                        r5.A04("gdrive/restore-media/failed to restore files", sb2.toString(), true);
                                    }
                                    StringBuilder A0S4 = AnonymousClass008.A0S("gdrive/restore-media/restore-files waiting for restore to finish: ");
                                    A0S4.append(this.A0G.get());
                                    A0S4.append("/");
                                    A0S4.append(this.A0H);
                                    A0S4.append(" (");
                                    A0S4.append(this.A0F.get());
                                    A0S4.append(" failed)");
                                    Log.i(A0S4.toString());
                                    if (this.A0G.get() > 0 || this.A0F.get() > 0) {
                                        this.A03.A0G(this.A0G.get(), this.A0F.get(), this.A0H.get());
                                    }
                                    z = true;
                                } catch (InterruptedException e) {
                                    Log.e(e);
                                    z = false;
                                }
                            }
                        } catch (InterruptedException e2) {
                            Log.e(e2);
                        }
                    } else if (r14 instanceof C41461v5) {
                        throw ((C41461v5) r14);
                    } else {
                        throw new IllegalStateException(r14);
                    }
                }
            }
            Log.e("gdrive/restore-media/restore-files failed to get list of files to be restored.");
            r22.A01();
            z = false;
            i = 0;
            this.A0A.A0Q(i);
            return z;
        }
        throw new C41461v5();
    }
}
