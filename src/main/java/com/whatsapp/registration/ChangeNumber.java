package com.whatsapp.registration;

import X.AbstractC011406u;
import X.AbstractC658331s;
import X.AbstractView$OnClickListenerC08330av;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01P;
import X.AnonymousClass01S;
import X.AnonymousClass01X;
import X.AnonymousClass03C;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass070;
import X.AnonymousClass0AR;
import X.AnonymousClass0CO;
import X.AnonymousClass0HE;
import X.AnonymousClass0HM;
import X.AnonymousClass0HU;
import X.AnonymousClass0I2;
import X.AnonymousClass0JE;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass0SE;
import X.AnonymousClass26F;
import X.AnonymousClass26G;
import X.AnonymousClass2C0;
import X.AnonymousClass300;
import X.AnonymousClass303;
import X.AnonymousClass304;
import X.AnonymousClass30A;
import X.AnonymousClass30O;
import X.AnonymousClass3MT;
import X.AnonymousClass3MU;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C007603r;
import X.C03160Fa;
import X.C03190Fd;
import X.C03290Fp;
import X.C09940dm;
import X.C70703Mb;
import X.C70713Mc;
import X.C70723Md;
import X.DialogInterface$OnClickListenerC64992z8;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class ChangeNumber extends AnonymousClass0HU {
    public static String A0T;
    public static String A0U;
    public int A00;
    public int A01;
    public long A02 = 0;
    public long A03 = 0;
    public View A04;
    public ScrollView A05;
    public AnonymousClass30A A06;
    public ArrayList A07;
    public final Handler A08 = new AnonymousClass303(this, Looper.getMainLooper());
    public final C03290Fp A09 = C03290Fp.A00();
    public final AnonymousClass0CO A0A = AnonymousClass0CO.A00();
    public final AnonymousClass01I A0B = AnonymousClass01I.A00();
    public final AnonymousClass03P A0C = AnonymousClass03P.A00();
    public final AnonymousClass03C A0D = AnonymousClass03C.A00();
    public final AnonymousClass03S A0E = AnonymousClass03S.A00();
    public final AnonymousClass00D A0F = AnonymousClass00D.A00();
    public final AnonymousClass01K A0G = AnonymousClass01K.A00();
    public final AnonymousClass01P A0H = AnonymousClass01P.A00();
    public final AnonymousClass01S A0I = AnonymousClass01S.A00();
    public final C03160Fa A0J = C03160Fa.A00();
    public final AnonymousClass0AR A0K = AnonymousClass0AR.A00();
    public final AnonymousClass30O A0L = new C70703Mb(this);
    public final AnonymousClass0HM A0M = AnonymousClass0HM.A00();
    public final AbstractC658331s A0N = AbstractC658331s.A00();
    public final AnonymousClass0HE A0O = AnonymousClass0HE.A00();
    public final C03190Fd A0P = C03190Fd.A00();
    public final AbstractView$OnClickListenerC08330av A0Q = new ViewOnClickCListenerShape13S0100000_I1_2(this, 44);
    public final AnonymousClass00T A0R = C002101e.A00();
    public final Runnable A0S = new RunnableEBaseShape12S0100000_I1_7(this, 21);

    public final void A0U() {
        if (this.A05.canScrollVertically(1)) {
            this.A04.setElevation((float) this.A00);
        } else {
            this.A04.setElevation(0.0f);
        }
    }

    public final void A0V() {
        Log.i("changenumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        A0H(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_sms).putExtra("permissions", new String[]{"android.permission.RECEIVE_SMS"}).putExtra("message_id", R.string.permission_sms_request).putExtra("force_ui", true), 2);
    }

    public final void A0W() {
        if (isFinishing()) {
            Log.i("changenumber/verify/cancel");
            return;
        }
        AnonymousClass0HU.A0M = 0;
        AnonymousClass00D r5 = this.A0F;
        AnonymousClass008.A0m(r5, "registration_code", null);
        this.A0I.A0F();
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass0HU.A0N);
        sb.append(AnonymousClass0HU.A0O);
        String A1o = C002001d.A1o(sb.toString());
        byte[] A0E2 = C007603r.A0E(this, A1o);
        if (A0E2 == null) {
            A0E2 = C007603r.A0B();
            C007603r.A09(this, A0E2, A1o);
        }
        C000300f r3 = ((ActivityC004702f) this).A0G;
        if (AnonymousClass0I2.A03(r3)) {
            AnonymousClass0I2.A01(getApplicationContext(), this.A0R, r5);
        }
        this.A0R.ANC(new C09940dm(r3, ((AnonymousClass0HU) this).A0E, r5, ((AnonymousClass0HU) this).A0G, AnonymousClass0HU.A0N, AnonymousClass0HU.A0O, A0E2, null, null, false, AnonymousClass0HU.A0M, this), new Void[0]);
    }

    public final void A0X(boolean z) {
        Intent intent = new Intent(this, VerifySms.class);
        intent.putExtra("changenumber", true);
        intent.putExtra("sms_retry_time", this.A02);
        intent.putExtra("voice_retry_time", this.A03);
        intent.putExtra("use_sms_retriever", z);
        A0I(intent, true);
    }

    public final boolean A0Y(String str, String str2, AnonymousClass30A r9) {
        AnonymousClass0CO r4 = this.A0A;
        switch (AnonymousClass0HU.A05(r4, str, str2)) {
            case 1:
                int parseInt = Integer.parseInt(str);
                String replaceAll = str2.replaceAll("\\D", "");
                try {
                    replaceAll = r4.A02(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("changenumber/cc failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder sb = new StringBuilder("changenumber/cc=");
                sb.append(str);
                sb.append("/number=");
                sb.append(replaceAll);
                Log.i(sb.toString());
                AnonymousClass0HU.A0N = str;
                AnonymousClass0HU.A0O = replaceAll;
                return true;
            case 2:
                APr(AnonymousClass0HU.A06(((AnonymousClass2C0) this).A01));
                r9.A02.requestFocus();
                return false;
            case 3:
                APo(R.string.register_bad_cc_valid);
                r9.A02.setText("");
                r9.A02.requestFocus();
                return false;
            case 4:
                APo(R.string.register_empty_phone);
                r9.A03.requestFocus();
                return false;
            case 5:
                AnonymousClass01X r42 = ((AnonymousClass2C0) this).A01;
                APr(r42.A0D(R.string.register_bad_phone_too_short, this.A0P.A03(r42, r9.A06)));
                r9.A03.requestFocus();
                return false;
            case 6:
                AnonymousClass01X r43 = ((AnonymousClass2C0) this).A01;
                APr(r43.A0D(R.string.register_bad_phone_too_long, this.A0P.A03(r43, r9.A06)));
                r9.A03.requestFocus();
                return false;
            case 7:
                AnonymousClass01X r44 = ((AnonymousClass2C0) this).A01;
                APr(r44.A0D(R.string.register_bad_phone, this.A0P.A03(r44, r9.A06)));
                r9.A03.requestFocus();
                return false;
            default:
                return false;
        }
    }

    @Override // X.AnonymousClass0HV
    public void AFo() {
        this.A0S.run();
    }

    @Override // X.AnonymousClass0HV
    public void AHy(String str, String str2, byte[] bArr) {
        AnonymousClass0HE r0 = this.A0O;
        r0.A02();
        r0.A03();
        this.A0K.A05();
        this.A0J.A09(false);
        AnonymousClass01I r1 = this.A0B;
        Log.i("memanager/clearMe");
        r1.A04();
        r1.A05(null);
        new File(getFilesDir(), "me").delete();
        AnonymousClass0HM r2 = this.A0M;
        r2.A0E(AnonymousClass0HU.A0N, AnonymousClass0HU.A0O, null);
        r2.A0C(4);
        this.A02 = System.currentTimeMillis() + (AnonymousClass0JE.A02(str, 0) * 1000);
        this.A03 = System.currentTimeMillis() + (AnonymousClass0JE.A02(str2, 0) * 1000);
        if (this.A0E.A02("android.permission.RECEIVE_SMS") == 0) {
            A0X(false);
        } else if (C002001d.A3F(this)) {
            AbstractC011406u A012 = new AnonymousClass26F((Activity) this).A01(new AnonymousClass26G());
            AnonymousClass3MT r02 = new AnonymousClass3MT(this);
            if (A012 != null) {
                Executor executor = AnonymousClass070.A00;
                A012.A02(executor, r02);
                A012.A01(executor, new AnonymousClass3MU(this));
                return;
            }
            throw null;
        } else {
            A0V();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        throw r0;
     */
    @Override // X.ActivityC004902h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
        // Method dump skipped, instructions count: 443
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.ChangeNumber.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.d("[onConfigurationChanged]");
        if (Build.VERSION.SDK_INT >= 21) {
            this.A05.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass304(this));
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0HU, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String simCountryIso;
        super.onCreate(bundle);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        setTitle(r2.A06(R.string.change_number_title));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0B(true);
            setContentView(R.layout.change_number);
            PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(R.id.registration_fields);
            PhoneNumberEntry phoneNumberEntry2 = (PhoneNumberEntry) findViewById(R.id.registration_new_fields);
            AnonymousClass30A r0 = new AnonymousClass30A();
            this.A06 = r0;
            r0.A05 = phoneNumberEntry;
            AnonymousClass30A r02 = new AnonymousClass30A();
            ((AnonymousClass0HU) this).A01 = r02;
            r02.A05 = phoneNumberEntry2;
            this.A05 = (ScrollView) findViewById(R.id.scroll_view);
            this.A04 = findViewById(R.id.bottom_button_container);
            AnonymousClass30A r03 = this.A06;
            WaEditText waEditText = phoneNumberEntry.A01;
            r03.A02 = waEditText;
            waEditText.setContentDescription(r2.A06(R.string.old_country_code_content_description));
            AnonymousClass30A r04 = ((AnonymousClass0HU) this).A01;
            WaEditText waEditText2 = phoneNumberEntry2.A01;
            r04.A02 = waEditText2;
            waEditText2.setContentDescription(r2.A06(R.string.new_country_code_content_description));
            this.A06.A03 = phoneNumberEntry.A02;
            AnonymousClass30A r1 = ((AnonymousClass0HU) this).A01;
            WaEditText waEditText3 = phoneNumberEntry2.A02;
            r1.A03 = waEditText3;
            AnonymousClass0SE.A03(waEditText3);
            AnonymousClass0SE.A03(this.A06.A03);
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            TelephonyManager A0F2 = this.A0C.A0F();
            if (!(A0F2 == null || (simCountryIso = A0F2.getSimCountryIso()) == null)) {
                try {
                    A0T = this.A0A.A05(simCountryIso);
                } catch (IOException e) {
                    Log.e("changenumber/iso/code failed to get code from CountryPhoneInfo", e);
                }
            }
            phoneNumberEntry.A03 = new C70713Mc(this);
            phoneNumberEntry2.A03 = new C70723Md(this);
            AnonymousClass30A r12 = this.A06;
            r12.A01 = AnonymousClass0JE.A00(r12.A03);
            AnonymousClass30A r13 = this.A06;
            r13.A00 = AnonymousClass0JE.A00(r13.A02);
            AnonymousClass30A r14 = ((AnonymousClass0HU) this).A01;
            r14.A01 = AnonymousClass0JE.A00(r14.A03);
            AnonymousClass30A r15 = ((AnonymousClass0HU) this).A01;
            r15.A00 = AnonymousClass0JE.A00(r15.A02);
            TextView textView = (TextView) findViewById(R.id.next_btn);
            textView.setText(r2.A06(R.string.next));
            textView.setOnClickListener(this.A0Q);
            String str = A0T;
            if (str != null) {
                this.A06.A02.setText(str);
                ((AnonymousClass0HU) this).A01.A02.setText(A0T);
            }
            String str2 = this.A06.A06;
            if (str2 != null && str2.length() > 0) {
                AnonymousClass008.A18("changenumber/country: ", str2);
                this.A06.A05.A00(str2);
                ((AnonymousClass0HU) this).A01.A05.A00(str2);
            }
            ((AnonymousClass0HU) this).A03 = this.A0F.A00.getString("change_number_new_number_banned", null);
            this.A0M.A0n.add(this.A0L);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A05.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass300(this));
                this.A05.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass304(this));
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0HU, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            r3.A01.A0E = r2.A06(R.string.change_number_new_country_code_suggestion);
            r3.A07(r2.A06(R.string.btn_continue), new DialogInterface$OnClickListenerC64992z8(this));
            return r3.A00();
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        AnonymousClass0HM r0 = this.A0M;
        r0.A0n.remove(this.A0L);
        super.onDestroy();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // X.AnonymousClass0HU, X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        AnonymousClass30A r1 = this.A06;
        r1.A01 = AnonymousClass0JE.A00(r1.A03);
        AnonymousClass30A r12 = this.A06;
        r12.A00 = AnonymousClass0JE.A00(r12.A02);
        AnonymousClass30A r13 = ((AnonymousClass0HU) this).A01;
        r13.A01 = AnonymousClass0JE.A00(r13.A03);
        AnonymousClass30A r14 = ((AnonymousClass0HU) this).A01;
        r14.A00 = AnonymousClass0JE.A00(r14.A02);
        if (((AnonymousClass0HU) this).A03 != null) {
            AnonymousClass00D r0 = this.A0F;
            String str = AnonymousClass0HU.A0N;
            String str2 = AnonymousClass0HU.A0O;
            SharedPreferences.Editor edit = r0.A00.edit();
            StringBuilder sb = new StringBuilder("+");
            sb.append(str);
            sb.append(str2);
            edit.putString("change_number_new_number_banned", sb.toString()).apply();
            return;
        }
        AnonymousClass00D r2 = this.A0F;
        if (r2.A00.getString("change_number_new_number_banned", null) != null) {
            AnonymousClass008.A0j(r2, "change_number_new_number_banned");
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A0T = bundle.getString("country_code");
        A0U = bundle.getString("phone_number");
        AnonymousClass0HU.A0N = bundle.getString("countryCode");
        AnonymousClass0HU.A0O = bundle.getString("phoneNumber");
        this.A07 = bundle.getStringArrayList("notifyJids");
        this.A01 = bundle.getInt("mode");
    }

    @Override // X.AnonymousClass0HU, X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        String str = A0T;
        if (str != null) {
            this.A06.A02.setText(str);
        }
        AnonymousClass30A r0 = this.A06;
        AnonymousClass0JE.A0G(r0.A02, r0.A00);
        AnonymousClass30A r02 = this.A06;
        AnonymousClass0JE.A0G(r02.A03, r02.A01);
        AnonymousClass30A r03 = ((AnonymousClass0HU) this).A01;
        AnonymousClass0JE.A0G(r03.A02, r03.A00);
        AnonymousClass30A r04 = ((AnonymousClass0HU) this).A01;
        AnonymousClass0JE.A0G(r04.A03, r04.A01);
        this.A06.A03.clearFocus();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("country_code", A0T);
        bundle.putCharSequence("phone_number", A0U);
        bundle.putCharSequence("countryCode", AnonymousClass0HU.A0N);
        bundle.putCharSequence("phoneNumber", AnonymousClass0HU.A0O);
        bundle.putStringArrayList("notifyJids", this.A07);
        bundle.putInt("mode", this.A01);
    }
}
