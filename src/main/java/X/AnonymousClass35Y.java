package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.google.android.search.verification.client.R;

/* renamed from: X.35Y  reason: invalid class name */
public class AnonymousClass35Y {
    public static volatile AnonymousClass35Y A02;
    public final C02780Dk A00;
    public final AnonymousClass01X A01;

    public AnonymousClass35Y(C02780Dk r1, AnonymousClass01X r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass35Y A00() {
        if (A02 == null) {
            synchronized (AnonymousClass36B.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass35Y(C02780Dk.A02(), AnonymousClass01X.A00());
                }
            }
        }
        return A02;
    }

    public static String A01(String str) {
        int length = str.length();
        if (length <= 96) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 64));
        sb.append("…");
        sb.append(str.substring(length - 32));
        return sb.toString();
    }

    public void A02(Context context, Uri uri) {
        AnonymousClass01X r3 = this.A01;
        SpannableString spannableString = new SpannableString(r3.A0D(R.string.link_taking_to, A01(uri.toString())));
        Linkify.addLinks(spannableString, 1);
        AnonymousClass0MB r2 = new AnonymousClass0MB(context, R.style.AlertDialogExternalLink);
        r2.A01.A0E = spannableString;
        r2.A05(r3.A06(R.string.cancel), null);
        r2.A07(r3.A06(R.string.btn_continue), new AnonymousClass35D(this, context, uri));
        r2.A00().show();
    }
}
