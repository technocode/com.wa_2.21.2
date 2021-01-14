package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass0AR;
import X.AnonymousClass0CO;
import X.AnonymousClass0HU;
import X.AnonymousClass0JE;
import X.AnonymousClass0SE;
import X.AnonymousClass1WO;
import X.C004302a;
import X.C03190Fd;
import X.C06470Tj;
import X.C39861sE;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import java.io.IOException;

public class CountryAndPhoneNumberFragment extends WaFragment {
    public int A00;
    public int A01;
    public EditText A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public MatchPhoneNumberFragment A07;
    public ActivityC004602e A08;
    public PhoneNumberEntry A09;
    public String A0A = null;
    public String A0B;
    public final AnonymousClass0CO A0C = AnonymousClass0CO.A00();
    public final AnonymousClass01X A0D = AnonymousClass01X.A00();
    public final C03190Fd A0E = C03190Fd.A00();

    public static void A00(CountryAndPhoneNumberFragment countryAndPhoneNumberFragment, boolean z) {
        TextView textView = countryAndPhoneNumberFragment.A05;
        ActivityC004602e r1 = countryAndPhoneNumberFragment.A08;
        int i = R.color.settings_item_subtitle_text;
        if (z) {
            i = R.color.red_error;
        }
        textView.setTextColor(C004302a.A00(r1, i));
        int i2 = R.color.settings_delete_account_spinner_tint;
        if (z) {
            i2 = R.color.red_error;
        }
        countryAndPhoneNumberFragment.A06.getBackground().setColorFilter(C004302a.A00(countryAndPhoneNumberFragment.A08, i2), PorterDuff.Mode.SRC_IN);
        TextView textView2 = countryAndPhoneNumberFragment.A04;
        int i3 = 4;
        if (z) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.country_and_phone_number, viewGroup, false);
        this.A09 = (PhoneNumberEntry) inflate.findViewById(R.id.phone_number_entry);
        this.A06 = (TextView) inflate.findViewById(R.id.registration_country);
        this.A04 = (TextView) inflate.findViewById(R.id.registration_country_error_view);
        this.A05 = (TextView) inflate.findViewById(R.id.registration_country_label);
        PhoneNumberEntry phoneNumberEntry = this.A09;
        this.A02 = phoneNumberEntry.A01;
        this.A03 = phoneNumberEntry.A02;
        phoneNumberEntry.A03 = new C39861sE(this);
        TelephonyManager telephonyManager = (TelephonyManager) this.A08.getSystemService("phone");
        if (telephonyManager == null) {
            Log.w("CountryAndPhoneNumberFragment tm=null");
        } else {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso != null) {
                try {
                    this.A0A = this.A0C.A05(simCountryIso);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/iso/code failed to get code from CountryPhoneInfo", e);
                }
            }
        }
        Drawable A032 = C004302a.A03(this.A08, R.drawable.abc_spinner_textfield_background_material);
        if (AnonymousClass0SE.A01) {
            this.A06.setBackground(A032);
        } else {
            this.A06.setBackgroundDrawable(new C06470Tj(this.A0D, A032));
        }
        AnonymousClass0SE.A03(this.A03);
        if (Build.VERSION.SDK_INT < 21) {
            this.A06.getBackground().setColorFilter(C004302a.A00(this.A08, R.color.settings_delete_account_spinner_tint), PorterDuff.Mode.SRC_IN);
        }
        this.A06.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 17));
        this.A03.requestFocus();
        this.A01 = AnonymousClass0JE.A00(this.A03);
        this.A00 = AnonymousClass0JE.A00(this.A02);
        String str = this.A0A;
        if (str != null) {
            this.A02.setText(str);
        }
        if (!TextUtils.isEmpty(this.A0B)) {
            AnonymousClass008.A1U(AnonymousClass008.A0S("CountryAndPhoneNumberFragment/country: "), this.A0B);
            this.A09.A00(this.A0B);
        }
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        this.A08 = (ActivityC004602e) context;
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        this.A01 = AnonymousClass0JE.A00(this.A03);
        this.A00 = AnonymousClass0JE.A00(this.A02);
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        String str = this.A0A;
        if (str != null) {
            this.A02.setText(str);
        }
        String str2 = this.A0B;
        if (str2 != null) {
            this.A06.setText(this.A0E.A03(this.A0D, str2));
        }
        AnonymousClass0JE.A0G(this.A02, this.A00);
        AnonymousClass0JE.A0G(this.A03, this.A01);
        this.A03.clearFocus();
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1 && intent != null) {
            this.A0A = intent.getStringExtra("cc");
            this.A0B = intent.getStringExtra("iso");
            String stringExtra = intent.getStringExtra("country_name");
            this.A02.setText(this.A0A);
            this.A06.setText(stringExtra);
            this.A09.A00(this.A0B);
            if (this.A01 == -1) {
                this.A01 = Integer.MAX_VALUE;
            }
        }
    }

    public void A0n() {
        boolean z;
        String A0B2 = AnonymousClass008.A0B(this.A02);
        String obj = this.A03.getText().toString();
        AnonymousClass0CO r4 = this.A0C;
        switch (AnonymousClass0HU.A05(r4, A0B2, obj)) {
            case 2:
                this.A08.APr(AnonymousClass0HU.A06(this.A0D));
                this.A02.requestFocus();
                return;
            case 3:
                this.A08.APo(R.string.register_bad_cc_valid);
                this.A02.setText("");
                this.A02.requestFocus();
                return;
            case 4:
                this.A08.APo(R.string.register_empty_phone);
                this.A03.requestFocus();
                return;
            case 5:
                this.A08.APr(this.A0D.A0D(R.string.register_bad_phone_too_short, this.A06.getText()));
                this.A03.requestFocus();
                return;
            case 6:
                this.A08.APr(this.A0D.A0D(R.string.register_bad_phone_too_long, this.A06.getText()));
                this.A03.requestFocus();
                return;
            case 7:
                this.A08.APr(this.A0D.A0D(R.string.register_bad_phone, this.A06.getText()));
                this.A03.requestFocus();
                return;
            default:
                int parseInt = Integer.parseInt(A0B2);
                String replaceAll = obj.replaceAll("\\D", "");
                try {
                    replaceAll = r4.A02(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/phone failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder sb = new StringBuilder("CountryAndPhoneNumberFragment/phone/cc=");
                sb.append(A0B2);
                sb.append("/number=");
                sb.append(replaceAll);
                Log.i(sb.toString());
                this.A0A = A0B2;
                MatchPhoneNumberFragment matchPhoneNumberFragment = this.A07;
                if (matchPhoneNumberFragment != null) {
                    StringBuilder A0a = AnonymousClass008.A0a("MatchPhoneNumberFragment/submit/cc ", A0B2, " ph=", replaceAll, " jid=");
                    AnonymousClass01I r0 = matchPhoneNumberFragment.A02;
                    r0.A04();
                    A0a.append(r0.A03);
                    Log.w(A0a.toString());
                    ActivityC004602e r3 = matchPhoneNumberFragment.A01;
                    Bundle bundle = new Bundle();
                    ConnectionProgressDialogFragment connectionProgressDialogFragment = new ConnectionProgressDialogFragment();
                    connectionProgressDialogFragment.A0N(bundle);
                    connectionProgressDialogFragment.A0u(r3.A04(), "PROGRESS");
                    matchPhoneNumberFragment.A00.sendEmptyMessageDelayed(4, 30000);
                    AnonymousClass0AR r2 = matchPhoneNumberFragment.A04;
                    if (r2.A04.A06) {
                        r2.A08.A09(Message.obtain(null, 0, 36, 0, new AnonymousClass1WO(A0B2, replaceAll)));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        matchPhoneNumberFragment.A00.removeMessages(4);
                        DialogFragment dialogFragment = (DialogFragment) matchPhoneNumberFragment.A01.A04().A0Q.A01("PROGRESS");
                        if (dialogFragment != null) {
                            dialogFragment.A0r();
                        }
                        ActivityC004602e r42 = matchPhoneNumberFragment.A01;
                        AnonymousClass01X r32 = matchPhoneNumberFragment.A03;
                        r42.APr(r32.A0D(R.string.register_check_connectivity, r32.A06(R.string.connectivity_self_help_instructions)));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
