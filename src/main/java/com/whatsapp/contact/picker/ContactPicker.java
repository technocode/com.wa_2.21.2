package com.whatsapp.contact.picker;

import X.AbstractC06110Rt;
import X.ActivityC004702f;
import X.AnonymousClass01I;
import X.AnonymousClass02N;
import X.AnonymousClass03B;
import X.AnonymousClass0GE;
import X.AnonymousClass0LW;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QB;
import X.AnonymousClass0Wl;
import X.AnonymousClass1KV;
import X.AnonymousClass1Y8;
import X.AnonymousClass2C0;
import X.C004302a;
import X.C02230Bd;
import X.C04350Ka;
import X.C04360Kb;
import X.C27241Os;
import X.C27261Ou;
import X.C58822mb;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.Conversation;
import com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.Main;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.PaymentContactPicker;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.List;

public class ContactPicker extends AnonymousClass0GE implements AnonymousClass1KV, AnonymousClass0Wl {
    public BaseSharedPreviewDialogFragment A00;
    public C58822mb A01;
    public ContactPickerFragment A02;
    public final AnonymousClass03B A03 = AnonymousClass03B.A00();
    public final C04350Ka A04 = C04350Ka.A00();
    public final C04360Kb A05 = C04360Kb.A00();
    public final WhatsAppLibLoader A06 = WhatsAppLibLoader.A00();

    public ContactPicker() {
        super(false);
    }

    @Override // X.AnonymousClass0Wl
    public C58822mb A6j() {
        C58822mb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C58822mb r02 = new C58822mb(this);
        this.A01 = r02;
        return r02;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.primary_dark));
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 4);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.AnonymousClass1KV
    public void AMk() {
        this.A00 = null;
    }

    @Override // X.AnonymousClass1KV
    public void ANi(Uri uri, List list, Bundle bundle) {
        Intent A052;
        this.A04.A05(list, uri, C02230Bd.A0O(((ActivityC004702f) this).A0I.A06(), uri), null, A6j(), false);
        A6j().A00.A0S(list);
        if (list.size() == 1) {
            A052 = Conversation.A05(this, (AnonymousClass02N) list.get(0));
        } else {
            A052 = HomeActivity.A05(this);
        }
        startActivity(A052);
        finish();
    }

    @Override // X.AnonymousClass1KV
    public void ANn(String str, List list, Bundle bundle) {
        C27241Os r4;
        Intent A052;
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("load_preview"));
        if (valueOf != null) {
            if (valueOf.booleanValue()) {
                r4 = C27261Ou.A00(AnonymousClass1Y8.A01(str));
            } else {
                r4 = null;
            }
            Boolean valueOf2 = Boolean.valueOf(bundle.getBoolean("has_text_from_url"));
            if (valueOf2 != null) {
                this.A05.A0T(list, str, r4, null, null, false, valueOf2.booleanValue());
                A6j().A00.A0S(list);
                if (list.size() == 1) {
                    A052 = Conversation.A05(this, (AnonymousClass02N) list.get(0));
                } else {
                    A052 = HomeActivity.A05(this);
                }
                startActivity(A052);
                finish();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass1KV
    public void AP5(BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment) {
        this.A00 = baseSharedPreviewDialogFragment;
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A02;
        if (contactPickerFragment == null || !contactPickerFragment.A1D()) {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0GE, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        ContactPickerFragment paymentContactPickerFragment;
        Bundle bundle2;
        super.onCreate(bundle);
        if (!this.A06.A04()) {
            Log.i("aborting due to native libraries missing");
            finish();
            return;
        }
        AnonymousClass01I r0 = ((AnonymousClass0GE) this).A01;
        r0.A04();
        if (r0.A00 == null || !this.A0P.A02()) {
            ((ActivityC004702f) this).A0F.A06(R.string.finish_registration_first, 1);
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        if (AnonymousClass03B.A01()) {
            Log.w("contactpicker/device-not-supported");
            APm(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
        }
        if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
            setTitle(((AnonymousClass2C0) this).A01.A06(R.string.conversation_shortcut));
        }
        setContentView(R.layout.contact_picker_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        AnonymousClass0LW A042 = A04();
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) A042.A0Q.A01("ContactPickerFragment");
        this.A02 = contactPickerFragment;
        if (contactPickerFragment == null) {
            if (this instanceof PaymentContactPicker) {
                paymentContactPickerFragment = new PaymentContactPickerFragment();
            } else if (!(this instanceof IndiaUpiContactPicker)) {
                paymentContactPickerFragment = new ContactPickerFragment();
            } else {
                paymentContactPickerFragment = new IndiaUpiContactPicker.IndiaUpiContactPickerFragment();
            }
            this.A02 = paymentContactPickerFragment;
            Intent intent = getIntent();
            if (paymentContactPickerFragment != null) {
                if (intent.getExtras() != null) {
                    bundle2 = intent.getExtras();
                } else {
                    bundle2 = new Bundle();
                }
                if (intent.hasExtra("android.intent.extra.shortcut.ID")) {
                    bundle2.putString("jid", intent.getStringExtra("android.intent.extra.shortcut.ID"));
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("action", intent.getAction());
                bundle3.putString("type", intent.getType());
                bundle3.putBundle("extras", bundle2);
                paymentContactPickerFragment.A0N(bundle3);
                if (A042 != null) {
                    AnonymousClass0QB r2 = new AnonymousClass0QB(A042);
                    r2.A0A(R.id.fragment, this.A02, "ContactPickerFragment", 1);
                    if (!r2.A0D) {
                        r2.A0E = false;
                        r2.A02.A0i(r2, false);
                        return;
                    }
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass0GE, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        Dialog A0n;
        ContactPickerFragment contactPickerFragment = this.A02;
        return (contactPickerFragment == null || (A0n = contactPickerFragment.A0n(i)) == null) ? super.onCreateDialog(i) : A0n;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = this.A00;
            if (baseSharedPreviewDialogFragment != null) {
                baseSharedPreviewDialogFragment.A0w(false, false);
                return true;
            }
            ContactPickerFragment contactPickerFragment = this.A02;
            if (contactPickerFragment != null && contactPickerFragment.A1D()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A02;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0D.A01();
        return true;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A02;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0D.A01();
        return true;
    }
}
