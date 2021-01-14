package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.service.MDSyncService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2ih  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56482ih implements AbstractC03150Ez {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04420Kh A01;
    public final /* synthetic */ C56862jJ A02;

    public /* synthetic */ C56482ih(C04420Kh r1, C40531tQ r2, C56862jJ r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        int i;
        boolean z;
        String str;
        long j;
        int i2;
        C50162Tq r1;
        int i3;
        long j2;
        Long l;
        Long l2;
        int i4;
        byte[] bArr;
        C04420Kh r4 = this.A01;
        C40531tQ r3 = this.A00;
        C56862jJ r2 = this.A02;
        Integer num = (Integer) obj;
        StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/mediajob/finished for ");
        CopyOnWriteArrayList copyOnWriteArrayList = r3.A01;
        A0S.append(copyOnWriteArrayList.size());
        A0S.append(" messages; result = ");
        A0S.append(num);
        A0S.append("; job=");
        A0S.append(r2);
        Log.d(A0S.toString());
        AnonymousClass2T3 A002 = r2.A00();
        synchronized (A002) {
            i = A002.A00;
        }
        C50152Tp r12 = (C50152Tp) r2.A0G.A00();
        if (r12 != null) {
            C04430Ki.A01(r12, r3, new C56302iP(r4.A08));
        }
        C50152Tp r5 = (C50152Tp) r2.A0D.A00();
        if (r5 != null) {
            C04430Ki.A01(r5, r3, new C56272iM(r4.A08));
        }
        Object A003 = r2.A04.A00();
        if (A003 != null) {
            C04430Ki.A01(A003, r3, new C56542in(r4.A08));
        }
        C04430Ki r7 = r4.A08;
        int intValue = num.intValue();
        C04430Ki.A01(Integer.valueOf(intValue), r3, new C56572iq(r7));
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (AnonymousClass1VY.A0Y(((AbstractC007503q) it.next()).A0n.A00)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        C04440Kj r8 = r4.A0D;
        C50132Tn r11 = r2.A0K.A02;
        boolean z2 = r11.A01;
        if (i == 0 || i == 2) {
            int i5 = 0;
            if (intValue == 0) {
                i5 = 2;
            }
            AnonymousClass01I r6 = r8.A02;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                AbstractC007503q r0 = (AbstractC007503q) it2.next();
                if (!AnonymousClass0FI.A0M(r6, r0)) {
                    if (i5 == 0) {
                        r0.A08 = 0;
                    } else {
                        r0.A0T(i5);
                    }
                }
            }
            if (intValue != 21) {
                switch (intValue) {
                    case 2:
                        r8.A01.A04(R.string.error_no_disc_space, 0);
                        break;
                    case 3:
                        r8.A01.A06(R.string.share_failed, 0);
                        break;
                    case 4:
                        r8.A01.A04(R.string.error_out_of_memory, 0);
                        break;
                    case 5:
                        byte b = r3.A00().A0m;
                        AnonymousClass02M r13 = r8.A01;
                        if (b == 1) {
                            r13.A04(R.string.error_file_is_not_a_image, 0);
                            break;
                        } else {
                            r13.A04(R.string.error_bad_media, 0);
                            break;
                        }
                    case 6:
                        r8.A01.A04(R.string.no_access_permission, 0);
                        break;
                    case 7:
                        r8.A01.A04(r8.A0A.A01(), 0);
                        break;
                }
            } else if (z2) {
                r8.A01.A06(R.string.share_file_format_unsupport, 0);
            }
            if (r3.A04()) {
                Long l3 = null;
                if (!(r12 == null || (r1 = r12.A01.A04) == null)) {
                    l3 = r1.A0E;
                }
                C04380Kd r14 = r8.A03;
                AnonymousClass0M3 A004 = r3.A00();
                if (l3 != null) {
                    j = l3.longValue();
                } else {
                    j = 0;
                }
                if (intValue != 0) {
                    i2 = 2;
                    if (intValue != 1) {
                        i2 = 3;
                    }
                } else {
                    i2 = 1;
                }
                r14.A04(A004, j, i2);
            }
            for (AnonymousClass0M3 r10 : Collections.unmodifiableList(copyOnWriteArrayList)) {
                if (i5 == 2) {
                    AnonymousClass0M4 r122 = r10.A02;
                    if (r122 != null) {
                        if (r10.A09 == null) {
                            AnonymousClass008.A1T(AnonymousClass008.A0S("mediauploadresponseprocessor/uploaded, but url is null for "), r10.A0n.A01);
                        }
                        if (r122.A0U != null && r122.A0B == 0 && C04440Kj.A0C.A00()) {
                            r8.A00.A03("mediauploadresponseprocessor/media key timestamp not set", 1);
                        }
                        if (r10.A01 <= 0) {
                            File file = r122.A0F;
                            if (file != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(file);
                                sb.append("; exists=");
                                sb.append(r122.A0F.exists());
                                sb.append("; size=");
                                sb.append(r122.A0F.length());
                                str = sb.toString();
                            } else {
                                str = "null";
                            }
                            StringBuilder A0S2 = AnonymousClass008.A0S("mediauploadresponseprocessor/uploaded, but mediaSize=");
                            A0S2.append(r10.A01);
                            A0S2.append("; file=");
                            A0S2.append(str);
                            A0S2.append("; msg=");
                            AnonymousClass008.A1T(A0S2, r10.A0n.A01);
                            if (C04440Kj.A0B.A00()) {
                                r8.A00.A03("mediauploadresponseprocessor/invalid mediaSize", 1);
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                AnonymousClass01K r15 = r8.A05;
                int i6 = -1;
                if (i5 == 2) {
                    i6 = 1;
                }
                r15.A0Q(r10, i6);
                if (i5 != 2) {
                    r8.A07.A02(r10);
                }
            }
        } else if (r12 == null) {
            StringBuilder sb2 = new StringBuilder("mediauploadresponseprocessor/processUploadResponse/not regular upload, but upload response is null: uploadType=");
            sb2.append(i);
            sb2.append("; result=");
            sb2.append(intValue);
            Log.e(sb2.toString());
        } else if (i == 1) {
            C56902jN r16 = (C56902jN) r12.A01;
            C50142To r02 = r12.A02;
            AnonymousClass0M3 A005 = r3.A00();
            StringBuilder A0S3 = AnonymousClass008.A0S("webmediareupload/end ");
            C007303n r9 = A005.A0n;
            A0S3.append(r9);
            A0S3.append(" result:");
            A0S3.append(intValue);
            Log.i(A0S3.toString());
            if (intValue == 0) {
                StringBuilder A0S4 = AnonymousClass008.A0S("webmediareupload/success ");
                A0S4.append(r9);
                A0S4.append(" ");
                A0S4.append(r02.A06());
                Log.i(A0S4.toString());
                C02800Dm r142 = r8.A08;
                String str2 = r16.A00;
                String A06 = r02.A06();
                if (r02.A00() != null) {
                    bArr = r02.A00().A01;
                } else {
                    bArr = null;
                }
                r142.A01(str2, new C70533Lk(A06, bArr, r02.A03(), r02.A04()), 5);
                r8.A05.A0Q(A005, -1);
            } else {
                r8.A08.A01(r16.A00, new C70533Lk(502), 5);
            }
        } else if (i == 3) {
            AnonymousClass0M3 A006 = r3.A00();
            C56882jL r03 = (C56882jL) r12.A01;
            C04450Kk r143 = r8.A06;
            if (intValue != 0) {
                i4 = 2;
                if (intValue != 7) {
                    i4 = 0;
                }
            } else {
                i4 = 1;
            }
            Jid jid = r03.A01;
            r143.A02(A006, i4, jid, A006.A0n.A01, r03.A00, r03.A03, r03.A02, r12.A02.A03());
            if (r8.A02.A09(jid)) {
                r8.A09.A03(r8.A04.A00, MDSyncService.class, new Intent("com.whatsapp.service.MDSyncService.RMR_COMPLETED"));
            }
            if (intValue == 0) {
                r8.A05.A0Q(A006, -1);
            }
        }
        r4.A03(r3, null);
        if (r11.A00) {
            i3 = 4;
        } else {
            i3 = 2;
            if (z) {
                i3 = 3;
            }
        }
        AnonymousClass00Y r17 = r4.A06;
        AnonymousClass0EJ r72 = r4.A07;
        r17.A07(r72.A04(r2, r2.A00, i3));
        C56872jK r04 = r2.A01;
        if (!(r04 == null || r5 == null)) {
            r17.A07(r72.A03(r04.A00, r04.A01, r5, r5.A00, i3));
        }
        int A012 = AnonymousClass0AH.A01(r3.A00());
        C50162Tq r18 = r2.A00().A04;
        if (r18 == null || (l = r18.A08) == null) {
            j2 = 0;
        } else {
            j2 = l.longValue();
            AnonymousClass2U5 r05 = r18.A01;
            if (!(r05 == null || (l2 = r05.A02) == null)) {
                j2 -= l2.longValue();
            }
        }
        r4.A0F.ANF(new RunnableC49872Sn(r4, j2, r2, z, num, A012, r3));
        r2.A03();
    }
}
