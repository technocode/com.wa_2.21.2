package com.whatsapp.registration;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01Q;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass03B;
import X.AnonymousClass03C;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass0CO;
import X.AnonymousClass0FE;
import X.AnonymousClass0FV;
import X.AnonymousClass0FW;
import X.AnonymousClass0HM;
import X.AnonymousClass0HP;
import X.AnonymousClass0HU;
import X.AnonymousClass0HW;
import X.AnonymousClass0HX;
import X.AnonymousClass0I2;
import X.AnonymousClass0JE;
import X.AnonymousClass0JW;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass0S2;
import X.AnonymousClass0SE;
import X.AnonymousClass1LS;
import X.AnonymousClass2C0;
import X.AnonymousClass2OC;
import X.AnonymousClass30A;
import X.AnonymousClass30C;
import X.AnonymousClass30K;
import X.AnonymousClass30L;
import X.AnonymousClass30Y;
import X.AnonymousClass324;
import X.AnonymousClass325;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C007603r;
import X.C014708f;
import X.C02660Cy;
import X.C03160Fa;
import X.C03190Fd;
import X.C05710Pt;
import X.C05720Pu;
import X.C06210Sf;
import X.C06470Tj;
import X.C09940dm;
import X.C12440i6;
import X.C70773Mi;
import X.C70783Mj;
import X.DialogInterface$OnClickListenerC65142zN;
import X.DialogInterface$OnClickListenerC65152zO;
import X.DialogInterface$OnDismissListenerC65162zP;
import X.ViewTreeObserver$OnGlobalLayoutListenerC65132zM;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegisterPhone extends AnonymousClass0HU implements AnonymousClass0HW, AnonymousClass0HX {
    public static boolean A0j;
    public static boolean A0k;
    public int A00 = 30;
    public int A01;
    public long A02 = 0;
    public long A03 = 0;
    public Dialog A04;
    public ScrollView A05;
    public TextView A06;
    public TextEmojiLabel A07;
    public C09940dm A08;
    public AnonymousClass30L A09;
    public AnonymousClass30Y A0A = new AnonymousClass30Y();
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final C12440i6 A0K = C12440i6.A00();
    public final AnonymousClass0CO A0L = AnonymousClass0CO.A00();
    public final AnonymousClass03B A0M = AnonymousClass03B.A00();
    public final C06210Sf A0N = C06210Sf.A00();
    public final AnonymousClass04j A0O = AnonymousClass04j.A00();
    public final AnonymousClass03P A0P = AnonymousClass03P.A00();
    public final AnonymousClass00G A0Q = AnonymousClass00G.A01;
    public final AnonymousClass03C A0R = AnonymousClass03C.A00();
    public final AnonymousClass03S A0S = AnonymousClass03S.A00();
    public final AnonymousClass01Q A0T = AnonymousClass01Q.A00();
    public final AnonymousClass0M9 A0U = AnonymousClass0M9.A01();
    public final AnonymousClass2OC A0V = AnonymousClass2OC.A00();
    public final C02660Cy A0W = C02660Cy.A00();
    public final C03160Fa A0X = C03160Fa.A00();
    public final AnonymousClass0FE A0Y = AnonymousClass0FE.A00();
    public final AnonymousClass022 A0Z = AnonymousClass022.A00();
    public final AnonymousClass0HM A0a = AnonymousClass0HM.A00();
    public final C014708f A0b = C014708f.A00();
    public final AnonymousClass0HP A0c = AnonymousClass0HP.A00();
    public final AnonymousClass0FV A0d = AnonymousClass0FV.A00();
    public final AnonymousClass0FW A0e = AnonymousClass0FW.A00();
    public final AnonymousClass324 A0f = AnonymousClass324.A00();
    public final AnonymousClass325 A0g = AnonymousClass325.A00();
    public final C03190Fd A0h = C03190Fd.A00();
    public final AnonymousClass00T A0i = C002101e.A00();

    @Override // X.AnonymousClass0HV
    public void AFo() {
    }

    public static List A04(AnonymousClass0CO r5, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1LS r2 = (AnonymousClass1LS) it.next();
            if (AnonymousClass0HU.A05(r5, r2.A00, r2.A02) == 1) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public String A0U() {
        Editable text = ((AnonymousClass0HU) this).A01.A03.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    public void A0V() {
        this.A0G = false;
        this.A00 = 30;
        if (this.A06.getVisibility() == 0) {
            AlphaAnimation A022 = AnonymousClass008.A02(1.0f, 0.0f, 150);
            this.A06.startAnimation(A022);
            A022.setAnimationListener(new C70783Mj(this));
            return;
        }
        this.A06.setVisibility(8);
    }

    public void A0W() {
        if (this.A0S.A02("android.permission.RECEIVE_SMS") == 0) {
            Log.i("registerphone/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission for SMB");
            A0a(false);
            return;
        }
        Log.i("registerphone/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_sms).putExtra("permissions", new String[]{"android.permission.RECEIVE_SMS"}).putExtra("message_id", R.string.permission_sms_request).putExtra("force_ui", true), 1);
    }

    public void A0X() {
        String obj;
        A0j = false;
        Editable text = ((AnonymousClass0HU) this).A01.A02.getText();
        if (text == null) {
            obj = null;
        } else {
            obj = text.toString();
        }
        String A0U2 = A0U();
        if (obj == null || A0U2 == null || obj.equals("") || AnonymousClass0JE.A0A(this.A0L, A0U2, obj, this.A0B) == null) {
            A0V();
        } else {
            new AnonymousClass30K(this).start();
        }
    }

    public final void A0Y() {
        Log.i("register/phone/reset-state");
        AnonymousClass0HU.A0L = 7;
        A0T();
        AnonymousClass00D r3 = ((ActivityC004702f) this).A0J;
        AnonymousClass0JE.A0H(r3, "");
        AnonymousClass0HU.A0M = 0;
        AnonymousClass008.A0m(r3, "registration_code", null);
        AnonymousClass0HM r1 = this.A0a;
        r1.A0E(null, null, null);
        r1.A0C(0);
    }

    public final void A0Z() {
        Log.i("register/phone/whats-my-number/permission-granted");
        this.A0A.A01 = 1;
        AnonymousClass03P r2 = this.A0P;
        TelephonyManager A0F2 = r2.A0F();
        if (A0F2 == null || A0F2.getSimState() != 1) {
            List A0D2 = AnonymousClass0JE.A0D(r2, this.A0S, this.A0K);
            int size = ((AbstractCollection) A0D2).size();
            List A042 = A04(this.A0L, A0D2);
            int size2 = ((AbstractCollection) A042).size();
            AnonymousClass30Y r1 = this.A0A;
            int i = 0;
            if (size != size2) {
                i = 1;
            }
            r1.A03 = Integer.valueOf(i);
            r1.A04 = Integer.valueOf(size2);
            if (size2 == 0) {
                Log.i("register/phone/whats-my-number/unable-to-get-phone-number-from-sim");
                ((ActivityC004702f) this).A0F.A06(R.string.no_phone_number_sim_error, 1);
                return;
            }
            Log.i("register/phone/whats-my-number/show-select-phone-number-dialog");
            ((ActivityC004602e) this).A0H.A02(((AnonymousClass0HU) this).A01.A03);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(A042);
            SelectPhoneNumberDialog selectPhoneNumberDialog = new SelectPhoneNumberDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("deviceSimInfoList", arrayList);
            selectPhoneNumberDialog.A0N(bundle);
            APl(selectPhoneNumberDialog, null);
            return;
        }
        Log.i("register/phone/whats-my-number/no-sim");
        this.A0A.A04 = -1;
        ((ActivityC004702f) this).A0F.A06(R.string.no_sim_error, 1);
    }

    public final void A0a(boolean z) {
        AnonymousClass0HU.A0L = 0;
        A0T();
        this.A0a.A0C(4);
        long j = this.A02;
        long j2 = this.A03;
        Intent intent = new Intent(this, VerifySms.class);
        intent.putExtra("sms_retry_time", j);
        intent.putExtra("voice_retry_time", j2);
        intent.putExtra("use_sms_retriever", z);
        startActivity(intent);
        finish();
    }

    @Override // X.AnonymousClass0HW
    public void ADq() {
        ((ActivityC004602e) this).A0H.A03(((AnonymousClass0HU) this).A01.A03);
    }

    @Override // X.AnonymousClass0HV
    public void AHy(String str, String str2, byte[] bArr) {
        this.A02 = System.currentTimeMillis() + (AnonymousClass0JE.A02(str, 0) * 1000);
        this.A03 = System.currentTimeMillis() + (AnonymousClass0JE.A02(str2, 0) * 1000);
        if (!((AnonymousClass0HU) this).A02.A02) {
            C002001d.A2O(this, 21);
        }
    }

    @Override // X.AnonymousClass0HW
    public void AI5(AnonymousClass1LS r3) {
        this.A0A.A02 = 1;
        this.A0D = r3.A00;
        String str = r3.A02;
        this.A0E = str;
        ((AnonymousClass0HU) this).A01.A03.setText(str);
        ((AnonymousClass0HU) this).A01.A02.setText(this.A0D);
        EditText editText = ((AnonymousClass0HU) this).A01.A03;
        String A0U2 = A0U();
        if (A0U2 != null) {
            editText.setSelection(A0U2.length());
            return;
        }
        throw null;
    }

    public SharedPreferences getPreferences(int i) {
        return this.A0Z.A01(getLocalClassName());
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 0) {
            if (i2 == -1) {
                AnonymousClass0HU.A0N = intent.getStringExtra("cc");
                this.A0C = intent.getStringExtra("iso");
                String stringExtra = intent.getStringExtra("country_name");
                ((AnonymousClass0HU) this).A01.A02.setText(AnonymousClass0HU.A0N);
                ((AnonymousClass0HU) this).A01.A04.setText(stringExtra);
                ((AnonymousClass0HU) this).A01.A05.A00(this.A0C);
                SharedPreferences preferences = getPreferences(0);
                SharedPreferences.Editor edit = preferences.edit();
                edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", AnonymousClass0HU.A0N);
                edit.putString("com.whatsapp.registration.RegisterPhone.country_code", AnonymousClass0HU.A0N);
                if (preferences.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1) == -1) {
                    edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", Integer.MAX_VALUE);
                }
                edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1);
                if (!edit.commit()) {
                    Log.w("registerphone/actresult/commit failed");
                }
            }
            this.A0I = false;
            Log.d("register/phone/countrypicker/pickingcountry/false");
        } else if (i == 1) {
            StringBuilder A0S2 = AnonymousClass008.A0S("register/phone/sms permission ");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            A0S2.append(str);
            Log.i(A0S2.toString());
            A0a(false);
        } else if (i != 155) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0B = AnonymousClass0JE.A0B(this.A0Q, this.A0P, this.A0S);
            A0Z();
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0HU, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.registerphone);
        AnonymousClass00T r7 = this.A0i;
        AnonymousClass0M9 r8 = this.A0U;
        AnonymousClass01X r9 = ((AnonymousClass2C0) this).A01;
        this.A09 = new AnonymousClass30L(r7, r8, r9, this.A0V, this.A0W);
        AnonymousClass00G r1 = this.A0Q;
        AnonymousClass03P r3 = this.A0P;
        this.A0B = AnonymousClass0JE.A0B(r1, r3, this.A0S);
        if (this.A0b.A01() != 1) {
            Log.e("register/phone/create/wrong-state bounce to main");
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            A0C(toolbar);
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A0A(false);
                A092.A0D(false);
            }
        }
        ((TextView) findViewById(R.id.register_phone_toolbar_title)).setText(R.string.register_phone_header_experiment);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", false)) {
                C002001d.A2O(this, 125);
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.resetstate", false)) {
                A0Y();
            }
            this.A0F = intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            if (!(intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code") == null || intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number") == null)) {
                getPreferences(0).edit().putString("com.whatsapp.registration.RegisterPhone.input_phone_number", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number")).putString("com.whatsapp.registration.RegisterPhone.input_country_code", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code")).apply();
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
                Log.i("register/phone/link/instructions/dialog");
                APr(getString(R.string.register_tapped_link_no_phone_number, getString(R.string.ok)));
            }
        } else {
            this.A0F = false;
        }
        AnonymousClass30A r12 = new AnonymousClass30A();
        ((AnonymousClass0HU) this).A01 = r12;
        r12.A05 = (PhoneNumberEntry) findViewById(R.id.registration_fields);
        AnonymousClass30A r6 = ((AnonymousClass0HU) this).A01;
        PhoneNumberEntry phoneNumberEntry = r6.A05;
        phoneNumberEntry.A03 = new C70773Mi(this);
        r6.A02 = phoneNumberEntry.A01;
        r6.A04 = (TextView) findViewById(R.id.registration_country);
        ((AnonymousClass0HU) this).A01.A04.setBackgroundDrawable(new C06470Tj(r9, C004302a.A03(this, R.drawable.abc_spinner_textfield_background_material)));
        AnonymousClass30A r13 = ((AnonymousClass0HU) this).A01;
        WaEditText waEditText = r13.A05.A02;
        r13.A03 = waEditText;
        AnonymousClass0SE.A03(waEditText);
        if (r9.A02().A06) {
            ((AnonymousClass0HU) this).A01.A05.setPadding(getResources().getDimensionPixelSize(R.dimen.card_h_padding), ((AnonymousClass0HU) this).A01.A05.getPaddingTop(), ((AnonymousClass0HU) this).A01.A05.getPaddingRight(), ((AnonymousClass0HU) this).A01.A05.getPaddingBottom());
        }
        this.A05 = (ScrollView) findViewById(R.id.scroll_view);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.registration_info);
        this.A07 = textEmojiLabel;
        AnonymousClass008.A0d(textEmojiLabel);
        TextEmojiLabel textEmojiLabel2 = this.A07;
        textEmojiLabel2.setAccessibilityHelper(new C05720Pu(textEmojiLabel2));
        this.A07.setText(this.A0N.A02(this, getString(R.string.tos_registration_info)));
        this.A07.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.mistyped_undercard_text);
        this.A06 = textView;
        textView.setVisibility(8);
        if (getPreferences(0).getString("com.whatsapp.registration.RegisterPhone.input_country_code", null) == null) {
            TelephonyManager A0F2 = r3.A0F();
            if (A0F2 == null) {
                Log.w("register/phone tm=null");
            } else {
                String simCountryIso = A0F2.getSimCountryIso();
                if (simCountryIso != null) {
                    try {
                        String A052 = this.A0L.A05(simCountryIso);
                        if (A052 != null) {
                            SharedPreferences.Editor edit = getPreferences(0).edit();
                            edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", A052);
                            if (!edit.commit()) {
                                Log.w("register/phone/input_cc/commit failed");
                            }
                        }
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder("register/phone/iso: ");
                        sb.append(simCountryIso);
                        sb.append(" failed to lookupCallingCode from CountryPhoneInfo");
                        Log.e(sb.toString(), e);
                    }
                }
            }
        }
        ((AnonymousClass0HU) this).A01.A04.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 13));
        ((AnonymousClass0HU) this).A01.A03.requestFocus();
        ((AnonymousClass0HU) this).A01.A03.setCursorVisible(true);
        Button button = (Button) findViewById(R.id.registration_submit);
        button.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 14));
        String str = AnonymousClass0HU.A0N;
        if (str != null) {
            ((AnonymousClass0HU) this).A01.A02.setText(str);
        }
        String charSequence = ((AnonymousClass0HU) this).A01.A04.getText().toString();
        if (charSequence.length() > 0) {
            ((AnonymousClass0HU) this).A01.A05.A00(charSequence);
        }
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        if (point.y <= 480) {
            getWindow().setSoftInputMode(3);
        }
        AnonymousClass03B r14 = this.A0M;
        if (r14.A04()) {
            Log.w("register/phone/clock-wrong");
            C002001d.A3J(this, this.A0X, this.A0Y);
        } else if (r14.A03()) {
            Log.w("register/phone/sw-expired");
            C002001d.A3K(this, this.A0X, this.A0Y);
        }
        this.A05.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC65132zM(this, button));
        Log.i("register/phone/whats-my-number/enabled");
        TextEmojiLabel textEmojiLabel3 = (TextEmojiLabel) findViewById(R.id.description);
        textEmojiLabel3.A07 = new C05710Pt();
        textEmojiLabel3.setAccessibilityHelper(new C05720Pu(textEmojiLabel3));
        textEmojiLabel3.setText(AnonymousClass0JE.A06(getString(R.string.register_phone_number_code_confirm_experiment), "whats-my-number", new RunnableEBaseShape4S0100000_I0_4(this, 3)));
        textEmojiLabel3.setLinkTextColor(C004302a.A00(this, R.color.text_link_color));
        findViewById(R.id.sms_charge_warning).setVisibility(0);
    }

    @Override // X.AnonymousClass0HU, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 21) {
            return super.onCreateDialog(i);
        }
        Log.i("register/phone/dialog/num_confirm");
        String string = getString(R.string.register_phone_phone_number_confirmation_message, ((AnonymousClass2C0) this).A01.A0F(AnonymousClass0JE.A0C(AnonymousClass0HU.A0N, AnonymousClass0HU.A0O)));
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        Spanned fromHtml = Html.fromHtml(string);
        AnonymousClass0MC r3 = r4.A01;
        r3.A0E = fromHtml;
        r3.A0J = false;
        r4.A04(R.string.ok, new DialogInterface$OnClickListenerC65142zN(this));
        DialogInterface$OnClickListenerC65152zO r1 = new DialogInterface$OnClickListenerC65152zO(this);
        r3.A0G = r3.A0O.getText(R.string.register_edit_button);
        r3.A04 = r1;
        AnonymousClass0MD A002 = r4.A00();
        this.A04 = A002;
        A002.setOnDismissListener(new DialogInterface$OnDismissListenerC65162zP(this));
        return this.A04;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 5, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        if (this.A08 != null) {
            Log.i("register/phone/destroy canceling task");
            ((AnonymousClass0JW) this.A08).A00.cancel(true);
            this.A08 = null;
        }
        this.A09.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
            Log.i("register/phone/newintent/link/instructions/dialog");
            APr(getString(R.string.register_tapped_link_no_phone_number, getString(R.string.ok)));
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String obj;
        String str;
        String str2;
        switch (menuItem.getItemId()) {
            case 0:
                this.A0a.A0B();
                startActivity(EULA.A04(this));
                finishAffinity();
                return true;
            case 1:
                String replaceAll = ((AnonymousClass0HU) this).A01.A02.getText().toString().replaceAll("\\D", "");
                String replaceAll2 = ((AnonymousClass0HU) this).A01.A03.getText().toString().replaceAll("\\D", "");
                byte[] A0B2 = C007603r.A0B();
                StringBuilder sb = new StringBuilder();
                sb.append(replaceAll);
                sb.append(replaceAll2);
                C007603r.A09(this, A0B2, C002001d.A1o(sb.toString()));
                return true;
            case 2:
                new File(getFilesDir(), "rc2").delete();
                return true;
            case 3:
                AnonymousClass0I2.A01(getApplicationContext(), this.A0i, ((ActivityC004702f) this).A0J);
                return true;
            case 4:
                String replaceAll3 = ((AnonymousClass0HU) this).A01.A02.getText().toString().replaceAll("\\D", "");
                String replaceAll4 = ((AnonymousClass0HU) this).A01.A03.getText().toString().replaceAll("\\D", "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceAll3);
                sb2.append(replaceAll4);
                byte[] A0E2 = C007603r.A0E(this, C002001d.A1o(sb2.toString()));
                StringBuilder A0S2 = AnonymousClass008.A0S("register-phone rc=");
                if (A0E2 == null) {
                    obj = "(null)";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    int length = A0E2.length;
                    for (int i = 0; i < length; i++) {
                        sb3.append(String.format("%02X", Byte.valueOf(A0E2[i])));
                    }
                    obj = sb3.toString();
                }
                AnonymousClass008.A1U(A0S2, obj);
                return true;
            case 5:
                AnonymousClass0HP r2 = this.A0c;
                if (((AnonymousClass0HU) this).A05) {
                    str = "validNumber";
                } else {
                    str = "notValidNumber";
                }
                r2.A03(str);
                if (((AnonymousClass0HU) this).A04) {
                    str2 = "emptyNumber";
                } else {
                    str2 = "notEmptyNumber";
                }
                r2.A03(str2);
                r2.A02("register-phone");
                this.A09.A01(this, r2, "register-phone");
                return true;
            case 6:
                startActivity(new Intent().setClassName(this, "com.whatsapp.DebugToolsActivity"));
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.AnonymousClass0HU, X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        AnonymousClass30C r1 = ((AnonymousClass0HU) this).A02;
        r1.A02 = true;
        AnonymousClass0JE.A0H(r1.A04, AnonymousClass0JE.A00);
        StringBuilder sb = new StringBuilder("register/phone/pause ");
        sb.append(AnonymousClass0HU.A0L);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("com.whatsapp.registration.RegisterPhone.country_code", AnonymousClass0HU.A0N);
        edit.putString("com.whatsapp.registration.RegisterPhone.phone_number", AnonymousClass0HU.A0O);
        edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", AnonymousClass0HU.A0L);
        edit.putString("com.whatsapp.registration.RegisterPhone.input_phone_number", ((AnonymousClass0HU) this).A01.A03.getText().toString());
        edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", ((AnonymousClass0HU) this).A01.A02.getText().toString());
        edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", AnonymousClass0JE.A00(((AnonymousClass0HU) this).A01.A02));
        edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", AnonymousClass0JE.A00(((AnonymousClass0HU) this).A01.A03));
        if (!edit.commit()) {
            Log.w("register/phone/pause/commit failed");
        }
    }

    @Override // X.AnonymousClass0HU, X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        ((AnonymousClass0HU) this).A02.A00();
        SharedPreferences preferences = getPreferences(0);
        AnonymousClass0HU.A0N = preferences.getString("com.whatsapp.registration.RegisterPhone.country_code", null);
        AnonymousClass0HU.A0O = preferences.getString("com.whatsapp.registration.RegisterPhone.phone_number", null);
        AnonymousClass0HU.A0L = preferences.getInt("com.whatsapp.registration.RegisterPhone.verification_state", 7);
        if (this.A0F) {
            this.A0F = false;
            ((AnonymousClass0HU) this).A01.A03.setText("");
        } else {
            String string = preferences.getString("com.whatsapp.registration.RegisterPhone.input_phone_number", null);
            ((AnonymousClass0HU) this).A01.A03.setText(string);
            if (!TextUtils.isEmpty(string)) {
                ((AnonymousClass0HU) this).A04 = false;
                ((AnonymousClass0HU) this).A05 = true;
            }
        }
        ((AnonymousClass0HU) this).A01.A02.setText(preferences.getString("com.whatsapp.registration.RegisterPhone.input_country_code", null));
        if (TextUtils.isEmpty(((AnonymousClass0HU) this).A01.A02.getText())) {
            ((AnonymousClass0HU) this).A01.A02.requestFocus();
        }
        AnonymousClass0JE.A0G(((AnonymousClass0HU) this).A01.A03, preferences.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1));
        AnonymousClass0JE.A0G(((AnonymousClass0HU) this).A01.A02, preferences.getInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1));
        AnonymousClass008.A1L(new StringBuilder("register/phone/resume "), AnonymousClass0HU.A0L);
        if (AnonymousClass0HU.A0L == 15) {
            if (AnonymousClass0HU.A0N == null || AnonymousClass0HU.A0O == null) {
                Log.i("register/phone/reset-state");
                AnonymousClass0HU.A0L = 7;
                A0T();
            } else {
                C002001d.A2O(this, 21);
            }
        }
        this.A0R.A04(null, 1, "RegisterPhone1");
        this.A0a.A0C(1);
        AnonymousClass01Q r1 = this.A0T;
        r1.A00.A0A();
        ArrayList arrayList = r1.A01;
        synchronized (arrayList) {
            arrayList.clear();
        }
    }
}
