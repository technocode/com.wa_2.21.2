package X;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CopyableTextView;
import com.whatsapp.SettingsHelp;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.1ec  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractView$OnClickListenerC32271ec extends ActivityC004602e implements View.OnClickListener {
    public int A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public CopyableTextView A06;
    public AnonymousClass1VM A07;
    public PayToolbar A08;
    public boolean A09;
    public final C04580Kx A0A = C04580Kx.A00;
    public final C01970Ad A0B = C01970Ad.A00();
    public final C018809u A0C = C018809u.A00("PaymentMethodDetailsActivity", "payment-settings", "COMMON");
    public final AnonymousClass3GH A0D = new AnonymousClass3GH(this);

    public AnonymousClass0MD A0T(CharSequence charSequence, String str, boolean z) {
        int i = 201;
        if (z) {
            i = 200;
        }
        AnonymousClass0MB r3 = new AnonymousClass0MB(this);
        AnonymousClass0MC r2 = r3.A01;
        r2.A0E = charSequence;
        r2.A0J = true;
        r3.A05(((AnonymousClass2C0) this).A01.A06(R.string.cancel), new DialogInterface$OnClickListenerC62842vR(this, i));
        DialogInterface$OnClickListenerC62852vS r0 = new DialogInterface$OnClickListenerC62852vS(this, i, z);
        r2.A0H = str;
        r2.A06 = r0;
        r2.A02 = new DialogInterface$OnCancelListenerC62832vQ(this, i);
        return r3.A00();
    }

    public void A0U() {
        C01970Ad r0 = this.A0B;
        r0.A04();
        List A092 = r0.A06.A09();
        C018809u r2 = this.A0C;
        StringBuilder A0S = AnonymousClass008.A0S("#methods=");
        AbstractCollection abstractCollection = (AbstractCollection) A092;
        A0S.append(abstractCollection.size());
        r2.A07(null, A0S.toString(), null);
        if (abstractCollection.size() <= 1) {
            C002001d.A2O(this, 200);
        } else {
            C002001d.A2O(this, 201);
        }
    }

    public void A0V(AnonymousClass1VM r5, boolean z) {
        boolean z2;
        AbstractC460627w r0;
        if (r5 == null) {
            finish();
            return;
        }
        this.A07 = r5;
        boolean z3 = false;
        if (r5.A01 == 2) {
            z3 = true;
        }
        this.A09 = z3;
        this.A05.setText(r5.A0A);
        ImageView imageView = (ImageView) findViewById(R.id.payment_method_icon);
        if (r5 instanceof C43761yu) {
            imageView.setImageResource(C28051Sr.A07((C43761yu) r5));
        } else {
            Bitmap A052 = r5.A05();
            if (A052 != null) {
                imageView.setImageBitmap(A052);
            } else {
                imageView.setImageResource(R.drawable.av_bank);
            }
        }
        if (!(this instanceof BrazilPaymentCardDetailsActivity)) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i = R.color.settings_icon;
        if (z2) {
            i = R.color.fb_pay_hub_icon_tint;
        }
        int A002 = C004302a.A00(this, i);
        this.A00 = A002;
        C002001d.A2m(this.A02, A002);
        C002001d.A2m(this.A03, this.A00);
        ImageView imageView2 = this.A02;
        boolean z4 = this.A09;
        int i2 = R.drawable.ic_settings_unstarred;
        if (z4) {
            i2 = R.drawable.ic_settings_starred;
        }
        imageView2.setImageResource(i2);
        TextView textView = this.A04;
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        boolean z5 = this.A09;
        int i3 = R.string.default_payment_method_unset;
        if (z5) {
            i3 = R.string.default_payment_method_set;
        }
        textView.setText(r2.A06(i3));
        if (!this.A09) {
            this.A01.setOnClickListener(this);
        }
        if (C28051Sr.A1s(r5) && (r0 = (AbstractC460627w) r5.A06) != null && !r0.A0R) {
            findViewById(R.id.default_payment_method_container).setVisibility(8);
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            Intent intent2 = new Intent();
            int i3 = 0;
            if (intent != null) {
                i3 = intent.getIntExtra("extra_remove_payment_account", 0);
            }
            intent2.putExtra("extra_remove_payment_account", i3);
            setResult(-1, intent2);
            finish();
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.default_payment_method_row) {
            if (!this.A09) {
                A0G(R.string.register_wait_message);
                if (!(this instanceof AnonymousClass1PS)) {
                    IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
                    indiaUpiBankAccountDetailsActivity.A0G(R.string.register_wait_message);
                    C68683Ed r3 = indiaUpiBankAccountDetailsActivity.A0C;
                    r3.AQ7();
                    AnonymousClass3H9 r2 = new AnonymousClass3H9(indiaUpiBankAccountDetailsActivity, r3, 15, indiaUpiBankAccountDetailsActivity.A0E);
                    C74463ay r6 = (C74463ay) indiaUpiBankAccountDetailsActivity.A00.A06;
                    C018809u r32 = indiaUpiBankAccountDetailsActivity.A0D;
                    AnonymousClass00E.A04(r6, r32.A02(r32.A02, "onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData").toString());
                    AnonymousClass3EI r15 = indiaUpiBankAccountDetailsActivity.A01;
                    String str2 = r6.A0D;
                    String str3 = r6.A0E;
                    String str4 = r6.A0A;
                    String str5 = indiaUpiBankAccountDetailsActivity.A00.A07;
                    if (r15 == null) {
                        throw null;
                    } else if (TextUtils.isEmpty(str2)) {
                        AnonymousClass3EB r4 = new AnonymousClass3EB(r15.A00, r15.A01, r15.A02, r15.A07, r15.A03, r15.A06, r15.A08, r15.A05, r15.A04, null);
                        AnonymousClass3EG r33 = new AnonymousClass3EG(r15, str4, str5, r2);
                        AnonymousClass01I r0 = r4.A02;
                        r0.A04();
                        r4.A00(r0.A03, new AnonymousClass3EA(r4, r33));
                    } else {
                        r15.A01(str2, str3, str4, str5, true, r2);
                    }
                } else {
                    AnonymousClass1PS r7 = (AnonymousClass1PS) this;
                    AnonymousClass3H9 r5 = new AnonymousClass3H9(r7, null, 0, null);
                    C03340Fu r42 = r7.A08;
                    String str6 = ((AbstractView$OnClickListenerC32271ec) r7).A07.A07;
                    if (r42 != null) {
                        r42.A06(new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "edit-default-credential", null, (byte) 0), new AnonymousClass0OS("credential-id", str6, null, (byte) 0), new AnonymousClass0OS("version", "2", null, (byte) 0)}, null, null), r5);
                        return;
                    }
                    throw null;
                }
            }
        } else if (view.getId() != R.id.help_row) {
        } else {
            if (!(this instanceof IndiaUpiBankAccountDetailsActivity)) {
                startActivity(new Intent(this, SettingsHelp.class));
                return;
            }
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = (IndiaUpiBankAccountDetailsActivity) this;
            AnonymousClass00T r22 = indiaUpiBankAccountDetailsActivity2.A0G;
            AnonymousClass0e8 r02 = indiaUpiBankAccountDetailsActivity2.A02;
            if (r02 != null && ((AnonymousClass0JW) r02).A00.getStatus() == AsyncTask.Status.RUNNING) {
                ((AnonymousClass0JW) indiaUpiBankAccountDetailsActivity2.A02).A00.cancel(false);
            }
            Bundle bundle = new Bundle();
            bundle.putString("com.whatsapp.DescribeProblemActivity.from", "payments:account-details");
            AbstractC43781yw r1 = ((AbstractView$OnClickListenerC32271ec) indiaUpiBankAccountDetailsActivity2).A07.A06;
            if (r1 != null) {
                if (!(r1 instanceof AbstractC59432ne)) {
                    str = !(r1 instanceof AbstractC460627w) ? ((AnonymousClass27v) r1).A02 : ((AbstractC460627w) r1).A0B;
                } else {
                    str = null;
                }
                bundle.putString("com.whatsapp.DescribeProblemActivity.paymentBankPhone", str);
            }
            AnonymousClass0e8 r43 = new AnonymousClass0e8(indiaUpiBankAccountDetailsActivity2, ((ActivityC004702f) indiaUpiBankAccountDetailsActivity2).A0G, ((AnonymousClass2C0) indiaUpiBankAccountDetailsActivity2).A01, indiaUpiBankAccountDetailsActivity2.A0O, indiaUpiBankAccountDetailsActivity2.A0B, "payments:account-details", ((AbstractView$OnClickListenerC32271ec) indiaUpiBankAccountDetailsActivity2).A07, null, bundle);
            indiaUpiBankAccountDetailsActivity2.A02 = r43;
            r22.ANC(r43, new Void[0]);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!(this instanceof BrazilPaymentCardDetailsActivity)) {
            z = false;
        } else {
            z = true;
        }
        int i = R.layout.payment_method_details;
        if (z) {
            i = R.layout.fb_pay_container;
        }
        setContentView(i);
        ((ViewGroup) findViewById(R.id.scroll_view_layout)).addView(getLayoutInflater().inflate(R.layout.payment_method_details_view, (ViewGroup) null));
        if (getIntent() == null || getIntent().getExtras() == null || getIntent().getExtras().get("extra_bank_account") == null) {
            this.A0C.A03("got null bank account; finishing");
            finish();
            return;
        }
        if (z) {
            PayToolbar payToolbar = (PayToolbar) findViewById(R.id.pay_service_toolbar);
            this.A08 = payToolbar;
            A0C(payToolbar);
        }
        this.A05 = (TextView) findViewById(R.id.payment_method_bank_name);
        this.A06 = (CopyableTextView) findViewById(R.id.payment_method_account_id);
        this.A01 = findViewById(R.id.default_payment_method_row);
        this.A02 = (ImageView) findViewById(R.id.default_payment_method_icon);
        this.A04 = (TextView) findViewById(R.id.default_payment_method_text);
        this.A03 = (ImageView) findViewById(R.id.help_icon);
        findViewById(R.id.help_row).setOnClickListener(this);
        this.A0A.A01(this.A0D);
        AnonymousClass1V4 A012 = this.A0B.A01();
        AnonymousClass1VM r0 = (AnonymousClass1VM) getIntent().getExtras().get("extra_bank_account");
        if (r0 != null) {
            String str = r0.A07;
            C41191ud r3 = new C41191ud();
            A012.A03.ANF(new RunnableEBaseShape1S1200000_I1(A012, r3, str, 21));
            r3.A01.A03(new AnonymousClass3GG(this), ((ActivityC004702f) this).A0F.A06);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        AnonymousClass01X r2;
        String A062;
        if (i == 200) {
            C01970Ad r0 = this.A0B;
            r0.A04();
            if (((AbstractCollection) r0.A05.A0S(1)).size() > 0) {
                r2 = ((AnonymousClass2C0) this).A01;
                A062 = r2.A06(R.string.delete_payment_accounts_dialog_title_with_warning);
            } else {
                r2 = ((AnonymousClass2C0) this).A01;
                A062 = r2.A06(R.string.delete_payment_accounts_dialog_title);
            }
            return A0T(C002001d.A1J(A062, this, this.A0M), r2.A06(R.string.remove), true);
        } else if (i != 201) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
            return A0T(r22.A06(R.string.delete_payment_accounts_dialog_title), r22.A06(R.string.remove), false);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, ((AnonymousClass2C0) this).A01.A06(R.string.remove_payment_method));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A0U();
            return true;
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        this.A0A.A00(this.A0D);
        super.onStop();
    }
}
