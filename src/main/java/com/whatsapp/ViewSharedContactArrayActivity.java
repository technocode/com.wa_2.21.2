package com.whatsapp;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass09V;
import X.AnonymousClass0CN;
import X.AnonymousClass0FI;
import X.AnonymousClass0L2;
import X.AnonymousClass0S2;
import X.AnonymousClass0SE;
import X.AnonymousClass0YX;
import X.AnonymousClass1OS;
import X.AnonymousClass1OU;
import X.AnonymousClass1Z4;
import X.AnonymousClass36B;
import X.C002101e;
import X.C007303n;
import X.C014308b;
import X.C017009c;
import X.C09110cJ;
import X.C09200cS;
import X.C11110fj;
import X.C40951uB;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class ViewSharedContactArrayActivity extends ActivityC004602e {
    public AnonymousClass0YX A00;
    public AnonymousClass02N A01;
    public C09110cJ A02;
    public List A03;
    public Pattern A04;
    public AnonymousClass1Z4 A05;
    public boolean A06;
    public final AnonymousClass01I A07 = AnonymousClass01I.A00();
    public final C017009c A08 = C017009c.A00();
    public final AnonymousClass01A A09 = AnonymousClass01A.A00();
    public final C014308b A0A = C014308b.A00();
    public final AnonymousClass0L2 A0B = AnonymousClass0L2.A01();
    public final AnonymousClass00G A0C = AnonymousClass00G.A01;
    public final AnonymousClass03S A0D = AnonymousClass03S.A00();
    public final AnonymousClass01X A0E = AnonymousClass01X.A00();
    public final AnonymousClass09V A0F = AnonymousClass09V.A00();
    public final AnonymousClass01K A0G = AnonymousClass01K.A00();
    public final AnonymousClass00Y A0H = AnonymousClass00Y.A00();
    public final AnonymousClass36B A0I = AnonymousClass36B.A01();
    public final AnonymousClass00T A0J = C002101e.A00();
    public final AnonymousClass0CN A0K = AnonymousClass0CN.A00();
    public final C09200cS A0L = C09200cS.A00();
    public final ArrayList A0M = new ArrayList();
    public final ArrayList A0N = new ArrayList();
    public final ArrayList A0O = new ArrayList();
    public final List A0P = new ArrayList();

    public static final AnonymousClass1OS A04(SparseArray sparseArray, int i) {
        AnonymousClass1OS r0 = (AnonymousClass1OS) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1OS r02 = new AnonymousClass1OS();
        sparseArray.put(i, r02);
        return r02;
    }

    public static String A05(ViewSharedContactArrayActivity viewSharedContactArrayActivity, Class cls, int i) {
        try {
            return viewSharedContactArrayActivity.A0E.A07(((Integer) cls.getMethod("getTypeLabelResource", Integer.TYPE).invoke(null, Integer.valueOf(i))).intValue());
        } catch (Exception e) {
            Log.e(e);
            return null;
        }
    }

    public static void A06(C40951uB r3) {
        r3.A01.setClickable(false);
        ImageView imageView = r3.A04;
        imageView.setVisibility(8);
        imageView.setClickable(false);
        ImageView imageView2 = r3.A05;
        imageView2.setVisibility(8);
        imageView2.setClickable(false);
    }

    public static void A07(ViewSharedContactArrayActivity viewSharedContactArrayActivity, C40951uB r5, String str, String str2, int i, int i2, boolean z) {
        TextView textView;
        if (i2 > 1) {
            textView = r5.A07;
            textView.setMaxLines(i2);
            textView.setSingleLine(false);
        } else {
            textView = r5.A07;
            textView.setSingleLine(true);
        }
        AnonymousClass0SE.A03(textView);
        if (!str.equalsIgnoreCase("null")) {
            textView.setText(str);
        }
        if (str2 == null || str2.equalsIgnoreCase("null")) {
            r5.A06.setText(viewSharedContactArrayActivity.A0E.A06(R.string.no_phone_type));
        } else {
            r5.A06.setText(str2);
        }
        r5.A03.setImageResource(i);
        if (viewSharedContactArrayActivity.A06) {
            CheckBox checkBox = r5.A02;
            checkBox.setChecked(z);
            checkBox.setClickable(false);
            checkBox.setVisibility(0);
            r5.A00.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(viewSharedContactArrayActivity, 4));
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1 && this.A05 != null) {
                String str = null;
                if (!(intent == null || intent.getData() == null)) {
                    str = intent.getData().getLastPathSegment();
                }
                this.A0I.A03(this.A0O, this.A0P, this.A05.A07(), str);
            }
            this.A02.A00();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = new C09110cJ(this.A0H, ((ActivityC004702f) this).A0G, super.A0I, this.A0D);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
        }
        setContentView(R.layout.view_shared_contact_array);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vcard");
        C007303n A062 = AnonymousClass0FI.A06(intent.getBundleExtra("vcard_message"));
        List stringArrayListExtra = intent.getStringArrayListExtra("vcard_array");
        Uri uri = (Uri) intent.getParcelableExtra("vcard_uri");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("vcard_sender_infos");
        if (stringExtra != null) {
            stringArrayListExtra = Collections.singletonList(stringExtra);
        }
        AnonymousClass1OU r10 = new AnonymousClass1OU(stringArrayListExtra, A062, uri, parcelableArrayListExtra);
        this.A00 = this.A0B.A03(this);
        this.A06 = getIntent().getBooleanExtra("edit_mode", true);
        this.A01 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
        this.A03 = r10.A02;
        this.A0J.ANC(new C11110fj(this.A0C, this.A0K, this.A09, this.A0E, this.A0F, this.A08, this, r10), new Void[0]);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A00.A00();
    }

    public final void toggleCheckBox(View view) {
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.cbx);
        if (compoundButton.isChecked()) {
            compoundButton.setChecked(false);
        } else {
            compoundButton.setChecked(true);
        }
        ((AnonymousClass1OS) view.getTag()).A01 = compoundButton.isChecked();
    }
}
