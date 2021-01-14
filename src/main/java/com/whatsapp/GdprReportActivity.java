package com.whatsapp;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass019;
import X.AnonymousClass01X;
import X.AnonymousClass03C;
import X.AnonymousClass03P;
import X.AnonymousClass0AC;
import X.AnonymousClass0AR;
import X.AnonymousClass0JW;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass1IE;
import X.AnonymousClass1IF;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C03500Gm;
import X.C05690Pr;
import X.C05710Pt;
import X.C05720Pu;
import X.C06470Tj;
import X.C40071sa;
import X.C40091sc;
import X.C40111se;
import X.C40131sg;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;

public class GdprReportActivity extends ActivityC004602e {
    public View A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public C40091sc A07;
    public C40111se A08;
    public C40131sg A09;
    public final C03500Gm A0A = C03500Gm.A00();
    public final AnonymousClass03P A0B = AnonymousClass03P.A00();
    public final AnonymousClass00S A0C = AnonymousClass00S.A00();
    public final AnonymousClass03C A0D = AnonymousClass03C.A00();
    public final AnonymousClass01X A0E = AnonymousClass01X.A00();
    public final AnonymousClass019 A0F = new C40071sa(this);
    public final AnonymousClass0AC A0G = AnonymousClass0AC.A00;
    public final AnonymousClass0M9 A0H = AnonymousClass0M9.A01();
    public final AnonymousClass0AR A0I = AnonymousClass0AR.A00();
    public final AnonymousClass00T A0J = C002101e.A00();

    public class DeleteReportConfirmationDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
            AnonymousClass01X r2 = this.A00;
            r3.A01.A0E = Html.fromHtml(r2.A06(R.string.gdpr_delete_report_confirmation));
            r3.A05(r2.A06(R.string.cancel), null);
            r3.A07(r2.A06(R.string.delete), new AnonymousClass1IE(this));
            return r3.A00();
        }
    }

    public class ShareReportConfirmationDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
            AnonymousClass01X r2 = this.A00;
            r3.A01.A0E = r2.A06(R.string.gdpr_share_report_confirmation);
            r3.A05(r2.A06(R.string.cancel), null);
            r3.A07(r2.A06(R.string.gdpr_share_report_button), new AnonymousClass1IF(this));
            return r3.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0191 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T() {
        /*
        // Method dump skipped, instructions count: 749
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GdprReportActivity.A0T():void");
    }

    public void lambda$onCreate$984$GdprReportActivity(View view) {
        if (((ActivityC004702f) this).A0F.A0H()) {
            APl(new DeleteReportConfirmationDialogFragment(), null);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r4 = this.A0E;
        setTitle(r4.A06(R.string.title_gdpr_report));
        setContentView(R.layout.gdpr_report);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.gdpr_report_header);
            textEmojiLabel.A07 = new C05710Pt();
            textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(r4.A0D(R.string.gdpr_report_header, this.A0H.A03("general", "26000110", null).toString())));
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.setSpan(new C05690Pr(this, ((ActivityC004702f) this).A0F, this.A0B, ((ActivityC004602e) this).A05, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
                    spannableStringBuilder.setSpan(new TextAppearanceSpan(this, R.style.SettingsInlineLink), spanStart, spanEnd, spanFlags);
                }
                for (URLSpan uRLSpan2 : uRLSpanArr) {
                    spannableStringBuilder.removeSpan(uRLSpan2);
                }
            }
            textEmojiLabel.setText(spannableStringBuilder);
            this.A06 = (TextView) findViewById(R.id.gdpr_report_footer);
            this.A05 = (TextView) findViewById(R.id.gdpr_report_button_title);
            this.A04 = (TextView) findViewById(R.id.gdpr_report_button_subtitle);
            this.A03 = (ImageView) findViewById(R.id.gdpr_report_button_icon);
            this.A00 = findViewById(R.id.gdpr_report_button);
            this.A01 = findViewById(R.id.gdpr_report_delete);
            this.A02 = findViewById(R.id.gdpr_report_delete_divider);
            C002001d.A2m(this.A03, C002001d.A06(this, R.attr.settingsIconColor, R.color.settings_icon));
            ((ImageView) findViewById(R.id.gdpr_report_logo)).setImageDrawable(new C06470Tj(r4, C004302a.A03(this, R.drawable.settings_account_info)));
            this.A01.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 23));
            this.A0G.A01(this.A0F);
            C03500Gm r6 = this.A0A;
            synchronized (r6) {
                int A022 = r6.A02();
                if (A022 < 0 || A022 > 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdpr/validate-state/wrong-state ");
                    sb.append(A022);
                    Log.e(sb.toString());
                    r6.A0D.A0M();
                } else {
                    if (A022 == 3 && !new File(r6.A02.A03.A00.getFilesDir(), "gdpr.zip").exists()) {
                        Log.e("gdpr/validate-state/report-media-file-missing");
                        AnonymousClass008.A0k(r6.A0D, "gdpr_report_state", 2);
                    }
                    if (r6.A02() == 2 && r6.A04() == null) {
                        Log.e("gdpr/validate-state/report-message-missing");
                        r6.A0D.A0M();
                    }
                    if (r6.A02() == 2) {
                        AnonymousClass00S r5 = r6.A0A;
                        long A052 = r5.A05();
                        AnonymousClass00D r9 = r6.A0D;
                        SharedPreferences sharedPreferences = r9.A00;
                        if (A052 > sharedPreferences.getLong("gdpr_report_expiration_timestamp", 0)) {
                            long A053 = r5.A05();
                            long j = sharedPreferences.getLong("gdpr_report_expiration_timestamp", 0);
                            if (A053 > j) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("gdpr/validate-state/report-too-old current:");
                                sb2.append(A053);
                                sb2.append(" expired:");
                                sb2.append(j);
                                Log.i(sb2.toString());
                                r9.A0M();
                            }
                        }
                    }
                }
            }
            if (r6.A02() < 3) {
                C40111se r2 = new C40111se(this, r6, this.A0I);
                this.A08 = r2;
                this.A0J.ANC(r2, new Void[0]);
            }
            A0T();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C40111se r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C40131sg r02 = this.A09;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
        }
        C40091sc r03 = this.A07;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(true);
        }
        this.A0G.A00(this.A0F);
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A0D.A04(null, 16, "GdprReport");
    }
}
