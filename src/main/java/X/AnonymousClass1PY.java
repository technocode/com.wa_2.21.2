package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiBankAccountLinkingRetryActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentBankSetupActivity;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1PY  reason: invalid class name */
public abstract class AnonymousClass1PY extends AbstractActivityC34761jB {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final AnonymousClass00Y A0A = AnonymousClass00Y.A00();
    public final C018809u A0B = C018809u.A00("IndiaUpiBasePaymentsActivity", "payment", "IN");
    public final C06170Sb A0C = C06170Sb.A00();
    public final AnonymousClass00T A0D = C002101e.A00();

    public String A0X(String str) {
        AnonymousClass01I r0 = ((AbstractActivityC34761jB) this).A0C;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                long A052 = ((AbstractActivityC34761jB) this).A0F.A05();
                byte[] bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) ((int) A052);
                    A052 >>= 8;
                }
                instance.update(bArr);
                instance.update(userJid.getRawString().getBytes());
                byte[] bArr2 = new byte[16];
                new SecureRandom().nextBytes(bArr2);
                instance.update(bArr2);
                byte[] bArr3 = new byte[15];
                System.arraycopy(instance.digest(), 0, bArr3, 0, 15);
                return A0Y(str, C007603r.A03(bArr3));
            } catch (NoSuchAlgorithmException e) {
                this.A0B.A06("payment", "generateUuid unable to hash due to missing sha256 algorithm", e);
                return null;
            }
        } else {
            throw null;
        }
    }

    public String A0Y(String str, String str2) {
        int length = str.length();
        if (length <= 8) {
            String A0K = AnonymousClass008.A0K(str, str2);
            return A0K.length() > 35 ? A0K.substring(0, 35) : A0K;
        }
        C018809u r2 = this.A0B;
        StringBuilder A0S = AnonymousClass008.A0S("prefixAndTruncate called with too long a prefix: ");
        A0S.append(length);
        throw new IllegalArgumentException(r2.A02(r2.A02, A0S.toString()).toString());
    }

    public void A0Z() {
        if (this instanceof AnonymousClass1DU) {
            AnonymousClass1DU r2 = (AnonymousClass1DU) this;
            C60922sD r3 = r2.A0C;
            r3.A04.A06.add("done");
            C018809u r22 = r2.A0J;
            StringBuilder A0S = AnonymousClass008.A0S("clearStates: ");
            A0S.append(r3.A04);
            r22.A07(null, A0S.toString(), null);
            r3.A08();
        } else if (this instanceof IndiaUpiPaymentBankSetupActivity) {
            IndiaUpiPaymentBankSetupActivity indiaUpiPaymentBankSetupActivity = (IndiaUpiPaymentBankSetupActivity) this;
            indiaUpiPaymentBankSetupActivity.A00.A06.add("done");
            C018809u r23 = indiaUpiPaymentBankSetupActivity.A07;
            StringBuilder A0S2 = AnonymousClass008.A0S("clearStates: ");
            A0S2.append(indiaUpiPaymentBankSetupActivity.A00);
            r23.A07(null, A0S2.toString(), null);
            indiaUpiPaymentBankSetupActivity.A02.A08();
        } else if (this instanceof IndiaUpiDeviceBindActivity) {
            IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity = (IndiaUpiDeviceBindActivity) this;
            C61082sT r0 = indiaUpiDeviceBindActivity.A09;
            if (r0 != null) {
                r0.A06.add("done");
                C018809u r24 = indiaUpiDeviceBindActivity.A0T;
                StringBuilder A0S3 = AnonymousClass008.A0S("clearStates: ");
                A0S3.append(indiaUpiDeviceBindActivity.A09);
                r24.A07(null, A0S3.toString(), null);
            }
            indiaUpiDeviceBindActivity.A0L.A08();
        } else if (this instanceof IndiaUpiBankPickerActivity) {
            IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) this;
            C61082sT r02 = indiaUpiBankPickerActivity.A04;
            if (r02 != null) {
                r02.A06.add("done");
                C018809u r25 = indiaUpiBankPickerActivity.A0F;
                StringBuilder A0S4 = AnonymousClass008.A0S("clearStates: ");
                A0S4.append(indiaUpiBankPickerActivity.A04.toString());
                r25.A07(null, A0S4.toString(), null);
            }
            indiaUpiBankPickerActivity.A0C.A08();
        } else if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            indiaUpiBankAccountPickerActivity.A04.A06.add("done");
            C018809u r26 = indiaUpiBankAccountPickerActivity.A0K;
            StringBuilder A0S5 = AnonymousClass008.A0S("clearStates: ");
            A0S5.append(indiaUpiBankAccountPickerActivity.A04.toString());
            r26.A07(null, A0S5.toString(), null);
            indiaUpiBankAccountPickerActivity.A0D.A08();
        } else if (this instanceof IndiaUpiBankAccountLinkingRetryActivity) {
            ((IndiaUpiBankAccountLinkingRetryActivity) this).A00.A08();
        }
    }

    public void A0a() {
        if (this instanceof IndiaUpiBankPickerActivity) {
            View view = ((IndiaUpiBankPickerActivity) this).A00;
            if (view != null) {
                view.findViewById(R.id.progress).setVisibility(8);
            }
        } else if (!(this instanceof IndiaUpiBankAccountPickerActivity)) {
            View findViewById = findViewById(R.id.progress);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        } else {
            View view2 = ((IndiaUpiBankAccountPickerActivity) this).A00;
            if (view2 != null) {
                view2.findViewById(R.id.progress).setVisibility(8);
            }
        }
    }

    public void A0b() {
        if (this instanceof IndiaUpiBankPickerActivity) {
            View view = ((IndiaUpiBankPickerActivity) this).A00;
            if (view != null) {
                view.findViewById(R.id.progress).setVisibility(0);
            }
        } else if (!(this instanceof IndiaUpiBankAccountPickerActivity)) {
            View findViewById = findViewById(R.id.progress);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View view2 = ((IndiaUpiBankAccountPickerActivity) this).A00;
            if (view2 != null) {
                view2.findViewById(R.id.progress).setVisibility(0);
            }
        }
    }

    public void A0c(Intent intent) {
        intent.putExtra("extra_conversation_message_type", ((AbstractActivityC34761jB) this).A00);
        intent.putExtra("extra_jid", AnonymousClass1VY.A0D(((AbstractActivityC34761jB) this).A02));
        intent.putExtra("extra_receiver_jid", AnonymousClass1VY.A0D(((AbstractActivityC34761jB) this).A03));
        intent.putExtra("extra_quoted_msg_row_id", ((AbstractActivityC34761jB) this).A01);
        intent.putExtra("extra_payment_preset_amount", ((AbstractActivityC34761jB) this).A06);
        intent.putExtra("extra_transaction_id", ((AbstractActivityC34761jB) this).A09);
        intent.putExtra("extra_payment_preset_min_amount", ((AbstractActivityC34761jB) this).A07);
        intent.putExtra("extra_request_message_key", ((AbstractActivityC34761jB) this).A08);
        intent.putExtra("extra_is_pay_money_only", ((AbstractActivityC34761jB) this).A0B);
        intent.putExtra("extra_payment_note", ((AbstractActivityC34761jB) this).A05);
        List list = ((AbstractActivityC34761jB) this).A0A;
        if (list != null) {
            intent.putStringArrayListExtra("extra_mentioned_jids", new ArrayList<>(AnonymousClass1VY.A0F(list)));
        }
        intent.putExtra("extra_in_setup", this.A09);
        intent.putExtra("extra_setup_mode", this.A01);
        intent.putExtra("extra_default_action_after_setup", this.A00);
        intent.putExtra("extra_payment_handle", this.A07);
        intent.putExtra("extra_payment_handle_id", this.A08);
        intent.putExtra("extra_merchant_code", this.A03);
        intent.putExtra("extra_transaction_ref", this.A06);
        intent.putExtra("extra_payee_name", this.A04);
        intent.putExtra("extra_transaction_ref_url", this.A05);
        intent.putExtra("extra_incoming_pay_request_id", this.A02);
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            A0Z();
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        C018809u r2 = this.A0B;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onBackPressed");
        r2.A07(null, sb.toString(), null);
        A0Z();
        finish();
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C018809u r2 = this.A0B;
        StringBuilder sb = new StringBuilder("onCreate");
        sb.append(this);
        r2.A07(null, sb.toString(), null);
        if (getIntent() != null) {
            this.A09 = getIntent().getBooleanExtra("extra_in_setup", false);
            this.A01 = getIntent().getIntExtra("extra_setup_mode", 1);
            this.A00 = getIntent().getIntExtra("extra_default_action_after_setup", 2);
            this.A07 = getIntent().getStringExtra("extra_payment_handle");
            this.A08 = getIntent().getStringExtra("extra_payment_handle_id");
            this.A03 = getIntent().getStringExtra("extra_merchant_code");
            this.A06 = getIntent().getStringExtra("extra_transaction_ref");
            this.A04 = getIntent().getStringExtra("extra_payee_name");
            this.A05 = getIntent().getStringExtra("extra_transaction_ref_url");
            this.A02 = getIntent().getStringExtra("extra_incoming_pay_request_id");
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C018809u r2 = this.A0B;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" action bar home");
        r2.A07(null, sb.toString(), null);
        A0Z();
        finish();
        return true;
    }
}
