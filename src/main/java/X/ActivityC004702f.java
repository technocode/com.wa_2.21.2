package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.MessageDialogFragment;
import com.whatsapp.SettingsChat;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.notification.PopupNotification;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.02f  reason: invalid class name and case insensitive filesystem */
public class ActivityC004702f extends AnonymousClass2C0 implements AbstractC004502c {
    public int A00;
    public long A01;
    public Intent A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public Toolbar A07;
    public AnonymousClass0SC A08;
    public Integer A09;
    public List A0A = new ArrayList();
    public boolean A0B = true;
    public boolean A0C;
    public final AnonymousClass009 A0D = AnonymousClass009.A00();
    public final AnonymousClass088 A0E = AnonymousClass088.A00();
    public final AnonymousClass02M A0F = AnonymousClass02M.A00();
    public final C000300f A0G = C000300f.A00();
    public final AnonymousClass04j A0H = AnonymousClass04j.A00();
    public final AnonymousClass03P A0I = AnonymousClass03P.A00();
    public final AnonymousClass00D A0J = AnonymousClass00D.A00();
    public final C06090Rr A0K = new C06090Rr(this);
    public final C02600Cs A0L = C02600Cs.A00();
    public final C02590Cr A0M = C02590Cr.A00();
    public final C002701k A0N = C002701k.A00();
    public final C02660Cy A0O = C02660Cy.A00();

    public static void A00(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime < 300) {
            SystemClock.sleep(300 - elapsedRealtime);
        }
    }

    @Override // X.ActivityC004802g
    public AbstractC06110Rt A0B(AbstractC06100Rs r2) {
        AbstractC06110Rt A0B2 = super.A0B(r2);
        if (A0B2 != null) {
            A0B2.A01();
        }
        return A0B2;
    }

    @Override // X.ActivityC004802g
    public void A0C(Toolbar toolbar) {
        super.A0C(toolbar);
        this.A07 = toolbar;
    }

    public List A0D() {
        ArrayList arrayList = new ArrayList();
        for (Reference reference : this.A0A) {
            AnonymousClass037 r1 = (AnonymousClass037) reference.get();
            if (r1 != null && r1.A0U()) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public void A0E() {
        View view;
        if (!isFinishing() && (view = this.A04) != null) {
            view.postDelayed(new RunnableEBaseShape1S0100000_I0_1(this, 49), 300);
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0F() {
        boolean z = false;
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(R.layout.toolbar, (ViewGroup) null, false);
        toolbar.setFitsSystemWindows(true);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.actionBarStyle, typedValue, true);
            TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(typedValue.resourceId, C06140Ry.A00);
            try {
                float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
                obtainStyledAttributes.recycle();
                toolbar.setElevation(dimension);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(R.attr.windowActionBarOverlay, typedValue2, true);
        if (typedValue2.type == 18 && typedValue2.data != 0) {
            z = true;
        }
        if (z) {
            this.A06 = new FrameLayout(this);
            FrameLayout frameLayout = new FrameLayout(this);
            this.A05 = frameLayout;
            this.A06.addView(frameLayout, -1, -1);
            this.A06.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.actionbar_height));
        } else {
            LinearLayout linearLayout = new LinearLayout(this);
            this.A06 = linearLayout;
            this.A05 = linearLayout;
            linearLayout.setOrientation(1);
            this.A06.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.actionbar_height));
        }
        A0C(toolbar);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 12));
    }

    public void A0G(int i) {
        if (!AB1()) {
            APv(0, i);
        }
    }

    public void A0H(Intent intent, int i) {
        if (!this.A0B) {
            this.A02 = intent;
            this.A09 = Integer.valueOf(i);
            this.A0C = false;
            return;
        }
        startActivityForResult(intent, i);
    }

    public void A0I(Intent intent, boolean z) {
        boolean z2;
        if (!this.A0B) {
            this.A02 = intent;
            z2 = false;
        } else {
            startActivity(intent);
            z2 = true;
        }
        if (!z) {
            return;
        }
        if (z2) {
            finish();
        } else {
            this.A0C = z;
        }
    }

    public void A0J(String str) {
        if (!AB1()) {
            AnonymousClass0LW A042 = A04();
            AnonymousClass0QB r1 = new AnonymousClass0QB(A042);
            AnonymousClass037 A012 = A042.A0Q.A01(str);
            if (A012 != null) {
                r1.A03(A012);
                r1.A01();
            }
        }
    }

    public void A0K(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.subtitle_text_size));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A07(C002001d.A1H(str, this, textPaint, this.A0M));
            return;
        }
        throw null;
    }

    public void A0L(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.title_text_size));
        setTitle(C002001d.A1H(str, this, textPaint, this.A0M));
    }

    public void A0M(String str) {
        if (!AB1()) {
            C06090Rr r4 = this.A0K;
            if (r4.A00 == null) {
                ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("title", null);
                bundle.putString("message", str);
                progressDialogFragment.A0N(bundle);
                r4.A00 = progressDialogFragment;
                progressDialogFragment.A0u(r4.A01.A04(), C06090Rr.A03);
            }
            C06090Rr.A02 = true;
        }
    }

    public void A0N(String str, String str2) {
        if (!AB1()) {
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("title", str);
            }
            bundle.putString("message", str2);
            messageDialogFragment.A0N(bundle);
            messageDialogFragment.A0u(A04(), null);
        }
    }

    public void A0O(boolean z) {
        AnonymousClass0S2 A092;
        int i = 0;
        if (this.A03 == null) {
            View inflate = getLayoutInflater().inflate(R.layout.actionbar_progress, (ViewGroup) null, false);
            View findViewById = inflate.findViewById(R.id.progress_bar);
            this.A03 = findViewById;
            if (!(findViewById == null || (A092 = A09()) == null)) {
                A092.A0B(true);
                A092.A06(inflate, new AnonymousClass0S5());
            }
        }
        View view = this.A03;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public boolean A0P() {
        if (this.A0H.A05()) {
            return false;
        }
        if (AnonymousClass04j.A02(this)) {
            APo(R.string.network_required_airplane_on);
            return true;
        }
        APo(R.string.network_required);
        return true;
    }

    public boolean A0Q(int i) {
        if (this.A0H.A05()) {
            return false;
        }
        APo(i);
        return true;
    }

    @Override // X.AbstractC004502c
    public boolean AB1() {
        if (!(this instanceof PopupNotification)) {
            return C002001d.A3D(this);
        }
        return false;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r3) {
        Toolbar toolbar = this.A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 0);
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r3) {
        Toolbar toolbar = this.A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 4);
        }
    }

    @Override // X.AbstractC004502c
    public void AMi() {
        if (!(this instanceof PopupNotification)) {
            this.A0K.A00();
        }
    }

    @Override // X.AbstractC004502c
    public void APl(DialogFragment dialogFragment, String str) {
        if (!(this instanceof PopupNotification) && !AB1()) {
            C002001d.A2p(A04(), dialogFragment, str);
        }
    }

    @Override // X.AbstractC004502c
    public void APm(DialogFragment dialogFragment) {
        if (!(this instanceof PopupNotification) && !AB1()) {
            AnonymousClass0LW A042 = A04();
            String name = dialogFragment.getClass().getName();
            if (A042.A0Q.A01(name) == null) {
                dialogFragment.A0u(A042, name);
            }
        }
    }

    @Override // X.AbstractC004502c
    public void APo(int i) {
        if (this instanceof PopupNotification) {
            PopupNotification popupNotification = (PopupNotification) this;
            popupNotification.A0g.A0C(popupNotification.A1B.A06(i), 0);
        } else if (!AB1()) {
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("title_id", 0);
            bundle.putInt("message_id", i);
            messageDialogFragment.A0N(bundle);
            messageDialogFragment.A0u(A04(), null);
        }
    }

    @Override // X.AbstractC004502c
    public void APp(int i, int i2, int i3, C42921xV r7, Object... objArr) {
        if (this instanceof PopupNotification) {
            APq(i, i2, objArr);
        } else if (!AB1()) {
            MessageDialogFragment.A00(i, i2, i3, new DialogInterface$OnClickListenerC25681Hx(r7), objArr).A0u(A04(), null);
        }
    }

    @Override // X.AbstractC004502c
    public void APq(int i, int i2, Object... objArr) {
        if (this instanceof PopupNotification) {
            PopupNotification popupNotification = (PopupNotification) this;
            AnonymousClass02M r2 = popupNotification.A0g;
            AnonymousClass01X r0 = popupNotification.A1B;
            r2.A0C(String.format(r0.A0I(), r0.A06(i2), objArr), 0);
        } else if (!AB1()) {
            MessageDialogFragment.A00(i, i2, 0, null, objArr).A0u(A04(), null);
        }
    }

    @Override // X.AbstractC004502c
    public void APr(String str) {
        if (this instanceof PopupNotification) {
            Toast A012 = ((PopupNotification) this).A0g.A01(str, 0);
            A012.setGravity(17, 0, 0);
            A012.show();
        } else if (!AB1()) {
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            messageDialogFragment.A0N(bundle);
            messageDialogFragment.A0u(A04(), null);
        }
    }

    @Override // X.AbstractC004502c
    public void APv(int i, int i2) {
        if (!(this instanceof PopupNotification) && !AB1()) {
            C06090Rr r1 = this.A0K;
            if (r1.A00 == null) {
                ProgressDialogFragment A002 = ProgressDialogFragment.A00(i, i2);
                r1.A00 = A002;
                A002.A0u(r1.A01.A04(), C06090Rr.A03);
            }
            C06090Rr.A02 = true;
        }
    }

    @Override // X.AbstractC004502c
    public void AQu(String str) {
        if (!(this instanceof PopupNotification) && !AB1()) {
            DialogFragment dialogFragment = this.A0K.A00;
            if (dialogFragment == null) {
                AnonymousClass008.A1C("dialogtoast/update-progress-message/progress-spinner-not-shown \"", str, "\"");
                return;
            }
            Dialog dialog = dialogFragment.A03;
            if (dialog == null) {
                AnonymousClass008.A1C("dialogtoast/update-progress-message/null-dialog/ \"", str, "\"");
            } else if (!(dialog instanceof ProgressDialog)) {
                AnonymousClass008.A1C("dialogtoast/update-progress-message/dialog-type-not-progress-dialog/ \"", str, "\"");
            } else {
                ((AlertDialog) dialog).setMessage(str);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.A0B || SystemClock.elapsedRealtime() - this.A01 > 500 || !(motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2)) && super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$setToolbarAsActionBar$12$DialogActivity(View view) {
        finish();
    }

    @Override // X.AnonymousClass02i
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT < 29) {
            onStateNotSaved();
        }
        if (this.A0B) {
            ((AnonymousClass02i) this).A02.A00();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!(this instanceof SettingsChat)) {
            this.A08.A02(configuration, 1);
            return;
        }
        SettingsChat settingsChat = (SettingsChat) this;
        if (!settingsChat.A08) {
            ((ActivityC004702f) settingsChat).A08.A02(configuration, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0076, code lost:
        if (r2.data != 0) goto L_0x0078;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ActivityC004702f.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onDestroy() {
        C06090Rr r1 = this.A0K;
        DialogFragment dialogFragment = r1.A00;
        if (dialogFragment != null) {
            dialogFragment.A0r();
        }
        r1.A00 = null;
        this.A02 = null;
        this.A0C = false;
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // X.ActivityC004902h
    public void onPause() {
        this.A0F.A07(this);
        super.onPause();
        this.A0B = false;
        this.A01 = SystemClock.elapsedRealtime();
    }

    public void onRestart() {
        super.onRestart();
        if (AbstractC003201p.A00 != this.A00) {
            recreate();
        }
    }

    @Override // X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A0F.A09(this);
        this.A0B = true;
        Intent intent = this.A02;
        if (intent != null) {
            Integer num = this.A09;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            if (this.A0C) {
                finish();
            }
            this.A02 = null;
            this.A09 = null;
            this.A0C = false;
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A08.A02(getResources().getConfiguration(), 2);
    }

    @Override // X.ActivityC004802g, android.app.Activity
    public void setContentView(int i) {
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null, false));
    }

    @Override // X.ActivityC004802g, android.app.Activity
    public void setContentView(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass0Q7.A0O(view);
        }
        if (this.A06 != null) {
            this.A05.addView(view, -1, -1);
            ViewGroup viewGroup = this.A06;
            this.A04 = viewGroup;
            super.setContentView(viewGroup);
            return;
        }
        this.A04 = view;
        super.setContentView(view);
    }
}
