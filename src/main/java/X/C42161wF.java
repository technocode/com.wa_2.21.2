package X;

import android.content.Intent;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1wF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42161wF implements AbstractC03150Ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ ActivityC004702f A03;
    public final /* synthetic */ C41191ud A04;
    public final /* synthetic */ AnonymousClass1S0 A05;
    public final /* synthetic */ AnonymousClass1S6 A06;
    public final /* synthetic */ C48052Ks A07;
    public final /* synthetic */ AnonymousClass02N A08;
    public final /* synthetic */ UserJid A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ boolean A0B;

    public /* synthetic */ C42161wF(AnonymousClass1S6 r1, boolean z, int i, List list, ActivityC004702f r5, int i2, AnonymousClass02N r7, C48052Ks r8, UserJid userJid, long j, AnonymousClass1S0 r12, C41191ud r13) {
        this.A06 = r1;
        this.A0B = z;
        this.A00 = i;
        this.A0A = list;
        this.A03 = r5;
        this.A01 = i2;
        this.A08 = r7;
        this.A07 = r8;
        this.A09 = userJid;
        this.A02 = j;
        this.A05 = r12;
        this.A04 = r13;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass1S6 r7 = this.A06;
        boolean z = this.A0B;
        int i = this.A00;
        List list = this.A0A;
        ActivityC004702f r8 = this.A03;
        int i2 = this.A01;
        AnonymousClass02N r13 = this.A08;
        C48052Ks r2 = this.A07;
        UserJid userJid = this.A09;
        long j = this.A02;
        AnonymousClass1S0 r9 = this.A05;
        C41191ud r4 = this.A04;
        AnonymousClass02R r6 = (AnonymousClass02R) obj;
        if (!z && i == list.size() - 1) {
            r8.AMi();
        }
        File file = (File) r6.A01;
        if (r6.A00 == Boolean.FALSE) {
            r8.APo(R.string.catalog_product_send_message_failed);
            Log.w("product-details/send-product/temp file creation failed");
        } else if (i2 == 2) {
            Intent A052 = Conversation.A05(r8, r13);
            A052.putExtra("product", r2);
            A052.putExtra("product_file", file);
            A052.putExtra("business_jid", userJid.getRawString());
            r8.startActivity(A052);
        } else {
            Uri fromFile = Uri.fromFile(file);
            if (i2 != 1 || r13 == null) {
                Intent intent = new Intent(r8, ContactPicker.class);
                intent.putExtra("send", true);
                intent.putExtra("skip_preview", true);
                intent.putExtra("file_path", file.getAbsolutePath());
                HashSet hashSet = new HashSet();
                hashSet.add(23);
                intent.putIntegerArrayListExtra("message_types", new ArrayList<>(hashSet));
                r8.startActivityForResult(intent, 3);
            } else {
                AbstractC007503q r21 = null;
                if (j > 0) {
                    r21 = r7.A07.A0J.A01(j);
                }
                r7.A03.A0A(r2, Collections.singletonList(r13), userJid, fromFile, r21);
                if (i < list.size() - 1) {
                    r7.A05(r8, r9, userJid, i2, list, r13, j, i + 1);
                } else {
                    r8.setResult(-1);
                    r8.finish();
                }
            }
        }
        r4.A02();
    }
}
