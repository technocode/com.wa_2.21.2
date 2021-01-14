package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.2DC  reason: invalid class name */
public abstract class AnonymousClass2DC extends ActivityC004602e implements AnonymousClass1TU {
    public AbstractC011006p A00;
    public BloksDialogFragment A01;
    public boolean A02 = true;
    public final AnonymousClass1T6 A03 = new AnonymousClass1T6();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final AnonymousClass00Y A05 = AnonymousClass00Y.A00();

    public static void A05(Intent intent, String str) {
        HashMap hashMap;
        Serializable serializableExtra = intent.getSerializableExtra("screen_params");
        if (serializableExtra == null) {
            hashMap = new HashMap();
        } else {
            hashMap = (HashMap) serializableExtra;
        }
        hashMap.put("referral_screen", str);
        intent.putExtra("screen_params", hashMap);
    }

    public void A0T() {
        String str = C43331yC.A03;
        if (str == null) {
            str = getIntent().getStringExtra("screen_name");
        }
        if (!TextUtils.isEmpty(str)) {
            this.A01 = ((AnonymousClass1PT) this).A4y(str, C43331yC.A04);
            AnonymousClass0LW A042 = A04();
            if (A042 != null) {
                AnonymousClass0QB r2 = new AnonymousClass0QB(A042);
                r2.A06(R.id.bloks_fragment_container, this.A01, null);
                r2.A00();
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$25$BloksActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        AnonymousClass1T6 r2 = this.A03;
        HashMap hashMap = r2.A01;
        C28021Sn r1 = (C28021Sn) hashMap.get("backpress");
        if (r1 != null) {
            r1.A00("on_success");
            return;
        }
        AnonymousClass0LW A042 = A04();
        if (A042.A03() <= 1) {
            setResult(0, getIntent());
            C43331yC.A03 = null;
            C43331yC.A04 = null;
            finish();
            return;
        }
        A042.A0C();
        A042.A0A();
        Stack stack = r2.A02;
        stack.size();
        hashMap.size();
        AnonymousClass1T6.A00(hashMap);
        stack.pop();
        String name = ((AnonymousClass0QE) A042.A09.get(A042.A03() - 1)).getName();
        stack.peek();
        this.A01 = A4y(name, (HashMap) stack.peek());
        AnonymousClass0QB r22 = new AnonymousClass0QB(A042);
        r22.A06(R.id.bloks_fragment_container, this.A01, null);
        r22.A00();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra("screen_params");
        AnonymousClass1T6 r2 = this.A03;
        AnonymousClass1T6.A00(r2.A01);
        r2.A02.add(new HashMap());
        if (serializableExtra != null) {
            r2.A01((Map) serializableExtra);
        }
        super.onCreate(bundle);
        try {
            AnonymousClass00b.A00(getApplicationContext());
        } catch (IOException unused) {
        }
        setContentView(R.layout.activity_blok_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.A09();
        A0C(toolbar);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08("");
            A09.A0A(true);
        }
        C06470Tj r22 = new C06470Tj(this.A04, C004302a.A03(this, R.drawable.ic_back_teal));
        r22.setColorFilter(getResources().getColor(R.color.dark_gray), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(r22);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 28));
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1T6 r3 = this.A03;
        Stack stack = r3.A02;
        stack.size();
        HashMap hashMap = r3.A01;
        hashMap.size();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
        AnonymousClass1T6.A00(hashMap);
        r3.A00.A01.clear();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A03.A02(false);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.d("PAY: BloksActivity: onRestoreInstanceState()");
        super.onRestoreInstanceState(bundle);
        AnonymousClass1T6 r2 = this.A03;
        if (r2 != null) {
            Log.d("PAY: ScreenManager.onRestoreInstanceState()");
            ArrayList arrayList = (ArrayList) bundle.getSerializable("screen_manager_saved_state");
            if (arrayList != null) {
                Stack stack = r2.A02;
                stack.clear();
                stack.addAll(arrayList);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (this.A00 == null) {
            AnonymousClass1T6 r3 = this.A03;
            this.A00 = new C37351o4(new C42971xa(r3, new C43331yC(this.A05, r3, this.A04)));
        }
        Context applicationContext = getApplicationContext();
        AbstractC011006p r2 = this.A00;
        C28051Sr.A1H();
        AnonymousClass06P r32 = new AnonymousClass06P(C28051Sr.A02);
        C28051Sr.A1H();
        C009205v.A05 = new C009205v(applicationContext, r2, r32, new AnonymousClass1GM(), Collections.emptyMap());
        C28051Sr.A1H();
        C010406j.A01 = new C010406j(new AnonymousClass06P(C28051Sr.A02));
        this.A03.A02(true);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        Log.d("PAY: BloksActivity: onSaveInstanceState()");
        super.onSaveInstanceState(bundle);
        AnonymousClass1T6 r1 = this.A03;
        if (r1 != null) {
            Log.d("PAY: ScreenManager.onSaveInstanceState()");
            Stack stack = r1.A02;
            if (stack.size() > 0) {
                ArrayList arrayList = new ArrayList(stack.size());
                arrayList.addAll(stack);
                bundle.putSerializable("screen_manager_saved_state", arrayList);
                return;
            }
            return;
        }
        throw null;
    }
}
