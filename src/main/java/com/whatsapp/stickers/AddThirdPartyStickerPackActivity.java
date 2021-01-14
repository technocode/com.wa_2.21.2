package com.whatsapp.stickers;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0H4;
import X.AnonymousClass0JW;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass33L;
import X.AnonymousClass3QD;
import X.AnonymousClass3QE;
import X.C002101e;
import X.C03570Gt;
import X.C03620Gz;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;

public class AddThirdPartyStickerPackActivity extends ActivityC004902h {
    public AnonymousClass3QE A00;
    public final AnonymousClass0H4 A01 = AnonymousClass0H4.A00();
    public final AnonymousClass00T A02 = C002101e.A00();

    public class AddStickerPackDialogFragment extends WaDialogFragment {
        public String A00;
        public String A01;
        public String A02;
        public final View.OnClickListener A03 = new ViewOnClickEBaseShape8S0100000_I1_6(this, 44);
        public final View.OnClickListener A04 = new ViewOnClickEBaseShape8S0100000_I1_6(this, 38);
        public final AnonymousClass02M A05 = AnonymousClass02M.A00();
        public final AnonymousClass01X A06 = AnonymousClass01X.A00();
        public final AnonymousClass33L A07 = new AnonymousClass3QD(this);
        public final C03620Gz A08 = C03620Gz.A00();
        public final C03570Gt A09 = C03570Gt.A00();

        @Override // X.AnonymousClass037
        public void A0c() {
            this.A0U = true;
            this.A08.A00(this.A07);
        }

        @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
        public void A0i(Bundle bundle) {
            super.A0i(bundle);
            this.A08.A01(this.A07);
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            super.A0p(bundle);
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                this.A01 = bundle2.getString("sticker_pack_id");
                this.A00 = bundle2.getString("sticker_pack_authority");
                this.A02 = bundle2.getString("sticker_pack_name");
            }
            View inflate = LayoutInflater.from(A00()).inflate(R.layout.add_third_party_sticker_dialog, (ViewGroup) null);
            AnonymousClass01X r5 = this.A06;
            ((TextView) inflate.findViewById(R.id.message_text_view)).setText(r5.A0D(R.string.validate_sticker_progress_message_with_app, r5.A06(R.string.localized_app_name)));
            View findViewById = inflate.findViewById(R.id.ok_button);
            findViewById.setVisibility(8);
            View.OnClickListener onClickListener = this.A04;
            findViewById.setOnClickListener(onClickListener);
            View findViewById2 = inflate.findViewById(R.id.cancel_button);
            findViewById2.setVisibility(8);
            findViewById2.setOnClickListener(onClickListener);
            View findViewById3 = inflate.findViewById(R.id.add_button);
            findViewById3.setOnClickListener(this.A03);
            findViewById3.setVisibility(8);
            AnonymousClass0MB r1 = new AnonymousClass0MB(A00());
            AnonymousClass0MC r0 = r1.A01;
            r0.A0C = inflate;
            r0.A01 = 0;
            return r1.A00();
        }

        public final void A0x(String str, int i, int i2, int i3) {
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog != null) {
                ((TextView) dialog.findViewById(R.id.message_text_view)).setText(Html.fromHtml(str));
                dialog.findViewById(R.id.progress_bar).setVisibility(i);
                dialog.findViewById(R.id.ok_button).setVisibility(i2);
                dialog.findViewById(R.id.cancel_button).setVisibility(i3);
                dialog.findViewById(R.id.add_button).setVisibility(i3);
            }
        }

        @Override // androidx.fragment.app.DialogFragment
        public void onDismiss(DialogInterface dialogInterface) {
            if (!((DialogFragment) this).A0C) {
                A0w(true, true);
            }
            ActivityC004902h A0A = A0A();
            if (A0A != null) {
                A0A.finish();
                A0A.overridePendingTransition(0, 0);
            }
        }
    }

    @Override // X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra2 = getIntent().getStringExtra("sticker_pack_authority");
        String stringExtra3 = getIntent().getStringExtra("sticker_pack_name");
        if (getCallingActivity() != null) {
            str = getCallingActivity().getPackageName();
        } else {
            str = null;
        }
        if (str != null) {
            ProviderInfo resolveContentProvider = getPackageManager().resolveContentProvider(stringExtra2, 128);
            if (resolveContentProvider == null) {
                String A0K = AnonymousClass008.A0K("cannot find the provider for authority:", stringExtra2);
                Intent intent = new Intent();
                intent.putExtra("validation_error", A0K);
                setResult(0, intent);
                Log.e(A0K);
                finish();
                overridePendingTransition(0, 0);
                return;
            } else if (!str.equals(resolveContentProvider.packageName)) {
                String A0M = AnonymousClass008.A0M("the calling activity: ", str, " does not own authority: ", stringExtra2);
                Intent intent2 = new Intent();
                intent2.putExtra("validation_error", A0M);
                setResult(0, intent2);
                Log.e(A0M);
                finish();
                overridePendingTransition(0, 0);
                return;
            }
        }
        AnonymousClass3QE r4 = new AnonymousClass3QE(stringExtra, stringExtra2, stringExtra3, this.A01, this);
        this.A00 = r4;
        this.A02.ANC(r4, new Void[0]);
    }

    @Override // X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3QE r0 = this.A00;
        if (r0 != null && !((AnonymousClass0JW) r0).A00.isCancelled()) {
            ((AnonymousClass0JW) this.A00).A00.cancel(true);
        }
    }
}
