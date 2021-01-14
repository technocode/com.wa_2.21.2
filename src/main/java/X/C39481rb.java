package X;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1rb  reason: invalid class name and case insensitive filesystem */
public class C39481rb extends AnonymousClass0JW {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public final C39461rZ A05;
    public final C04090Iz A06;
    public final AbstractC07200Wh A07 = new C39471ra(this);
    public final AnonymousClass00C A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;

    public C39481rb(C04090Iz r2, AnonymousClass00C r3, C39461rZ r4, String str, String str2, List list, String str3, boolean z) {
        this.A06 = r2;
        this.A08 = r3;
        this.A05 = r4;
        this.A03 = str;
        this.A04 = str2;
        this.A0A = list;
        this.A09 = str3;
        this.A0B = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x018a, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
        // Method dump skipped, instructions count: 453
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39481rb.A01():void");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        boolean z;
        String str;
        String str2;
        C26391Kr r2 = (C26391Kr) obj;
        C39461rZ r0 = this.A05;
        if (r0 != null && r2 != null) {
            File file = r2.A00;
            String str3 = r2.A01;
            String str4 = r2.A02;
            ActivityC004702f r15 = r0.A01;
            C26401Ks r3 = r0.A00;
            C26491Ld r13 = r3.A02;
            String str5 = r0.A02;
            ArrayList<? extends Parcelable> arrayList = r0.A04;
            String str6 = r0.A03;
            AnonymousClass01X r6 = r13.A01;
            String A062 = r6.A06(R.string.email_subject_beta);
            StringBuilder sb = new StringBuilder();
            if (str5 != null) {
                sb.append(str5);
            }
            if (!TextUtils.isEmpty(str3)) {
                sb.append(str3);
            } else {
                sb.append("\n");
            }
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (arrayList == null || arrayList.isEmpty()) {
                z = false;
                str = "android.intent.action.SEND";
            } else {
                z = true;
                str = "android.intent.action.SEND_MULTIPLE";
            }
            Intent intent = new Intent(str);
            AnonymousClass008.A16("email-sender/send-email uploadedLogsId is ", str4);
            if (file == null) {
                intent.setType("plain/text");
                sb2.append("No log file to attach.\n");
            } else {
                if (z) {
                    str2 = "*/*";
                } else {
                    str2 = "application/zip";
                }
                intent.setType(str2);
                intent.setFlags(1);
                Uri A063 = C006803i.A06(r15, file);
                if (z) {
                    arrayList.add(A063);
                } else {
                    intent.putExtra("android.intent.extra.STREAM", A063);
                }
            }
            String[] strArr = new String[1];
            if (str6 == null) {
                str6 = "android@support.whatsapp.com";
            }
            strArr[0] = str6;
            intent.putExtra("android.intent.extra.EMAIL", strArr);
            intent.putExtra("android.intent.extra.SUBJECT", A062);
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            if (z) {
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                ArrayList arrayList2 = new ArrayList(arrayList);
                ClipData clipData = new ClipData(A062, new String[]{"application/zip", "image/*"}, new ClipData.Item((Uri) arrayList2.get(0)));
                arrayList2.remove(0);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    clipData.addItem(new ClipData.Item((Uri) it.next()));
                }
                intent.setClipData(clipData);
                intent.setFlags(1);
            }
            boolean A012 = r13.A01(intent, r15, r15, r6.A06(R.string.contact_support_via), true);
            if (r15 != null) {
                r15.AMi();
            }
            if (r15 instanceof AnonymousClass0J8) {
                ((AnonymousClass0J8) r15).AJM(A012);
            }
            r3.A00 = null;
        }
    }
}
