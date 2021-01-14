package X;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.PaymentContactPicker;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1eZ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractView$OnClickListenerC32241eZ extends ActivityC004602e implements View.OnClickListener, AbstractC63152vw, AbstractC61092sU, AnonymousClass3HB, AbstractC63202w1, AbstractC63162vx {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public ListView A08;
    public TextView A09;
    public AnonymousClass0e8 A0A;
    public AbstractC63112vs A0B;
    public AnonymousClass3HS A0C;
    public TransactionsExpandableView A0D;
    public TransactionsExpandableView A0E;
    public final AnonymousClass01I A0F = AnonymousClass01I.A00();
    public final AnonymousClass03S A0G = AnonymousClass03S.A00();
    public final AnonymousClass0BA A0H = AnonymousClass0BA.A00();
    public final C01980Ae A0I = C01980Ae.A00();
    public final C02060Am A0J = C02060Am.A00();
    public final C04560Kv A0K = C04560Kv.A00();
    public final C02010Ah A0L = C02010Ah.A00();
    public final AnonymousClass0AD A0M = AnonymousClass0AD.A00;
    public final C03340Fu A0N = C03340Fu.A00();
    public final C02020Ai A0O = C02020Ai.A00();
    public final C02040Ak A0P = C02040Ak.A00();
    public final C01970Ad A0Q = C01970Ad.A00();
    public final C61592tQ A0R = C61592tQ.A00();
    public final C018809u A0S = C018809u.A00("PaymentSettingsActivity", "payment-settings", "COMMON");
    public final AnonymousClass00T A0T = C002101e.A00();

    @Override // X.AnonymousClass3HB
    public boolean APa() {
        return false;
    }

    @Override // X.AnonymousClass3HB
    public void APj(AnonymousClass1VM r1, PaymentMethodRow paymentMethodRow) {
    }

    public String A0T() {
        List<AnonymousClass1VM> list = this.A0B.A00;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (AnonymousClass1VM r2 : list) {
            if (r2.A01 == 2) {
                AbstractC43781yw r0 = r2.A06;
                if (r0 != null) {
                    return r0.A04();
                }
                Log.e(C018809u.A01("PaymentMethodUtils", "getDefaultAccountHolderName/null country data"));
                return null;
            }
        }
        return null;
    }

    public void A0U() {
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            Intent intent = new Intent(this, PaymentContactPicker.class);
            intent.putExtra("for_payments", true);
            startActivity(intent);
            return;
        }
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = (IndiaUpiPaymentSettingsActivity) this;
        if (!indiaUpiPaymentSettingsActivity.A08.A08()) {
            Intent intent2 = new Intent(indiaUpiPaymentSettingsActivity, IndiaUpiPaymentsAccountSetupActivity.class);
            intent2.putExtra("extra_setup_mode", 1);
            intent2.putExtra("extra_default_action_after_setup", 0);
            indiaUpiPaymentSettingsActivity.startActivity(intent2);
            return;
        }
        Intent intent3 = new Intent(indiaUpiPaymentSettingsActivity, IndiaUpiContactPicker.class);
        intent3.putExtra("for_payments", true);
        indiaUpiPaymentSettingsActivity.startActivity(intent3);
    }

    public boolean A0V() {
        if (this instanceof IndiaUpiPaymentSettingsActivity) {
            return false;
        }
        C02010Ah r1 = this.A0L;
        return r1.A01.A05() - r1.A01().getLong("payments_all_transactions_last_sync_time", 0) > TimeUnit.DAYS.toMillis(7);
    }

    @Override // X.AbstractC63102vr
    public String A7R(AnonymousClass1VM r3) {
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
            return C28051Sr.A0v(r1, r3) != null ? C28051Sr.A0v(r1, r3) : "";
        }
        C74463ay r0 = (C74463ay) r3.A06;
        if (r0 != null && !r0.A0G) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.setup_pin_prompt);
        }
        AnonymousClass01X r12 = ((AnonymousClass2C0) this).A01;
        return C28051Sr.A0v(r12, r3) != null ? C28051Sr.A0v(r12, r3) : "";
    }

    @Override // X.AbstractC61092sU
    public void AIO() {
        this.A0C.A00(false);
    }

    @Override // X.AbstractC63162vx
    public void AQs(List list) {
        boolean z;
        boolean z2;
        String A0y;
        AbstractC59432ne r0;
        int i = 0;
        this.A03.setVisibility(0);
        AbstractC63112vs r02 = this.A0B;
        r02.A00 = list;
        r02.notifyDataSetChanged();
        if (!(this instanceof BrazilPaymentSettingsActivity)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!(this instanceof BrazilPaymentSettingsActivity)) {
                z2 = false;
            } else {
                BrazilPaymentSettingsActivity brazilPaymentSettingsActivity = (BrazilPaymentSettingsActivity) this;
                brazilPaymentSettingsActivity.A0P.A01();
                z2 = true;
                if (brazilPaymentSettingsActivity.A00.A02(true) == null) {
                    z2 = false;
                }
            }
            View view = this.A02;
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            view.setVisibility(i2);
            View view2 = this.A00;
            int i3 = 8;
            if (z2) {
                i3 = 0;
            }
            view2.setVisibility(i3);
            View view3 = this.A01;
            if (z2) {
                i = 8;
            }
            view3.setVisibility(i);
            if (!z2) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            A0y = C28051Sr.A0y(this.A0Q, ((AnonymousClass2C0) this).A01, (AnonymousClass1VM) list.get(C28051Sr.A0D(list)));
                            break;
                        }
                        AnonymousClass1VM r2 = (AnonymousClass1VM) it.next();
                        if (r2.A04() == 5 && (r0 = (AbstractC59432ne) r2.A06) != null) {
                            A0y = r0.A02;
                            if (TextUtils.isEmpty(A0y)) {
                                A0y = this.A0F.A02();
                            }
                        }
                    }
                } else {
                    A0y = ((AnonymousClass2C0) this).A01.A06(R.string.facebook_pay_hub_desc);
                }
            } else {
                A0y = ((AnonymousClass2C0) this).A01.A06(R.string.facebook_pay_hub_desc_not_added);
            }
            this.A09.setText(A0y);
        }
        C28051Sr.A1U(this.A08);
    }

    @Override // X.AbstractC63202w1
    public void AQv(List list) {
        this.A03.setVisibility(0);
        if (list == null || list.size() == 0) {
            this.A05.setVisibility(8);
            this.A0D.setVisibility(8);
            return;
        }
        this.A0D.setVisibility(0);
        this.A05.setVisibility(0);
        this.A0D.A00(list);
        this.A0D.setTitle(((AnonymousClass2C0) this).A01.A08(R.plurals.payments_settings_payment_requests, (long) list.size()));
    }

    @Override // X.AbstractC63202w1
    public void AQx(List list) {
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            this.A03.setVisibility(0);
            TransactionsExpandableView transactionsExpandableView = this.A0E;
            if (list == null) {
                list = new ArrayList();
            }
            transactionsExpandableView.A00(list);
            return;
        }
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = (IndiaUpiPaymentSettingsActivity) this;
        indiaUpiPaymentSettingsActivity.A0W();
        indiaUpiPaymentSettingsActivity.A01.A05("UPI");
        indiaUpiPaymentSettingsActivity.A09.A04(list);
        ((AbstractView$OnClickListenerC32241eZ) indiaUpiPaymentSettingsActivity).A03.setVisibility(0);
        TransactionsExpandableView transactionsExpandableView2 = ((AbstractView$OnClickListenerC32241eZ) indiaUpiPaymentSettingsActivity).A0E;
        if (list == null) {
            list = new ArrayList();
        }
        transactionsExpandableView2.A00(list);
    }

    public void lambda$onCreate$90$PaymentSettingsActivity(View view) {
        startActivity(new Intent(this, PaymentTransactionHistoryActivity.class));
    }

    public /* synthetic */ void lambda$onCreate$91$PaymentSettingsActivity(View view) {
        Intent intent = new Intent(this, PaymentTransactionHistoryActivity.class);
        intent.putExtra("extra_show_requests", true);
        startActivity(intent);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 48) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                A0U();
            }
        } else if (i2 == -1) {
            finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    @Override // X.ActivityC004702f, X.AnonymousClass02i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r3 = this;
            boolean r0 = r3.isTaskRoot()
            if (r0 == 0) goto L_0x0020
            java.lang.Class<com.whatsapp.HomeActivity> r0 = com.whatsapp.HomeActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x001d
            r3.finishAndRemoveTask()
            r3.startActivity(r2)
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x0022
            return
        L_0x001d:
            r3.startActivity(r2)
        L_0x0020:
            r0 = 0
            goto L_0x001a
        L_0x0022:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnClickListenerC32241eZ.onBackPressed():void");
    }

    public void onClick(View view) {
        boolean z = false;
        if (view.getId() == R.id.payment_support_container) {
            AnonymousClass00T r1 = this.A0T;
            AnonymousClass0e8 r0 = this.A0A;
            if (r0 != null && ((AnonymousClass0JW) r0).A00.getStatus() == AsyncTask.Status.RUNNING) {
                ((AnonymousClass0JW) this.A0A).A00.cancel(false);
            }
            Bundle bundle = new Bundle();
            bundle.putString("com.whatsapp.DescribeProblemActivity.from", "payments:settings");
            AnonymousClass0e8 r3 = new AnonymousClass0e8(this, ((ActivityC004702f) this).A0G, ((AnonymousClass2C0) this).A01, super.A0O, this.A0O, "payments:settings", null, null, bundle);
            this.A0A = r3;
            r1.ANC(r3, new Void[0]);
        } else if (view.getId() == R.id.send_payment_fab) {
            if (!this.A0G.A03()) {
                RequestPermissionActivity.A08(this, R.string.permission_contacts_access_on_new_payment_request, R.string.permission_contacts_access_on_new_payment);
            } else {
                A0U();
            }
        } else if (view.getId() == R.id.add_new_account) {
            if (this.A0B.getCount() == 0) {
                z = true;
            }
            ACc(z);
        } else if (view.getId() == R.id.fb_pay_hub && (this instanceof BrazilPaymentSettingsActivity)) {
            BrazilPaymentSettingsActivity brazilPaymentSettingsActivity = (BrazilPaymentSettingsActivity) this;
            brazilPaymentSettingsActivity.A0P.A01();
            String A022 = brazilPaymentSettingsActivity.A00.A02(true);
            if (A022 != null) {
                Intent intent = new Intent(brazilPaymentSettingsActivity, BrazilPayBloksActivity.class);
                intent.putExtra("screen_name", A022);
                AnonymousClass2DC.A05(intent, "wa_payment_settings");
                brazilPaymentSettingsActivity.startActivityForResult(intent, 2);
                return;
            }
            brazilPaymentSettingsActivity.startActivity(new Intent(brazilPaymentSettingsActivity, BrazilFbPayHubActivity.class));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence A5f;
        super.onCreate(bundle);
        setContentView(R.layout.payment_settings);
        if (!this.A0P.A04()) {
            this.A0S.A07(null, "onCreate payment is not enabled; finish", null);
            finish();
            return;
        }
        this.A02 = findViewById(R.id.fb_pay_hub_section_desc);
        this.A00 = findViewById(R.id.fb_pay_hub_add);
        this.A09 = (TextView) findViewById(R.id.fb_pay_hub_desc);
        this.A01 = findViewById(R.id.fb_pay_hub_chevron);
        this.A03 = findViewById(R.id.payment_setting_container);
        this.A05 = findViewById(R.id.requests_separator);
        AnonymousClass00T r10 = this.A0T;
        C01970Ad r11 = this.A0Q;
        this.A0C = new AnonymousClass3HS(this, r10, r11, this.A0L, this.A0I, this.A0N, this.A0R, this.A0J, this.A0M, this.A0H, this.A0K, true);
        Intent intent = getIntent();
        if (intent != null) {
            z = intent.getBooleanExtra("extra_force_get_methods", false);
        } else {
            z = false;
        }
        this.A0C.A01(A0V(), z);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_activity_title));
            A092.A0A(true);
        }
        findViewById(R.id.add_new_account).setOnClickListener(this);
        findViewById(R.id.payment_support_container).setOnClickListener(this);
        findViewById(R.id.send_payment_fab).setOnClickListener(this);
        if (!(this instanceof BrazilPaymentSettingsActivity)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            findViewById(R.id.payment_settings_services_separator).setVisibility(0);
            findViewById(R.id.pay_hub_container).setVisibility(0);
            findViewById(R.id.payment_methods_container).setVisibility(8);
            findViewById(R.id.payment_history_separator).setVisibility(8);
            if (z2) {
                findViewById(R.id.fb_pay_hub).setVisibility(0);
                findViewById(R.id.fb_pay_hub).setOnClickListener(this);
            }
        }
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        this.A0B = new AnonymousClass3HC(this, r3, r11, this);
        ListView listView = (ListView) findViewById(R.id.methods_list);
        this.A08 = listView;
        listView.setAdapter((ListAdapter) this.A0B);
        this.A08.setOnItemClickListener(new C62872vU(this));
        TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) findViewById(R.id.payment_history_container);
        this.A0E = transactionsExpandableView;
        transactionsExpandableView.setTitle(r3.A06(R.string.payments_settings_payment_history));
        TransactionsExpandableView transactionsExpandableView2 = this.A0E;
        String A062 = r3.A06(R.string.payments_settings_view_payment_history);
        String A063 = r3.A06(R.string.payments_no_history);
        ViewOnClickEBaseShape7S0100000_I1_5 viewOnClickEBaseShape7S0100000_I1_5 = new ViewOnClickEBaseShape7S0100000_I1_5(this, 30);
        transactionsExpandableView2.A09 = A062;
        transactionsExpandableView2.A08 = A063;
        transactionsExpandableView2.A01 = viewOnClickEBaseShape7S0100000_I1_5;
        this.A0E.setPaymentRequestActionCallback(this);
        View inflate = getLayoutInflater().inflate(R.layout.payment_txn_history_nux_view, (ViewGroup) null, false);
        this.A0E.setCustomEmptyView(inflate);
        C002001d.A2m((ImageView) inflate.findViewById(R.id.payment_nux_logo), getResources().getColor(R.color.icon_color_disabled));
        this.A07 = (FrameLayout) findViewById(R.id.payment_custom_header_row);
        this.A04 = findViewById(R.id.payment_custom_header_row_separator);
        TransactionsExpandableView transactionsExpandableView3 = (TransactionsExpandableView) findViewById(R.id.requests_container);
        this.A0D = transactionsExpandableView3;
        String A064 = r3.A06(R.string.payments_settings_see_more_requests);
        String A065 = r3.A06(R.string.payments_settings_see_more_requests);
        ViewOnClickEBaseShape7S0100000_I1_5 viewOnClickEBaseShape7S0100000_I1_52 = new ViewOnClickEBaseShape7S0100000_I1_5(this, 31);
        transactionsExpandableView3.A09 = A064;
        transactionsExpandableView3.A08 = A065;
        transactionsExpandableView3.A01 = viewOnClickEBaseShape7S0100000_I1_52;
        TransactionsExpandableView transactionsExpandableView4 = this.A0D;
        transactionsExpandableView4.setPaymentRequestActionCallback(this);
        C63762wy r2 = new C63762wy(this);
        this.A0E.A00 = r2;
        transactionsExpandableView4.A00 = r2;
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (z3) {
            findViewById(R.id.pin_container).setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.payments_drawable_text_view);
        if (!(this instanceof IndiaUpiPaymentSettingsActivity)) {
            A5f = AnonymousClass1VK.A01("BRL").A5f(this);
        } else {
            A5f = C05880Qw.A01.A5f(this);
        }
        textView.setText(A5f);
        View findViewById = findViewById(R.id.payments_settings_scroll_view_layout);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.send_payment_fab);
        View findViewById2 = findViewById(R.id.payments_text_view);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        layoutTransition.setInterpolator(0, new C06930Vg());
        layoutTransition.setInterpolator(1, new C06930Vg());
        layoutTransition.setDuration(150);
        findViewById.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC62882vV(findViewById, viewGroup, findViewById2));
        int A002 = C004302a.A00(this, R.color.settings_icon);
        C002001d.A2m((ImageView) findViewById(R.id.change_pin_icon), A002);
        C002001d.A2m((ImageView) findViewById(R.id.add_new_account_icon), A002);
        C002001d.A2m((ImageView) findViewById(R.id.payment_support_icon), A002);
        C002001d.A2m(this.A0E.A04, A002);
        C002001d.A2m(this.A0D.A04, A002);
        C002001d.A2m((ImageView) findViewById(R.id.fingerprint_setting_icon), A002);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3HS r2 = this.A0C;
        if (r2 != null) {
            C10010dt r0 = r2.A02;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
            }
            r2.A02 = null;
            AbstractC29091Wz r1 = r2.A00;
            if (r1 != null) {
                r2.A09.A00(r1);
            }
        }
        AnonymousClass0e8 r02 = this.A0A;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(false);
        }
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("extra_force_get_methods", false);
        }
        this.A0C.A01(A0V(), z);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                Intent intent = new Intent(this, HomeActivity.class);
                if (Build.VERSION.SDK_INT >= 21) {
                    finishAndRemoveTask();
                    startActivity(intent);
                } else {
                    startActivity(intent);
                    return true;
                }
            }
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_debug) {
            return false;
        } else {
            String A84 = this.A0Q.A03().A84();
            if (TextUtils.isEmpty(A84)) {
                return false;
            }
            startActivity(new Intent().setClassName(this, A84));
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        A0G(R.string.payments_loading);
        this.A0C.A00(true);
    }
}
