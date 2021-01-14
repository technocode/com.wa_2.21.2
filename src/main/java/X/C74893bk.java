package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3bk  reason: invalid class name and case insensitive filesystem */
public class C74893bk extends AnonymousClass3ZW {
    public AnonymousClass3ZX A00;
    public final C02780Dk A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass02M A03;
    public final C000300f A04;
    public final AnonymousClass03S A05;
    public final AnonymousClass0BW A06;
    public final C04370Kc A07;
    public final AnonymousClass00T A08;

    public C74893bk(Context context, AnonymousClass00S r16, C04370Kc r17, AnonymousClass02M r18, AnonymousClass009 r19, AnonymousClass01I r20, AnonymousClass00T r21, C02590Cr r22, C000300f r23, C09610dF r24, C02780Dk r25, AnonymousClass01A r26, AnonymousClass03P r27, C014308b r28, AnonymousClass01X r29, AnonymousClass31y r30, AnonymousClass0BW r31, AnonymousClass03S r32, C09030cB r33, AnonymousClass022 r34) {
        super(context, r16, r20, r22, r24, r26, r27, r28, r29, r30, r33, r34);
        this.A07 = r17;
        this.A03 = r18;
        this.A02 = r19;
        this.A08 = r21;
        this.A04 = r23;
        this.A01 = r25;
        this.A06 = r31;
        this.A05 = r32;
    }

    /* renamed from: A07 */
    public void A04(AnonymousClass0M2 r11, List list) {
        String A062;
        super.A04(r11, list);
        AnonymousClass3ZX r3 = this.A00;
        if (r3 != null) {
            if (!TextUtils.isEmpty(r11.A0w())) {
                A062 = r11.A0w();
            } else {
                A062 = r3.A02.A06(R.string.untitled_document);
            }
            AnonymousClass01X r6 = r3.A02;
            String A1Y = C002001d.A1Y(r6, ((AnonymousClass0M3) r11).A01);
            String upperCase = C02220Bc.A01(((AnonymousClass0M3) r11).A07).toUpperCase(Locale.US);
            if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(r11.A0w())) {
                upperCase = C006803i.A0K(r11.A0w()).toUpperCase(Locale.US);
            }
            r3.A01.setTitleAndDescription(A062, null, list);
            if (r6.A0M()) {
                r3.A01.setSubText(r6.A0D(R.string.file_attachment_size_and_ext, A1Y, upperCase), null);
            } else {
                r3.A01.setSubText(r6.A0D(R.string.file_attachment_size_and_ext, upperCase, A1Y), null);
            }
            r3.A00.setImageDrawable(AnonymousClass0ZD.A03(r3.getContext(), r11));
            this.A00.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r11, 32));
            return;
        }
        throw null;
    }

    public Drawable getMessageIcon() {
        return C002001d.A0b(getContext(), R.drawable.msg_status_doc, R.color.msgStatusTint);
    }

    public CharSequence getRawMessageText() {
        return this.A0C.A02;
    }
}
