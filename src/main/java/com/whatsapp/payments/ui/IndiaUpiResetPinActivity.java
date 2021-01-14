package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC43781yw;
import X.AbstractC61442tB;
import X.AbstractC61462tD;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass0GP;
import X.AnonymousClass0JW;
import X.AnonymousClass0RM;
import X.AnonymousClass0S2;
import X.AnonymousClass1DU;
import X.AnonymousClass1PY;
import X.AnonymousClass3EE;
import X.C002001d;
import X.C018809u;
import X.C01980Ae;
import X.C05900Qy;
import X.C10080e0;
import X.C15740oa;
import X.C15750ob;
import X.C28051Sr;
import X.C43751yt;
import X.C61072sS;
import X.C63072vo;
import X.C68393Da;
import X.C69293Gm;
import X.C74463ay;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;

public class IndiaUpiResetPinActivity extends AnonymousClass1DU implements AbstractC61462tD, AbstractC61442tB {
    public int A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public C43751yt A04;
    public AnonymousClass3EE A05;
    public C10080e0 A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public HashMap A0C;
    public final BroadcastReceiver A0D = new C63072vo(this);
    public final AnonymousClass0GP A0E = AnonymousClass0GP.A00();
    public final C018809u A0F = C018809u.A00("IndiaUpiResetPinActivity", "payment-settings", "IN");

    public final void A0m() {
        ((AnonymousClass1DU) this).A03.A01("pin-entry-ui");
        C43751yt r0 = this.A04;
        if (r0 != null) {
            C74463ay r1 = (C74463ay) r0.A06;
            if (r1 == null) {
                this.A0F.A07(null, "could not find bank info to reset pin", null);
                A0i();
            } else if (!((AnonymousClass1PY) this).A09 || !r1.A0G) {
                Intent intent = new Intent(this, IndiaUpiEducationActivity.class);
                intent.putExtra("extra_bank_account", this.A04);
                intent.putExtra("extra_set_pin_education_type", this.A00);
                intent.putExtra("extra_education_type", 0);
                A0H(intent, 1013);
            } else {
                this.A0F.A07(null, "showOrCheckPin insetup and upi pin already set; showSuccessAndFinish", null);
                C01980Ae r12 = ((AbstractActivityC34761jB) this).A0I;
                synchronized (r12) {
                    r12.A05(r12.A01("2fa"));
                }
                A0q(true);
            }
        } else {
            this.A0F.A07(null, "could not find bank account", null);
            A0i();
        }
    }

    public final void A0n(int i) {
        A0a();
        if (i == 0) {
            i = R.string.payments_set_pin_error;
        }
        if (((AnonymousClass1PY) this).A09) {
            A0Z();
            finish();
            Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
            intent.putExtra("error", i);
            A0c(intent);
            A0I(intent, false);
            return;
        }
        APo(i);
    }

    public void A0o(C61072sS r11) {
        ((AnonymousClass1DU) this).A0I.A03(16, this.A04, r11);
        if (r11 == null) {
            C68393Da r1 = ((AnonymousClass1DU) this).A0D;
            this.A0A = r1.A06();
            this.A0B = A0X(r1.A03());
            ((AnonymousClass1DU) this).A03.A02("upi-get-credential");
            String str = this.A0A;
            C43751yt r0 = this.A04;
            A0l(str, r0.A08, this.A0B, (C74463ay) r0.A06, 1, r0.A0A);
        } else if (!C69293Gm.A02(this, "upi-generate-otp", r11.code, true)) {
            this.A0F.A07(null, "onRequestOtp failed; showErrorAndFinish", null);
            A0n(R.string.payments_set_pin_opt_not_requested);
        }
    }

    public final void A0p(boolean z) {
        TextView textView = this.A02;
        int i = 0;
        int i2 = 4;
        if (z) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        ProgressBar progressBar = this.A01;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    public final void A0q(boolean z) {
        A0a();
        if (((AnonymousClass1PY) this).A09) {
            A0Z();
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A0c(intent);
            if (z) {
                intent.putExtra("successInfo", ((AnonymousClass1DU) this).A0B.A06(R.string.payments_setup_upi_pin_exists));
            }
            A0I(intent, false);
            finish();
            return;
        }
        APq(0, R.string.payments_set_pin_success, C28051Sr.A14(this.A04.A0A));
    }

    @Override // X.AbstractC61462tD
    public void AE2(boolean z, boolean z2, C05900Qy r5, C05900Qy r6, AnonymousClass0RM r7, AnonymousClass0RM r8, C61072sS r9) {
        throw new UnsupportedOperationException("onCheckPin unsupported");
    }

    @Override // X.AbstractC61462tD
    public void AH0(String str, C61072sS r6) {
        Integer num;
        AbstractC43781yw r0;
        C43751yt r02;
        AbstractC43781yw r1;
        ((AnonymousClass1DU) this).A0I.A03(1, this.A04, r6);
        if (TextUtils.isEmpty(str) || (r02 = this.A04) == null || (r1 = r02.A06) == null) {
            if (r6 != null && !C69293Gm.A02(this, "upi-list-keys", r6.code, true)) {
                if (((AnonymousClass1DU) this).A03.A06("upi-list-keys")) {
                    ((AnonymousClass1DU) this).A0D.A0A();
                    this.A02.setText(((AnonymousClass1DU) this).A0B.A06(R.string.payments_still_working));
                    ((AnonymousClass1DU) this).A04.A00();
                    return;
                }
                C018809u r3 = this.A0F;
                StringBuilder A0S = AnonymousClass008.A0S("onListKeys: ");
                if (str != null) {
                    num = Integer.valueOf(str.length());
                } else {
                    num = null;
                }
                A0S.append(num);
                A0S.append(" bankAccount: ");
                A0S.append(this.A04);
                A0S.append(" countrydata: ");
                C43751yt r03 = this.A04;
                if (r03 != null) {
                    r0 = r03.A06;
                } else {
                    r0 = null;
                }
                A0S.append(r0);
                A0S.append(" failed; ; showErrorAndFinish");
                r3.A07(null, A0S.toString(), null);
                A0i();
            }
        } else if (((AnonymousClass1PY) this).A09) {
            Intent intent = new Intent(this, IndiaUpiEducationActivity.class);
            intent.putExtra("extra_use_pin_education_type", 1);
            intent.putExtra("extra_bank_account", C28051Sr.A14(this.A04.A0A));
            intent.putExtra("extra_education_type", 1);
            A0H(intent, 1010);
        } else {
            this.A05.A00((C74463ay) r1, this);
        }
    }

    @Override // X.AbstractC61462tD
    public void AK1(C61072sS r5) {
        ((AnonymousClass1DU) this).A0I.A03(6, this.A04, r5);
        boolean z = false;
        if (r5 == null) {
            z = true;
        }
        if (z) {
            this.A0F.A07(null, "onSetPin success; showSuccessAndFinish", null);
            ((AnonymousClass1PY) this).A0D.ANF(new RunnableEBaseShape11S0100000_I1_6(this, 34));
            A0q(false);
        } else if (!C69293Gm.A02(this, "upi-set-mpin", r5.code, true)) {
            C43751yt r0 = this.A04;
            if (r0 == null || r0.A06 == null) {
                A0i();
                return;
            }
            int i = r5.code;
            if (i == 11460 || i == 11461) {
                C002001d.A2O(this, 14);
            } else if (i == 11456 || i == 11471) {
                C002001d.A2O(this, 13);
            } else if (i == 11458 || i == 11457) {
                C002001d.A2O(this, 17);
            } else if (i == 11459) {
                C002001d.A2O(this, 10);
            } else if (i == 11496) {
                C002001d.A2O(this, 16);
            } else if (i == 11499) {
                C002001d.A2O(this, 23);
            } else {
                this.A0F.A07(null, "onSetPin failed; showErrorAndFinish", null);
                A0i();
            }
        }
    }

    @Override // X.AnonymousClass1DU, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        C018809u r2 = this.A0F;
        r2.A07(null, AnonymousClass008.A0H("got result for activity: ", i, " result:", i2), null);
        super.onActivityResult(i, i2, intent);
        if (i != 1010) {
            if (i != 1013) {
                return;
            }
            if (i2 != 101 || intent == null) {
                r2.A07(null, "onActivityResult debit card back pressed or unsuccessful", null);
                setResult(0);
                A0Z();
                finish();
                return;
            }
            this.A09 = intent.getStringExtra("extra_india_upi_debit_card_last6");
            this.A07 = intent.getStringExtra("extra_india_upi_debit_card_expiry_month");
            this.A08 = intent.getStringExtra("extra_india_upi_debit_card_expiry_year");
            ((AnonymousClass1DU) this).A04.A00();
        } else if (i2 == -1) {
            this.A03.setText(((AnonymousClass1DU) this).A0B.A06(R.string.setup_pin_requesting_otp));
            this.A05.A00((C74463ay) this.A04.A06, this);
        }
    }

    @Override // X.AnonymousClass1DU, X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_pin_setup);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass1DU) this).A0B.A06(R.string.payments_reset_upi_pin_activity_title));
            A092.A0A(true);
        }
        if (getIntent() == null || getIntent().getExtras() == null) {
            this.A00 = -1;
        } else {
            this.A04 = (C43751yt) getIntent().getParcelableExtra("extra_bank_account");
            this.A00 = getIntent().getIntExtra("extra_set_pin_education_type", -1);
        }
        this.A03 = (TextView) findViewById(R.id.payments_upi_pin_setup_title);
        this.A02 = (TextView) findViewById(R.id.payments_upi_pin_setup_desc);
        this.A01 = (ProgressBar) findViewById(R.id.progress);
        this.A05 = new AnonymousClass3EE(this, ((ActivityC004702f) this).A0F, ((AnonymousClass1DU) this).A0A, ((AnonymousClass1DU) this).A0K, ((AnonymousClass1DU) this).A0H, ((ActivityC004702f) this).A0H, ((AnonymousClass1DU) this).A0C, ((AbstractActivityC34761jB) this).A0J, ((AnonymousClass1DU) this).A0I, this.A0E, ((AnonymousClass1DU) this).A0D);
        C15750ob A002 = C15750ob.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A0D;
        IntentFilter intentFilter = new IntentFilter("TRIGGER_OTP");
        HashMap hashMap = A002.A04;
        synchronized (hashMap) {
            C15740oa r4 = new C15740oa(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(r4);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap hashMap2 = A002.A03;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(r4);
            }
        }
    }

    @Override // X.AnonymousClass1DU, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        A0p(false);
        if (i == 10) {
            return A0d(10, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_set_pin_invalid_pin_retry), R.string.yes, R.string.no, new RunnableEBaseShape1S1100000_I1(this, ((AnonymousClass1DU) this).A0D.A06(), 23));
        } else if (i == 23) {
            return A0d(23, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_set_pin_incorrect_format_error), R.string.payments_try_again, R.string.cancel, new RunnableEBaseShape11S0100000_I1_6(this, 35));
        } else {
            if (i == 13) {
                ((AnonymousClass1DU) this).A0D.A0B();
                return A0d(13, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_set_pin_retry), R.string.yes, R.string.no, new RunnableEBaseShape11S0100000_I1_6(this, 31));
            } else if (i == 14) {
                return A0d(14, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_set_pin_otp_incorrect), R.string.payments_try_again, R.string.cancel, new RunnableEBaseShape11S0100000_I1_6(this, 30));
            } else {
                if (i == 16) {
                    return A0d(16, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_set_pin_atm_pin_incorrect), R.string.payments_try_again, R.string.cancel, new RunnableEBaseShape11S0100000_I1_6(this, 32));
                }
                if (i != 17) {
                    return super.onCreateDialog(i);
                }
                return A0d(17, ((AnonymousClass1DU) this).A0B.A0D(R.string.payments_card_or_expiry_incorrect_with_placeholder, 6), R.string.payments_try_again, R.string.cancel, new RunnableEBaseShape11S0100000_I1_6(this, 33));
            }
        }
    }

    @Override // X.AnonymousClass1DU, X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C10080e0 r0 = this.A06;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C15750ob A002 = C15750ob.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A0D;
        HashMap hashMap = A002.A04;
        synchronized (hashMap) {
            ArrayList arrayList = (ArrayList) hashMap.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C15740oa r7 = (C15740oa) arrayList.get(size);
                    r7.A01 = true;
                    for (int i = 0; i < r7.A03.countActions(); i++) {
                        String action = r7.A03.getAction(i);
                        HashMap hashMap2 = A002.A03;
                        ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C15740oa r1 = (C15740oa) arrayList2.get(size2);
                                if (r1.A02 == broadcastReceiver) {
                                    r1.A01 = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                hashMap2.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ((AnonymousClass1PY) this).A09 = bundle.getBoolean("inSetupSavedInst");
        C43751yt r0 = (C43751yt) bundle.getParcelable("bankAccountSavedInst");
        if (r0 != null) {
            this.A04 = r0;
            this.A04.A06 = (AbstractC43781yw) bundle.getParcelable("countryDataSavedInst");
        }
        this.A09 = bundle.getString("debitLast6SavedInst");
        this.A07 = bundle.getString("debitExpiryMonthSavedInst");
        this.A08 = bundle.getString("debitExpiryYearSavedInst");
        this.A0B = bundle.getString("seqNumSavedInst");
        this.A0A = bundle.getString("keysXML");
        this.A0C = (HashMap) bundle.getSerializable("credentialBlobsSavedInst");
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C018809u r2 = this.A0F;
        StringBuilder A0S = AnonymousClass008.A0S("onResume with states: ");
        A0S.append(((AnonymousClass1DU) this).A03);
        r2.A07(null, A0S.toString(), null);
        if (!isFinishing()) {
            byte[] A0I = ((AnonymousClass1DU) this).A0D.A0I();
            if (!((AnonymousClass1DU) this).A03.A06.contains("upi-get-challenge") && A0I == null) {
                ((AnonymousClass1DU) this).A03.A02("upi-get-challenge");
                ((AnonymousClass1DU) this).A02.A00();
            } else if (!((AnonymousClass1DU) this).A03.A06.contains("upi-get-challenge")) {
                A0j();
            }
        }
    }

    @Override // X.AnonymousClass1DU, X.AbstractActivityC34761jB, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC43781yw r1;
        super.onSaveInstanceState(bundle);
        if (((AnonymousClass1PY) this).A09) {
            bundle.putBoolean("inSetupSavedInst", true);
        }
        C43751yt r12 = this.A04;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C43751yt r0 = this.A04;
        if (!(r0 == null || (r1 = r0.A06) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A09;
        if (str != null) {
            bundle.putString("debitLast6SavedInst", str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            bundle.putString("debitExpiryMonthSavedInst", str2);
        }
        String str3 = this.A08;
        if (str3 != null) {
            bundle.putString("debitExpiryYearSavedInst", str3);
        }
        String str4 = this.A0B;
        if (str4 != null) {
            bundle.putString("seqNumSavedInst", str4);
        }
        String str5 = this.A0A;
        if (str5 != null) {
            bundle.putString("keysXML", str5);
        }
        HashMap hashMap = this.A0C;
        if (hashMap != null) {
            bundle.putSerializable("credentialBlobsSavedInst", hashMap);
        }
    }
}
