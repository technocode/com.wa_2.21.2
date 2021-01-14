package X;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.search.verification.client.R;

/* renamed from: X.2sb  reason: invalid class name and case insensitive filesystem */
public class C61162sb {
    public final AnonymousClass01X A00;

    public C61162sb(AnonymousClass01X r1) {
        this.A00 = r1;
    }

    public AnonymousClass0MD A00(Context context, int i, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2) {
        if (!(i == 6 || i == 7)) {
            switch (i) {
                case -2:
                    break;
                case 400:
                case 403:
                case 2826001:
                    return A03(context, this.A00.A06(R.string.payments_sender_generic_error), onDismissListener);
                case 443:
                    return A03(context, this.A00.A06(R.string.payments_upgrade_error), onDismissListener2);
                case 500:
                case 503:
                case 4002:
                case 2826004:
                    return A03(context, this.A00.A06(R.string.payments_generic_error), onDismissListener2);
                case 10702:
                    return A03(context, this.A00.A06(R.string.payments_bank_generic_error), onDismissListener2);
                case 2826007:
                    AnonymousClass01X r2 = this.A00;
                    return A04(context, r2.A06(R.string.describe_problem_contact_support), r2.A06(R.string.payments_risk_blocked), onDismissListener2);
                case 2826009:
                    AnonymousClass01X r22 = this.A00;
                    return A04(context, r22.A06(R.string.payments_try_again_later), r22.A06(R.string.payments_risk_try_again_later), onDismissListener2);
                case 2826012:
                    return A03(context, this.A00.A06(R.string.payments_risk_method_blocked), onDismissListener2);
                default:
                    return null;
            }
        }
        return A03(context, this.A00.A06(R.string.no_internet_message), onDismissListener2);
    }

    public AnonymousClass0MD A01(Context context, int i, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2) {
        if (i == 8 || i == 9) {
            return A03(context, this.A00.A06(R.string.payments_generic_error), onDismissListener);
        }
        if (i != 1448) {
            return null;
        }
        return A03(context, this.A00.A06(R.string.payments_generic_error), onDismissListener2);
    }

    public final AnonymousClass0MD A02(Context context, int i, String str, DialogInterface.OnDismissListener onDismissListener) {
        AnonymousClass01X r3 = this.A00;
        return A03(context, String.format(r3.A0I(), r3.A06(i), str), onDismissListener);
    }

    public AnonymousClass0MD A03(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        AnonymousClass01X r1 = this.A00;
        AnonymousClass0MB r2 = new AnonymousClass0MB(context);
        r2.A01.A0E = str;
        r2.A07(r1.A06(R.string.ok), null);
        AnonymousClass0MD A002 = r2.A00();
        A002.setOnDismissListener(onDismissListener);
        return A002;
    }

    public AnonymousClass0MD A04(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        AnonymousClass01X r1 = this.A00;
        AnonymousClass0MB r2 = new AnonymousClass0MB(context);
        AnonymousClass0MC r0 = r2.A01;
        r0.A0I = str;
        r0.A0E = str2;
        r2.A07(r1.A06(R.string.ok), null);
        AnonymousClass0MD A002 = r2.A00();
        A002.setOnDismissListener(onDismissListener);
        return A002;
    }
}
