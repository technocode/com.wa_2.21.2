package com.whatsapp.http;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.AnonymousClass0MI;
import X.C000300f;
import X.C002101e;
import X.C02780Dk;
import X.C05490Ot;
import X.DialogInterface$OnClickListenerC49392Qh;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.io.File;

public class GoogleSearchDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final C000300f A01 = C000300f.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass00Y A03 = AnonymousClass00Y.A00();
    public final AnonymousClass00T A04 = C002101e.A00();

    public static void A00(ActivityC004702f r5, AnonymousClass02M r6, C000300f r7, AbstractC007503q r8) {
        File file;
        if (r8 instanceof AnonymousClass0MI) {
            if (r7.A0D(AbstractC000400g.A2G)) {
                AnonymousClass0M4 r0 = ((AnonymousClass0M3) r8).A02;
                if (r0 == null || (file = r0.A0F) == null) {
                    r6.A04(R.string.search_by_image_failed, 0);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("image_file", file.getAbsolutePath());
                bundle.putInt("search_query_type", 1);
                GoogleSearchDialogFragment googleSearchDialogFragment = new GoogleSearchDialogFragment();
                googleSearchDialogFragment.A0N(bundle);
                r5.APm(googleSearchDialogFragment);
            }
        } else if ((r8 instanceof C05490Ot) && r7.A0D(AbstractC000400g.A2A)) {
            String A0D = r8.A0D();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("search_query_type", 0);
            bundle2.putString("search_query_text", A0D);
            GoogleSearchDialogFragment googleSearchDialogFragment2 = new GoogleSearchDialogFragment();
            googleSearchDialogFragment2.A0N(bundle2);
            r5.APm(googleSearchDialogFragment2);
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        if (!(context instanceof ActivityC004702f)) {
            AnonymousClass00E.A08(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0B = A0B();
        DialogInterface$OnClickListenerC49392Qh r1 = new DialogInterface$OnClickListenerC49392Qh(this);
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0B);
        AnonymousClass01X r2 = this.A02;
        r3.A07(r2.A06(R.string.action_search_web), r1);
        r3.A05(r2.A06(R.string.cancel), null);
        r3.A01.A0E = r2.A06(R.string.quick_message_search_confirmation);
        AnonymousClass0MD A002 = r3.A00();
        A002.setCanceledOnTouchOutside(true);
        return A002;
    }
}
