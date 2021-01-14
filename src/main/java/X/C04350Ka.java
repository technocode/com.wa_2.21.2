package X;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Ka  reason: invalid class name and case insensitive filesystem */
public class C04350Ka {
    public static volatile C04350Ka A0M;
    public final AnonymousClass088 A00;
    public final AnonymousClass02M A01;
    public final C000300f A02;
    public final C04360Kb A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass01X A06;
    public final AnonymousClass01K A07;
    public final AnonymousClass0AC A08;
    public final C02590Cr A09;
    public final C002701k A0A;
    public final AnonymousClass00Y A0B;
    public final AnonymousClass0CP A0C;
    public final C04420Kh A0D;
    public final C02240Be A0E;
    public final AnonymousClass0FZ A0F;
    public final AnonymousClass022 A0G;
    public final C03110Ev A0H;
    public final AnonymousClass0D1 A0I;
    public final C02220Bc A0J;
    public final AnonymousClass00T A0K;
    public final AnonymousClass0CN A0L;

    public C04350Ka(AnonymousClass00G r2, AnonymousClass02M r3, AnonymousClass00T r4, AnonymousClass088 r5, AnonymousClass00Y r6, C02590Cr r7, C000300f r8, C002701k r9, C04360Kb r10, AnonymousClass0CN r11, AnonymousClass0CP r12, C02220Bc r13, AnonymousClass03P r14, AnonymousClass01X r15, C02240Be r16, AnonymousClass01K r17, AnonymousClass0AC r18, C03110Ev r19, AnonymousClass0FZ r20, AnonymousClass0D1 r21, C04420Kh r22, AnonymousClass022 r23) {
        this.A05 = r2;
        this.A01 = r3;
        this.A0K = r4;
        this.A00 = r5;
        this.A0B = r6;
        this.A09 = r7;
        this.A02 = r8;
        this.A0A = r9;
        this.A03 = r10;
        this.A0L = r11;
        this.A0C = r12;
        this.A0J = r13;
        this.A04 = r14;
        this.A06 = r15;
        this.A0E = r16;
        this.A07 = r17;
        this.A08 = r18;
        this.A0H = r19;
        this.A0F = r20;
        this.A0I = r21;
        this.A0D = r22;
        this.A0G = r23;
    }

    public static C04350Ka A00() {
        if (A0M == null) {
            synchronized (C04350Ka.class) {
                if (A0M == null) {
                    A0M = new C04350Ka(AnonymousClass00G.A01, AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass088.A00(), AnonymousClass00Y.A00(), C02590Cr.A00(), C000300f.A00(), C002701k.A00(), C04360Kb.A00(), AnonymousClass0CN.A00(), AnonymousClass0CP.A00(), C02220Bc.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), C02240Be.A00(), AnonymousClass01K.A00(), AnonymousClass0AC.A00, C03110Ev.A00(), AnonymousClass0FZ.A00(), AnonymousClass0D1.A00(), C04420Kh.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A0M;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r1.A02(r1.A01((X.AnonymousClass0M3) r2)) == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C40531tQ r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04350Ka.A01(X.1tQ, boolean, boolean):void");
    }

    public void A02(AnonymousClass0M3 r4) {
        AnonymousClass0M4 r1 = r4.A02;
        if (r4.A09 == null || !(r1 == null || r1.A0F == null)) {
            A03(r4, true, true);
        } else {
            this.A0F.A03(r4, false, null);
        }
        this.A08.A06(r4, -1);
    }

    public void A03(AnonymousClass0M3 r3, boolean z, boolean z2) {
        AnonymousClass0M4 r1 = r3.A02;
        if (r1 != null) {
            if (z && !r1.A0L) {
                r1.A0L = true;
                this.A07.A0Q(r3, -1);
            }
            A01(new C40531tQ(Collections.singletonList(r3)), z, z2);
            return;
        }
        throw null;
    }

    public void A04(List list, Uri uri, AnonymousClass2T4 r21, int i, AbstractC007503q r23, List list2, String str, boolean z, int i2, List list3, boolean z2, boolean z3) {
        Bitmap A062 = this.A0J.A06(uri, 100, 100);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A062.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        A062.recycle();
        C04360Kb r12 = this.A03;
        AnonymousClass0CP r0 = this.A0C;
        AnonymousClass0M4 r2 = new AnonymousClass0M4();
        byte b = 1;
        if (z3) {
            b = 42;
        }
        r12.A08(r0.A01(list, r2, b, i, str, uri, r23, list2, z, i2, list3), byteArray, null, r21, z2);
    }

    public void A05(List list, Uri uri, String str, AbstractC007503q r39, AbstractC004502c r40, boolean z) {
        StringBuilder sb = new StringBuilder("sendmedia/send-document uri:");
        sb.append(uri);
        sb.append(" mime:");
        sb.append(str);
        sb.append(" jids:");
        sb.append(Arrays.deepToString(list.toArray()));
        Log.i(sb.toString());
        this.A0K.ANC(new C40581tV(this.A05, this.A0A, this.A01, this.A00, this.A0B, this.A02, this.A03, this.A0C, this.A0J, this.A04, this.A06, this.A0E, list, uri, str, r39, r40, z), new Void[0]);
    }

    public void A06(boolean z, List list, List list2, String str, int i, boolean z2, Activity activity, AbstractC004502c r33, AnonymousClass1NW r34) {
        StringBuilder A0S = AnonymousClass008.A0S("sendmedia/sendmedia/size=");
        A0S.append(list2.size());
        Log.i(A0S.toString());
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            String A0O = C02230Bd.A0O(this.A04.A06(), uri);
            C02220Bc r1 = this.A0J;
            byte A052 = r1.A05(uri);
            if (A052 != 1) {
                if (A052 == 2) {
                    r1.A0C(uri, r33, new C38981ql(this, z, list, str, r34, uri, r33));
                } else if (A052 != 3) {
                    if (A052 == 4) {
                        try {
                            AnonymousClass0CN r12 = this.A0L;
                            String A022 = r12.A02(uri);
                            if (A022 != null) {
                                try {
                                    AnonymousClass36X A012 = r12.A01(A022);
                                    ArrayList arrayList2 = A012.A01;
                                    if (arrayList2.size() > 1) {
                                        this.A03.A0W(list, arrayList2, null, false);
                                    } else {
                                        this.A03.A0V(list, A012.A00, (String) arrayList2.get(0), null, false);
                                    }
                                } catch (AnonymousClass3D8 e) {
                                    r12.A03(e);
                                }
                            }
                        } catch (IOException unused) {
                            this.A01.A06(R.string.vcard_format_unsupport, 0);
                        }
                    } else if (A052 == 9) {
                        A05(list, uri, A0O, null, r33, false);
                        r34.ALY(uri);
                    } else if (A052 != 13) {
                        if (!(A052 == 23 || A052 == 37)) {
                        }
                    } else if (z2) {
                        r1.A0C(uri, r33, new C38971qk(this, z, list, str, r34, uri, r33));
                    } else {
                        arrayList.add(uri);
                    }
                } else if (z2) {
                    r1.A0C(uri, r33, new C38991qm(this, uri, activity, list, i, str, r34, r33));
                } else {
                    arrayList.add(uri);
                }
            }
            if (z2) {
                try {
                    A04(list, uri, null, i, null, C006803i.A0O(uri.getQueryParameter("mentions")), str, false, 0, null, false, false);
                } catch (IOException e2) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e2);
                    if (e2.getMessage() == null || !e2.getMessage().contains("No space")) {
                        this.A01.A06(R.string.share_failed, 0);
                    } else {
                        this.A01.A04(R.string.error_no_disc_space, 0);
                    }
                } catch (C666835k e3) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e3);
                    this.A01.A04(R.string.error_file_is_not_a_image, 0);
                } catch (OutOfMemoryError e4) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e4);
                    this.A01.A04(R.string.error_out_of_memory, 0);
                } catch (SecurityException e5) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e5);
                    this.A01.A04(R.string.no_access_permission, 0);
                }
                r34.ALY(uri);
            } else {
                arrayList.add(uri);
            }
        }
        if (!arrayList.isEmpty()) {
            Serializable A0F2 = AnonymousClass1VY.A0F(list);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z3 = false;
            if (list.size() > 1) {
                z3 = true;
            }
            Intent intent = new Intent(activity, MediaPreviewActivity.class);
            intent.putExtra("android.intent.extra.STREAM", arrayList);
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.putExtra("jid", (String) null);
            intent.putExtra("jids", A0F2);
            intent.putExtra("max_items", 0);
            intent.putExtra("origin", 5);
            intent.putExtra("picker_open_time", elapsedRealtime);
            intent.putExtra("send", true);
            intent.putExtra("quoted_message_row_id", 0L);
            intent.putExtra("quoted_group_jid", (String) null);
            intent.putExtra("number_from_url", false);
            intent.putExtra("media_preview_params", (Bundle) null);
            intent.putExtra("smb_quick_reply", false);
            intent.putExtra("start_home", z3);
            intent.putExtra("animate_uri", (Parcelable) null);
            intent.putExtra("preselected_image_uri", (Parcelable) null);
            intent.putExtra("scan_for_qr", false);
            activity.startActivity(intent);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r34.ALX((Uri) it2.next());
            }
        } else if (list.size() > 1) {
            activity.startActivity(HomeActivity.A05(activity));
        }
    }

    public boolean A07(boolean z, List list, File file, AnonymousClass1XO r21, boolean z2, String str, AbstractC007503q r24, boolean z3) {
        int A062;
        File A0I2;
        AnonymousClass01X r7 = this.A06;
        AnonymousClass02M r6 = this.A01;
        C000300f r5 = this.A02;
        StringBuilder A0S = AnonymousClass008.A0S("mediafileutils/checkmediafilesize src:");
        A0S.append(file.getAbsolutePath());
        Log.i(A0S.toString());
        if (r21 == AnonymousClass1XO.A07) {
            A062 = r5.A06(AbstractC000400g.A32);
        } else {
            A062 = r5.A06(AbstractC000400g.A3a);
        }
        long j = (long) A062;
        if (file.length() > 1048576 * j) {
            StringBuilder A0S2 = AnonymousClass008.A0S("mediafileutils/checkmediafilesize/too large:");
            A0S2.append(file.length());
            Log.w(A0S2.toString());
            String A0D2 = r7.A0D(R.string.file_too_large_with_placeholder, r7.A09(280, j, String.format(r7.A0I(), "%d", Integer.valueOf(A062))));
            if (z) {
                r6.A0C(A0D2, 1);
                return false;
            }
            r6.A0G(A0D2, 1);
            return false;
        }
        StringBuilder A0S3 = AnonymousClass008.A0S("sendmedia/sendmediafile src:");
        A0S3.append(file.getAbsolutePath());
        A0S3.append(" ");
        A0S3.append(file.length());
        Log.i(A0S3.toString());
        if (!z2) {
            A0I2 = file;
        } else {
            Application application = this.A05.A00;
            AnonymousClass088 r52 = this.A00;
            A0I2 = C02230Bd.A0I(application, r52, this.A0G, file, r21, 0);
            StringBuilder A0S4 = AnonymousClass008.A0S("sendmedia/sendmediafile send:");
            A0S4.append(A0I2.getAbsolutePath());
            Log.i(A0S4.toString());
            C006803i.A0X(r52.A04, file, A0I2);
        }
        AnonymousClass0M4 r72 = new AnonymousClass0M4();
        r72.A0F = A0I2;
        byte[] bArr = null;
        if ((r21 == AnonymousClass1XO.A0N || r21 == AnonymousClass1XO.A04 || r21 == AnonymousClass1XO.A0Q) && (bArr = C002001d.A3j(C002001d.A0V(A0I2))) == null) {
            Log.w("sendmedia/sendmediafile no video thumbnail generated");
        }
        this.A03.A07(this.A0C.A01(list, r72, r21.A00, 0, str, null, r24, null, z3, 0, null), bArr);
        return true;
    }
}
